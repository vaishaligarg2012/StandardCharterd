public class StaticKeyword {

    public static int pinCode = 1;
    public int pin = 1;

    public StaticKeyword(){
        pinCode++;
        pin++;
    }

    public void printInfo(){
        System.out.println("pinCode "+ pinCode+ " pin "+pin);
    }
}
