/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Vivienda;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author braya
 */
public class ControladorVivienda extends ControladorAbstact<Vivienda>{

    public ControladorVivienda() {
        super();
    }
    
    public List<Vivienda> verificar(int numCasa) {
        Query buscar = getEm().createNamedQuery("buscarNumCasa");
        buscar.setParameter("numCasa", numCasa);
        var p = buscar.getResultList();
        if (p.isEmpty()) {
            System.out.println("null");
            return null;
        }else{ 
            System.out.println("lleno");
            return p;
        }
    }
}
