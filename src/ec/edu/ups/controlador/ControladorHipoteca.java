/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Hipoteca;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author braya
 */
public class ControladorHipoteca extends ControladorAbstact<Hipoteca>{

    public ControladorHipoteca() {
        super();
    }
    
    public List<Hipoteca> buscarH(long id){
        Query buscar = getEm().createNamedQuery("buscarIdHipo");
        buscar.setParameter("id", id);
        var h = buscar.getResultList();
        if (h.isEmpty()) {
            System.out.println("null");
            return null;
        }else{
            System.out.println("lleno");
            return h;
        }
    }
}
