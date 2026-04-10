package Abstraction.Interfaces;

class Phone{
    public void call(){
        System.out.println("Phone Calling");
    }
    public void sms(){
        System.out.println("Phone sending SMS");
    }
}

// Interface Camera
interface Camera{
    public static final int x = 10;
    void click();
    void record();
}

// Interface MusicPlayer
interface MusicPlayer{
    void play();
    void pause();
}

class SmartPhone extends Phone implements Camera,MusicPlayer{
    public void Videocall(){
        System.out.println("SmartPhone video call");
    }
    public void click(){
        System.out.println("SmartPhone clicking photos");
    }
    public void record(){
        System.out.println("SmartPhone recording videos");
    }
    public void play(){
        System.out.println("SmartPhone playing music");
    }
    public void pause(){
        System.out.println("SmartPhone pause music");
    }
}

public class Example {
    public static void main(String[] args){
        Phone p = new SmartPhone();
        p.call();
        p.sms();
        MusicPlayer mp = new SmartPhone();
        mp.play();
        mp.pause();
        ;    }
}
