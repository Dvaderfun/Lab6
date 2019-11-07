package pnit.lab6

import java.util.*

data class Conference constructor(override var date: Date, override var city: String, var reportTitle: String): Event