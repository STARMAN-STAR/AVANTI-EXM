/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author STARDUST
 */
//CAMBIO GENERAL BRANCH

@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno_1.findAll", query = "SELECT a FROM Alumno_1 a")
    , @NamedQuery(name = "Alumno_1.findByIdalumno", query = "SELECT a FROM Alumno_1 a WHERE a.idalumno = :idalumno")
    , @NamedQuery(name = "Alumno_1.findByMatricula", query = "SELECT a FROM Alumno_1 a WHERE a.matricula = :matricula")
    , @NamedQuery(name = "Alumno_1.findByNombre", query = "SELECT a FROM Alumno_1 a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Alumno_1.findByApellidos", query = "SELECT a FROM Alumno_1 a WHERE a.apellidos = :apellidos")})
public class Alumno_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idalumno")
    private Integer idalumno;
    @Basic(optional = false)
    @Column(name = "matricula")
    private int matricula;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlumno")
    private List<Usuario_1> usuarioList;

    public Alumno_1() {
    }

    public Alumno_1(Integer idalumno) {
        this.idalumno = idalumno;
    }

    public Alumno_1(Integer idalumno, int matricula, String nombre, String apellidos) {
        this.idalumno = idalumno;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @XmlTransient
    public List<Usuario_1> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario_1> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalumno != null ? idalumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno_1)) {
            return false;
        }
        Alumno_1 other = (Alumno_1) object;
        if ((this.idalumno == null && other.idalumno != null) || (this.idalumno != null && !this.idalumno.equals(other.idalumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.Alumno_1[ idalumno=" + idalumno + " ]";
    }
    
}
