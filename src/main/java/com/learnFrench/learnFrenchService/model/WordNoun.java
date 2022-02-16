package com.learnFrench.learnFrenchService.model;

import javax.persistence.*;

@Entity
public class WordNoun {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable=false, name="Id")
    private long id;

    @Column(name = "Polish")
    private String polishText;

    @Column(name = "French")
    private String frenchText;

    @Column(name = "gender")
    private String gender;

    @Column(name = "Phrase")
    private String samplePhrase;

    public WordNoun() {}

    public WordNoun(String polishText, String frenchText, String gender, String samplePhrase){
        this.polishText = polishText;
        this.frenchText = frenchText;
        this.gender = gender;
        this.samplePhrase = samplePhrase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPolishText() {
        return polishText;
    }

    public void setPolishText(String polishText) {
        this.polishText = polishText;
    }

    public String getFrenchText() {
        return frenchText;
    }

    public void setFrenchText(String frenchText) {
        this.frenchText = frenchText;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSamplePhrase() {
        return samplePhrase;
    }

    public void setSamplePhrase(String samplePhrase) {
        this.samplePhrase = samplePhrase;
    }

    @Override
    public String toString() {
        return "WordNoun{" +
                "id=" + id +
                ", polishText='" + polishText + '\'' +
                ", frenchText='" + frenchText + '\'' +
                ", gender='" + gender + '\'' +
                ", samplePhrase='" + samplePhrase + '\'' +
                '}';
    }
}
