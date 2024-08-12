package semester

import Course
import CourseSchedule
import CourseTime
import DIECINUEVE
import DIECISIETE
import JUEVES
import LUNES
import MARTES
import MIERCOLES
import NUEVE
import ONCE
import QUINCE
import TRECE
import VIERNES

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

