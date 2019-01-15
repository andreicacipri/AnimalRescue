package org.fasttrackit;

public class Cat extends Pet {
    private boolean mew ;

    public boolean isMew() {
        return mew;
    }

    public void setMew(boolean mew) {
        this.mew = mew;
    }
    public void spiritlevel (Animal animal){
        System.out.println(" level spirit of  "+getName() + " is " + animal.getSpirit()+ ", cat purrs of happiness ");

    }
}
