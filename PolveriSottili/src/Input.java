import java.util.Scanner;

public class Input {

    public static final int SOGLIA_MAX_GIORNALIERA = 75;
    public static final int SOGLIA_MEDIA_SETTIMANALE = 50;
    public static final int SETTIMANA = 7;

    public static void input() {

        Scanner in = new Scanner(System.in);

        int[] valore = new int[SETTIMANA];

        Week settimana = new Week(0, valore, 0);

        do {
            System.out.print("Inserire l'anno: ");  // Se mettessi if(anno==null) esegue l'input?
            settimana.setYear(in.nextInt());
            System.out.print("Inserire il numero della settimana: ");   // Uguale a commento sopra
            settimana.setNoWeek(in.nextInt());

            System.out.print("Inserire valore polveri sottili giornaliero: ");
            for (int i = 0; i < settimana.getValorePolveri().length; i++) {
                valore[i] = in.nextInt();
                if (valore[i]<=0) {
                    i--;
                    System.out.println("Il valore deve essere maggiore o uguale di 0");
                }
            }
            settimana.setValorePolveri(valore);

            if(settimana.getYear()==0) {
                System.out.println("L'anno deve essere maggiore o uguale a zero");
            }
            if(settimana.getNoWeek()<=0 || settimana.getNoWeek()>=53) {
                System.out.println("Il numero della settimana deve essere compreso tra 1 e 53 compresi");
            }
        }
        while (settimana.getYear()<=0 || (settimana.getNoWeek()<=0 && settimana.getNoWeek()>=53));

        if (settimana.valMax() > SOGLIA_MAX_GIORNALIERA) {
            System.out.printf("La soglia giornaliera di polveri sottili è pericolosamente alta: %d\n", settimana.valMax());
        }

        if (settimana.valMedio() > SOGLIA_MEDIA_SETTIMANALE) {
            System.out.printf("La soglia media è %.2f\n", settimana.valMedio());
        }
    }
}
