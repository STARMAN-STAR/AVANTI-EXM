package mx.desarrollo.delegate;

import mx.desarrollo.entidad.Teacher;
import mx.desarrollo.integracion.ServiceLocator;

import java.util.List;

public class DelegateTeacher {
    
    public Teacher auth(String username, String password) {
      List<Teacher> aux= ServiceLocator.getInstanceTeacherDAO().findAll();
      for(Teacher teacher: aux)
          if(teacher.getUsername().equals(username) && teacher.getPassword().equals(password))
              return teacher;
      
      return null;
    }
    
    public Teacher find(String username){
        List<Teacher> aux= ServiceLocator.getInstanceTeacherDAO().findAll();
        for(Teacher teacher: aux)
          if(teacher.getUsername().equalsIgnoreCase(username))
              return teacher;
        
      return null;
    }
    
    public void save(Teacher teacher) {
        if(find(teacher.getUsername()) == null){   
         ServiceLocator.getInstanceTeacherDAO().save(teacher);
        }else{
            System.out.println("ALREADY EXIST");
        }
    }

    public void update(Teacher teacher) {
       ServiceLocator.getInstanceTeacherDAO().update(teacher);
    }
    
    public void delete(String nombre){
        ServiceLocator.getInstanceTeacherDAO().delete(find(nombre));
    }
    
    public List<Teacher> getAllTeachers(){
        return ServiceLocator.getInstanceTeacherDAO().findAll();
    }
}
