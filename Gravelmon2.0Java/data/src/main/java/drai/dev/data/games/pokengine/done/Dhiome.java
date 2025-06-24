package drai.dev.data.games.pokengine.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.atlas.Ampin;
import drai.dev.data.pokemon.atlas.Bonafant;
import drai.dev.data.pokemon.atlas.Dwarpy;
import drai.dev.data.pokemon.atlas.Korboral;
import drai.dev.data.pokemon.atlas.Nebulent;
import drai.dev.data.pokemon.atlas.Petrifern;
import drai.dev.data.pokemon.atlas.Serrarbo;
import drai.dev.data.pokemon.atlas.Sharquake;
import drai.dev.data.pokemon.atlas.Submurchin;
import drai.dev.data.pokemon.atlas.Surchin;
import drai.dev.data.pokemon.atlas.Wisdaum;
import drai.dev.data.pokemon.atlas.Wombabe;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done https://pokengine.org/collections/10l0j1ih/Dhiome
public class Dhiome extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Dhiome();
    private Dhiome() {
        super("Dhiome");
    }
    //TODO get art from deviant art
    @Override
    public void registerPokemon() {
        addNewPokemon(new Spearex().addLabels(Label.STARTER));
        addNewPokemon(new Jagrowth().addLabels(Label.STARTER));
        addNewPokemon(new Venoble().addLabels(Label.STARTER));
        addNewPokemon(new Caflare().addLabels(Label.STARTER));
        addNewPokemon(new Bovlame().addLabels(Label.STARTER));
        addNewPokemon(new Pharaox().addLabels(Label.STARTER));
        addNewPokemon(new Bubblebon().addLabels(Label.STARTER));
        addNewPokemon(new Scufflebon().addLabels(Label.STARTER));
        addNewPokemon(new Lochare().addLabels(Label.STARTER));

        addNewPokemon(new Wombabe());
        addNewPokemon(new Korboral());
//        addNewPokemon(new Cantarini());  Member of line Not Finished
//        addNewPokemon(new Flavian());   Missing Art
//        addNewPokemon(new Carafowl());   Missing Art
//        addNewPokemon(new Melobaa());   Member of line Not Finished
//        addNewPokemon(new Bellaris());   Member of line Not Finished
//        addNewPokemon(new Metalicot());   Missing Art
//        addNewPokemon(new Larvora());   Member of line Not Finished
//        addNewPokemon(new Pupod());   Member of line Not Finished
//        addNewPokemon(new Gyrogig());   Missing Art
//        addNewPokemon(new Leaplit());   Missing Art
//        addNewPokemon(new Chrysaleye());   Member of line Not Finished
//        addNewPokemon(new Falantern());   Missing Art
//        addNewPokemon(new Terrapile());   Missing Art
//        addNewPokemon(new Chozumi());   Missing Art
//        addNewPokemon(new Zumi());   Missing Art
//        addNewPokemon(new Weebud());   Member of line Not Finished
//        addNewPokemon(new Whoopsey());   Member of line Not Finished
//        addNewPokemon(new Wilterales());   Missing Art
//        addNewPokemon(new Fingel());   Member of line Not Finished
//        addNewPokemon(new Celefin());   Missing Art
//        addNewPokemon(new Pterangel());   Missing Art
//        addNewPokemon(new Burcrub());   Missing Art
//        addNewPokemon(new Forticlawd());   Missing Art
//        addNewPokemon(new Origull());   Member of line Not Finished
//        addNewPokemon(new Crane());   Missing Art
        addNewPokemon(new Macaboo());
        addNewPokemon(new Spectross(new Stats(441, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Gloshroom());
        addNewPokemon(new Phosporus(new Stats(435, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Istobat());
//        addNewPokemon(new Arabat(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        addNewPokemon(new Thermate());   Member of line Not Finished
//        addNewPokemon(new Babburn());   Missing Art
        addNewPokemon(new Cropiki(new Stats(312, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Dwarpy());
        addNewPokemon(new Bonafant());
        addNewPokemon(new Wisdaum());
        addNewPokemon(new Surchin().fishingSpawnFromExisting());
        addNewPokemon(new Submurchin());
        addNewPokemon(new Nimbleak(new Stats(387, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Dojoku());
        addNewPokemon(new Fumaji(new Stats(455, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Furatle(new Stats(455, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Fusecto(new Stats(455, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
//        addNewPokemon(new Femewliar());   Member of line Not Finished
//        addNewPokemon(new Niarsith());   Missing Art
        addNewPokemon(new Welpyre());
        addNewPokemon(new Keenine());
        addNewPokemon(new Shisapien(new Stats(546, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Silnun());
        addNewPokemon(new Amivelv(new Stats(423, StatArchetype.BULKY_SUPPORT, List.of(StatType.ATTACK))));
        addNewPokemon(new Nebulent());
        addNewPokemon(new Draligne());
        addNewPokemon(new Mushcap(new Stats(378, StatArchetype.FAST_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Belyad(new Stats(425, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Petishell());
        addNewPokemon(new Primorse(new Stats(444, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Puffoon(new Stats(444, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Egenpus(new Stats(398, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Slugly());
        addNewPokemon(new Toxnail(new Stats(421, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Mandibrine(new Stats(423, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Petrifern());
        addNewPokemon(new Serrarbo());
        addNewPokemon(new Ruminelk());
        addNewPokemon(new Ancervus(new Stats(495, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Ampin());
        addNewPokemon(new Sharquake());
        addNewPokemon(new Polykelp(new Stats(483, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Venchill(new Stats(365, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Fungeon(new Stats(525, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
//        addNewPokemon(new Pixidra());   Missing Art
        addNewPokemon(new Genbrisk(new Stats(640, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Voltwin(new Stats(298, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Vanishade(new Stats(298, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));
    }

}
