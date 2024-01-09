package com.example.nlpthing.NLPThing;

import com.example.nlpthing.NLPThing.nlpBoiler.BoilerPipeExtractor;
import com.example.nlpthing.NLPThing.nlpBoiler.PortfolioNewsAnalyzer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;


@SpringBootApplication
public class NlpThingApplication {


  public static String urlString = "https://www.moneycontrol.com/news/technology/it-q3-fy24-earnings-five-factors-to-watch-out-for-12021101.html";
  public static String urlString1 = "https://auth.geeksforgeeks.org/user/mayankdinesh1";
	public static void main(String[] args)   throws java.io.IOException,
    org.xml.sax.SAXException,
    de.l3s.boilerpipe.BoilerpipeProcessingException {
		SpringApplication.run(NlpThingApplication.class, args);
    String text = BoilerPipeExtractor.extractFromUrl(urlString);
//    System.out.print(text);
    PortfolioNewsAnalyzer portfolioNewsAnalyzer = new PortfolioNewsAnalyzer();
    String taggedPos = portfolioNewsAnalyzer.tagPos(text);
//    System.out.println(taggedPos);
    HashSet<String> allNouns = portfolioNewsAnalyzer.extractProperNouns(taggedPos);
    allNouns.forEach(item->System.out.println(item));
	}

}

