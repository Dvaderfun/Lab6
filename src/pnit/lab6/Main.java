package pnit.lab6;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Abraham","Lincoln");
        Student student2 = new Student("Zack","Arnold");
        Student student3 = new Student("Rudolf","Arnold");
        Student student4 = new Student("Hitler","Boris");
        Student student5 = new Student("Boris","Lindon");

        Olympics olympics = new Olympics(null, "", "");

        Payment payment = new Payment(1300, new Date());
        Payment payment2 = new Payment(1300, new Date());
        Payment payment3 = new Payment(1300, new Date());

        ContractStudent student6 = new ContractStudent("2", "2");
        student6.addPayment(payment);
        student6.addPayment(payment2);
        student6.addPayment(payment3);
        System.out.println(student6.getPayments());

        Group group = new Group(1);
        group.addStudent(student);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        for (int i = 0; i < group.getStudents().size(); i++) {
            System.out.println(group.getSortedStudents().get(i).getFirstName() + " " + group.getSortedStudents().get(i).getLastName());
        }


    }
}
