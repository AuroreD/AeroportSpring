package AeroportSpring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.model.Passager;

public interface PassagerRepository extends JpaRepository<Passager, Long> {
	
	List <Passager> findByNom(String nom);
	List <Passager> findById(Integer id);
	List <Passager> removeById(Integer id);
	
	
	
	
	
	
	

}
