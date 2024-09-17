package mx.desarrollo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.desarrollo.entidad.Teacherlearningunit;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-16T20:52:30")
@StaticMetamodel(Learningunit.class)
public class Learningunit_ { 

    public static volatile ListAttribute<Learningunit, Teacherlearningunit> teacherlearningunitList;
    public static volatile SingularAttribute<Learningunit, Integer> workshopHours;
    public static volatile SingularAttribute<Learningunit, String> name;
    public static volatile SingularAttribute<Learningunit, Integer> laboratoryHours;
    public static volatile SingularAttribute<Learningunit, Integer> id;
    public static volatile SingularAttribute<Learningunit, Integer> classHours;

}