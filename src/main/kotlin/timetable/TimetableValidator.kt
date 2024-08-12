package timetable

import data.course.CourseClassRoom
import data.days.Day
import data.hours.HourPeriod

class TimetableValidator(private val config: Config = Config()) {

    fun isValidSolution(currentSolution: Array<Array<CourseClassRoom?>>): Boolean {
        val hasDoubleGaps = (0 until Day.values().size).any { getColumnGapCount(currentSolution, it) > 1 }
        val daysWithGaps = (0 until Day.values().size).count { getColumnGapCount(currentSolution, it) == 1 }

        if(!config.allowDoubleGaps && hasDoubleGaps) return false
        if(config.maxDaysWithGaps != null && daysWithGaps > config.maxDaysWithGaps) return false
        if(config.disallowClassIn != null && hasClassInDay(currentSolution, config.disallowClassIn.ordinal)) return false

        return true
    }

    private fun hasClassInDay(currentSolution: Array<Array<CourseClassRoom?>>, day: Int): Boolean {
        return (0 until HourPeriod.values().size).any { currentSolution[it][day] != null }
    }

    private fun getColumnGapCount(timetable: Array<Array<CourseClassRoom?>>, column: Int): Int {
        var gapCount = 0
        var startCounting = false
        var checkingGap = false
        for(i in timetable.indices) {
            if(!startCounting && (timetable[i][column] != null)) startCounting = true
            else if(startCounting && timetable[i][column] == null) checkingGap = true
            else if(checkingGap && (timetable[i][column] != null)) {
                gapCount++
                checkingGap = false
            }
        }

        return gapCount
    }

    data class Config(val allowDoubleGaps: Boolean = false, val maxDaysWithGaps: Int? = null, val disallowClassIn: Day? = null)

}