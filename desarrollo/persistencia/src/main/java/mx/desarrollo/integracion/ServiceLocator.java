/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;
import mx.desarrollo.DAO.AlumnoDAO;
import mx.desarrollo.DAO.UsuarioDAO;
/**
 *
 * @author STARDUST
 */
public class ServiceLocator {
    private static AlumnoDAO alumnoDAO;
    private static UsuarioDAO usuarioDAO;
    
    public static AlumnoDAO getInstanceAlumnoDAO(){
        if(alumnoDAO == null){
            alumnoDAO = new AlumnoDAO();
            return alumnoDAO;
        } else{
            return alumnoDAO;
        }
    }
  
    public static UsuarioDAO getInstanceUsuarioDAO(){
        if(usuarioDAO == null){
            usuarioDAO = new UsuarioDAO();
            return usuarioDAO;
        } else{
            return usuarioDAO;
        }
    }
}
