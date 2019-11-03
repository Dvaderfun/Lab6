package pnit.lab6

class Group (var id: Int) {
    var students: Array<Student>
    var studentsNumber: Int

    init {
        students = emptyArray()
        studentsNumber = 0
    }
    constructor(id: Int, studentsNumber: Int = 0) : this (id){
        this.students = emptyArray()
        this.studentsNumber = studentsNumber
    }
    constructor(students: Array<Student>) : this(0, students.size){
        this.students = students
    }
}
