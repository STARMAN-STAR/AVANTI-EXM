package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateAdministrator;
import mx.desarrollo.delegate.DelegateLearningUnit;
import mx.desarrollo.entidad.Administrator;

public class FacadeAdministrator {
    private final DelegateAdministrator delegateAdministrator;
    
    public FacadeAdministrator(){ 
        this.delegateAdministrator = new DelegateAdministrator();
    }
    
    public Administrator auth(String username, String password){
        return delegateAdministrator.auth(username, password);
    }
}
