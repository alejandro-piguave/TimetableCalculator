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
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(LUNES, DIECINUEVE),
                    CourseTime(MIERCOLES, DIECISIETE)
                )
            ),
        )
    ),
)
