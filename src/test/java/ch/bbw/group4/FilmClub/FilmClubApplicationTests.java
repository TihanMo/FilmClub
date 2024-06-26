package ch.bbw.group4.FilmClub;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FilmClubApplicationTests {
    private Regisseur regisseur1, regisseur2, regisseur3, regisseur4;

    @BeforeEach
    public void setUp() {
        regisseur1 = new Regisseur("Max Mustermann");
        regisseur2 = new Regisseur("Max1 Mustermann1");
        regisseur3 = new Regisseur("import.org.junit.jupiter.api.*");
        regisseur4 = new Regisseur("");
    }

    @Test
    public void testString() {
        assertEquals(regisseur1.getString(), "Max Mustermann");
        assertEquals(regisseur2.getString(), "Max1 Mustermann1");
        assertEquals(regisseur3.getString(), "import.org.junit.jupiter.api.*");
        assertNull(regisseur4.getString(), null);
    }
}
