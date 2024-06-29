package com.scm;

public class RealImage implements Image{
    String filename;

    RealImage(String filename){
        this.filename = filename;
        loadFromDisk(filename);
    }

    public void loadFromDisk(String filename){
        try{
            System.out.println("Loading Image from DB");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Image loaded from disk");
        }
    }
    @Override
    public void display() {
        System.out.println("Displaying imahge from Real Image"+filename);
    }
}
