package data.course

import data.days.Day
import data.hours.HourPeriod

data class Course(val name: String, val courseSchedule: List<CourseSchedule>)

data class CourseSchedule(val classroom: String, val times: List<CourseTime>)
data class CourseTime(val day: Day, val hourPeriod: HourPeriod)

data class CourseClassRoom(val course: String, val classroom: String)