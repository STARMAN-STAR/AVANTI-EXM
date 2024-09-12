/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STARDUST
 */
@Entity
@Table(name = "learningunit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Learningunit.findAll", query = "SELECT l FROM Learningunit l")
    , @NamedQuery(name = "Learningunit.findById", query = "SELECT l FROM Learningunit l WHERE l.id = :id")
    , @NamedQuery(name = "Learningunit.findByName", query = "SELECT l FROM Learningunit l WHERE l.name = :name")
    , @NamedQuery(name = "Learningunit.findByClassHours", query = "SELECT l FROM Learningunit l WHERE l.classHours = :classHours")
    , @NamedQuery(name = "Learningunit.findByWorkshopHours", query = "SELECT l FROM Learningunit l WHERE l.workshopHours = :workshopHours")
    , @NamedQuery(name = "Learningunit.findByLaboratoryHours", query = "SELECT l FROM Learningunit l WHERE l.laboratoryHours = :laboratoryHours")
    , @NamedQuery(name = "Learningunit.findByCreatedAt", query = "SELECT l FROM Learningunit l WHERE l.createdAt = :createdAt")
    , @NamedQuery(name = "Learningunit.findByUpdatedAt", query = "SELECT l FROM Learningunit l WHERE l.updatedAt = :updatedAt")})
public class Learningunit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "class_hours")
    private int classHours;
    @Basic(optional = false)
    @Column(name = "workshop_hours")
    private int workshopHours;
    @Basic(optional = false)
    @Column(name = "laboratory_hours")
    private int laboratoryHours;
    @Basic(optional = false)
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Learningunit() {
    }

    public Learningunit(Integer id) {
        this.id = id;
    }

    public Learningunit(Integer id, String name, int classHours, int workshopHours, int laboratoryHours, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.classHours = classHours;
        this.workshopHours = workshopHours;
        this.laboratoryHours = laboratoryHours;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

    public int getClassHours() {
        return classHours;
    }

    public void setClassHours(int classHours) {
        this.classHours = classHours;
    }

    public int getWorkshopHours() {
        return workshopHours;
    }

    public void setWorkshopHours(int workshopHours) {
        this.workshopHours = workshopHours;
    }

    public int getLaboratoryHours() {
        return laboratoryHours;
    }

    public void setLaboratoryHours(int laboratoryHours) {
        this.laboratoryHours = laboratoryHours;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Learningunit)) {
            return false;
        }
        Learningunit other = (Learningunit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.Learningunit[ id=" + id + " ]";
    }
    
}
