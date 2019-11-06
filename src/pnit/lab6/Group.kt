package pnit.lab6

class Group (var id: Int) {
    var students: ArrayList<Student> = ArrayList()
    var studentsNumber: Int = 0
    val sortedStudents = students.sortedWith(compareBy<Student> {it.lastName}.thenBy {it.firstName}.thenBy {it.id})

    constructor(id: Int, studentsNumber: Int) : this (id){
        this.studentsNumber = studentsNumber
    }
    constructor(students: ArrayList<Student>) : this(0, students.size){
        this.students = students
    }

    fun removeStudent(id: Int){
        students.removeAt(id)
        studentsNumber--
    }

    fun addStudent(student: Student){
        students.add(student)
        studentsNumber++
    }


}
