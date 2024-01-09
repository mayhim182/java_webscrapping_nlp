package com.example.nlpthing.NLPThing.nlpBoiler;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.util.HashSet;

public class PortfolioNewsAnalyzer {
  private HashSet<String> portfolio;
  private static final String modelPath = "edu\\stanford\\nlp\\models\\pos-tagger\\english-left3words\\english-left3words-distsim.tagger";
  private MaxentTagger tagger;

  public PortfolioNewsAnalyzer()
  {
    tagger = new MaxentTagger(modelPath);
  }
  public String tagPos(String input){
    return tagger.tagString(input);
  }
}
