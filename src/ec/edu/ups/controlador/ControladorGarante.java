/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Garante;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author braya
 */
public class ControladorGarante extends ControladorAbstact<Garante>{

    public ControladorGarante() {
        super();
    }
    
    public List<Garante> buscarG(String cedula){
        Query buscar = getEm().createNamedQuery("buscarCedulaG");
        buscar.setParameter("cedula", cedula);
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
