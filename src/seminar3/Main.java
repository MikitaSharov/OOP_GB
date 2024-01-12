package seminar3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "aab", "aab", "aab");
        Student student2 = new Student(2, "aaa", "aaa", "aaa");
        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
        Student student4 = new Student(1, "bbb", "bbb", "bbb");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.firstName.equals("aab"))
//                iterator.remove();
//            else
//                System.out.println(student);
//        }

        StudentGroupService service = new StudentGroupService(studentGroup);
//        service.removeByFIO("aaa", "aaa", "aaa");

        List<Student> sortedStudents = service.sortedByID();
        for (Student student: sortedStudents) {
            System.out.println(student);
        }
        System.out.println();
        sortedStudents = service.sortedByFIO();
        for (Student student: sortedStudents) {
            System.out.println(student);
        }


    }
}
