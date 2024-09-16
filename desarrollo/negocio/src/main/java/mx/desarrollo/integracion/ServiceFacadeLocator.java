/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;
import mx.desarrollo.facade.*;

/**
 *
 * @author STARDUST
 */
public class ServiceFacadeLocator {
    private static FacadeAdministrator facadeAdministrator;
    private static FacadeLearningUnit facadeLearningUnit;
    private static FacadeTeacher facadeTeacher;
    private static FacadeTeacherUnit facadeTeacherUnit;

    public static FacadeAdministrator getInstanceFacadeAdministrator() {
        return (facadeAdministrator == null) ? facadeAdministrator = new FacadeAdministrator() : facadeAdministrator;
    }

    public static FacadeLearningUnit getInstanceLearningUnit() {
        return (facadeLearningUnit == null) ? facadeLearningUnit = new FacadeLearningUnit() : facadeLearningUnit;
    }

    public static FacadeTeacher getInstanceFacadeTeacher() {
        return (facadeTeacher == null) ? facadeTeacher = new FacadeTeacher() : facadeTeacher;

    }
    
    public static FacadeTeacherUnit getInstanceFacadeTeacherUnit(){
        return (facadeTeacherUnit == null) ? facadeTeacherUnit = new FacadeTeacherUnit() : facadeTeacherUnit;
    }
}
