package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.pastelisland.*;
import drai.dev.data.pokemon.pastelisland.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PastelIsland extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new PastelIsland();
    private PastelIsland() {
        super("Pastel Island");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new PastelianShellder("", Aspect.PASTELIAN)); 
        addNewPokemon(new PastelianCloyster("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianChansey("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianKoffing("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianWeezing("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianLedyba("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianLedian("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianGirafarig("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianSneasel("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianSmeargle("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianWeavile("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianGothita("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianGothorita("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianGothitelle("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianFlabebe("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianFloette("", Aspect.PASTELIAN));
        
        addNewPokemon(new Geckamp());
        addNewPokemon(new Gecktricity());
        addNewPokemon(new Geckolt());
        addNewPokemon(new Avire());
        addNewPokemon(new Cygnaze());
        addNewPokemon(new Inphoeno());
        addNewPokemon(new Hissicle());
        addNewPokemon(new Viperost());
        addNewPokemon(new Kelviper());
        addNewPokemon(new Chucheek());
        addNewPokemon(new Mowzumi());
        addNewPokemon(new Pripilla());
        addNewPokemon(new Orilepi());
        addNewPokemon(new Nymfly());
        addNewPokemon(new Drasilis());
        addNewPokemon(new Dragoneura());
        addNewPokemon(new Buzkin());
        addNewPokemon(new Electrisk());
        addNewPokemon(new Eleedian());
        addNewPokemon(new Hejjikyu());
        addNewPokemon(new Yapifur());
        addNewPokemon(new Frosfur());
        addNewPokemon(new Blasfur());
        addNewPokemon(new Rascat());
        addNewPokemon(new Panthevil());
        addNewPokemon(new Florgae());
        addNewPokemon(new Friylash()); 
        addNewPokemon(new Majestrill(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED)))); 
        addNewPokemon(new Dametal());
        addNewPokemon(new Damaleo());
        addNewPokemon(new Searth());
        addNewPokemon(new Titanomaw());
//        addNewPokemon(new Carburn());   Missing Art
//        addNewPokemon(new Crustoise());   Missing Art
//        addNewPokemon(new Allodina());   Missing Art
        addNewPokemon(new Lunapyon());
        addNewPokemon(new Lemish());
        addNewPokemon(new Sourprion());
        addNewPokemon(new Banksund());
        addNewPokemon(new Bossey());
        addNewPokemon(new PsyEye());   
        addNewPokemon(new Hyprentice());   
        addNewPokemon(new Hallusage(new Stats(500, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Giruffle());   
        addNewPokemon(new Sparaffe());   
        addNewPokemon(new Trojaraffe(new Stats(500, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Dimnewt());   
        addNewPokemon(new Spimeleon());   
        addNewPokemon(new Donguana(new Stats(500, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Malloh());   
        addNewPokemon(new Marshamie());   
        addNewPokemon(new Mallowisp(new Stats(490, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new Cobblelf()); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Elfishoe());   Missing Art
//        addNewPokemon(new Sabatelf());   Missing Art
        addNewPokemon(new Leetch());   
        addNewPokemon(new Pariahsite());   
        addNewPokemon(new Haebidon(new Stats(530, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Rooklite());   
        addNewPokemon(new Militite());   
        addNewPokemon(new Colossesar(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
    }

}
