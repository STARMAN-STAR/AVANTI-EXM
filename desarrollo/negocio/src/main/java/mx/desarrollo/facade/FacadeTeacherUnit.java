/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;
import mx.desarrollo.delegate.DelegateTeacherLunit;
import mx.desarrollo.entidad.*;
import java.util.List;
/**
 *
 * @author STARDUST
 */
public class FacadeTeacherUnit {
    private final DelegateTeacherLunit teacherunit;
    
    public FacadeTeacherUnit(){
        teacherunit= new DelegateTeacherLunit();
    }
    public List<Teacherlearningunit> getTeacherUnits(){
        return teacherunit.getAllTeacherUnits();
    }
    
    public void conectTeacherUnit(Teacher teacher , List<Learningunit> unit){
        teacherunit.conectTeacherUnit( teacher, unit);
    }
     public List<Learningunit> getLUnitByTeacher(Teacher teacher){
         return teacherunit.getLUnitByTeacher(teacher);
     }
}
