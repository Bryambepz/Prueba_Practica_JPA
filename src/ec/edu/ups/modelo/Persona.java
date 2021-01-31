/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author braya
 */
@Entity
@NamedQuery(name = "buscarCedula", query = "Select p from Persona p where p.cedula = :cedula")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Cedula")
    private String cedula;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String Apellido;
    @Column(name = "Sueldo")
    private double sueldo;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Fecha_Nacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNac;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Vivienda> listaViviendas;

    public Persona() {
        listaViviendas = new ArrayList<>();
    }
    
    public Persona(String cedula, String nombre, String Apellido, double sueldo, String direccion, String telefono, Date fechaN) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNac = fechaN;
        listaViviendas = new ArrayList<>();
    }

    public Persona(String cedula, String nombre, String Apellido, double sueldo, String direccion, String telefono, Date fechaN, List<Vivienda> listaViviendas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNac = fechaN;
        this.listaViviendas = new ArrayList<>();
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaN() {
        return fechaNac;
    }

    public void setFechaN(Date fechaN) {
        this.fechaNac = fechaN;
    }

    public List<Vivienda> getListaViviendas() {
        return listaViviendas;
    }

    public void setListaViviendas(List<Vivienda> listaViviendas) {
        this.listaViviendas = listaViviendas;
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "ec.edu.ups.modelo.Persona[ id= " + id + " ]";
//    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", Apellido=" + Apellido + ", sueldo=" + sueldo + ", direccion=" + direccion + ", telefono=" + telefono + ", fechaN=" + fechaNac + '}';
    }
    
}
