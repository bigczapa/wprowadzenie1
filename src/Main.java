import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
        System.out.println("Dzień dobry");

        byte liczba1 =8;
        short liczba2 =300;
        int liczba3 = 12345678;
        long liczba4 = 871364082;
        System.out.println("Twoja liczba " + liczba1);


        //typy zmiennoprzecinkowe
        float LiczbaRzeczywista = 3.14f;
        double liczbaRzeczywista2 = 23.45678;

        System.out.println("Liczba rzeczywista " + LiczbaRzeczywista);


        //typ logiczny
        boolean czyPrawda = true;


        //typ znakowy
        char znak = 'a';

        //napisz program w ktorym wylosujesz liczbe od 1 do 100, wpiszesz liczbe z klawiatury, powiesz czy ktos zgadl porządaną

int wylosowanaLiczba = (int)(Math.random()*100+1);
System.out.println("Wylosowano "+wylosowanaLiczba);

//wczytywanie liczby z klawiatury

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int zgadywanaLiczba = scanner.nextInt();
        System.out.println("Wpisano "+zgadywanaLiczba);
        //instrukcja warunkowa
if (wylosowanaLiczba == zgadywanaLiczba){
    System.out.println("Brawo zgadles");
}
else{
    System.out.println("może następnym razem");
}
int roznica;
if (wylosowanaLiczba >zgadywanaLiczba){
    roznica = wylosowanaLiczba -zgadywanaLiczba;

}
else{
    roznica = zgadywanaLiczba - wylosowanaLiczba;
}
//wyrazenie warunkowe --> zwraca wartosc

        roznica = zgadywanaLiczba>wylosowanaLiczba? zgadywanaLiczba - wylosowanaLiczba :wylosowanaLiczba-zgadywanaLiczba;

    roznica = roznica/10; //dzielenie calkowite -->  wynik calkowity bo dzielimy 2 liczby calkowite


        //instrukcja wyboru
        switch (roznica){
            case 0:
                System.out.println("Bardzo blisko");
                break;
            case 1:
                    System.out.println("dosc blisko");
                    break;
            case 2:
                        System.out.println("nie najgorzej");
                        break;
            default:
                System.out.println("sproboj innym razem");
        }

//wyrazenie switch
        // zwraca wartosc
        System.out.println(
                switch (roznica){
                    case 0 -> "Bardzo blisko";
                    case 1 -> "dosc blisko";
                    case 2 -> " nie najgorzej";
                    default -> " sproboj innym razem";
                }
   );

        //zgadywanie 10 razy
Random random = new Random();
wylosowanaLiczba = random.nextInt(1, 101);


        for (int i = 0; i < 10; i++) {
            System.out.println("zgadnij liczbe");
            zgadywanaLiczba = scanner.nextInt();
            if (zgadywanaLiczba = wylosowanaLiczba){
                System.out.println("gratulacje to ta liczba");
                break;
            }
            else{
                System.out.println("wpisano za malo");
            }
        }

    }
}
