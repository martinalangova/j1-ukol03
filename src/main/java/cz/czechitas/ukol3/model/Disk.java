package cz.czechitas.ukol3.model;

public class Disk {

    private long kapacita;
    private long vyuziteMisto;


    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "kapacita disku je " + kapacita + "bajtů," + "využité místo je "+ vyuziteMisto + "bajtů";
    }


}
