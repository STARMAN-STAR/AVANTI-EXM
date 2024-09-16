package mx.desarrollo.delegate;
import java.util.ArrayList;
import mx.desarrollo.integracion.ServiceLocator;
import mx.desarrollo.entidad.Learningunit;
import java.util.List;

public class DelegateLearningUnit {
    
    public void saveLearnUnit(Learningunit learningunit){
        if(find(learningunit.getName()) == null){
            ServiceLocator.getInstanceLearningUnitDAO().save(learningunit);
        }else{
            System.out.println("LEARNING UNIT");
        }
    }
    
    public void deleteLearningUnit(String name){
        ServiceLocator.getInstanceLearningUnitDAO().delete(find(name));
    }
    
    public Learningunit find(String name){
       List<Learningunit> aux=  ServiceLocator.getInstanceLearningUnitDAO().findAll();
       for(Learningunit unit : aux)
          if(unit.getName().equals(name))
              return unit;
      
      return null;
    }
    
    public List<Learningunit> getAllLearningUnit(){
        return ServiceLocator.getInstanceLearningUnitDAO().findAll();
    }
    
    public List<String> getAllNamesLearningUnits(){
        List<String> names= new ArrayList<>();
        List<Learningunit> aux=  ServiceLocator.getInstanceLearningUnitDAO().findAll();
        for(Learningunit lu : aux)
            names.add(lu.getName());
        return names;
    }
}
