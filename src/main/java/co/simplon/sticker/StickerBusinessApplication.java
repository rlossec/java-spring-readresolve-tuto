package co.simplon.sticker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Spring boot: scans all the classes in this package and
 * all its subpackages in order to find classes annotated with
 * some Spring @Annotations
 * Spring boot is not the framework, this is Spring
 * Spring boot is a tool box
 */
@SpringBootApplication
public class StickerBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(StickerBusinessApplication.class, args);
	}

}
