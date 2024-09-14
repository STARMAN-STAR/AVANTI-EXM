package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateLearningUnit;
import mx.desarrollo.entidad.Learningunit;
import java.util.List;

public class FacadeLearningUnit {
    private final DelegateLearningUnit delegateLearningUnit;
    
    public FacadeLearningUnit(){
        this.delegateLearningUnit = new DelegateLearningUnit();
    }
    
    public List<Learningunit> getAllLearningUnit(){
        return delegateLearningUnit.getAllLearningUnit();
    }
    
    public Learningunit find(String name){
        return delegateLearningUnit.find(name);
    }
    
    public void saveLearningUnit(Learningunit learn){
        delegateLearningUnit.saveLearnUnit(learn);
    }
    
    public void deleteLearningUnit(String name){
        delegateLearningUnit.deleteLearningUnit(name);
    }
}
