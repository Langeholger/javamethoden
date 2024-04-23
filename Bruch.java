package javamethoden;

class Bruch {
int zaehler;
int nenner;

void ausgeben() { 
    System.out.print(" " + zaehler + "/" + nenner);
    }

void kuerzen() {
    var m = Math.abs(zaehler); //speichert in m den Betrag von zaehler
    var n = Math.abs(nenner); //speichert in n den Betrag von nenner
    var r = m % n;
    while (r > 0) {
        m = n;
        n = r;
        r = m % n;
    }
    zaehler /= n; //in n steht jetzt der ggT
    nenner /= n;
}
    
}
