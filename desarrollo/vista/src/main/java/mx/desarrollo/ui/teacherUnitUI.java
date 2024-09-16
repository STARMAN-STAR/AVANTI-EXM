/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;
import mx.desarrollo.entidad.Teacherlearningunit;
import javax.enterprise.context.SessionScoped;
import mx.desarrollo.helper.teacherUnitHelper;
import mx.desarrollo.helper.TeacherHelper;
import mx.desarrollo.entidad.Learningunit;
import mx.desarrollo.entidad.Teacher;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author STARDUST
 */

@ManagedBean (name = "techerUnit")
@SessionScoped
public class teacherUnitUI implements Serializable{
    private List<Teacherlearningunit> lUnits;
    private final teacherUnitHelper helper;
    private TeacherHelper teacherHelper;
    
    public teacherUnitUI(){
        helper = new teacherUnitHelper();
        lUnits = helper.getTeacherUnits();
    }

    public List<Learningunit> teacherUnits(String name){
        return helper.getUnitsbyTeacher(new TeacherHelper().find(name));
    }
    
    public List<Teacherlearningunit> getlUnits() {
        return lUnits;
    }

    public void setlUnits(List<Teacherlearningunit> lUnits) {
        this.lUnits = lUnits;
    }

    public TeacherHelper getTeacherHelper() {
        return teacherHelper;
    }

    public void setTeacherHelper(TeacherHelper teacherHelper) {
        this.teacherHelper = teacherHelper;
    }
    
    
    
}
