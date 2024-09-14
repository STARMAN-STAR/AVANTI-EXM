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
/**
 *
 * @author PC
 */
@Named(value = "unidadesAprendizajeUI")
@SessionScoped
public class UnidadesAprendizajeUI implements Serializable {
    private List<Learningunit> learningunits;
//    private Learningunit learningunit''
    private learningUnitHelper helper;

    public UnidadesAprendizajeUI() {
        learningunits = new ArrayList();
    }
    @PostConstruct
    public void init(){
        learningunits = helper.getLearningUnits();
    }
    
    public List<Learningunit> getUnidadAprendizaje() {
        return learningunits;
    }
    
}
