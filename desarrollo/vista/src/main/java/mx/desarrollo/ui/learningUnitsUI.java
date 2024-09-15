/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import javax.enterprise.context.SessionScoped;
import mx.desarrollo.entidad.Learningunit;
import mx.desarrollo.helper.learningUnitHelper;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import java.util.List;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author PC
 */
@ManagedBean (name= "learningUI")
@SessionScoped
public class learningUnitsUI implements Serializable {
    private List<Learningunit> learningunits;
    private List<String> learningnames;
    private Learningunit learningunit;
    private String nombre;
    private int horasClase;
    private int horasTaller;
    private int horasLab;
    
    private final learningUnitHelper helper;

    public learningUnitsUI() {
        helper = new learningUnitHelper();
        this.learningunits = helper.getLearningUnits();
        this.learningnames= helper.getLearningNames();
    }

    public List<String> getLearningnames() {
        return learningnames;
    }

    public void setLearningnames(List<String> learningnames) {
        this.learningnames = learningnames;
    }
    
    public List<Learningunit> getLearningunits() {
        return learningunits;
    }

    public void setLearningunits(List<Learningunit> learningunits) {
        this.learningunits = learningunits;
    }

    public Learningunit getLearningunit() {
        return learningunit;
    }

    public void setLearningunit(Learningunit learningunit) {
        this.learningunit = learningunit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getHorasLab() {
        return horasLab;
    }

    public void setHorasLab(int horasLab) {
        this.horasLab = horasLab;
    }
    
    public void saveUnidadAprendizaje(String nombre, int horasClase, int horasTaller, int horasLaboratorio){
        helper.saveLearningUnit(new Learningunit(0,nombre,horasClase,horasTaller, horasLaboratorio));
    }
    
    
}
