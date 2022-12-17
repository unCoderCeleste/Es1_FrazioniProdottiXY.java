/*
* Esercizio 1:
Si scriva un programma che effettua le seguenti attività.
● Utilizzare Scanner per leggere un numero in virgola mobile x.
● Calcolare 1.0 / x e memorizzare il risultato in y.
● Visualizzare x, y e il prodotto di x e y.
● Sottrarre x dal prodotto di x e y e mostrarne il risultat
* */
import java.util.Scanner;
public class Es1_FrazioniProdottiXY {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("FRAZIONE E PROOTTO FRA X e Y");
        System.out.print("Scriva un numero tipo double (cioè con la virgola e i decimali): ");
        System.out.println();
        double x= num.nextDouble();
        double y= (1.0/x);
        System.out.println("La frazione 1/"+x+" dà: "+y);
        double prodotto=(x*y);
        System.out.println("X= " +x +" Y= " +y +"\nIl prodotto fra X e Y: " +prodotto);
        double sottrazione=prodotto-x;
        System.out.println("Sottraendo "+x +" da " +prodotto+" otteniamo: "+sottrazione);
    }
}