import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.time.Month
import kotlin.time.measureTime

fun main() {
    var date =LocalDate.now()
    println("current date is $date")
    var time =LocalTime.now()
    println("current time is $time")
    var mn = date.month
    println(mn)
    var dy =date.dayOfWeek
    println(dy)
    var yr =date.year
    println(yr)


}




