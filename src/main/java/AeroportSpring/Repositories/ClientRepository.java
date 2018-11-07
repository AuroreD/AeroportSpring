package AeroportSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{

}
