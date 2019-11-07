package pnit.lab6

data class Group(var id: Int) {
    var students = ArrayList<Student>()
    var studentsNumber = 0

    constructor(id: Int, studentsNumber: Int) : this(id) {
        this.studentsNumber = studentsNumber
    }

    constructor(students: ArrayList<Student>) : this(0, students.size) {
        this.students = students
    }

    fun removeStudent(id: Int) {
        students.removeAt(id)
        studentsNumber--
    }

    fun addStudent(student: Student) {
        students.add(student)
        studentsNumber++
    }

    fun getSortedStudents(): List<Student> {
        return students.sortedWith(compareBy<Student> { it.lastName }.thenBy { it.firstName }.thenBy { it.id })
    }
    //TODO сделать через переменную и get() или через функцию?

    fun getActivists(): ArrayList<Student> {
        val studentsActivists: ArrayList<Student> = ArrayList()
        for (student: Student in students) {
            if (student.events > 0) {
                studentsActivists.add(student)
            }
        }
        return studentsActivists
    }

    fun getStudentsWinners(): ArrayList<Student> {
        val studentsWinners: ArrayList<Student> = ArrayList()
        for (student: Student in students) {
            if ((student.prizePlace == 1 or 2 or 3) or (student.projectNames?.isNotEmpty() != true)) {
                studentsWinners.add(student)
            }
        }
        return studentsWinners
    }


    private fun getBudgetStudentsNumber(): Int {
        var count = 0
        for (student: Student in students) {
            if (student !is ContractStudent) {
                count++
            }
            return count
        }
    }

    private fun getContractStudentsNumber(): Int {
        var count = 0
        for (student: Student in students) {
            if (student is ContractStudent) {
                count++
            }
            return count
        }
    }
}
