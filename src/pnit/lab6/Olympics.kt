package pnit.lab6

import java.util.*

data class Olympics constructor(override var date: Date, override var city: String, var place: String) : Event