package pnit.lab6

import java.util.*

data class Payment constructor (var money: Double, var date: Date?) {
    constructor(): this(0.0, null)
}