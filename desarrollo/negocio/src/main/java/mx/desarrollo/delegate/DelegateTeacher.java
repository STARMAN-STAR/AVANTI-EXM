package mx.desarrollo.delegate;

import mx.desarrollo.DAO.TeacherDAO;
import mx.desarrollo.entidad.Teacher;
import mx.desarrollo.integracion.ServiceLocator;

import java.util.List;

public class DelegateTeacher {
    public Teacher auth(String username, String password) {
       TeacherDAO teacherDAO = ServiceLocator.getInstanceTeacherDAO();

       List<Teacher> teachers = teacherDAO.executeQuery("SELECT * FROM Teachers WHERE username = '" + username + "'" + " AND password = '" + password + "'");
       return teachers.get(0);
    }

    public Teacher save(Teacher teacher) {
        TeacherDAO teacherDAO = ServiceLocator.getInstanceTeacherDAO();
        teacherDAO.save(teacher);

        return teacher;
    }

    public Teacher update(Teacher teacher) {
        TeacherDAO teacherDAO = ServiceLocator.getInstanceTeacherDAO();
        teacherDAO.update(teacher);

        return teacher;
    }
}
