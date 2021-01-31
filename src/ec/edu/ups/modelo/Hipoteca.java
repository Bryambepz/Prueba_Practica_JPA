/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 *
 * @author braya
 */
@Entity
public class Hipoteca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Interes")
    private double interes;
    @Column(name = "Fecha_Inicio")
    private Date fechaIn;
    @Column(name = "Fecha_Fin")
    private Date fechaFin;
    @Column(name = "Monto")
    private int monto;
    @Column(name = "NumeroMeses")
    private int numMeses;
    @Column(name = "valorCuota")
    private double valorCu;
    //////////////////////////////////
    @OneToOne
    @JoinColumn(name = "id_Persona")
    private Persona persona;
    //////////////////////////////////

    public Hipoteca() {
    }

    public Hipoteca(double interes, Date fechaIn, Date fechaFin, int monto, int numMeses, double valorCuota,Persona persona) {
        this.interes = interes;
        this.fechaIn = fechaIn;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.numMeses = numMeses;
        this.valorCu = valorCuota;
        this.persona = persona;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public double getValorCu() {
        return valorCu;
    }

    public void setValorCu(double valorCu) {
        this.valorCu = valorCu;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
        if (!(object instanceof Hipoteca)) {
            return false;
        }
        Hipoteca other = (Hipoteca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "ec.edu.ups.modelo.Hipoteca[ id=" + id + " ]";
//    }

    @Override
    public String toString() {
        return "Hipoteca{" + "id=" + id + ", interes=" + interes + ", fechaIn=" + fechaIn + ", fechaFin=" + fechaFin + ", monto=" + monto + ", numMeses=" + numMeses + ", persona=" + persona + '}';
    }

}
