package dimulski.dockerplaylist.controllers;

import dimulski.dockerplaylist.models.Songs;
import dimulski.dockerplaylist.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping(value = "/get-playlist")
    public List<Songs> getAll() {
        return songRepository.findAll();
    }

    @PostMapping(value = "/add-song")
    public List<Songs> persist(@RequestBody final Songs songs) {
        songRepository.save(songs);
        return songRepository.findAll();
    }
}
