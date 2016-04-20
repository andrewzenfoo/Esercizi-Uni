
public class Week {

    private int year;
    private int noWeek;
    private int[] valorePolveri = new int[7];


    public Week(int year, int[] valorePolveri, int noWeek) {
        this.year = year;
        this.valorePolveri = valorePolveri;
        this.noWeek = noWeek;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNoWeek() {
        return noWeek;
    }

    public void setNoWeek(int noWeek) {
        this.noWeek = noWeek;
    }

    public int[] getValorePolveri() {
        return valorePolveri;
    }

    public void setValorePolveri(int[] valorePolveri) {
        this.valorePolveri = valorePolveri;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * This method looks for the maximum number
     * @return maximum number
     */

    public int valMax() {
        int maxPolveri=0;
        for (int i=0; i<valorePolveri.length; i++) {
            if (valorePolveri[i] >= maxPolveri) {
                maxPolveri=valorePolveri[i];
            }
        }
        return maxPolveri;  // potrei mettere il messaggio nel metodo
    }

    /**
     * This method calculates the medium int
     * @return medium number
     */

    public double valMedio() {
        double mediaPolveri = 0;
        double somma = 0;
        for (int i = 0; i < valorePolveri.length; i++) {
            somma += valorePolveri[i];
        }

        mediaPolveri = somma / valorePolveri.length;    // vedi commento metodo sopra

        return mediaPolveri;
    }





}
