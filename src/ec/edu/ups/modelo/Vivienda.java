/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author braya
 */
@Entity
public class Vivienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "ValorBien")
    private int valorBien;
    @Column(name = "Calle_Principal")
    private String calleP;
    @Column(name = "Calle_Secundaria")
    private String calleS;
    @Column(name = "Numero_de_Pisos")
    private int numPisos;
    @ManyToOne
    @JoinColumn(name = "fk_persona")
    private Persona persona;
///////////////////
//    @OneToOne(mappedBy = "Vivienda", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Hipoteca hipoteca;
/////////////////////
    public Vivienda() {
    }

    public Vivienda(int valorBien, String calleP, String calleS, int numPisos, Persona persona) {
        this.valorBien = valorBien;
        this.calleP = calleP;
        this.calleS = calleS;
        this.numPisos = numPisos;
        this.persona = persona;
    }
            
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValorBien() {
        return valorBien;
    }

    public void setValorBien(int valorBien) {
        this.valorBien = valorBien;
    }

    public String getCalleP() {
        return calleP;
    }

    public void setCalleP(String calleP) {
        this.calleP = calleP;
    }

    public String getCalleS() {
        return calleS;
    }

    public void setCalleS(String calleS) {
        this.calleS = calleS;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
////////////////////////////////////////////////
//    public Hipoteca getHipoteca() {
//        return hipoteca;
//    }
//
//    public void setHipoteca(Hipoteca hipoteca) {
//        this.hipoteca = hipoteca;
//    }
////////////////////////////////////////////////
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vivienda)) {
            return false;
        }
        Vivienda other = (Vivienda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "ec.edu.ups.modelo.Vivienda[ id=" + id + " ]";
//    }

    @Override
    public String toString() {
        return "Vivienda{" + "id=" + id + ", valorBien=" + valorBien + ", calleP=" + calleP + ", calleS=" + calleS + ", numPisos=" + numPisos + ", persona=" + persona + '}';
    }
    
}
