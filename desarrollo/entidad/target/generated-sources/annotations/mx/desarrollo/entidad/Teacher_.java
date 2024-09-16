package mx.desarrollo.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.desarrollo.entidad.Teacherlearningunit;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-15T22:38:17")
@StaticMetamodel(Teacher.class)
public class Teacher_ { 

    public static volatile ListAttribute<Teacher, Teacherlearningunit> teacherlearningunitList;
    public static volatile SingularAttribute<Teacher, String> firstName;
    public static volatile SingularAttribute<Teacher, String> lastName;
    public static volatile SingularAttribute<Teacher, String> password;
    public static volatile SingularAttribute<Teacher, Integer> id;
    public static volatile SingularAttribute<Teacher, String> rfc;
    public static volatile SingularAttribute<Teacher, String> username;

}