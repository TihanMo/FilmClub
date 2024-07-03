package ch.bbw.group4.FilmClub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class FilmClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmClubApplication.class, args);
		List<Regisseur> regisseure = getDirectors();
		regisseure.forEach(regisseur ->
				System.out.println(regisseur.getVorname() + " " + regisseur.getName() + ", geboren am " + regisseur.getBirthdate())
		);
	}

	public static List<Regisseur> getDirectors() {
		List<Regisseur> regisseure = new ArrayList<>();
		regisseure.add(new Regisseur("Steven", "Spielberg", createDate(1946, 12, 18)));
		regisseure.add(new Regisseur("Martin", "Scorsese", createDate(1942, 11, 17)));
		regisseure.add(new Regisseur("Christopher", "Nolan", createDate(1970, 7, 30)));
		regisseure.add(new Regisseur("Quentin", "Tarantino", createDate(1963, 3, 27)));
		regisseure.add(new Regisseur("Alfred", "Hitchcock", createDate(1899, 8, 13)));
		regisseure.add(new Regisseur("Stanley", "Kubrick", createDate(1928, 7, 26)));
		regisseure.add(new Regisseur("Francis Ford", "Coppola", createDate(1939, 4, 7)));
		regisseure.add(new Regisseur("James", "Cameron", createDate(1954, 8, 16)));
		regisseure.add(new Regisseur("Ridley", "Scott", createDate(1937, 11, 30)));
		regisseure.add(new Regisseur("Peter", "Jackson", createDate(1961, 10, 31)));
		regisseure.add(new Regisseur("Tim", "Burton", createDate(1958, 8, 25)));
		regisseure.add(new Regisseur("George", "Lucas", createDate(1944, 5, 14)));
		regisseure.add(new Regisseur("David", "Fincher", createDate(1962, 8, 28)));
		regisseure.add(new Regisseur("Sofia", "Coppola", createDate(1971, 5, 14)));
		regisseure.add(new Regisseur("Guillermo", "del Toro", createDate(1964, 10, 9)));
		regisseure.add(new Regisseur("Wes", "Anderson", createDate(1969, 5, 1)));
		regisseure.add(new Regisseur("Clint", "Eastwood", createDate(1930, 5, 31)));
		regisseure.add(new Regisseur("Roman", "Polanski", createDate(1933, 8, 18)));
		regisseure.add(new Regisseur("Joel", "Coen", createDate(1954, 9, 21))); // für Joel Coen
		regisseure.add(new Regisseur("Spike", "Lee", createDate(1957, 3, 20)));
		regisseure.add(new Regisseur("Alejandro", "Iñárritu", createDate(1963, 8, 15)));
		regisseure.add(new Regisseur("Denis", "Villeneuve", createDate(1967, 10, 3)));
		regisseure.add(new Regisseur("Paul Thomas", "Anderson", createDate(1970, 6, 26)));
		regisseure.add(new Regisseur("Kathryn", "Bigelow", createDate(1951, 11, 27)));
		regisseure.add(new Regisseur("Jean-Luc", "Godard", createDate(1930, 12, 3)));
		regisseure.add(new Regisseur("Akira", "Kurosawa", createDate(1910, 3, 23)));
		regisseure.add(new Regisseur("Orson", "Welles", createDate(1915, 5, 6)));
		regisseure.add(new Regisseur("Fritz", "Lang", createDate(1890, 12, 5)));
		regisseure.add(new Regisseur("Ingmar", "Bergman", createDate(1918, 7, 14)));
		regisseure.add(new Regisseur("Federico", "Fellini", createDate(1920, 1, 20)));
		regisseure.add(new Regisseur("Luis", "Buñuel", createDate(1900, 2, 22)));
		regisseure.add(new Regisseur("François", "Truffaut", createDate(1932, 2, 6)));
		regisseure.add(new Regisseur("Werner", "Herzog", createDate(1942, 9, 5)));
		regisseure.add(new Regisseur("Jean-Pierre", "Jeunet", createDate(1953, 9, 3)));
		regisseure.add(new Regisseur("Lars", "von Trier", createDate(1956, 4, 30)));
		regisseure.add(new Regisseur("Michael", "Haneke", createDate(1942, 3, 23)));
		regisseure.add(new Regisseur("Pedro", "Almodóvar", createDate(1949, 9, 25)));
		regisseure.add(new Regisseur("Ken", "Loach", createDate(1936, 6, 17)));
		regisseure.add(new Regisseur("Wim", "Wenders", createDate(1945, 8, 14)));
		regisseure.add(new Regisseur("Sam", "Mendes", createDate(1965, 8, 1)));
		regisseure.add(new Regisseur("Ang", "Lee", createDate(1954, 10, 23)));
		regisseure.add(new Regisseur("Hayao", "Miyazaki", createDate(1941, 1, 5)));
		regisseure.add(new Regisseur("David", "Lynch", createDate(1946, 1, 20)));
		regisseure.add(new Regisseur("Terrence", "Malick", createDate(1943, 11, 30)));
		regisseure.add(new Regisseur("Robert", "Zemeckis", createDate(1951, 5, 14)));
		regisseure.add(new Regisseur("Guy", "Ritchie", createDate(1968, 9, 10)));
		regisseure.add(new Regisseur("J.J.", "Abrams", createDate(1966, 6, 27)));
		return regisseure;
	}

	private static Date createDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		return calendar.getTime();
	}
}
