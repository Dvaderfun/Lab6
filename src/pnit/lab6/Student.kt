package pnit.lab6

import java.lang.NullPointerException
import java.time.Year
import java.util.*
import kotlin.collections.ArrayList

open class Student @JvmOverloads constructor(var firstName: String, var lastName: String, var id: Int = 0, var eventsArray: ArrayList<Event> = ArrayList()) : Activist {
    var admissionYear: Year = Year.now()

    override var events: Int = 0
    override var prizePlace: Int = 0
    override var reportsNumber: Int = 0
    override var projectNames: String? = null

    fun addEvent(event: Event){
        eventsArray.add(event)
        events++
    }

    fun getEventByDate(date: Date): Event? {
        return eventsArray.single { event -> event.date == date }
    }

    fun deleteEventByDate(date: Date) {
        eventsArray.remove(getEventByDate(date))
    }
}

