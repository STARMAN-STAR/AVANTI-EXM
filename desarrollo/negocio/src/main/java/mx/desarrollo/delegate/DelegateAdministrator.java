package mx.desarrollo.delegate;

import mx.desarrollo.DAO.AdministratorDAO;
import mx.desarrollo.entidad.Administrator;
import mx.desarrollo.entidad.Teacher;
import mx.desarrollo.integracion.ServiceLocator;

import java.util.List;

public class DelegateAdministrator {
    public Administrator auth(String username, String password) {
        AdministratorDAO administratorDAO = ServiceLocator.getInstanceAdministratorDAO();
        List<Administrator> administrators = administratorDAO.executeQuery("SELECT * FROM Administrators WHERE username = '" + username + "'" + " AND password = '" + password + "'");
        return administrators.get(0);
    }
}
