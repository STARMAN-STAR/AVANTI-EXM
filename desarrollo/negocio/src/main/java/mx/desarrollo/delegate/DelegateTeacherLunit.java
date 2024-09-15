/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import mx.desarrollo.integracion.ServiceLocator;
import mx.desarrollo.entidad.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author STARDUST
 */
public class DelegateTeacherLunit {
    
    public List<Teacherlearningunit> getAllTeacherUnits(){
        return ServiceLocator.getinstanceTeacherLearningUnitDAO().findAll();
    }
    
    public void conectTeacherUnit(Teacher teacher, Learningunit unit){
        Teacherlearningunit ts= new Teacherlearningunit();
        ts.setId(0);
        ts.setTeacherId(teacher);
        ts.setLearningUnitId(unit.getId());
        try{
            ServiceLocator.getinstanceTeacherLearningUnitDAO().save(ts);
        }catch(Exception e){
            System.out.println("FAIL");
        }
    }
    
    public List<Learningunit> getLUnitByTeacher(Teacher teacher){
        List<Learningunit> aux = new ArrayList();
        List<Learningunit> tlu = ServiceLocator.getInstanceLearningUnitDAO().findAll();
        int idteacher=teacher.getId();
        for(Learningunit ls : tlu)
        for(Teacherlearningunit tl : ServiceLocator.getinstanceTeacherLearningUnitDAO().findAll())   
            if(ls.getId() == tl.getLearningUnitId() && idteacher == tl.getTeacherId().getId()){
                aux.add(ls);
            }
        return aux;
    }
}
