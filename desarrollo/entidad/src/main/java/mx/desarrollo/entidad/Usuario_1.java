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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u")
    , @NamedQuery(name = "Usuario_1.findByCorreo", query = "SELECT u FROM Usuario_1 u WHERE u.correo = :correo")
    , @NamedQuery(name = "Usuario_1.findByIdusuario", query = "SELECT u FROM Usuario_1 u WHERE u.idusuario = :idusuario")
    , @NamedQuery(name = "Usuario_1.findByContrasena", query = "SELECT u FROM Usuario_1 u WHERE u.contrasena = :contrasena")})
public class Usuario_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Basic(optional = false)
    @Column(name = "contrasena")
    private String contrasena;
    @JoinColumn(name = "idAlumno", referencedColumnName = "idalumno")
    @ManyToOne(optional = false)
    private Alumno_1 idAlumno;

    public Usuario_1() {
    }

    public Usuario_1(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario_1(Integer idusuario, String correo, String contrasena) {
        this.idusuario = idusuario;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Alumno_1 getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno_1 idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.Usuario_1[ idusuario=" + idusuario + " ]";
    }
    
}
