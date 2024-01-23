package seminar6;

import seminar6.presenter.*;
import seminar6.view.*;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentViewImpl();
        StudentController studentController = new StudentControllerImpl(studentView);

        studentController.addStudent("qwe", "asd", "zxc");
        studentController.addStudent("zxc", "asd", "qwe");
        studentController.showStudents();

        System.out.println();

        TeacherView teacherView = new TeacherViewImpl();
        TeacherController teacherController = new TeacherControllerImpl(teacherView);

        teacherController.addTeacher("rty", "fgh", "vbn");
        teacherController.addTeacher("vbn", "fgh", "rty");
        teacherController.showTeachers();

        System.out.println();

        teacherController.editTeacher(2, "QQQ", "PPP", "RRR");
        teacherController.showTeachers();
    }
}
