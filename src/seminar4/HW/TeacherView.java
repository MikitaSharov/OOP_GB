package seminar4.HW;

import seminar4.UserView;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> teachersList) {
        for (Teacher teacher: teachersList) {
            System.out.println(teacher);
        }
    }
}
