package mx.desarrollo.delegate;
import mx.desarrollo.integracion.ServiceLocator;
import mx.desarrollo.entidad.Learningunit;
import java.util.List;

public class DelegateLearningUnit {
    
    public void saveLearnUnit(Learningunit learningunit){
        ServiceLocator.getInstanceLearningUnitDAO().save(learningunit);
    }
    
    public void deleteLearningUnit(Learningunit learninigunit){
        ServiceLocator.getInstanceLearningUnitDAO().delete(learninigunit);
    }
    
    public Learningunit find(String name){
        List<Learningunit> LearningUnits = ServiceLocator.getInstanceLearningUnitDAO().executeQuery("SELECT * FROM desarrollo.LearningUnit WHERE name = '"+name+"';");
        return LearningUnits.get(0);
    }
    
    public List<Learningunit> getAllLearningUnit(){
        return ServiceLocator.getInstanceLearningUnitDAO().findAll();
    }
    
}
