package pnit.lab6

import java.time.Year

class Student @JvmOverloads constructor(var firstName: String, var lastName: String, var admissionYear: Year = Year.now(), var id: Int = 0)

