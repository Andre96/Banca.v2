public class ContoDeposito extends Conto {


    //Costruttore
    public ContoDeposito(String CF) {
        super(CF);
    }

    //Metodi
    @Override
    public boolean operazioni(double importo) {
        if(importo < 0) {
            return false;
        }else {
            return super.operazioni(importo);
        }
    }
}
