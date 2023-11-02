package org.example.persistencia;

import org.example.logica.Platillos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class PlatilloJpaController {

    private EntityManagerFactory emf = null;

    //Constructor
    public PlatilloJpaController() {
        //Obtener la unidad de persistencia
        this.emf = Persistence.createEntityManagerFactory("restaurantePU");
    }

    //Getter
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    //Metodos para interactuar con la BBDD

    //Crear
    public void create(Platillos platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(platillo);
        em.getTransaction().commit();
    }

    //Borrar
    public void destroy(Long id){
        EntityManager em  = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillos platillo = em.find(Platillos.class, id);
        em.remove(platillo);
        em.getTransaction().commit();
    }

    //Modificar
    public void edit(Platillos platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.merge(platillo);
        em.getTransaction().commit();
    }

    //Metodo Listar
    public List<Platillos> findPlatilloEntities(){
        EntityManager em = null;
        em = getEntityManager();

        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillos.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
}
