package com.example.cardviewmine;

public class Pattern {
    private String patternName;
    private  int patternImg;

    public Pattern(String patternName, int patternImg) {
        this.patternName = patternName;
        this.patternImg = patternImg;
    }

    public String getPatternName() {
        return patternName;
    }

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    public int getPatternImg() {
        return patternImg;
    }

    public void setPatternImg(int patternImg) {
        this.patternImg = patternImg;
    }
}
