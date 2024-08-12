package timetable

import data.course.Course
import data.course.CourseClassRoom
import data.course.CourseTime
import data.days.Day
import data.hours.HourPeriod

class TimetableCalculator(private val validator: TimetableValidator) {
    fun calculate(courses: List<Course>): List<List<List<CourseClassRoom?>>> {
        val currentTimetable = Array<Array<CourseClassRoom?>>(HourPeriod.values().size) { Array(Day.values().size) { null } }
        val solutions = mutableListOf<List<List<CourseClassRoom?>>>()
        recursiveCalculate(courses, solutions, currentTimetable, 0)
        return solutions
    }

    private fun recursiveCalculate(courses: List<Course>, solutions: MutableList<List<List<CourseClassRoom?>>>, currentSolution: Array<Array<CourseClassRoom?>>, depth: Int) {
        for(i in 0 until courses[depth].courseSchedule.size) {
            val currentSchedule = courses[depth].courseSchedule[i]
            if(canAdd(currentSolution, currentSchedule.times)) {
                val courseClassRoom = CourseClassRoom(courses[depth].name, currentSchedule.classroom)
                currentSchedule.times.forEach { currentSolution[it.hourPeriod.ordinal][it.day.ordinal] = courseClassRoom }
                if(depth == courses.size -1) {
                    if(validator.isValidSolution(currentSolution)) {
                        val solutionCopy = currentSolution.map { solutionRow -> solutionRow.map { it } }
                        solutions.add(solutionCopy)
                    }
                } else {
                    recursiveCalculate(courses, solutions, currentSolution, depth + 1)
                }
                currentSchedule.times.forEach { currentSolution[it.hourPeriod.ordinal][it.day.ordinal] = null }
            }
        }

    }


    private fun canAdd(timetable: Array<Array<CourseClassRoom?>>, times: List<CourseTime>): Boolean {
        return times.all { timetable[it.hourPeriod.ordinal][it.day.ordinal] == null }
    }

}