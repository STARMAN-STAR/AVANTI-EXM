/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.List;
import mx.desarrollo.entidad.*;
import mx.desarrollo.integracion.ServiceFacadeLocator;
/**
 *
 * @author STARDUST
 */
public class test {
    public static void main(String[] args) {
        Teacher ts=ServiceFacadeLocator.getInstanceFacadeTeacher().findTeacher("laurasanchez");
//        List<Learningunit> lu = new ArrayList();
//        lu.add(ServiceFacadeLocator.getInstanceLearningUnit().find("Matemáticas"));
//        lu.add(ServiceFacadeLocator.getInstanceLearningUnit().find("Física"));
//
//        ServiceFacadeLocator.getInstanceFacadeTeacherUnit().conectTeacherUnit(ts, lu);
//        
//        List<Learningunit> tlu = ServiceFacadeLocator.getInstanceFacadeTeacherUnit().getLUnitByTeacher(ts);
//        tlu.forEach((unit)->{System.out.println("NOMBRE DEL PROFESOR "+ts.getFirstName()+" UNIDADES ACADEMICAS "+unit.getName());});
        ServiceFacadeLocator.getInstanceFacadeTeacher().updateTeacher(new Teacher(1,"Juan","Tilin","Nose","Eso","Que"));
    }
}
