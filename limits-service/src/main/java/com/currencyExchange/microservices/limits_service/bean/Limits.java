package com.currencyExchange.microservices.limits_service.bean;

public class Limits {

    private int minimum;
    private int maximum;

  public  Limits(int minimum,int maximum){
        this.maximum=maximum;
        this.minimum=minimum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
