package ch.bbw.group4.FilmClub.controller;

import ch.bbw.group4.FilmClub.FilmClubApplication;
import ch.bbw.group4.FilmClub.Regisseur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {

    private List<Regisseur> regisseure = FilmClubApplication.getDirectors();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("regisseure", new ArrayList<Regisseur>());  // Leere Liste übergeben
        return "film1View";
    }

    @GetMapping("/search")
    public String search(@RequestParam("vorname") String vorname, Model model) {
        List<Regisseur> result = new ArrayList<>();
        for (Regisseur regisseur : regisseure) {
            if (regisseur.getVorname().equalsIgnoreCase(vorname)) {
                result.add(regisseur);
            }
        }
        model.addAttribute("regisseure", result);
        return "film1View";
    }
}
