package timetable

import CourseClassRoom
import timetable.TimetableCalculator.Companion.COLUMNS
import timetable.TimetableCalculator.Companion.ROWS

class SolutionValidator(private val config: Config = Config()) {

    fun isValidSolution(currentSolution: Array<Array<CourseClassRoom?>>): Boolean {
        val hasDoubleGaps = (0 until COLUMNS).any { getColumnGapCount(currentSolution, it) > 1 }
        val daysWithGaps = (0 until COLUMNS).count { getColumnGapCount(currentSolution, it) == 1 }

        if(!config.allowDoubleGaps && hasDoubleGaps) return false
        if(config.maxDaysWithGaps != null && daysWithGaps > config.maxDaysWithGaps) return false
        if(config.disallowClassInDay != null && hasClassInDay(currentSolution, config.disallowClassInDay)) return false

        return true
    }

    private fun hasClassInDay(currentSolution: Array<Array<CourseClassRoom?>>, day: Int): Boolean {
        return (0 until ROWS).any { currentSolution[it][day] != null }
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

    data class Config(val allowDoubleGaps: Boolean = false, val maxDaysWithGaps: Int? = null, val disallowClassInDay: Int? = null)

}