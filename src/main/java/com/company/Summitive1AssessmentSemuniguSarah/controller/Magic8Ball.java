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
        answer.add("answer1");
        answer.add("answer2");
        answer.add("answer3");
        answer.add("answer4");
        answer.add("answer5");
        answer.add("answer6");
    }

    @RequestMapping(value = "/magic8Ball", method= RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    @ResponseBody
    //the question being asked
    public MagicBall getAnswer(@RequestBody String question){
        Random random= new Random();
        int index = random.nextInt(answer.size());

        MagicBall response= new MagicBall(question, answer.get(index), index);
        return response;

    }


}

