public abstract class Conto implements Operable{/*poichè è una classe astratta potrei anche non definire tutti i metodi definiti nell'interfaccia*/
    private String cf;
    private String iban;
    private double saldo;

    //costruttore
    public Conto(String CF){
        this.saldo = 0;
        this.cf = CF;
        this.iban = "";
    }

    //Metodi

    @Override
    public String getIban() {
        return iban;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean operazioni(double importo) {
        if(importo+saldo < 0){
            return false;
        }else {
            saldo += importo;
            return true;
        }
    }
}
