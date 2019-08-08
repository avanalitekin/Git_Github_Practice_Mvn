package tests;
public class Calculator {
    public static void main(String[] args){
        System.out.println(add(10,15));
        System.out.println(subtract(15,10));
        System.out.println(multiply(15,3));
        System.out.println(divide(15,3));
        System.out.println(mode(15,3));
        System.out.println(mode10(15));
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
    public static int mode10(int number){
        return number%10;
    }
    public static int mode5(int number){
        return number%5;
    }
}
