package pnit.lab6

import java.util.*

fun main(args: Array<String>) {
    val student = Student("Abraham", "Lincoln")
    val student2 = Student("Zack", "Arnold")
    val student3 = Student("Rudolf", "Arnold")
    val student4 = Student("Hitler", "Boris")
    val student5 = Student("Boris", "Lindon")

    val olympics = Olympics(Date(), "", "")

    val payment = Payment(1300.0, Date())
    val payment2 = Payment(1300.0, Date())
    val payment3 = Payment(1300.0, Date())

    val student6 = ContractStudent("2", "2")
    val student7 = ContractStudent("2", "2")

    student6.addPayment(payment)
    student6.addPayment(payment2)
    student6.addPayment(payment3)
    println(student6.payments)

    val group = Group(1)
    group.addStudent(student)
    group.addStudent(student2)
    group.addStudent(student3)
    group.addStudent(student7)
    group.addStudent(student4)
    group.addStudent(student5)
    group.addStudent(student6)
    println(group.toString())

}