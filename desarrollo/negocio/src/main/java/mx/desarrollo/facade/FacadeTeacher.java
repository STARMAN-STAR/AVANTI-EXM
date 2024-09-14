package mx.desarrollo.facade;

import java.util.List;
import mx.desarrollo.delegate.DelegateTeacher;
import mx.desarrollo.entidad.Teacher;

public class FacadeTeacher {
    private final DelegateTeacher delegateTeacher;
    
    public FacadeTeacher(){
        delegateTeacher = new DelegateTeacher();
    }
    
    public void saveTeacher(Teacher teacher){
        delegateTeacher.save(teacher);
    }
    
    public void deleteTeacher(String name){
        delegateTeacher.delete(name);
    }
    
    public Teacher authTeacher(String name, String password){
        return delegateTeacher.auth(name, password);
    }
    
    public Teacher findTeacher(String nombre){
        return delegateTeacher.find(nombre);
    }
    
    public void updateTeacher(Teacher teacher){
        delegateTeacher.update(teacher);
    }
    
    public List<Teacher> getAllTeacher(){
        return delegateTeacher.getAllTeachers();
    }
}
