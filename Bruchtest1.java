package javamethoden;

public class Bruchtest1 {
public static void main(String[] args) {
    Bruch b = new Bruch();
    b.zaehler = 3;
    b.nenner = 12;
    b.ausgeben();
    System.out.print("\n Und nach dem Kürzen: ");
    b.gekuerztausgeben();
    
}    
}
