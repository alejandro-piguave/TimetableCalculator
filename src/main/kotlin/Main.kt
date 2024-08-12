import semester.firstSemester
import timetable.SolutionValidator
import timetable.TimetableCalculator
import timetable.TimetablePrinter

fun main() {

    val calculator = TimetableCalculator(SolutionValidator())
    val printer = TimetablePrinter()
    val solutions = calculator.calculate(firstSemester)
    printer.print(solutions)
}