public class StaticBlock {

    static {
        System.out.println("I am static block");
    }
    public StaticBlock(){
        System.out.println("I am from constructor");
    }
    public static void main(String[] args){

        StaticBlock sb = new StaticBlock();
        System.out.println("I am from main");

    }
}
