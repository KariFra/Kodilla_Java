package com.kodilla.stream.beautifier;

public class PoemBeautifier {

   public void beautify(String poemFragment, PoemDecorator poemDecorator){
       String result = poemDecorator.decorate(poemFragment);
       System.out.println("The text after changes: " + result);

   }
}
