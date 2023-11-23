/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.torneo.gestiontorneo.logica.servlets;

import com.torneo.gestiontorneo.logica.Controladora;
import com.torneo.gestiontorneo.logica.Partido;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    //Se crea una instancia de la clase Controladora
    Controladora controlLogica = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Se obtiene la lista de partidos desde la lógica de negocio
        List<Partido> listaPartido = controlLogica.traerPartidos();

        //Se establece la lista de partidos en la solicitud para mostrarla en el JSP
        request.setAttribute("partidos", listaPartido);

        //Se redirige de vuelta al formulario (index.jsp)
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Se obtienen los datos del formulario JSP
        String fecha = request.getParameter("fecha_partido");
        String equipoLocal = request.getParameter("equipo_local_id");
        String resultadoLocal = request.getParameter("resultado_local");
        String equipoVisitante = request.getParameter("equipo_visitante_id");
        String resultadoVisitante = request.getParameter("resultado_visitante");

        //Se obtienen los datos del formulario JSP
        Partido partido = new Partido();
        partido.setFecha(fecha);
        partido.setResultadoLocal(Integer.parseInt(resultadoLocal));
        partido.setResultadoVisitante(Integer.parseInt(resultadoVisitante));

        //Se persiste el partido en la base de datos a través de la lógica de negocio
        controlLogica.crearPartido(partido, Long.parseLong(equipoLocal), Long.parseLong(equipoVisitante));
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
