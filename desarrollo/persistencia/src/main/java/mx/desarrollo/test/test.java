/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.test;
import mx.desarrollo.DAO.*;
import mx.desarrollo.entidad.*;

public class test {
    public static void main(String[] args) {
       for(Teacher admin : new TeacherDAO().findAll()){
           System.out.println(admin.getFirstName());
       }
  for(Alumno admin : new AlumnoDAO().findAll()){
           System.out.println(admin.getApellidos());
       }
  for(Administrator admin : new administratorDAO().findAll()){
           System.out.println(admin.getEmail());
       }
    }
}
