 

import library.utilitats.JodaDT;

import org.joda.time.DateTime;

public class Curs {

    private Avaluacio ava1;
    private Avaluacio ava2;
    private Avaluacio ava3;

    public Curs(Avaluacio ava1, Avaluacio ava2, Avaluacio ava3) {
        this.ava1 = ava1;
        this.ava2 = ava2;
        this.ava3 = ava3;
    }

    public int nombreDies() {
        return ava1.nombreDies() + ava2.nombreDies() + ava3.nombreDies();
    }

    public boolean validaAvaluacions() {
        DateTime ava1fi = JodaDT.parseDDMMAAAA(this.ava1.getDataFi());
        DateTime ava2ini = JodaDT.parseDDMMAAAA(this.ava2.getDataInici());
        DateTime ava2fi = JodaDT.parseDDMMAAAA(this.ava2.getDataFi());
        DateTime ava3ini = JodaDT.parseDDMMAAAA(this.ava3.getDataInici());
        boolean valida12 = validaDiaSeguent(ava1fi, ava2ini);
        boolean valida23 = validaDiaSeguent(ava2fi, ava3ini);
        return valida12 && valida23;
    }

    private boolean validaDiaSeguent(DateTime dt1, DateTime dt2) {
//      if (dt1.plusDays(1).equals(dt2)) {
//          return true;
//      }
//      return false;
        return dt1.plusDays(1).equals(dt2);
    }

}
