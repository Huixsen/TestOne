package xhSpittrWeb;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class HomeControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws Exception {
		HomeController controller=new HomeController();
		MockMvc mockMvc=standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("Home"));
		//assertEquals("Home",controller.home());
		//fail("Not yet implemented");
	}

}
