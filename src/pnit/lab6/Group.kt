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

    fun getActivists(): List<Student> {
        return students.filter {student -> student.events > 0}
    }

    fun getStudentsWinners(): List<Student> {
        return students.filter {student -> (student.prizePlace == 1 or 2 or 3) or (student.projectNames?.isNotEmpty() != true)}
    }


    fun getBudgetStudentsNumber(): Int {
        return students.filter {student -> student !is ContractStudent}.size
    }

    fun getContractStudentsNumber(): Int {
        return students.filter {student -> student is ContractStudent}.size
    }
}
