package mx.desarrollo.entidad;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-14T13:26:11")
@StaticMetamodel(LearningUnit.class)
public class LearningUnit_ { 

    public static volatile SingularAttribute<LearningUnit, Instant> createdAt;
    public static volatile SingularAttribute<LearningUnit, Integer> workshopHours;
    public static volatile SingularAttribute<LearningUnit, String> name;
    public static volatile SingularAttribute<LearningUnit, Integer> laboratoryHours;
    public static volatile SingularAttribute<LearningUnit, Integer> id;
    public static volatile SingularAttribute<LearningUnit, Integer> classHours;
    public static volatile SingularAttribute<LearningUnit, Instant> updatedAt;

}