package com.learnFrench.learnFrenchService.model;

import javax.persistence.*;


@Entity
public class WordVerbPresent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable=false, name="Id")
    private long id;

    @Column(name = "Polish")
    private String polishText;

    @Column(name = "FrenchInfinitive")
    private String frenchText;

    @Column(name = "Je")
    private String je;

    @Column(name = "Tu")
    private String tu;

    @Column(name = "Il")
    private String il;

    @Column(name = "Nous")
    private String nous;

    @Column(name = "Vous")
    private String vous;

    @Column(name = "Ils")
    private String ils;

    public WordVerbPresent() {}

    public WordVerbPresent(String polishText, String frenchText, String je, String tu, String il,
                           String nous, String vous, String ils) {
        this.polishText = polishText;
        this.frenchText = frenchText;
        this.je = je;
        this.tu = tu;
        this.il = il;
        this.nous = nous;
        this.vous = vous;
        this.ils = ils;
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

    public String getJe() {
        return je;
    }

    public void setJe(String je) {
        this.je = je;
    }

    public String getTu() {
        return tu;
    }

    public void setTu(String tu) {
        this.tu = tu;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getNous() {
        return nous;
    }

    public void setNous(String nous) {
        this.nous = nous;
    }

    public String getVous() {
        return vous;
    }

    public void setVous(String vous) {
        this.vous = vous;
    }

    public String getIls() {
        return ils;
    }

    public void setIls(String ils) {
        this.ils = ils;
    }

    @Override
    public String toString() {
        return "WordVerbPresent{" +
                "id=" + id +
                ", polishText='" + polishText + '\'' +
                ", frenchText='" + frenchText + '\'' +
                ", je='" + je + '\'' +
                ", tu='" + tu + '\'' +
                ", il='" + il + '\'' +
                ", nous='" + nous + '\'' +
                ", vous='" + vous + '\'' +
                ", ils='" + ils + '\'' +
                '}';
    }
}
