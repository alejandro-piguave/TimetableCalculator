class TimetablePrinter {

    fun print(timetables: List<List<List<CourseClassRoom?>>>) {
        val horas = listOf("9:00-11:00","11:00-13:00","13:00-15:00","15:00-17:00","17:00-19:00","19:00-21:00")
        val cellLength = 12
        val header = listOf("Horas","Lunes","Martes", "Miércoles", "Jueves", "Viernes")
        timetables.forEachIndexed { index, timetable ->
            println("Horario #${index+1}")
            println("-".repeat(header.size*(cellLength+1)+1))
            // Header region
            print("|")
            header.forEach { print(String.format("%-${cellLength}s|", it)) }
            println()
            // Header region
            timetable.forEachIndexed { index, row ->
                print("|${String.format("%-${cellLength}s", horas[index])}|")

                row.forEach { courseClassroom ->
                    val text = courseClassroom?.let { "${it.course}-${it.classroom}" } ?: "·".repeat(12)
                    print("${String.format("%-${cellLength}s", text )}|")
                }
                println()
            }
            println("-".repeat(header.size*(cellLength+1)+1))
            println("\n")
        }
    }
}