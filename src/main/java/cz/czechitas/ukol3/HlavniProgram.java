package cz.czechitas.ukol3;


import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac mujPC = new Pocitac();
        System.out.println(mujPC);
        mujPC.zapniSe();  // Vypise chybu, protoze pocitac nema vsechny povinne soucasti

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(510_770_802_688L);
        mujDisk.setVyuziteMisto(319_197_962_240L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(8_000_000_000L);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setVyrobce("AMD");
        mujProcesor.setRychlost(2_700_000_000L);

        mujPC.setCpu(mujProcesor);
        mujPC.setPevnyDisk(mujDisk);
        mujPC.setRam(mojePamet);

        System.out.println(mujPC);

        mujPC.zapniSe();
        mujPC.zapniSe();  // Vypíše chybu, protože počítač je už zapnutý
        System.out.println(mujPC);
        mujPC.vypniSe();

        mujPC.vypniSe(); // Nevypíše chybu, ale nic neprovede,protože počítač je už vypnutý
        mujPC.vypniSe();

        mujPC.zapniSe();

        Disk mujDruhyDisk = new Disk();
        mujDruhyDisk.setKapacita(510_770_802_688L);
        mujDruhyDisk.setVyuziteMisto(100_000_000_000L);

        mujPC.setDruhyPevnyDisk(mujDruhyDisk);

        mujPC.vytvorSouborOVelikosti(0L);
        System.out.println(mujPC);

        mujPC.vymazSouboryOVelikosti(250000000000L);
        System.out.println(mujPC);

    }

}
