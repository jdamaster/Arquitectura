/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author Usuario
 */
public class empleadoAsalariado extends empleado {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public empleadoAsalariado() {
    }
    
    

    @Override
    public double salario() {
        return getSalario();
    }
    
}
