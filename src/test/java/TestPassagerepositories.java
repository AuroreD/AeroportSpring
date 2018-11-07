import static org.junit.Assert.*;

import java.util.concurrent.SynchronousQueue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import AeroportSpring.Repositories.PassagerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestPassagerepositories {

	@Autowired
	public PassagerRepository passagerrepository;

	@Test
	public void test() {
		assertNotNull(passagerrepository);
		
	
		
	}

}
