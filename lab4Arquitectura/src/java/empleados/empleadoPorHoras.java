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
public class empleadoPorHoras extends empleado{
    private int horas;
    private double valorHora;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public empleadoPorHoras() {
    }
    

    @Override
    public double salario() {
        if(this.getHoras()<=40){
        return (getHoras()*getValorHora());
        }else{
            return (getHoras()*getValorHora()) + ((getHoras()-40)*1.5);
        }
    }
    @Override
    public void created() {
        System.out.println("Se ha creado una dependencia de EmpeladoPorHoras.");
    }
     
    @Override
    public void destroying(){
        System.out.println("Se va a destruir una dependencia de EmpeladoPorHoras.");
    }
    
}
