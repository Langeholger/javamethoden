package javamethoden;

public class Bruchtest1 {
public static void main(String[] args) {
    Bruch b = new Bruch();
    b.zaehler = 3;
    b.nenner = 4;
    b.ausgeben();
    b.nenner = 5;
    b.ausgeben();
}    
}
