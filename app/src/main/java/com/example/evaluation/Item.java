package com.example.evaluation;

public class Item
{

    private float ratingBar;
    private String comment;
    private String question;

    public Item(String question, float ratingBar, String comment)

    {
        this.question = question;
        this.comment = comment;
        this.ratingBar = ratingBar;

    }

    public float getRatingBar() {
        return ratingBar;
    }

    public String getComment() {
        return comment;
    }

    public String getQuestion() {
        return question;
    }

}
