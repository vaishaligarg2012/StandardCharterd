public class StaticBlock {

    static {
        System.out.println("I am from static block");
    }
    public StaticBlock(){
        System.out.println("I am from constructor");
    }
    public static void main(String[] args){
        System.out.println("I am from main");

    }
}
