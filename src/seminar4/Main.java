package seminar4;

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
    }
}
