import java.util.Scanner;

//Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl. W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący, który stworzy trzy różne obiekty klasy Card.

public static void main(String[] args) {

        Card card1 = new Card(Wartosc.AS, Kolor.KIER);
        Card card2 = new Card(Wartosc.SZESC, Kolor.TREFL);
        Card card3 = new Card(Wartosc.SIEDEM, Kolor.PIK);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
}