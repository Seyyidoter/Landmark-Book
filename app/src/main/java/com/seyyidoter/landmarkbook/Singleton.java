package com.seyyidoter.landmarkbook;

public class Singleton {

    private Landmark sentLandmark;
    private static Singleton singleton;

    private Singleton(){

    }

    public void setSentLandmark(Landmark sentLandmark){
        this.sentLandmark = sentLandmark;
    }

    public Landmark getSentLandmark(){
        return sentLandmark;
    }
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
