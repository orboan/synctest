 

import library.utilitats.JodaDT;
import library.inout.Terminal;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Period;

public class Avaluacio {
    //Atributs
    private String dataInici;
    private String dataFi;

    /**
     * Constructor.
     * @param dataInici
     * @param dataFi
     */
    public Avaluacio(String dataInici, String dataFi) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public int nombreDies() {
        DateTime dtIni = JodaDT.parseDDMMAAAA(this.dataInici);
        DateTime dtFi = JodaDT.parseDDMMAAAA(this.dataFi);

        // Això no funciona
        //Period p = new Period(dtIni, dtFi);
        //int nombreDies = p.getYears() * 365 + p.getMonths() * 30 + p.getDays(); 

        Days dies = Days.daysBetween(dtIni, dtFi);
        int nombreDies = dies.getDays() + 1;
        
        // Una altra manera de fer-ho
        //long nombreSegons = JodaDT.durationInSeconds(dtIni, dtFi);
        //int nombreDies = (int) nombreSegons / (24 * 3600) + 1;

        return nombreDies;
    }

    public String getDataInici() {
        return dataInici;
    }

    public void setDataInici(String dataInici) {
        this.dataInici = dataInici;
    }

    public String getDataFi() {
        return dataFi;
    }

    public void setDataFi(String dataFi) {
        this.dataFi = dataFi;
    }

}
