package pnit.lab6

import java.util.*

data class Competition constructor(override var date: Date, override var city: String, var projectTitle: String, var winAmount: Double) : Event