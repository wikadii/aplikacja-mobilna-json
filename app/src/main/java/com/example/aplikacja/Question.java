package com.example.aplikacja;

import com.google.gson.annotations.SerializedName;

public class Question {
    @SerializedName(tresc)
    private String questionContent;
    @SerializedName(odp_a)
    private String answerA;
    @SerializedName(odp_b)
    private String answerB;
    @SerializedName(odp_c)
    private String answerC;
    @SerializedName(odp_poprawna)
    private String correctAnswer;

    public Question(String questionContent, String answerA, String answerB, String answerC, String correctAnswer) {
        this.questionContent = questionContent;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionContent='" + questionContent + '\'' +
                ", answerA='" + answerA + '\'' +
                ", answerB='" + answerB + '\'' +
                ", answerC='" + answerC + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
