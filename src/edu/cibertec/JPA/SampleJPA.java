package edu.cibertec.JPA;

import javax.persistence.Persistence;

import models.CRUD;
import models.producto;

public class SampleJPA {

	public static void main(String[] args) {
		//producto pr = new  producto(6,"Tablet","Tablet Para Pibes",100, 80.99, "2024-06-05");
		
		CRUD operaciones = new CRUD();
		//operaciones.insertar(pr);
		
		/*for(producto pt: operaciones.selectTodo() ) {
			System.out.println(pt);	
		
		//System.out.println(operaciones.buscar(4));
		
		producto pr = new  producto(5,"Ventilador","Refriferacion de PC",200, 130.99, "2024-10-09");
		operaciones.actualizar(pr);
		
		}*/
		operaciones.eliminar(3);
	}
	
}
