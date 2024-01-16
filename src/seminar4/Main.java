package seminar4;

import seminar4.HW.Teacher;
import seminar4.HW.TeacherController;
import seminar4.HW.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(studentController.addUser("qwe", "asd", "zxc"));
        studentsList.add(studentController.addUser("zxc", "asd", "qwe"));

        StudentView printStudents = new StudentView();
        printStudents.sendOnConsole(studentsList);
        System.out.println();

        TeacherController teacherController = new TeacherController();
        teacherController.addUser("rty", "fgh", "vbn");
        teacherController.addUser("vbn", "fgh", "rty");

        TeacherView printTeachers = new TeacherView();
        printTeachers.sendOnConsole(teacherController.getTeachersList());
        System.out.println();

        teacherController.editTeacherById(2, "vbn", "ppp", "rty");
        printTeachers.sendOnConsole(teacherController.getTeachersList());
    }
}
