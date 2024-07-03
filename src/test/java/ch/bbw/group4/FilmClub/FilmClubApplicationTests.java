package ch.bbw.group4.FilmClub;

import org.junit.jupiter.api.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FilmClubApplicationTests {
    private Regisseur regisseur1, regisseur2, regisseur3, regisseur4;

    @BeforeEach
    public void setUp() {
        regisseur1 = new Regisseur("Max", "Mustermann", new Date(2001, 01, 01));
        regisseur2 = new Regisseur("Max1",  "Mustermann1", new Date(2001, 01, 01));
        regisseur3 = new Regisseur("import.org.junit.jupiter.api.*", "Nachname", new Date(2001, 01, 01));
        regisseur4 = new Regisseur("", "", new Date(2001, 01, 01));
    }

    @Test
    public void testString() {
        assertEquals(regisseur1.getVorname(), "Max");
        assertEquals(regisseur2.getVorname(), "Max1");
        assertEquals(regisseur3.getVorname(), "import.org.junit.jupiter.api.*");
        assertNull(regisseur4.getVorname());
    }
}
