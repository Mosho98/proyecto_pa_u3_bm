package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class EstudianteRepoImpl implements IEstudianteRepo{

	@PersistenceContext 
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select *from estudiante where estu_nombre = 'Edison'
		//select e from Estudiante e where e.nombre = :datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);//1er campo variable a setear segundo parametro con que se va a setear
		return (Estudiante) jpqlQuery.getSingleResult();//devuelve obejtos genericos por lo que se hace un cast a Estudiante
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	//REUTILIZACION
	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}
	//Podemos hacer una combinacion

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNom", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	
	//NATIVE QUERY
	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select *from estudiante where estu_nombre = :datoNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	/*@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);//1er campo variable a setear segundo parametro con que se va a setear
		return jpqlQuery.getResultList();	
	}*/

	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
	
		return null;
	}

	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager
				.createQuery("select NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre, e.apellido, e.cedula, e.genero)  from Estudiante e where e.nombre = :datoNombre", EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreQueryCriteria(String nombre) {
		
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		//ESPECIFICAMOS EL TIPO DE RETORNO DE MI QUERY
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		
		//AQUI EMPEZAMOS A CREAR EL SQL
		//DEFINIMOS LA TABLA DESTINO ES DECIR EL FROM - Root...ES TOMADO COMO LA RUTA PRINCIPAL
		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class);//es como haber hecho el FROM Estudiante
		
		//Las condiciones WHERE se conocen en criteria API QUERY como predicados
		//e.nombre = :datoNombre(entidad.nombre)
		Predicate condicion1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		
		myQuery.select(miTablaFrom).where(condicion1);
		//DECALRADO/ARMADO MI QUERY
		//La ejecucion del query lo realizamos con cualquier tipo ya conocido: TypedQuery (RECOMENDACION)
		
		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myQuery);
		
		
		return mySQL.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryCriteriaAndOr(String nombre, String apellido, String genero) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myQuery = myBuilder.createQuery(Estudiante.class);
		Root<Estudiante> miTablaFrom = myQuery.from(Estudiante.class);
		
		//M: e.nombre = AND e.apellido= coincida nombre con apellido
		//F: e.nombre = OR e.apellido=
		//Creamos los predicados
		//Predicado del nombre
		Predicate p1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		
		//Predicado del apellido
		Predicate p2 = myBuilder.equal(miTablaFrom.get("apellido"), apellido);
		///////////////////////////////////////////////////////////////////////////////////
		
		Predicate predicadoFinal = null;		
		if(genero.equals("M")) {
			//Predicado de AND.......Pasa ser otro predicado mas
			 predicadoFinal = myBuilder.and(p1,p2);
		}else {
			//Predicado de OR
			 predicadoFinal = myBuilder.or(p1,p2);	
		}
		
		
		myQuery.select(miTablaFrom).where(predicadoFinal);
		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myQuery);
		
		
		return mySQL.getResultList();
		
		
		
	}

	@Override
	public int eliminarPorApellido(String apellido) {
		//DELETE FROM estudiante WHERE estu_apellido = 'Teran'
	   Query query = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.apellido = :apellido");
	   query.setParameter("apellido", apellido);
	   
	   return query.executeUpdate();
	}

	@Override
	public int actualizarPorApellido(String apellido, String nombre) {
		// UPDATE estudiante SET estu_nombre = 'Edison' WHERE estu_apellido = 'Cayambe'
		Query query = this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre = :datoNombre WHERE e.apellido = :datoApellido");
		  query.setParameter("datoNombre", nombre);
		  query.setParameter("datoApellido", apellido);
		  
		  return query.executeUpdate();
	}
	
	

	/*@Override
	public Estudiante buscarPorNombreQueryListFirst(String nombre) {
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);//1er campo variable a setear segundo parametro con que se va a setear
		return  (Estudiante) jpqlQuery.getResultList().get(0);	
	}*/
	
	
	
	
}
