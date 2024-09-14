/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.helper;
import java.io.Serializable;
import java.util.List;
import mx.desarrollo.entidad.Learningunit;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author STARDUST
 */
public class learningUnitHelper implements Serializable{
    public List<Learningunit> getLearningUnits(){
        return ServiceFacadeLocator.getInstanceLearningUnit().getAllLearningUnit();
    }
}
