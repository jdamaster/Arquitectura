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
public class empleadoComision extends empleado {
    public double ventasBrutas;
    public double porcentajeComision;

    public empleadoComision() {
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    

    @Override
    public double salario() {
        return this.getPorcentajeComision()*this.getVentasBrutas();
    }
    @Override
    public void created() {
        System.out.println("Se ha creado una dependencia de EmpeladoComision.");
    }
     
    @Override
    public void destroying(){
        System.out.println("Se va a destruir una dependencia de EmpeladoComision.");
    }
    
}
