package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.pastelisland.Panthevil;
import drai.dev.data.pokemon.pastelisland.Rascat;
import drai.dev.data.pokemon.pastelisland.regional.*;
import drai.dev.data.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PastelIsland extends drai.dev.data.games.registry.Game {
    public PastelIsland() {
        super("Pastel Island");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new PastelianLedyba("", Aspect.PASTELIAN));
        pokemon.add(new PastelianLedian("", Aspect.PASTELIAN));
        pokemon.add(new PastelianFlabebe("", Aspect.PASTELIAN));
        pokemon.add(new PastelianFloette("", Aspect.PASTELIAN));
        pokemon.add(new PastelianGirafarig("", Aspect.PASTELIAN));
        pokemon.add(new PastelianShellder("", Aspect.PASTELIAN));
        pokemon.add(new PastelianCloyster("", Aspect.PASTELIAN));
        pokemon.add(new PastelianSneasel("", Aspect.PASTELIAN));
        pokemon.add(new PastelianWeavile("", Aspect.PASTELIAN));
        pokemon.add(new PastelianGothita("", Aspect.PASTELIAN));
        pokemon.add(new PastelianGothorita("", Aspect.PASTELIAN));
        pokemon.add(new PastelianGothitelle("", Aspect.PASTELIAN));
        pokemon.add(new PastelianSmeargle("", Aspect.PASTELIAN));
        pokemon.add(new PastelianChansey("", Aspect.PASTELIAN));
        pokemon.add(new PastelianKoffing("", Aspect.PASTELIAN));
        pokemon.add(new PastelianWeezing("", Aspect.PASTELIAN));
        pokemon.add(new Geckamp());
        pokemon.add(new Gecktricity());
        pokemon.add(new Geckolt());
        pokemon.add(new Avire());
        pokemon.add(new Cygnaze());
        pokemon.add(new Inphoeno());
        pokemon.add(new Hissicle());
        pokemon.add(new Viperost());
        pokemon.add(new Kelviper());
        pokemon.add(new Chucheek());
        pokemon.add(new Mowzumi());
        pokemon.add(new Pripilla());
        pokemon.add(new Orilepi());
        pokemon.add(new Nymfly());
        pokemon.add(new Drasilis());
        pokemon.add(new Dragoneura());
        pokemon.add(new Buzkin());
        pokemon.add(new Electrisk());
        pokemon.add(new Eleedian());
        pokemon.add(new Hejjikyu());
        pokemon.add(new Yapifur());
        pokemon.add(new Frosfur());
        pokemon.add(new Blasfur());
        pokemon.add(new Rascat());
        pokemon.add(new Panthevil());
        pokemon.add(new Florgae());
        pokemon.add(new Friylash()); 
        pokemon.add(new Majestrill(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED)))); 
        pokemon.add(new Dametal());
        pokemon.add(new Damaleo());
        pokemon.add(new Searth());
        pokemon.add(new Titanomaw());
//        pokemon.add(new Carburn());   Missing Art
//        pokemon.add(new Crustoise());   Missing Art
//        pokemon.add(new Allodina());   Missing Art
        pokemon.add(new Lunapyon());
        pokemon.add(new Lemish());
        pokemon.add(new Sourprion());
        pokemon.add(new Banksund());
        pokemon.add(new Bossey());
        pokemon.add(new PsyEye());   
        pokemon.add(new Hyprentice());   
        pokemon.add(new Hallusage(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Giruffle());   
        pokemon.add(new Sparaffe());   
        pokemon.add(new Trojaraffe(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Dimnewt());   
        pokemon.add(new Spimeleon());   
        pokemon.add(new Donguana(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Malloh());   
        pokemon.add(new Marshamie());   
        pokemon.add(new Mallowisp(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
//        pokemon.add(new Cobblelf()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Elfishoe());   Missing Art
//        pokemon.add(new Sabatelf());   Missing Art
        pokemon.add(new Leetch());   
        pokemon.add(new Pariahsite());   
        pokemon.add(new Haebidon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
        pokemon.add(new Rooklite());   
        pokemon.add(new Militite());   
        pokemon.add(new Colossesar(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
    }

}
