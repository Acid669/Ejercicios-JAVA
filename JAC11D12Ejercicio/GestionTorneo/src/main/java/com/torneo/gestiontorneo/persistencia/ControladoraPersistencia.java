/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.torneo.gestiontorneo.persistencia;

import com.torneo.gestiontorneo.exceptions.NonexistentEntityException;
import com.torneo.gestiontorneo.logica.Equipo;
import com.torneo.gestiontorneo.logica.Partido;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acid
 */
public class ControladoraPersistencia {

    //Se crean instancias de los controladores JPA para las entidades Equipo y Partido
    EquipoJpaController equipoJpa = new EquipoJpaController();
    PartidoJpaController partidoJpa = new PartidoJpaController();

    //EQUIPOS
    //Método para crear un nuevo equipo en la base de datos
    public void crearEquipo(Equipo equipo) {
        equipoJpa.create(equipo);
    }

    //Método para obtener una lista de todos los equipos en la base de datos
    public List<Equipo> traerEquipos() {
        return equipoJpa.findEquipoEntities();
    }

    //Método para obtener un equipo específico por su ID
    public Equipo ObtenerEquipo(Long id) {
        return equipoJpa.findEquipo(id);
    }

    //PARTIDOS
    //Método para crear un nuevo partido en la base de datos
    public void crearPartido(Partido partido) {
        partidoJpa.create(partido);
    }

    //Método para obtener una lista de todos los partidos en la base de datos
    public List<Partido> traerPartidos() {
        return partidoJpa.findPartidoEntities();
    }

}
