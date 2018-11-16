package com.packages.model;

import java.util.Date;

public class Package {

    private String size;
    private boolean fragile;
    private Date sendDate;
    private boolean prime;
    private String nextCity;
    private String origin;
    private float weight;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public String getNextCity() {
        return nextCity;
    }

    public void setNextCity(String nextCity) {
        this.nextCity = nextCity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}