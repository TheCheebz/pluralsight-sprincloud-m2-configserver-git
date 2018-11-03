package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PluralsightSprincloudM2ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSprincloudM2ConfigserverGitApplication.class, args);
	}
}
