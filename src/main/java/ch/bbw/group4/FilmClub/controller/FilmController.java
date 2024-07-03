package ch.bbw.group4.FilmClub.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class FilmController {
    @GetMapping(value = "/")
    public String home(){
        return "film1View" ;
    }

}
