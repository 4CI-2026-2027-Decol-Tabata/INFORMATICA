
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        String intestatario;
        double saldo;
        String beneficiario;
        double importo;
        int scelta=-1;


        System.out.println("Qual'è instestatario di questo conto?");
        intestatario=input.nextLine();
        System.out.println("Qual'è il saldo di questo conto?");
        saldo=input.nextDouble();
        input.nextLine();
        
        
        Conto conto = new Conto(intestatario, saldo);

        System.out.println("Chi è il beneficiario di questo pagamento?");
        beneficiario=input.nextLine();
        System.out.println("Qual'è l'importo?");
        importo=input.nextDouble();
       
        input.nextLine();

        Pagamento pagamento1 = new Pagamento(beneficiario, importo);

        input.close();
        input = new Scanner (System.in);

            while (scelta!= 0){
                System.out.println("/nScegli le azioni che vuoi eseguire");
                System.out.println("1) effettua un pagamento");
                System.out.println("2) visualizza il saldo");
                System.out.println("3) cambia beneficiario");
                System.out.println("4) cambia importo");
                System.out.println("0) esci");
                System.out.println("scelta: ");
                scelta=input.nextInt();

                switch(scelta){

                case 1: 
                    System.out.print("beneficiario: " + beneficiario + "importo" + importo);
                try {
                    conto.effettuaPagamento(pagamento1);
                    System.out.println("saldo residuo: " + conto.getSaldo() + " euro");
                } catch (SaldoInsufficienteException e) {
                     System.out.println(e.getMessage());
                } break;

                case 2: 
                    System.out.println("saldo attuale: " + conto.getSaldo() + " euro");
                    break;
                
                case 3:
                    System.out.println("Chi è il nuovo beneficiario?");
                    beneficiario=input.nextLine();
                    System.out.println("Il nuovo beneficiario è " + beneficiario);
                    break;

                case 4: 
                     System.out.println("Quanto è il nuovo importo da pagare?");
                    importo=input.nextDouble();
                    System.out.println("Il nuovo importo è di  " + importo + "euro");
                    break;

                case 0: 
                    System.out.println("sei in uscita dal programma.");
                    break;
                
                 default:                       
                    System.out.println("scelta non valida");
                    break;
                }
            }
        }
    }