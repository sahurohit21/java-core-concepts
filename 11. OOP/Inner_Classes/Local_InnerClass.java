package Inner_Classes;

class LocalOuter{
    public void Display(){
        class Inner{
            public void show(){
                System.out.println("OKK");
            }
        }

        Inner i = new Inner();
        i.show();
    }

}

public class Local_InnerClass {
    public void main(String[] args){
        LocalOuter o = new LocalOuter();
        o.Display();
    }
}
