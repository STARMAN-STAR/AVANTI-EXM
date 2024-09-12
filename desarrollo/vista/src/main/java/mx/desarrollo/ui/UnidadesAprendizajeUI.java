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
@Named(value = "unidadesAprendizajeUI")
@SessionScoped
public class UnidadesAprendizajeUI implements Serializable {
    private String unidadAprendizaje;
    private int horasClase;
    private int horasTaller;
    private int horasLaboratorio;

    public UnidadesAprendizajeUI(String unidadAprendizaje, int horasClase, int horasTaller, int horasLaboratorio) {
        this.unidadAprendizaje = unidadAprendizaje;
        this.horasClase = horasClase;
        this.horasTaller = horasTaller;
        this.horasLaboratorio = horasLaboratorio;
    }
    
    public String getUnidadAprendizaje() {
        return unidadAprendizaje;
    }

    public void setUnidadAprendizaje(String unidadAprendizaje) {
        this.unidadAprendizaje = unidadAprendizaje;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(int horasTaller) {
        this.horasTaller = horasTaller;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }
    
    public UnidadesAprendizajeUI() {
    }
    
}
