package dimulski.dockerplaylist.repository;

import dimulski.dockerplaylist.models.Songs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Songs, Integer> {

}
