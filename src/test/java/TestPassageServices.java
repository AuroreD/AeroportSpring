import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import AeroportSpring.Repositories.AeroportRepository;
import AeroportSpring.Repositories.ClientRepository;
import AeroportSpring.Repositories.CompagnieAerienneRepository;
import AeroportSpring.Repositories.CompagnieAerienneVolRepository;
import AeroportSpring.Repositories.EscaleRepository;
import AeroportSpring.Repositories.LoginRepository;
import AeroportSpring.Repositories.PassagerRepository;
import AeroportSpring.Repositories.ReservationRepository;
import AeroportSpring.Repositories.VilleAeroportRepository;
import AeroportSpring.Repositories.VilleRepository;
import AeroportSpring.Repositories.VolRepository;
import AeroportSpring.Services.PassagerServices;
import AeroportSpring.model.Passager;
import AeroportSpring.model.Reservation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestPassageServices {

	@Autowired
	PassagerServices passagerServices;
	PassagerRepository passagerRepository;
	
	
	

//	@Test
////	public void testNumeroReservationPassager() {
////		
////		Passager p = new Passager ();
////		Reservation r = new Reservation();
////		p.setNom("sellaiah");
////		p.setPrenom("vallan");
////		p.setReservations(reservations);
////		passagerServices.AeroportArriveedupassager(p);
////		
////		
		
		

	}


