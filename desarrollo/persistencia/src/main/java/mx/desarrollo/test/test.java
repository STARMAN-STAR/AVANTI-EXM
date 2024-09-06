/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.test;

/**
 *
 * @author STARDUST
 */
import java.util.ArrayList;
import java.util.List;
import mx.desarrollo.DAO.UsuarioDAO;
import mx.desarrollo.entidad.Usuario_1;

public class test {
        public static void main(String[] args) {
        List<Usuario_1> listaUsuarios = new ArrayList();
        UsuarioDAO usuarioDao = new UsuarioDAO();
        listaUsuarios = usuarioDao.findAll();
        
        for(Usuario_1 us : listaUsuarios){
            System.out.println("Correo: " + us.getCorreo());
        }
    }
}
