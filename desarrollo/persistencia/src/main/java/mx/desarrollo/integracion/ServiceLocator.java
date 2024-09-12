/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;
import mx.desarrollo.DAO.*;
import mx.desarrollo.entidad.LearningUnit;

/**
 *
 * @author STARDUST
 */
public class ServiceLocator {
    private static final TeacherDAO teacherDAO = new TeacherDAO();
    private static final AdministratorDAO administratorDAO = new AdministratorDAO();
    private static final LearningUnitDAO learningUnitDAO = new LearningUnitDAO();

    public static TeacherDAO getInstanceTeacherDAO(){
        return teacherDAO;
    }

    public static AdministratorDAO getInstanceAdministratorDAO(){
        return administratorDAO;
    }

    public static LearningUnitDAO getInstanceLearningUnitDAO() {
        return learningUnitDAO;
    }
}
