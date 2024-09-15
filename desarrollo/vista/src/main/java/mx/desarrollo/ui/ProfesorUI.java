/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import javax.enterprise.context.SessionScoped;
import mx.desarrollo.helper.TeacherHelper;
import mx.desarrollo.entidad.Teacher;
import javax.faces.bean.ManagedBean;
import java.util.List;
import java.io.Serializable;

/**
 *
 * @author PC
 */

@ManagedBean (name = "Profesor")
@SessionScoped
public class ProfesorUI implements Serializable {
    private final TeacherHelper helper; 
    private List<Teacher> teachers;
    private Teacher teacher;
    private String username;
    private String password;
    private String apellidos;
    private String nombres;
    private String rfc;
    
    public ProfesorUI(){
      helper = new TeacherHelper();
      this.teachers = helper.getAllTeachers();
    }

    public void saveTeacher(String nombres, String apellidos, String rfc, String username, String password){
        helper.saveTeacher(new Teacher(0,nombres,apellidos,rfc,username, password));
    }
    
    public void updateTeacher(String nombres, String apellidos, String rfc, String username, String password){
        helper.updateTeacher(new Teacher(0,nombres,apellidos,rfc,username, password));
    }
    
    public void deleteTeacher(String username){
        helper.deleteTeacher(username);
    }
    
    
    public List<Teacher> getTeachers(){
        return teachers;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

      public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
