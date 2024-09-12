/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author PC
 */
@Named(value = "Profesor")
@SessionScoped
public class ProfesorUI implements Serializable {
    
    public ProfesorUI() {
        
    }
}
