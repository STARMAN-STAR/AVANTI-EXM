/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import mx.desarrollo.entidad.Teacher;
import mx.desarrollo.integracion.ServiceFacadeLocator;
import java.util.Date;
import mx.desarrollo.entidad.*;
/**
 *
 * @author STARDUST
 */
public class test {
     public static void main(String[] args) {
//       Administrator admin=  new DelegateAdministrator().auth("admin3@example.com", "password789");   
//       System.out.println("BIENVENIDO ADMINITRADOR:"+admin.getEmail());
// Administrator admin=  new FacadeAdministrator().auth("admin3@example.com", "password789");   
//       System.out.println("BIENVENIDO ADMINITRADOR:"+admin.getEmail());
//      Administrator admin=  ServiceFacadeLocator.getInstanceFacadeAdministrator().auth("admin3@example.com", "password789");   
//       System.out.println("BIENVENIDO ADMINITRADOR:"+admin.getEmail());
        ServiceFacadeLocator.getInstanceFacadeTeacher().getAllTeacher().forEach((teacher) -> {
            System.out.println(teacher.getUsername()+""+teacher.getId());
                 });
//        ServiceFacadeLocator.getInstanceFacadeTeacher().deleteTeacher("juanperez");

//        ServiceFacadeLocator.getInstanceFacadeAdministrator(new Administrator(1,"Juan", "Pérez"));
//        
//        
//    try{
    ServiceFacadeLocator.getInstanceLearningUnit().saveLearningUnit(new Learningunit(0, "Programacion Orientada a Objetos", 5, 3 , 4));
//    }catch(Exception e){
//        
//    }    
//            ServiceFacadeLocator.getInstanceLearningUnit().deleteLearningUnit("Calculo Integral");
//        
        ServiceFacadeLocator.getInstanceLearningUnit().getAllLearningUnit().forEach((unit)->{
            System.out.println(unit.getName()+" "+unit.getId());
        });
     }
}
