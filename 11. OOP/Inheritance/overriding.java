package Inheritance;

class TV {
    public void switchON(){
        System.out.println("TV is switched on.");
    }
    public void changeChannel(){
        System.out.println("TV channel is changed.");
    }
}

class SmartTV extends TV{
    @Override
    public void switchON() {
        System.out.println("SmartTV is switched on");
    }
    @Override
    public void changeChannel(){
        System.out.println("SmartTV channel is changed.");
    }
    public void browse(){
        System.out.println("SmartTV browsing.");
    }

}

public class overriding{
    public static void main(String[] args){
        TV s = new SmartTV();   // Dynamic Method Dispatch
        s.switchON();
        s.changeChannel();
    }
}
