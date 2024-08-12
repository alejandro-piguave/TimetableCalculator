import data.semester.firstSemester
import timetable.TimetableCalculator
import timetable.TimetablePrinter
import timetable.TimetableSorter
import timetable.TimetableValidator

fun main() {

    val validatorConfig = TimetableValidator.Config()
    val calculator = TimetableCalculator(TimetableValidator(validatorConfig))
    val sorter = TimetableSorter()
    val printer = TimetablePrinter()


    //FIRST SCENARIO
    val cases = listOf(
        firstSemester.filterNot { it.name == "GPR" },
        firstSemester.filterNot { it.name == "VV" },
        firstSemester.filterNot { it.name == "CS" }
    )

//    val cases = listOf(
//        secondSemester.filterNot { it.name == "ADS" },
//        secondSemester.filterNot { it.name == "BDA" },
//        secondSemester.filterNot { it.name == "EMS" },
//        secondSemester.filterNot { it.name == "CDIG" },
//        )

    var solutions = cases.flatMap { case -> calculator.calculate(case) }
    solutions = sorter.sort(solutions)
    printer.print(solutions)

}