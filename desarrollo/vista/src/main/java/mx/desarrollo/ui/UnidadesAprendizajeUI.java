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
@ManagedBean (name= "UAUI")
@SessionScoped
public class UnidadesAprendizajeUI implements Serializable {
    private List<Learningunit> learningunits;
    private Learningunit learningunit;
    private final learningUnitHelper helper;

    public UnidadesAprendizajeUI() {
        helper = new learningUnitHelper();
        this.learningunits = helper.getLearningUnits();
    }

    public List<Learningunit> getUnidadAprendizaje() {
        return learningunits;
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
    
    public void saveUnidadAprendizaje(){
        
    }
    
}
