package com.company.Summitive1AssessmentSemuniguSarah.model;

public class MagicBall {
    private String question;
    private String answer;
    private int id;
    public MagicBall(){}
    public MagicBall(String question, String answer, int id){
        this.question=question;
        this.answer= answer;
        this.id= id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {

        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
