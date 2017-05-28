package fr.yps.yps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yps.yps.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
