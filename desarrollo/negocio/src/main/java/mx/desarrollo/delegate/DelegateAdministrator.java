package mx.desarrollo.delegate;

import mx.desarrollo.entidad.Administrator;
import mx.desarrollo.integracion.ServiceLocator;


public class DelegateAdministrator {
    
    public Administrator auth(String username, String password) {
        for(Administrator admin :  ServiceLocator.getInstanceAdministratorDAO().findAll()){
            if(admin.getEmail().equals(username) && admin.getPassword().equals(password))
                return admin;
        }
        return null;
    }
}
