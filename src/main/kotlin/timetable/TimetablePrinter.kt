package timetable

import data.course.CourseClassRoom
import data.days.Day
import data.hours.HourPeriod

class TimetablePrinter {

    companion object {
        private const val CELL_WIDTH = 12
    }

    fun print(timetables: List<List<List<CourseClassRoom?>>>) {
        timetables.forEachIndexed { index, timetable ->
            println("Horario #${index+1}")
            printHyphen((Day.values().size+1)*(CELL_WIDTH+1)+1)
            // Header region
            print("|")
            printHeaderColumn("Horas")
            Day.values().forEach { printHeaderColumn(it.dayName) }
            println()
            // Header region

            timetable.forEachIndexed { timetableIndex, row ->
                print("|${String.format("%-${CELL_WIDTH}s", HourPeriod.values()[timetableIndex].periodName)}|")

                row.forEach { courseClassroom ->
                    val text = courseClassroom?.let { "${it.course}-${it.classroom}" } ?: "·".repeat(12)
                    print("${String.format("%-${CELL_WIDTH}s", text )}|")
                }
                println()
            }
            printHyphen((Day.values().size+1)*(CELL_WIDTH+1)+1)
            println("\n")
        }
    }

    private fun printHeaderColumn(text: String) {
        print(String.format("%-${CELL_WIDTH}s|", text))
    }


    private fun printHyphen(count: Int) {
        println("-".repeat(count))
    }
}