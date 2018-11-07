import static org.junit.Assert.*;

import org.junit.AfterClass;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestRepositories {

@Autowired	
AeroportRepository aeroportRepository;
ClientRepository clientRepository;
CompagnieAerienneRepository compagnieAerienneRepository;
CompagnieAerienneVolRepository compagnieAerienneVolRepository;
EscaleRepository escaleRepository;
LoginRepository loginRepository;
PassagerRepository passagerRepository;
ReservationRepository reservationRepository;
VilleAeroportRepository villeAeroportRepository;
VilleRepository villeRepository;
VolRepository volRepository;

@Test
public void init() {
	assertTrue(true);
}

}
