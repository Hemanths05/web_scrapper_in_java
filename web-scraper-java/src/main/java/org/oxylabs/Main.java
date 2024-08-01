package org.oxylabs;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Main {
    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://hemanths05.github.io/portfolio_/").get();

            String title = doc.title();
            System.out.println("Title: " + title);
            Elements aboutUsSection = doc.select(".txtHead");

            if (aboutUsSection != null) {
                // Print the "About Us" content
                System.out.println("About Us:");
                System.out.println(aboutUsSection.text());
            } else {
                System.out.println("The About Us section was not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}