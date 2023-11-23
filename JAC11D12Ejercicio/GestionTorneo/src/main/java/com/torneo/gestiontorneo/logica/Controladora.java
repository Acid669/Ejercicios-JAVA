/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torneo.gestiontorneo.logica;

import com.torneo.gestiontorneo.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    //Crear una instancia de ControladoraPersistencia para operaciones de persistencia de datos
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //EQUIPOS
    //Método para crear un nuevo equipo
    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    //Método para recuperar una lista de todos los equipos
    public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();
    }

    //PARTIDOS
    // Método para crear un nuevo partido con los IDs de equipo local y visitante especificados
    public void crearPartido(Partido partido, Long idEquipoLocal, Long idEquipoVisitante) {

        //Recuperar equipos local y visitante usando sus IDs
        Equipo equipoLoc = controlPersis.ObtenerEquipo(idEquipoLocal);
        Equipo equipoVis = controlPersis.ObtenerEquipo(idEquipoVisitante);

        //Establecer los equipos local y visitante para el partido
        partido.setEquipoLocal(equipoLoc);
        partido.setEquipoVisitante(equipoVis);

        //Crear el partido utilizando la información proporcionada
        controlPersis.crearPartido(partido);

    }

    //Método para recuperar una lista de todos los partidos
    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }
}
