package AeroportSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VilleService {

	@Autowired
	private VilleRepository villeRepository;
	
	@Autowired
	private AeroportRepository aeroportRepository;
	
	@Autowired
	private CompagnieAerienneRepository compagnieAerienneRepository;
	
	public void trouverAeroport(String nom) {
		villeRepository.findByNomAllAeroport(nom);
	}
}
