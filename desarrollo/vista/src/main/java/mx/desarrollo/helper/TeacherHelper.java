/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.helper;
import java.io.Serializable;
import mx.desarrollo.integracion.ServiceFacadeLocator;
import java.util.List;
import mx.desarrollo.entidad.Teacher;
/**
 *
 * @author STARDUST
 */
public class TeacherHelper implements Serializable {
    public List<Teacher> getAllTeachers(){
        return ServiceFacadeLocator.getInstanceFacadeTeacher().getAllTeacher();
    }
    
    public void saveTeacher(Teacher teacher){
        ServiceFacadeLocator.getInstanceFacadeTeacher().saveTeacher(teacher);
    }
    
    public void deleteTeacher(String username){
        ServiceFacadeLocator.getInstanceFacadeTeacher().deleteTeacher(username);
    }
    
    public void updateTeacher(Teacher teacher){
        ServiceFacadeLocator.getInstanceFacadeTeacher().updateTeacher(teacher);
    }
    
    public Teacher find(String username){
        return ServiceFacadeLocator.getInstanceFacadeTeacher().findTeacher(username);
    }
}
