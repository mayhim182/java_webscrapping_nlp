package com.example.nlpthing.NLPThing.nlpBoiler;

import java.net.URL;

import de.l3s.boilerpipe.document.TextDocument;
import de.l3s.boilerpipe.extractors.CommonExtractors;
import de.l3s.boilerpipe.sax.BoilerpipeSAXInput;
import de.l3s.boilerpipe.sax.HTMLDocument;
import de.l3s.boilerpipe.sax.HTMLFetcher;

public class BoilerPipeExtractor {
  public static String extractFromUrl(String userUrl) throws java.io.IOException, org.xml.sax.SAXException
    ,de.l3s.boilerpipe.BoilerpipeProcessingException{
      final HTMLDocument htmlDocument = HTMLFetcher.fetch(new URL(userUrl));
      final TextDocument doc = new BoilerpipeSAXInput(htmlDocument.toInputSource()).getTextDocument();
      return CommonExtractors.ARTICLE_EXTRACTOR.getText(doc);
  }
}
