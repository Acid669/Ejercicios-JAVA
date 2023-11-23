<%-- 
    Document   : index
    Created on : 22 nov 2023, 17:33:31
    Author     : Acid
--%>

<%@page import="com.torneo.gestiontorneo.persistencia.ControladoraPersistencia"%>
<%@page import="com.torneo.gestiontorneo.persistencia.EquipoJpaController"%>
<%@page import="com.torneo.gestiontorneo.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.torneo.gestiontorneo.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Torneo de Baloncesto</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>

        <div class="container mt-4">
            <h2>Formulario para registrar un nuevo equipo</h2>
            <form action="EquipoSv" method="POST" accept-charset="UTF-8">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre_equipo" name="nombre_equipo">
                </div>              

                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>

            <hr>
            <h2>Listado de equipos</h2>
            <hr>
            <form action="EquipoSv" method="GET" accept-charset="UTF-8">   
                <button type="submit" class="btn btn-primary">Ver equipos</button>
            </form>
            <br>
            <br>


            <!-- Resultados en tabla -->
            <div class="results-table">
                <% if (request.getAttribute("equipos") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID DE LOS EQUIPOS</th>
                            <th>NOMBRE DE LOS EQUIPOS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("equipos")) {%>
                        <tr>
                            <td><%= equipo.getId()%></td>
                            <td><%= equipo.getNombre()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                    </tbody>
                </table>
                <% }%>

                <br>
                <br>            
                <hr>
                <h2>Formulario Partido</h2>
                <form action="PartidoSv" method="POST" accept-charset="UTF-8">
                    <div class="form-group">
                        <label for="fecha">Fecha:</label>
                        <input type="text" class="form-control" id="fecha_partido" name="fecha_partido">
                    </div>     
                    <div class="form-group">
                        <label for="equipo1">Equipo Local: (ID)</label>
                        <input type="text" class="form-control" id="equipo_local_id" name="equipo_local_id">
                    </div>
                    </div>
                    <div class="form-group">
                        <label for="resultadoequipo1">Resultado equipo local:</label>
                        <input type="text" class="form-control" id="resultado_equipo1" name="resultado_local">
                    </div>
                    <div class="form-group">
                        <label for="equipo2">Equipo Visitante: (ID)</label>
                        <input type="text" class="form-control" id="equipo_visitante_id" name="equipo_visitante_id">
                    </div>                 
                    <div class="form-group">
                        <label for="resultadoequipo2">Resultado equipo visitante:</label>
                        <input type="text" class="form-control" id="resultado_equipo2" name="resultado_visitante">
                    </div>                  
                    <button type="submit" class="btn btn-primary">Guardar</button>
                </form>            
                <hr>
                <form action="PartidoSv" method="GET" accept-charset="UTF-8">    
                    <button type="submit" class="btn btn-primary">Ver partidos</button>
                </form>
                <br>
                <div class="results-table">
                    <% if (request.getAttribute("partidos") != null) { %>
                    <h3>Partidos registrados:</h3>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Fecha</th>
                                <th>Equipo Local:</th>
                                <th>Resultado equipo local:</th>
                                <th>Equipo Visitante:</th>                    
                                <th>Resultado equipo visitante:</th>                                
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) {%>
                            <tr>
                                <td><%= partido.getFecha()%></td>
                                <td><%= partido.getEquipoLocal().getNombre()%></td>
                                <td><%= partido.getResultadoLocal()%></td>
                                <td><%= partido.getEquipoVisitante().getNombre()%></td> 
                                <td><%= partido.getResultadoVisitante()%></td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                    <% }%>
                </div> 
            </div>
            <!-- Scripts de Bootstrap -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
