package AeroportSpring.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AeroportSpring.Repositories.AeroportRepository;
import AeroportSpring.model.Aeroport;

@Service
public class AeroportService {

	@Autowired
	private AeroportRepository aeroportRepository;
	
	public void trouverVille(String nom) {
		aeroportRepository.findAllVilleByNom(nom);
	}
	
	public void trouverVol(String nom) {
		aeroportRepository.findVolsDepartAndVolsArriveeByNom(nom);
	}
	
	public void trouverEscale(String nom) {
		aeroportRepository.findAllEscaleByNom(nom);
	}
	
	public void creerAeroport(String nom) {
		Optional<Aeroport> opt = aeroportRepository.findByNom(nom);
		if(opt.isPresent()) {
		} else {
			Aeroport aeroport = new Aeroport();
			aeroport.setNom(nom);
			aeroportRepository.save(aeroport);
		}
	}
	
	public void supprimerAeroport(String nom) {
		Optional<Aeroport> opt = aeroportRepository.findByNom(nom);
		if(opt.isPresent()) {
			Aeroport aeroport = opt.get();
			aeroportRepository.delete(aeroport);
		}
	}
		
	public void modifierNomAeroport(Long id, String nom) {
		Optional<Aeroport> opt = aeroportRepository.findById(id);
		if(opt.isPresent()) {
			Aeroport aeroport = opt.get();
			aeroport.setNom(nom);
			aeroportRepository.save(aeroport);
		}
	}
	
}
