fun main(args: Array<String>) {

    val firstSemester = listOf(
        Course(
            "AL",
            listOf(
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(MARTES, ONCE),
                        CourseTime(JUEVES, NUEVE)
                    ),
                ),
                CourseSchedule(
                    "CIC2",
                    listOf(
                        CourseTime(MIERCOLES, TRECE),
                        CourseTime(VIERNES, NUEVE)
                    )
                ),
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(MARTES, QUINCE),
                        CourseTime(JUEVES, DIECINUEVE)
                    )
                ),
                CourseSchedule(
                    "CIC2",
                    listOf(
                        CourseTime(MARTES, DIECISIETE),
                        CourseTime(JUEVES, QUINCE)
                    )
                )
            )
        ),
        Course(
            "ALP",

            listOf(

                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(VIERNES, ONCE),
                    )
                ),
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, QUINCE),
                    )
                ),
            )
        ),
        Course(
            "IPS",
            listOf(
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MIERCOLES, ONCE),
                        CourseTime(JUEVES, ONCE)
                    )
                ),
                CourseSchedule(
                    "CIC1",
                    listOf(
                        CourseTime(MIERCOLES, NUEVE),
                        CourseTime(JUEVES, NUEVE)
                    )
                ),
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MIERCOLES, DIECISIETE),
                        CourseTime(JUEVES, QUINCE)
                    )
                ),
            )
        ),
        Course(
            "IRM",
            listOf(

                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, ONCE),
                        CourseTime(MIERCOLES, NUEVE)
                    )
                ),
                CourseSchedule(
                    "CIC1",
                    listOf(
                        CourseTime(MARTES, NUEVE),
                        CourseTime(MIERCOLES, ONCE)
                    )
                ),
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, DIECISIETE),
                        CourseTime(MIERCOLES, DIECINUEVE)
                    )
                ),
            )
        ),
        Course(
            "CS",
            listOf(
                CourseSchedule(
                    "3104",
                    listOf(
                        CourseTime(MIERCOLES, ONCE),
                        CourseTime(VIERNES, ONCE)
                    )
                ),
                CourseSchedule(
                    "3203",
                    listOf(
                        CourseTime(MIERCOLES, NUEVE),
                        CourseTime(VIERNES, NUEVE)
                    )
                ),
                CourseSchedule(
                    "3104",
                    listOf(
                        CourseTime(MARTES, DIECINUEVE),
                        CourseTime(MIERCOLES, DIECISIETE)
                    )
                ),
            )
        ),
        Course(
            "GPR",
            listOf(
                CourseSchedule(
                    "3104",
                    listOf(
                        CourseTime(MARTES, ONCE),
                        CourseTime(JUEVES, ONCE)
                    )
                ),
                CourseSchedule(
                    "3203",
                    listOf(
                        CourseTime(MARTES, NUEVE),
                        CourseTime(JUEVES, NUEVE)
                    )
                ),
                CourseSchedule(
                    "3104",
                    listOf(
                        CourseTime(MARTES, DIECISIETE),
                        CourseTime(JUEVES, DIECISIETE)
                    )
                ),
            )
        ),

        Course(
            "VV",
            listOf(
                CourseSchedule(
                    "3104",
                listOf(
                    CourseTime(MIERCOLES, NUEVE),
                    CourseTime(VIERNES, NUEVE)
                )),
                CourseSchedule(
                    "3203",
                listOf(
                    CourseTime(MIERCOLES, ONCE),
                    CourseTime(JUEVES, ONCE)
                )),

                CourseSchedule(
                    "3104",
                listOf(
                    CourseTime(LUNES, DIECISIETE),
                    CourseTime(MIERCOLES, DIECINUEVE)
                )),
            )
        ),
    )

    val secondSemester = listOf(
        Course(
            "FEE",
            listOf(
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(MIERCOLES, NUEVE),
                        CourseTime(VIERNES, ONCE)
                    ),
                ),
                CourseSchedule(
                    "CIC2",
                    listOf(
                        CourseTime(MARTES, NUEVE),
                        CourseTime(JUEVES, ONCE)
                    )
                ),
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(MARTES, DIECINUEVE),
                        CourseTime(MIERCOLES, DIECINUEVE)
                    )
                ),
                CourseSchedule(
                    "CIC2",
                    listOf(
                        CourseTime(MARTES, DIECINUEVE),
                        CourseTime(MIERCOLES, DIECINUEVE)
                    )
                )
            )
        ),
        Course(
            "PCA",
            listOf(
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(MIERCOLES, TRECE),
                        CourseTime(VIERNES, NUEVE)
                    ),
                ),
                CourseSchedule(
                    "CIC2",
                    listOf(
                        CourseTime(MIERCOLES, ONCE),
                        CourseTime(VIERNES, TRECE)
                    )
                ),
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(LUNES, DIECISIETE),
                        CourseTime(JUEVES, DIECINUEVE)
                    )
                ),
                CourseSchedule(
                    "CIC2",
                    listOf(
                        CourseTime(LUNES, DIECISIETE),
                        CourseTime(JUEVES, DIECISIETE)
                    )
                )
            )
        ),
        Course(
            "SI",
            listOf(
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(MARTES, ONCE),
                    ),
                ),
                CourseSchedule(
                    "CIC2",
                    listOf(
                        CourseTime(VIERNES, NUEVE),
                    )
                ),
                CourseSchedule(
                    "3301",
                    listOf(
                        CourseTime(LUNES, DIECINUEVE),
                    )
                ),
            )
        ),
        Course(
            "ADS",
            listOf(

                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MIERCOLES, ONCE),
                        CourseTime(VIERNES, NUEVE)
                    )
                ),
                CourseSchedule(
                    "CIC1",
                    listOf(
                        CourseTime(MARTES, TRECE),
                        CourseTime(VIERNES, ONCE)
                    )
                ),
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, DIECINUEVE),
                        CourseTime(JUEVES, DIECINUEVE)
                    )
                ),
            )
        ),
        Course(
            "BDA",
            listOf(

                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, ONCE),
                        CourseTime(JUEVES, ONCE)
                    )
                ),
                CourseSchedule(
                    "CIC1",
                    listOf(
                        CourseTime(MIERCOLES, ONCE),
                        CourseTime(JUEVES, TRECE)
                    )
                ),
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, QUINCE),
                        CourseTime(JUEVES, QUINCE)
                    )
                ),
            )
        ),
        Course(
            "EMS",
            listOf(

                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, NUEVE),
                        CourseTime(JUEVES, NUEVE)
                    )
                ),
                CourseSchedule(
                    "CIC1",
                    listOf(
                        CourseTime(MARTES, ONCE),
                        CourseTime(JUEVES, ONCE)
                    )
                ),
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MARTES, DIECISIETE),
                        CourseTime(JUEVES, DIECISIETE)
                    )
                ),
            )
        ),

        Course(
            "CDIG",
            listOf(

                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(MIERCOLES, TRECE),
                        CourseTime(VIERNES, TRECE)
                    )),
                CourseSchedule(
                    "CIC3",
                    listOf(
                        CourseTime(LUNES, DIECINUEVE),
                        CourseTime(MIERCOLES, DIECISIETE)
                    )),
            )
        ),
    )


    val calculator = TimetableCalculator()
    val printer = TimetablePrinter()
    val solutions = calculator.calculate(firstSemester)
    printer.print(solutions)
}