package drai.dev.data.games.pokengine;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.pastelisland.*;
import drai.dev.data.pokemon.pastelisland.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PastelIsland extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new PastelIsland();
    private PastelIsland() {
        super("Pastel Island", "https://pokengine.org/collections/10bli91l/Pastel+Island");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Geckamp().addLabels(Label.STARTER));
        addNewPokemon(new Gecktricity().addLabels(Label.STARTER));
        addNewPokemon(new Geckolt().addLabels(Label.STARTER));
        addNewPokemon(new Avire().addLabels(Label.STARTER));
        addNewPokemon(new Cygnaze().addLabels(Label.STARTER));
        addNewPokemon(new Inphoeno().addLabels(Label.STARTER));
        addNewPokemon(new Hissicle().addLabels(Label.STARTER).fishingSpawnFromExisting());
        addNewPokemon(new Viperost().addLabels(Label.STARTER));
        addNewPokemon(new Kelviper().addLabels(Label.STARTER));

        addNewPokemon(new Chucheek());
        addNewPokemon(new Mowzumi());
        addNewPokemon(new Pripilla());
        addNewPokemon(new Orilepi());
        addNewPokemon(new Nymfly());
        addNewPokemon(new Drasilis());
        addNewPokemon(new Dragoneura());
        addNewPokemon(new Buzkin());
        addNewPokemon(new Electrisk());
        addNewPokemon(new PastelianLedyba("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianLedian("", Aspect.PASTELIAN));
        addNewPokemon(new Eleedian());
        addNewPokemon(new Hejjikyu());
        addNewPokemon(new Yapifur());
        addNewPokemon(new Frosfur());
        addNewPokemon(new Blasfur());
        addNewPokemon(new Rascat());
        addNewPokemon(new Panthevil());
        addNewPokemon(new PastelianFlabebe("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianFloette("", Aspect.PASTELIAN));
        addNewPokemon(new Florgae());
        addNewPokemon(new PastelianGirafarig("", Aspect.PASTELIAN));
        addNewPokemon(new Friylash().fishingSpawnFromExisting());
        addNewPokemon(new Majestrill(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))).fishingSpawnFromExisting());
        addNewPokemon(new PastelianSneasel("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianWeavile("", Aspect.PASTELIAN));
        addNewPokemon(new Dametal());
        addNewPokemon(new Damaleo());
        addNewPokemon(new PastelianGothita("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianGothorita("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianGothitelle("", Aspect.PASTELIAN));
        addNewPokemon(new Searth());
        addNewPokemon(new Titanomaw());
//        addNewPokemon(new Carburn());   Missing Art
//        addNewPokemon(new Crustoise());   Missing Art
//        addNewPokemon(new Allodina());   Missing Art
        addNewPokemon(new Lunapyon());
        addNewPokemon(new Lemish().fishingSpawnFromExisting());
        addNewPokemon(new Sourprion().fishingSpawnFromExisting());
        addNewPokemon(new PastelianSmeargle("", Aspect.PASTELIAN));
        addNewPokemon(new Banksund());
        addPokedexPokemon("happiny");
        addNewPokemon(new PastelianChansey("", Aspect.PASTELIAN));
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
        addNewPokemon(new PastelianKoffing("", Aspect.PASTELIAN));
        addNewPokemon(new PastelianWeezing("", Aspect.PASTELIAN));
        addNewPokemon(new Leetch().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Pariahsite().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Haebidon(new Stats(600, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Rooklite().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Militite().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Colossesar(new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))).addLabels(Label.PSEUDO_LEGENDARY));
    }

}
