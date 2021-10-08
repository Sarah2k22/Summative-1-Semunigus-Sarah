package com.company.Summitive1AssessmentSemuniguSarah.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicBall magicBall = (MagicBall) o;
        return getId() == magicBall.getId() && Objects.equals(getQuestion(), magicBall.getQuestion()) && Objects.equals(getAnswer(), magicBall.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestion(), getAnswer(), getId());
    }

    @Override
    public String toString() {
        return "MagicBall{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", id=" + id +
                '}';
    }
}
