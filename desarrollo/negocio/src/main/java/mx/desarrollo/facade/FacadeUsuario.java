/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;


import mx.desarrollo.delegate.DelegateUsuario;
import mx.desarrollo.entidad.Usuario_1;
/**
 *
 * @author STARDUST
 */
public class FacadeUsuario {
     private final DelegateUsuario delegateUsuario;

    public FacadeUsuario() {
        this.delegateUsuario = new DelegateUsuario();
    }
  
    public Usuario_1 login(String password, String correo){
        return delegateUsuario.login(password, correo);
    }
    
    public void saveUsario(Usuario_1 usuario){
        delegateUsuario.saveUsario(usuario);
    }
}
