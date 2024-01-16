package seminar4.HW;

import seminar4.UserController;

import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private List<Teacher> teachersList = new ArrayList<>();

    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    @Override
    public Teacher addUser(String secondName, String firstName, String lastName) {
        Teacher newTeacher = new Teacher(secondName, firstName, lastName);
        teachersList.add(newTeacher);
        return newTeacher;
    }

    public void editTeacherById (int teacherId, String secondName, String firstName, String lastName) {
        for (Teacher teacher: teachersList) {
            if (teacher.teacherId == teacherId) {
                teacher.setSecondName(secondName);
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                break;
            }
        }
    }
}
