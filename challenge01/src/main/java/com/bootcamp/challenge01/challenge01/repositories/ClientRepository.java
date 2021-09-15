package com.bootcamp.challenge01.challenge01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.challenge01.challenge01.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {

}
