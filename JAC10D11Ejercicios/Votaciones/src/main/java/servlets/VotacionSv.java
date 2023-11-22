/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Voto;

/**
 *
 * @author Acid
 */
@WebServlet(name = "VotacionSv", urlPatterns = {"/VotacionSv"})
public class VotacionSv extends HttpServlet {

    private ArrayList<Voto> listaVotos = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VotacionSv</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VotacionSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         //Obtenemos la opción seleccionada en el formulario
        String opcion = request.getParameter("opcion");

        //Verificamos si la opción no es nula ni está vacía
        if (opcion != null && !opcion.isEmpty()) {
            //Creamos una nueva instancia de Voto 
            Voto nuevoVoto = new Voto();
            //Se almacena la opcion 
            nuevoVoto.setPartido(opcion);
            //Se añade a la lista
            listaVotos.add(nuevoVoto);
        } 

        response.sendRedirect("index.jsp");

        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("mostrarResultados") != null) {
            
            //Mapeamos para almacenar los resultados (nombre del partido, cantidad de votos)
            Map<String, Integer> resultados = new HashMap<>();

            //Recorremos la lista de votos para contar los votos por partido
            for (Voto voto : listaVotos) {
                String partido = voto.getPartido();
                //Actualizar el conteo de votos para el partido actual
                resultados.put(partido, resultados.getOrDefault(partido, 0) + 1);
            }

            //Establecemos los resultados como atributo
            request.setAttribute("resultados", resultados);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
