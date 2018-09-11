package dimulski.playlist.repositories;

import dimulski.playlist.models.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Songs, Integer> {

}
