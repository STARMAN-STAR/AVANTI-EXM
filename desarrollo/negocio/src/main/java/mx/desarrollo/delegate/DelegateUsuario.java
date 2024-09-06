/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import java.util.List;
import mx.desarrollo.entidad.Usuario_1;
import mx.desarrollo.integracion.ServiceLocator;
/**
 *
 * @author STARDUST
 */
public class DelegateUsuario {

    public Usuario_1 login(String password, String correo){
        Usuario_1 usuario = new Usuario_1();
        List<Usuario_1> usuarios = ServiceLocator.getInstanceUsuarioDAO().findAll();
        
        for(Usuario_1 us:usuarios){
            if(us.getContrasena().equalsIgnoreCase(password) && us.getCorreo().equalsIgnoreCase(correo)){
                usuario = us;
            }
        }
        return usuario;
}
 public void saveUsario(Usuario_1 usuario){
        ServiceLocator.getInstanceUsuarioDAO().save(usuario);
    }
}
