package tests;
public class Calculator {
    public static void main(String[] args){
        System.out.println(add(10,15));
        System.out.println(subtract(15,10));
        System.out.println(multiply(15,3));
        System.out.println(divide(15,3));
    }
    public static int add(int n1, int n2){
        return n1+n2;
    }
    public static int subtract(int n1, int n2){
        return n1-n2;
    }

    public static int multiply(int n1, int n2){
        return n1*n2;
    }
    public static int divide(int n1, int n2){
        return n1/n2;
    }
    public static int mode(int n1, int n2){
        return n1%n2;
    }
    public static int remainder(int n1, int n2){
        return n1/n2;
    }
}
