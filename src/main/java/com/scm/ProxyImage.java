package com.scm;

public class ProxyImage implements Image{
    RealImage realImage;
    String fileName;
    ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
