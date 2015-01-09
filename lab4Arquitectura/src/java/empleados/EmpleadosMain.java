/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author LuisD
 */
public class EmpleadosMain {

    /**
     * @param args the command line arguments
     */
    private final List empleados = new ArrayList();
    ApplicationContext context = new ClassPathXmlApplicationContext("/org/Spring.xml");

            
    public static void main(String[] args) {
        // TODO code application logic here       
        
    }
    
    public void addEmpleadoAsalariado(String nombre, String apellido, String nroSeguro, double salario){
        empleadoAsalariado ea = (empleadoAsalariado)context.getBean("empleadoAsalariado");
        ea.setNombre(nombre);
        ea.setApellido(apellido);
        ea.setNoSeguroSocial(nroSeguro);
        ea.setSalario(salario);
        
        empleados.add(ea);
    }
    
    public void addEmpleadoComision(String nombre, String apellido, String nroSeguro, double ventasBrutas, double porcentajeComision){
        empleadoComision ec = (empleadoComision)context.getBean("empleadoComision");
        ec.setNombre(nombre);
        ec.setApellido(apellido);
        ec.setNoSeguroSocial(nroSeguro);
        ec.setVentasBrutas(ventasBrutas);
        ec.setPorcentajeComision(porcentajeComision);
        
        empleados.add(ec);
    }
    
    public void addEmpleadoPorHora(String nombre, String apellido, String nroSeguro, int horas, double salarioHora){
        empleadoPorHoras eh = (empleadoPorHoras)context.getBean("empleadoPorHoras");
        eh.setNombre(nombre);
        eh.setApellido(apellido);
        eh.setNoSeguroSocial(nroSeguro);
        eh.setHoras(horas);
        eh.setValorHora(salarioHora);
        
        empleados.add(eh);
    }
}
