<%-- 
    Document   : index.jsp
    Created on : 22 nov 2023, 9:32:13
    Author     : Acid
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Votaciones</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Votaciones</h2
            <!-- Formulario para elegir el voto -->
            <div class="container mt-4">
                <p>Elija su voto:</p>
                <form action="VotacionSv" method="post">

                    <div class="form-check">
                        <input type="radio" id="opcion1" name="opcion" value="Partido A" class="form-check-input">
                        <label for="opcion1" class="form-check-label">Partido A</label>
                    </div>

                    <div class="form-check">
                        <input type="radio" id="opcion2" name="opcion" value="Partido B" class="form-check-input">
                        <label for="opcion2" class="form-check-label">Partido B</label>
                    </div>

                    <div class="form-check">
                        <input type="radio" id="opcion3" name="opcion" value="Partido C" class="form-check-input">
                        <label for="opcion3" class="form-check-label">Partido C</label>
                    </div>

                    <!-- Botón para enviar el voto -->
                    <button type="submit" class="btn btn-primary mt-2">Votar</button>
                </form>
            </div>

            <!-- Formulario para mostrar resultados -->
            <form action="VotacionSv" method="get" accept-charset="UTF-8">
                <!-- Botón para la solicitud de resultados -->
                <button type="submit" class="btn btn-success mt-2" name="mostrarResultados">Mostrar resultados</button>
            </form>

            <br>
            <br>
            <!-- Resultados en tabla -->
            <div class="results-table">
                <!-- Verificamos si hay resultados para mostrar -->
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad Votos</th>
                        </tr>
                    </thead>
                    <tbody>

                        <%
                            // Obtenemos los resultados y los ordenamos por nombre de partido
                            Map<String, Integer> resultados = (Map<String, Integer>) request.getAttribute("resultados");
                            List<Map.Entry<String, Integer>> sortedResultados = new ArrayList<>(resultados.entrySet());
                            Collections.sort(sortedResultados, Map.Entry.comparingByKey());
                            for (Map.Entry<String, Integer> entry : sortedResultados) {
                        %>
                        <tr>
                            <!-- Fila de la tabla con el nombre del partido y cantidad de votos -->
                            <td><%= entry.getKey()%></td>
                            <td><%= entry.getValue()%></td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
    </div>
    <!-- Scripts de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>
