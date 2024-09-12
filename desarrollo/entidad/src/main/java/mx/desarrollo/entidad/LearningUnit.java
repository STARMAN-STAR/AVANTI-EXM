package mx.desarrollo.entidad;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class LearningUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "class_hours", nullable = false)
    private Integer classHours;

    @Column(name = "workshop_hours", nullable = false)
    private Integer workshopHours;

    @Column(name = "laboratory_hours", nullable = false)
    private Integer laboratoryHours;

    @Column(name = "createdAt", nullable = false)
    private Instant createdAt;

    @Column(name = "updatedAt", nullable = false)
    private Instant updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassHours() {
        return classHours;
    }

    public void setClassHours(Integer classHours) {
        this.classHours = classHours;
    }

    public Integer getWorkshopHours() {
        return workshopHours;
    }

    public void setWorkshopHours(Integer workshopHours) {
        this.workshopHours = workshopHours;
    }

    public Integer getLaboratoryHours() {
        return laboratoryHours;
    }

    public void setLaboratoryHours(Integer laboratoryHours) {
        this.laboratoryHours = laboratoryHours;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}