package ch.bbw.group4.FilmClub;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class IMDbScraper {
    public static void main(String[] args) {
        String movieTitle = "Cars 2";
        try {
            String searchUrl = "https://www.imdb.com/find?q=" + movieTitle.replace(" ", "+");
            Document searchDoc = Jsoup.connect(searchUrl).get();

            Element firstResult = searchDoc.select(".findResult").first();
            if (firstResult != null) {
                String moviePageUrl = "https://www.imdb.com" + firstResult.select("a").attr("href");

                Document movieDoc = Jsoup.connect(moviePageUrl).get();

                String title = movieDoc.select("h1").text();
                String rating = movieDoc.select("span[itemprop=ratingValue]").text();

                System.out.println("Title: " + title);
                System.out.println("Rating: " + rating);
            } else {
                System.out.println("Film nicht gefunden.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
