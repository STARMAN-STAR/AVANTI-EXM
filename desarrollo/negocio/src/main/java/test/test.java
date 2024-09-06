/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import mx.desarrollo.entidad.Usuario_1;
import mx.desarrollo.integracion.ServiceFacadeLocator;
/**
 *
 * @author STARDUST
 */
public class test {
     public static void main(String[] args) {
        Usuario_1 usuario = new Usuario_1();
        
        usuario = ServiceFacadeLocator.getInstanceFacadeUsuario().login("contra123","francisco.reyes.parra@uabc.edu.mx");
        
        if(usuario.getIdusuario() != null){
            System.out.println("Login exitoso con el correo: " + usuario.getCorreo());
        }else{
            System.out.println("No se encontro registro");
        }
    }
}
