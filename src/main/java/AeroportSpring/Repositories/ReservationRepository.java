package AeroportSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import AeroportSpring.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
