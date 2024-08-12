package data.semester

import data.course.Course
import data.course.CourseSchedule
import data.course.CourseTime
import data.days.Day
import data.hours.HourPeriod

val secondSemester = listOf(
    Course(
        "FEE",
        listOf(
            CourseSchedule(
                "3301",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINE),
                    CourseTime(Day.FRIDAY, HourPeriod.ELEVEN)
                ),
            ),
            CourseSchedule(
                "CIC2",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.NINE),
                    CourseTime(Day.THURSDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "3301",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.NINETEEN),
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINETEEN)
                )
            ),
            CourseSchedule(
                "CIC2",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.NINETEEN),
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINETEEN)
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
                    CourseTime(Day.WEDNESDAY, HourPeriod.THIRTEEN),
                    CourseTime(Day.FRIDAY, HourPeriod.NINE)
                ),
            ),
            CourseSchedule(
                "CIC2",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.FRIDAY, HourPeriod.THIRTEEN)
                )
            ),
            CourseSchedule(
                "3301",
                listOf(
                    CourseTime(Day.MONDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.NINETEEN)
                )
            ),
            CourseSchedule(
                "CIC2",
                listOf(
                    CourseTime(Day.MONDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.SEVENTEEN)
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
                    CourseTime(Day.TUESDAY, HourPeriod.ELEVEN),
                ),
            ),
            CourseSchedule(
                "CIC2",
                listOf(
                    CourseTime(Day.FRIDAY, HourPeriod.NINE),
                )
            ),
            CourseSchedule(
                "3301",
                listOf(
                    CourseTime(Day.MONDAY, HourPeriod.NINETEEN),
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
                    CourseTime(Day.WEDNESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.FRIDAY, HourPeriod.NINE)
                )
            ),
            CourseSchedule(
                "CIC1",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.THIRTEEN),
                    CourseTime(Day.FRIDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.NINETEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.NINETEEN)
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
                    CourseTime(Day.TUESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.THURSDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "CIC1",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.THURSDAY, HourPeriod.THIRTEEN)
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.FIFTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.FIFTEEN)
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
                    CourseTime(Day.TUESDAY, HourPeriod.NINE),
                    CourseTime(Day.THURSDAY, HourPeriod.NINE)
                )
            ),
            CourseSchedule(
                "CIC1",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.THURSDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.SEVENTEEN)
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
                    CourseTime(Day.WEDNESDAY, HourPeriod.THIRTEEN),
                    CourseTime(Day.FRIDAY, HourPeriod.THIRTEEN)
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(Day.MONDAY, HourPeriod.NINETEEN),
                    CourseTime(Day.WEDNESDAY, HourPeriod.SEVENTEEN)
                )
            ),
        )
    ),
)
