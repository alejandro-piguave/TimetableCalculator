package data.semester

import data.course.Course
import data.course.CourseSchedule
import data.course.CourseTime
import data.days.Day
import data.hours.HourPeriod

val firstSemester = listOf(
    Course(
        "AL",
        listOf(
            CourseSchedule(
                "3301",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.THURSDAY, HourPeriod.NINE)
                ),
            ),
            CourseSchedule(
                "CIC2",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.THIRTEEN),
                    CourseTime(Day.FRIDAY, HourPeriod.NINE)
                )
            ),
            CourseSchedule(
                "3301",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.FIFTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.NINETEEN)
                )
            ),
            CourseSchedule(
                "CIC2",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.FIFTEEN)
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
                    CourseTime(Day.FRIDAY, HourPeriod.ELEVEN),
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.FIFTEEN),
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
                    CourseTime(Day.WEDNESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.THURSDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "CIC1",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINE),
                    CourseTime(Day.THURSDAY, HourPeriod.NINE)
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.FIFTEEN)
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
                    CourseTime(Day.TUESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINE)
                )
            ),
            CourseSchedule(
                "CIC1",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.NINE),
                    CourseTime(Day.WEDNESDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "CIC3",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINETEEN)
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
                    CourseTime(Day.WEDNESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.FRIDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "3203",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINE),
                    CourseTime(Day.FRIDAY, HourPeriod.NINE)
                )
            ),
            CourseSchedule(
                "3104",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.NINETEEN),
                    CourseTime(Day.WEDNESDAY, HourPeriod.SEVENTEEN)
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
                    CourseTime(Day.TUESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.THURSDAY, HourPeriod.ELEVEN)
                )
            ),
            CourseSchedule(
                "3203",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.NINE),
                    CourseTime(Day.THURSDAY, HourPeriod.NINE)
                )
            ),
            CourseSchedule(
                "3104",
                listOf(
                    CourseTime(Day.TUESDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.THURSDAY, HourPeriod.SEVENTEEN)
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
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINE),
                    CourseTime(Day.FRIDAY, HourPeriod.NINE)
                )),
            CourseSchedule(
                "3203",
                listOf(
                    CourseTime(Day.WEDNESDAY, HourPeriod.ELEVEN),
                    CourseTime(Day.THURSDAY, HourPeriod.ELEVEN)
                )),

            CourseSchedule(
                "3104",
                listOf(
                    CourseTime(Day.MONDAY, HourPeriod.SEVENTEEN),
                    CourseTime(Day.WEDNESDAY, HourPeriod.NINETEEN)
                )),
        )
    )
)

