package mx.desarrollo.entidad;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-14T13:26:11")
@StaticMetamodel(Administrator.class)
public class Administrator_ { 

    public static volatile SingularAttribute<Administrator, Instant> createdAt;
    public static volatile SingularAttribute<Administrator, String> password;
    public static volatile SingularAttribute<Administrator, Integer> id;
    public static volatile SingularAttribute<Administrator, String> email;
    public static volatile SingularAttribute<Administrator, String> username;
    public static volatile SingularAttribute<Administrator, Instant> updatedAt;

}