package com.torneo.gestiontorneo.logica;

import com.torneo.gestiontorneo.logica.Equipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-23T00:14:49")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, String> fecha;
    public static volatile SingularAttribute<Partido, Equipo> equipoLocal;
    public static volatile SingularAttribute<Partido, Integer> resultadoVisitante;
    public static volatile SingularAttribute<Partido, Equipo> equipoVisitante;
    public static volatile SingularAttribute<Partido, Integer> resultadoLocal;
    public static volatile SingularAttribute<Partido, Long> id;

}