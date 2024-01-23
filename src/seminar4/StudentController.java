package seminar4;

import seminar6.presenter.TeacherController;

public class StudentController implements TeacherController.UserController<Student> {

    @Override
    public Student addUser(String secondName, String firstName, String lastName) {
        return new Student(1, secondName, firstName, lastName);
    }
}
