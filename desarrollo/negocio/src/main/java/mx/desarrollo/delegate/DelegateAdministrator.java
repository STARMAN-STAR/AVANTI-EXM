package mx.desarrollo.delegate;

import mx.desarrollo.integracion.ServiceLocator;
import mx.desarrollo.entidad.Administrator;
import java.util.List;


public class DelegateAdministrator {
    
    public Administrator auth(String username, String password) {
        List<Administrator>  aux = ServiceLocator.getInstanceAdministratorDAO().findAll();
        for(Administrator admin : aux ){
            if(admin.getEmail().equals(username) && admin.getPassword().equals(password))
                return admin;
        }
        return null;
    }
}
