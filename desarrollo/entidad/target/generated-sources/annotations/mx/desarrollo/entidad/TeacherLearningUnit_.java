package mx.desarrollo.entidad;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.desarrollo.entidad.LearningUnit;
import mx.desarrollo.entidad.Teacher;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-14T13:26:11")
@StaticMetamodel(TeacherLearningUnit.class)
public class TeacherLearningUnit_ { 

    public static volatile SingularAttribute<TeacherLearningUnit, LearningUnit> learningUnit;
    public static volatile SingularAttribute<TeacherLearningUnit, Instant> createdAt;
    public static volatile SingularAttribute<TeacherLearningUnit, Teacher> teacher;
    public static volatile SingularAttribute<TeacherLearningUnit, Integer> id;
    public static volatile SingularAttribute<TeacherLearningUnit, Instant> updatedAt;

}