/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import empleados.empleadoAsalariado;
import empleados.empleadoComision;
import empleados.empleadoPorHoras;
import empleados.listaEmpleados;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author LuisD
 */
public class SubirServlet extends HttpServlet {
    ApplicationContext context = new ClassPathXmlApplicationContext("/org/Spring.xml");
    listaEmpleados lista =(listaEmpleados)context.getBean("ListaEmpleados");

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String nroSeguro = request.getParameter("nroSeguro");
        String tipo = request.getParameter("type");
        switch (tipo) {
            case "ea":
                int salario = Integer.parseInt(request.getParameter("salario"));
                empleadoAsalariado ea = (empleadoAsalariado)context.getBean("asalariado");
                ea.setNombre(nombre);
                ea.setApellido(apellido);
                ea.setNoSeguroSocial(nroSeguro);
                ea.setSalario(salario);
                lista.addEmpleado(ea);
                break;
            case "eh":
                int horas = Integer.parseInt(request.getParameter("horas"));
                int salarioHora = Integer.parseInt(request.getParameter("salarioHora"));
                empleadoPorHoras eh = (empleadoPorHoras)context.getBean("porHoras");
                eh.setNombre(nombre);
                eh.setApellido(apellido);
                eh.setNoSeguroSocial(nroSeguro);
                eh.setHoras(horas);
                eh.setValorHora(salarioHora);
                lista.addEmpleado(eh);
                break;
            case "ec":
                int ventaBruta = Integer.parseInt(request.getParameter("ventaBruta"));
                int porcentajeComision = Integer.parseInt(request.getParameter("porcentajeComision"));
                empleadoComision ec = (empleadoComision)context.getBean("porComision");
                ec.setNombre(nombre);
                ec.setApellido(apellido);
                ec.setNoSeguroSocial(nroSeguro);
                ec.setVentasBrutas(ventaBruta);
                ec.setPorcentajeComision(porcentajeComision);
        
                lista.addEmpleado(ec);
                
                break;
        
        }
        request.setAttribute("listaEmpleados", lista.getListaE());
        request.getRequestDispatcher("listaEmpleados.jsp").forward(request, response);
        //Añadir el empleado a la lista que se encuentra en empleados main
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
