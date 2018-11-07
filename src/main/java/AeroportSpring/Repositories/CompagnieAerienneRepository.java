package AeroportSpring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.model.CompagnieAerienne;

public interface CompagnieAerienneRepository extends JpaRepository<CompagnieAerienne, Long> {

//	List <CompagnieAerienne> findAllCompagnieAerienneVol();
//	
//	List <CompagnieAerienne> findAllVol();
}
