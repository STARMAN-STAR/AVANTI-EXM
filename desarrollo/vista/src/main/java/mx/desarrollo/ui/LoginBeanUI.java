/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;


import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.desarrollo.entidad.Administrator;
import mx.desarrollo.entidad.Teacher;
import mx.desarrollo.helper.LoginHelper;

/**
 *
 * @author STARDUST
 */
@ManagedBean(name = "loginUI")
@SessionScoped
public class LoginBeanUI implements Serializable{
    private LoginHelper loginHelper;
    private Administrator admin;
    private Teacher teacher;
    
    public LoginBeanUI() {
        loginHelper = new LoginHelper();
    }

    @PostConstruct
    public void init(){
        admin= new Administrator();
        teacher = new Teacher();
    }

     public void login() throws IOException{
        String appURL = "/index.xhtml";
        Administrator us= new Administrator();
        Teacher aux = new Teacher();
        us.setId(0);
        aux.setId(0);
        aux= loginHelper.LoginTeacher(aux.getUsername(), aux.getPassword());
        us = loginHelper.Login(admin.getEmail(), admin.getPassword());
        if(us != null && us.getId()!= null){
            // asigno el usuario encontrado al usuario de esta clase para que 
            // se muestre correctamente en la pagina de informacion
            admin = us;
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrecta:", "Intente de nuevo"));          
        }
    }

    
    /* getters y setters*/

    public Administrator getUsuario() {
        return admin;
    }

    public void setUsuario(Administrator admin) {
        this.admin = admin;
    }
}
    