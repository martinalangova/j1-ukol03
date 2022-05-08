package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty()) {
            if ((pevnyDisk.getVyuziteMisto()+velikost)> pevnyDisk.getKapacita()) {
                System.err.println("Disk je plný, soubor přesahuje kapacitu disku.");
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()+velikost);
                System.out.println("Soubor přidán na disk. Aktuální použitá kapacita disku je" + pevnyDisk.getVyuziteMisto());
            }
        } else {
            System.err.println("Počítač je vypnutý, není možné přidat soubor.");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty()) {
            if (pevnyDisk.getVyuziteMisto()<velikost){
                System.err.println("Soubory není možné smazat, velikost přesahuje využitou kapacitu disku.");
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto()-velikost);
                System.out.println("Soubory byly vymazány. Aktuální využitá kapacita disku je" + pevnyDisk.getVyuziteMisto());
            }
        } else {
            System.err.println("Počítač je vypnutý, není možné vymazat soubory.");
        }
    }



    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty()) {
            System.err.println("Počítač je už zapnutý ");
        } else if (cpu==null || ram==null || pevnyDisk==null) {
            System.err.println("Počítač nemá všechny potřebné součásti");
        } else {
            jeZapnuty=true;
            System.out.println("Počítač se zapnul");
        }
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty=false;
            System.out.println("Počítač se vypnul");
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }
}
