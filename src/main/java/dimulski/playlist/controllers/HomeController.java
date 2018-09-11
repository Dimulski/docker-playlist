package dimulski.playlist.controllers;

import dimulski.playlist.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public final class HomeController {

    @Autowired
    SongRepository songRepository;

    @GetMapping(value = {"", "/"})
    public ModelAndView rootGet() {
        ModelAndView model = new ModelAndView("/greeting");
        model.addObject("playlist", getPlaylist());
        return model;
    }

    @ModelAttribute("playlist")
    public List<String> getPlaylist() {
        List<String> songs = new ArrayList<>();
        songs.add("Le Perv");
        songs.add("Hang'em all");
        songs.add("Ancient Stones");
        return songs;
    }
}
