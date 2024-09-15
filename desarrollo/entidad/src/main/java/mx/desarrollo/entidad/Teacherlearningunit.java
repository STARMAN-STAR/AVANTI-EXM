/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STARDUST
 */
@Entity
@Table(name = "teacherlearningunit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teacherlearningunit.findAll", query = "SELECT t FROM Teacherlearningunit t")
    , @NamedQuery(name = "Teacherlearningunit.findById", query = "SELECT t FROM Teacherlearningunit t WHERE t.id = :id")
    , @NamedQuery(name = "Teacherlearningunit.findByLearningUnitId", query = "SELECT t FROM Teacherlearningunit t WHERE t.learningUnitId = :learningUnitId")})
public class Teacherlearningunit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "learningUnitId")
    private int learningUnitId;
    @JoinColumn(name = "teacherId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Teacher teacherId;

    public Teacherlearningunit() {
    }

    public Teacherlearningunit(Integer id) {
        this.id = id;
    }

    public Teacherlearningunit(Integer id, int learningUnitId) {
        this.id = id;
        this.learningUnitId = learningUnitId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLearningUnitId() {
        return learningUnitId;
    }

    public void setLearningUnitId(int learningUnitId) {
        this.learningUnitId = learningUnitId;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
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
        if (!(object instanceof Teacherlearningunit)) {
            return false;
        }
        Teacherlearningunit other = (Teacherlearningunit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.Teacherlearningunit[ id=" + id + " ]";
    }
    
}
