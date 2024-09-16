/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import java.io.IOException;
import mx.desarrollo.entidad.Teacherlearningunit;
import javax.enterprise.context.SessionScoped;
import mx.desarrollo.helper.teacherUnitHelper;
import mx.desarrollo.entidad.Learningunit;
import mx.desarrollo.helper.TeacherHelper;
import mx.desarrollo.entidad.Teacher;
import javax.faces.bean.ManagedBean;
import java.util.List;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import mx.desarrollo.entidad.Administrator;
import mx.desarrollo.helper.LoginHelper;

/**
 *
 * @author PC
 */

@ManagedBean (name = "Profesor")
@SessionScoped
public class ProfesorUI implements Serializable {
    private List<Teacherlearningunit> tlearningunit;
    private final teacherUnitHelper helperLUNIT;
    private final TeacherHelper helper; 
    private int selectedId;
    private List<Teacher> teachers;
    private String apellidos;
    private String username;
    private String password;
    private Teacher teacher;
    private String nombres;
    private String rfc;
    
    private LoginHelper loginHelper;
    
    public ProfesorUI(){
      loginHelper = new LoginHelper(); 
      helper = new TeacherHelper();
      helperLUNIT = new teacherUnitHelper();
      this.teachers = helper.getAllTeachers();
      this.tlearningunit = helperLUNIT.getTeacherUnits();
    }

    public void limpiarCampos(){
        apellidos="";
        username="";
        password="";
        nombres="";
        rfc="";
    }
    
    @PostConstruct
    public void init(){
        teacher = new Teacher();
    }
    
    public void inicializarCampos() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        nombres = params.get("firstName");
        apellidos = params.get("lastName");
        username = params.get("username");
        password = params.get("password");
        rfc = params.get("rfc");

        System.out.println(rfc);
    }
    
    public void modificarSelecionado(Teacher ti) throws IOException {
        String url = "/modificarProfesor.xhtml";
        String fullUrl = url + "?firstName=" + ti.getFirstName() + "&lastName=" + ti.getLastName()
                         + "&username=" + ti.getUsername() + "&password=" + ti.getPassword() 
                         + "&rfc=" + ti.getRfc();
        System.out.println(ti.getFirstName() + ti.getLastName() + ti.getUsername() + ti.getPassword());
        
        if (ti.getUsername() != null) {
            this.teacher = loginHelper.LoginTeacher(ti.getUsername(), ti.getPassword());
            
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + fullUrl);
        }
    }
    
    public void saveTeacher(String nombres, String apellidos, String rfc, String username, String password, List<Learningunit> unit){
        limpiarCampos();
        helper.saveTeacher(new Teacher(0,nombres,apellidos,rfc,username, password));
        helperLUNIT.conectTeacherUnit(helper.find(username), unit);
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
    
     public List<Teacherlearningunit> getTlearningunit() {
        return tlearningunit;
    }

    public void setTlearningunit(List<Teacherlearningunit> tlearningunit) {
        this.tlearningunit = tlearningunit;
    }
}
