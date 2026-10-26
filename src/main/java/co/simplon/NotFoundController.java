package co.simplon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Spring boot: embed web server
 * Spring boot: auto configuration, auto-scan project
 * from the "root" package of the Application/main
 * (sub)class package
 */

@RestController
@RequestMapping("/hello")
public class NotFoundController {
	
	@GetMapping
	public String hello() {
		return "Hello World!";
	}

}


