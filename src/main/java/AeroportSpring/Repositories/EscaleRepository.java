package AeroportSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.model.Escale;
import AeroportSpring.model.EscaleKey;

public interface EscaleRepository extends JpaRepository<Escale, EscaleKey> {

}
