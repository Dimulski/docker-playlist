package dimulski.dockerplaylist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "dimulski.dockerplaylist.repository")
@SpringBootApplication
public class DockerPlaylistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerPlaylistApplication.class, args);
	}
}
