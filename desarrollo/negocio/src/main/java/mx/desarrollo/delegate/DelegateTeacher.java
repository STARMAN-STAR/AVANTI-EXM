package mx.desarrollo.delegate;

import mx.desarrollo.DAO.TeacherDAO;
import mx.desarrollo.entidad.Teacher;
import mx.desarrollo.integracion.ServiceLocator;

import java.util.List;

public class DelegateTeacher {
    
    public Teacher auth(String username, String password) {
       List<Teacher> teachers = ServiceLocator.getInstanceTeacherDAO().executeQuery("SELECT * FROM Teachers WHERE username = '" + username + "'" + " AND password = '" + password + "'");
      
       return teachers.get(0);
    }

    public void save(Teacher teacher) {
        TeacherDAO teacherDAO = ServiceLocator.getInstanceTeacherDAO();
        teacherDAO.save(teacher);
    }

    public void update(Teacher teacher) {
        TeacherDAO teacherDAO = ServiceLocator.getInstanceTeacherDAO();
        teacherDAO.update(teacher);
    }
    
    public List<Teacher> getAllTeachers(){
        return ServiceLocator.getInstanceTeacherDAO().findAll();
    }
}
