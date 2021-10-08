package com.company.Summitive1AssessmentSemuniguSarah.controller;

import com.company.Summitive1AssessmentSemuniguSarah.model.MagicBall;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
public class Magic8Ball {
    private List<String> answer = new ArrayList();
    public Magic8Ball(){
        answer.add("It is certain.");
        answer.add(" It is decidedly so");
        answer.add(" Without a doubt");
        answer.add("Yes definitely");
        answer.add("You may rely on it");
        answer.add("Most likely.");
    }

    @RequestMapping(value = "/magic8Ball", method= RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    //the question being asked
    public MagicBall getAnswer(@RequestBody MagicBall question){
        Random random= new Random();
        int index = random.nextInt(answer.size());

        question.setId(index);
        question.setAnswer(answer.get(index));
        return question;

    }


}

