import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import AeroportSpring.Repositories.ReservationRepository;
import AeroportSpring.Repositories.VolRepository;
import AeroportSpring.Services.ClientService;
import AeroportSpring.model.Adresse;
import AeroportSpring.model.Client;
import AeroportSpring.model.ClientPhysique;
import AeroportSpring.model.Login;
import AeroportSpring.model.Passager;
import AeroportSpring.model.Reservation;
import AeroportSpring.model.Vol;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })

public class TestServiceClient {

	@Autowired
	ClientService clientService ;
	@Autowired
	VolRepository VolRepository ;
	@Autowired
	ReservationRepository reservationRepository;

	@Test
	public void test() {
		
		// test création login & attribution login déjà existant
		Client clientPhysique = null;
		
		clientPhysique = (ClientPhysique) clientService.createClientPhysique();
		
		assertNotNull(clientPhysique);
		
		Adresse adresse = new Adresse();
		
		Login login = new Login();
		login.setId((long) 1);
		
		Client clientPhysique2 = (ClientPhysique) clientService.CreateClientPhysique("Paul",login,adresse);
		assertNotNull(clientPhysique2);

		//test  récupérer l'ensemble des vols d'un client
		
		Vol vol = new Vol();
		vol = VolRepository.save(vol);
		
		Reservation reservation = new Reservation();
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		Date date = null;
				try {
					date = sdf.parse("12/02/2017");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		reservation.setDate(date);	
		reservation.setNumero(12342);
		
		reservation.setVol(vol);
			
		reservation.setClient(clientPhysique2);
		
		reservation = reservationRepository.save(reservation);
		
		System.out.println(clientService.numVolPrint(clientPhysique2.getId()));
		
	}

}
