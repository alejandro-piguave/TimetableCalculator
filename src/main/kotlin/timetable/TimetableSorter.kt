package timetable

import data.course.CourseClassRoom

class TimetableSorter {
    fun sort(timetables: List<List<List<CourseClassRoom?>>> ): List<List<List<CourseClassRoom?>>> {
        return timetables.sortedBy { getScore(it) }
    }

    private fun getScore(timetable: List<List<CourseClassRoom?>>): Int {
        return timetable.mapIndexed { index, row ->
            row.count { it != null } * (index + 1)
        }.reduce { acc, unit -> acc + unit }
    }
}