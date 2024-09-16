/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.helper;

import mx.desarrollo.integracion.ServiceFacadeLocator;
import mx.desarrollo.entidad.Teacherlearningunit;
import mx.desarrollo.entidad.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author STARDUST
 */
public class teacherUnitHelper implements Serializable{
    
    public List<Teacherlearningunit> getTeacherUnits(){
        return ServiceFacadeLocator.getInstanceFacadeTeacherUnit().getTeacherUnits();
    }
    
    public List<Learningunit> getUnitsbyTeacher(Teacher teacher){
        return ServiceFacadeLocator.getInstanceFacadeTeacherUnit().getLUnitByTeacher(teacher);
    }
    
    public void conectTeacherUnit(Teacher teacher, List<Learningunit> unit){
        ServiceFacadeLocator.getInstanceFacadeTeacherUnit().conectTeacherUnit(teacher, unit);
    }
    
}
