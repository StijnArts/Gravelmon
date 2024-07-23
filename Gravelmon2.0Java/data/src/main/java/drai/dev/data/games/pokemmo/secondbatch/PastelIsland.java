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
        pokemon.add(new Majestrill(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
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
        pokemon.add(new Hallusage(new Stats(500, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Giruffle());   
        pokemon.add(new Sparaffe());   
        pokemon.add(new Trojaraffe(new Stats(500, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Dimnewt());   
        pokemon.add(new Spimeleon());   
        pokemon.add(new Donguana(new Stats(500, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Malloh());   
        pokemon.add(new Marshamie());   
        pokemon.add(new Mallowisp(new Stats(490, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
//        pokemon.add(new Cobblelf()); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Elfishoe());   Missing Art
//        pokemon.add(new Sabatelf());   Missing Art
        pokemon.add(new Leetch());   
        pokemon.add(new Pariahsite());   
        pokemon.add(new Haebidon(new Stats(530, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Rooklite());   
        pokemon.add(new Militite());   
        pokemon.add(new Colossesar(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
    }

}
