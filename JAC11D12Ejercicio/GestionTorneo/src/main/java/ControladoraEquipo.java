
import com.torneo.gestiontorneo.logica.Equipo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControladoraEquipo {

    // ...

    public void crearEquipo(String nombreEquipo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nombreDeTuUnidadDePersistencia");
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();

            // Crea una nueva instancia de la entidad Equipo y configura los atributos
            Equipo nuevoEquipo = new Equipo();
            nuevoEquipo.setNombre(nombreEquipo);

            // Guarda el nuevo equipo en la base de datos
            em.persist(nuevoEquipo);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
