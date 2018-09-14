package dimulski.playlist.controllers;

import dimulski.playlist.models.Song;
import dimulski.playlist.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public final class HomeController {

    @Autowired
    SongRepository songRepository;

    @GetMapping(value = "/homepage")
    public ModelAndView getHome() {
        ModelAndView model = new ModelAndView("/homepage");
        model.addObject("playlist", getPlaylist());
        return model;
    }

    @PostMapping(value = "/homepage")
    public ModelAndView persist(@ModelAttribute Song song) {
        songRepository.save(song);
        ModelAndView model = new ModelAndView("/homepage");
        model.addObject("playlist", getPlaylist());
        return model;
    }

    @ModelAttribute("playlist")
    public List<Song> getPlaylist() {
        return this.songRepository.findAll();
    }
}
