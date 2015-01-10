/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Usuario
 */

public class listaEmpleados {
    private List<empleado> listaE;

    public List<empleado> getListaE() {
        return listaE;
    }    

    public listaEmpleados() {
      this.listaE =new ArrayList();  
    }
    public void addEmpleado(empleado e){
        this.listaE.add(e);
    }
    
    

    
    
}
