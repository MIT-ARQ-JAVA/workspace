package br.edu.infnet.pedido.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.pedido.model.domain.Bebida;

@Repository
public interface BebidaRepository extends CrudRepository<Bebida, Integer> {

	@Query("from Bebida b where b.usuario.id = :id")
	Collection<Bebida> findAll(Integer id, Sort by);
}