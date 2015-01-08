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
    public static void main(String[] args) {
        // TODO code application logic here
        List empleados = new ArrayList();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/org/Spring.xml");
        
        
    }   
}
