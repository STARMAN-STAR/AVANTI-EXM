/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author PC
 */
@Named(value = "Profesor")
@SessionScoped
public class ProfesorUI implements Serializable {
    private String nombres;
    private String apellidos;
    private String rfc;
    private String[] unidadesDeAprendizaje;
    
    public void subirProfesor() {
        
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

    public String[] getUnidadesDeAprendizaje() {
        return unidadesDeAprendizaje;
    }

    public void setUnidadesDeAprendizaje(String[] unidadesDeAprendizaje) {
        this.unidadesDeAprendizaje = unidadesDeAprendizaje;
    }
    
    public ProfesorUI() {
        
    }
    
    public void AltaProfesorUI(String nombres, String apellidos, String rfc, String[] unidadesDeAprendizaje) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rfc = rfc;
        this.unidadesDeAprendizaje = unidadesDeAprendizaje;
    }
    //aaaaaa
    
}
