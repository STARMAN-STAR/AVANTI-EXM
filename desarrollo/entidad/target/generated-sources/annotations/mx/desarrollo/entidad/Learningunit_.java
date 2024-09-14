package mx.desarrollo.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-13T23:28:57")
@StaticMetamodel(Learningunit.class)
public class Learningunit_ { 

    public static volatile SingularAttribute<Learningunit, Date> createdAt;
    public static volatile SingularAttribute<Learningunit, Integer> workshopHours;
    public static volatile SingularAttribute<Learningunit, String> name;
    public static volatile SingularAttribute<Learningunit, Integer> laboratoryHours;
    public static volatile SingularAttribute<Learningunit, Integer> id;
    public static volatile SingularAttribute<Learningunit, Integer> classHours;
    public static volatile SingularAttribute<Learningunit, Date> updatedAt;

}