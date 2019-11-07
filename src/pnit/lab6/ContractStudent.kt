package pnit.lab6

import java.time.Year

class ContractStudent @JvmOverloads constructor(
    firstName: String,
    lastName: String,
    id: Int = 0
) : Student(firstName, lastName, id) {
    val payments: ArrayList<Payment> = ArrayList()
    val semesterFee: Double = 23750.0

    fun addPayment(payment: Payment) {
        payments.add(payment)
    }
}