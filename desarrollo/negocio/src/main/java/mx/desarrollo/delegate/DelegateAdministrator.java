package mx.desarrollo.delegate;

import mx.desarrollo.entidad.Administrator;
import mx.desarrollo.integracion.ServiceLocator;

import java.util.List;

public class DelegateAdministrator {
    
    public Administrator auth(String username, String password) {
        for(Administrator admin :  ServiceLocator.getInstanceAdministratorDAO().findAll()){
            System.out.println(admin.getEmail()+" "+ (admin.getEmail() ==  username && admin.getPassword() == password));
            if(admin.getEmail().equals(username) && admin.getPassword().equals(password))
                return admin;
        }
        return null;
    }
}
