package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class AutomovilRepoImpl implements IAutomovilRepo{
	
	@PersistenceContext 
	private EntityManager entityManager;

	@Override
	public Automovil buscarPorPlacaTypedQuery(String placa) {
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select a from Automovil a where a.placa = :datoPlaca", Automovil.class);
		myTypedQuery.setParameter("datoPlaca", placa);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlaca");
		myQuery.setParameter("datoPlaca", placa);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		Query myQuery = this.entityManager.createNativeQuery("select *from automovil where auto_placa = :datoPlaca", Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlacaNative", Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		return myQuery.getSingleResult();
	}
	
	//////////////////////EJEMPLO2///////////////////////

	@Override
	public Automovil buscarPorColorTypedQuery(String color) {
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select a from Automovil a where a.color = :datoColor", Automovil.class);
		myTypedQuery.setParameter("datoColor", color);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorNamedQuery(String color) {
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColor");
		myQuery.setParameter("datoColor", color);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		Query myQuery = this.entityManager.createNativeQuery("select *from automovil where auto_color = :datoColor", Automovil.class);
		myQuery.setParameter("datoColor", color);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorNamedNativeQuery(String color) {
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColorNative", Automovil.class);
		myQuery.setParameter("datoColor", color);
		return myQuery.getSingleResult();
	}

	//////////////////////////EJEMPLO 3//////////////////////////
	@Override
	public Automovil buscarPorMarcaTypedQuery(String marca) {
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select a from Automovil a where a.marca = :datoMarca", Automovil.class);
		myTypedQuery.setParameter("datoMarca", marca);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorKmNamedQuery(String km) {
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorKm");
		myQuery.setParameter("datoKm", km);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorTipoNativeQuery(String tipo) {
		Query myQuery = this.entityManager.createNativeQuery("select *from automovil where auto_tipo = :datoTipo", Automovil.class);
		myQuery.setParameter("datoTipo", tipo);
		
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaNamedNativeQuery(String marca) {
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarcaNative", Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getSingleResult();
	}

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}
	
	
	

}
