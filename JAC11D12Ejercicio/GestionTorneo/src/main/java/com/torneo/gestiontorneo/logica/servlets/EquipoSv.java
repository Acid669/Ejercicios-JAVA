/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.torneo.gestiontorneo.logica.servlets;

import com.torneo.gestiontorneo.logica.Controladora;
import com.torneo.gestiontorneo.logica.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {

    // Se crea una instancia de la clase Controladora para manejar la lógica del negocio
    Controladora controlLogica = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Se obtienen los equipos desde la base de datos
        List<Equipo> listEquipos = controlLogica.traerEquipos();

        // Se establecen los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("equipos", listEquipos);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Se obtienen datos del formulario JSP
        String nombreEquipo = request.getParameter("nombre_equipo");

        // Se crea un nuevo objeto Equipo con los datos del formulario
        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEquipo);

        // Se persiste el equipo en la base de datos a través de la lógica de negocio
        controlLogica.crearEquipo(equipo);

        // Redirigir de vuelta al formulario
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor

}
