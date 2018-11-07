package AeroportSpring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.model.Vol;

public interface VolRepository extends JpaRepository<Vol, Long> {
	
	List <Vol> findAllAeroportDepart(); 
	
	List <Vol> findAllAeroportArrivee();
	
	List <Vol> findAllEscale();
	
	List <Vol> findAllReservation();
	
	List <Vol> findAllCompagnieAerienneVol();
	
	List <Vol> findAllCompagnieAerienne();
	
}
