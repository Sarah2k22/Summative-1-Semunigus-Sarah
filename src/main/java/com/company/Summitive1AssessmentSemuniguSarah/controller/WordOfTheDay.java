package com.company.Summitive1AssessmentSemuniguSarah.controller;

import com.company.Summitive1AssessmentSemuniguSarah.model.Word;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordOfTheDay {

    List<Word> wordList = new ArrayList<>();
    private static int idCounter =1;
    public WordOfTheDay(){
        wordList.add(new Word("Atrocity","The word atrocity describes both the act of cruelty as well as the sense of cruelty.", idCounter++));
        wordList.add(new Word("Fanatical","Anatical comes from the word fanatic, which itself came from the Latin fanaticus, meaning mad or inspired by a deity", idCounter++));
        wordList.add(new Word("Pensive","If you're pensive, you might simply be thinking hard about something.", idCounter++));
        wordList.add(new Word("Respite"," It comes from the Latin word respectus, meaning refuge, but we almost always use respite to describe a time, not a place, of relief.", idCounter++));
        wordList.add(new Word("Discordant","Discord is tension felt between people who strongly disagree about something.", idCounter++));
        wordList.add(new Word("Eloquent","Being eloquent is about using words well", idCounter++));
        wordList.add(new Word("Encompass","Encompass can be used when talking about anything that contains something else", idCounter++));
        wordList.add(new Word("Imperceptible","Within the word imperceptible you see the word percept, which means the object of your perception. ", idCounter++));
        wordList.add(new Word("Insuperable","Insuperable is an adjective that is often paired with nouns like difficulty, obstacle, and barrier.", idCounter++));
        wordList.add(new Word("Lethargy","Lethargy comes from the Greek lethargos, originally meaning inactive through forgetfulness.", idCounter++));

    }
    @RequestMapping(value= "/word", method= RequestMethod.GET)
    @ResponseBody
    //the answer will be returned
        public Word getWord(){
        Random random= new Random();
        return wordList.get(random.nextInt((wordList.size())));

    }
}
