package models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CRUD {

	private EntityManagerFactory emf= Persistence.createEntityManagerFactory("T1_EXS");
	private EntityManager em= emf.createEntityManager();
	//METODOS CRUD
	//READ ALL
	public List<producto> selectTodo(){
		CriteriaBuilder cb= em.getCriteriaBuilder();
		CriteriaQuery<producto> cq=cb.createQuery(producto.class);
		Root<producto> registro= cq.from(producto.class);
		CriteriaQuery<producto> todos= cq.select(registro);
		TypedQuery<producto> lista=em.createQuery(todos);
		return lista.getResultList();
	}
	//CREATE
	public void insertar(producto pr) {
		em.getTransaction().begin();
		em.persist(pr);
		em.getTransaction().commit();
		System.out.println("El Registro se creó correctamente");
		
	}
	//GET BY ID
	public producto buscar(int id) {
		em.getTransaction().begin();
		producto pr= em.find(producto.class, id);
		em.getTransaction().commit();
		return pr;
	}
	//UPDATE
	public void actualizar(producto pr) {
		em.getTransaction().begin();
		producto pd= em.find(producto.class,pr.getId_prod()); 
		pd.setNombre(pr.getNombre());
		pd.setDescripcion(pr.getDescripcion());
		pd.setStock(pr.getStock());
		pd.setPrecio(pr.getPrecio());
		pd.setFecha_ingr(pr.getFecha_ingr());
		em.getTransaction().commit();
		System.out.println("El Registro se Actualizó Correctamente");
	}
	//DELETE
	public void eliminar(int id) {
		em.getTransaction().begin();
		producto pr=em.find(producto.class, id);
		em.remove(pr);
		em.getTransaction().commit();
		System.out.println("El Registro se Eliminó Correctamente");
	}
	

}
