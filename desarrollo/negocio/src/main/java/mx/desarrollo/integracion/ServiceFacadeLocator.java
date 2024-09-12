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
    private static final FacadeAdministrator facadeAdministrator = new FacadeAdministrator();
    private static final FacadeLearningUnit facadeLearningUnit = new FacadeLearningUnit();
    private static final FacadeTeacher facadeTeacher = new FacadeTeacher();

    public static FacadeAdministrator getInstanceFacadeAdministrator() {
        return facadeAdministrator;
    }

    public static FacadeLearningUnit getInstanceLearningUnit() {
        return facadeLearningUnit;
    }

    public static FacadeTeacher getInstanceFacadeTeacher() {
        return facadeTeacher;
    }
}
