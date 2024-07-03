package ch.bbw.group4.FilmClub;

import java.util.Date;

public class Regisseur {
    String Vorname;
    String Name;
    Date Birthdate;
    public Regisseur(String vorname, String name, Date birthdate) {
        this.Vorname = vorname;
        this.Name = name;
        this.Birthdate = birthdate;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.Birthdate = birthdate;
    }
}
