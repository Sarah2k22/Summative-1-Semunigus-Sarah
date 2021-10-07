package com.company.Summitive1AssessmentSemuniguSarah.controller;

import com.company.Summitive1AssessmentSemuniguSarah.model.Quote;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteOfTheDay {
    List<Quote> quoteList= new ArrayList<>();
    private static int idCounter =1;
    public QuoteOfTheDay(){
        quoteList.add(new Quote("E. Joseph Cossman","The best way to remember your wife's birthday is to forget it once.",idCounter++));
        quoteList.add(new Quote("Patti Smith","Never let go of that fiery sadness called desire.", idCounter++));
        quoteList.add(new Quote("T. S. Eliot","One starts an action simply because one must do something.", idCounter++));
        quoteList.add(new Quote("Oliver Wendell Holmes","Every calling is great when greatly pursued.", idCounter++));
        quoteList.add(new Quote("Henry Taylor","The world knows nothing of its greatest men.", idCounter++));
        quoteList.add(new Quote("Thomas Fuller","The great end of life is not knowledge, but action.", idCounter++));
        quoteList.add(new Quote("Thomas Fuller","Great and good are seldom the same man.", idCounter++));
        quoteList.add(new Quote("Bible","Great men are not always wise.",idCounter++));
        quoteList.add(new Quote("Angela Merici","Beware of trying to accomplish anything by force.",idCounter++));
        quoteList.add(new Quote("Patti Smith","Never let go of that fiery sadness called desire.",idCounter++));
    }

    @RequestMapping(value= "/quote", method= RequestMethod.GET)
    @ResponseBody
        public Quote getQuote() {
        Random random = new Random();
        return quoteList.get(random.nextInt(quoteList.size()));
    }
}


