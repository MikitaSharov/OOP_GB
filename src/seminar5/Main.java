package seminar5;

import seminar5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("qwe", "asd", "zxc");
        controller.createStudent("rty", "fgh", "vbn");
        controller.createTeacher("poi", "lkj", "mnb");
        controller.printStudentsList(controller.getStudentsList());

        System.out.println();

        controller.createStudent("www", "qqq", "eee");
        controller.createStudent("aaa", "sss", "ddd");
        controller.printStudentsList(controller.getStudentsList());

        System.out.println();

        controller.printStudyGroup(controller.createStudyGroup(1, 2, 4));
    }
}
