import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        DistributoreBenzina distributore = new DistributoreBenzina(1.85);
        distributore.rifornisci(100.0);

        Car auto1 = new Car(0.02, 0.0);

        int scelta = -1;
        double km;
        double euro;
        double litri;
        double prezzo;

        while(scelta != 0){
            System.out.println("\n===== MENU =====");
            System.out.println("1) Guida");
            System.out.println("2) Rifornisci l'auto");
            System.out.println("3) Rifornisci il distributore");
            System.out.println("4) Aggiorna il prezzo");
            System.out.println("5) Mostra lo stato");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch(scelta){
                case 1:
                    System.out.print("Quanti km vuoi fare? ");
                    km = sc.nextDouble();
                    auto1.drive(km);
                    break;
                case 2:
                    System.out.print("Quanti euro di benzina? ");
                    euro = sc.nextDouble();
                    distributore.vendi(euro, auto1);
                    break;
                case 3:
                    System.out.print("Quanti litri vuoi rifornire al distributore? ");
                    litri = sc.nextDouble();
                    distributore.rifornisci(litri);
                    break;
                case 4:
                    System.out.print("Nuovo prezzo al litro: ");
                    prezzo = sc.nextDouble();
                    distributore.aggiorna(prezzo);
                    break;
                case 5:
                    System.out.println(distributore.DistributoreBenzinaToString());
                    System.out.println(auto1.CarToString());
                    break;
                case 0:
                    System.out.println("Grazie per aver scelto il nostro distributore!");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
        sc.close();
    }
}