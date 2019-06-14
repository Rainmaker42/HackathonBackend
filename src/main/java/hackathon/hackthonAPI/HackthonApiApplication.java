package hackathon.hackthonAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HackthonApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(HackthonApiApplication.class, args);
	}

	@GetMapping(value = "/test")
	public String echoTest()
	{
		return "I am GRROOOOOTTT";
	}

}
