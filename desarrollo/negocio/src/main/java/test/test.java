/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import mx.desarrollo.delegate.DelegateAdministrator;
import mx.desarrollo.entidad.Administrator;
import mx.desarrollo.facade.FacadeAdministrator;
import mx.desarrollo.integracion.ServiceFacadeLocator;
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
      Administrator admin=  ServiceFacadeLocator.getInstanceFacadeAdministrator().auth("admin3@example.com", "password789");   
       System.out.println("BIENVENIDO ADMINITRADOR:"+admin.getEmail());
     }
}
