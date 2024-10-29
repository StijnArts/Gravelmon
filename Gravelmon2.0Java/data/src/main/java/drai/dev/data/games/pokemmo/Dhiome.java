package drai.dev.data.games.pokemmo;


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
import drai.dev.data.pokemon.dhiome.Puffoon;
import drai.dev.data.attributes.*;

import java.util.*;
//done
public class Dhiome extends drai.dev.data.games.registry.Game {
    public Dhiome() {
        super("Dhiome");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Spearex());
        pokemon.add(new Jagrowth());
        pokemon.add(new Venoble());
        pokemon.add(new Caflare());
        pokemon.add(new Bovlame());
        pokemon.add(new Pharaox());
        pokemon.add(new Bubblebon());
        pokemon.add(new Scufflebon());
        pokemon.add(new Lochare());

        pokemon.add(new Wombabe());
        pokemon.add(new Korboral());
//        pokemon.add(new Cantarini());  Member of line Not Finished
//        pokemon.add(new Flavian());   Missing Art
//        pokemon.add(new Carafowl());   Missing Art
//        pokemon.add(new Melobaa());   Member of line Not Finished
//        pokemon.add(new Bellaris());   Member of line Not Finished
//        pokemon.add(new Metalicot());   Missing Art
//        pokemon.add(new Larvora());   Member of line Not Finished
//        pokemon.add(new Pupod());   Member of line Not Finished
//        pokemon.add(new Gyrogig());   Missing Art
//        pokemon.add(new Leaplit());   Missing Art
//        pokemon.add(new Chrysaleye());   Member of line Not Finished
//        pokemon.add(new Falantern());   Missing Art
//        pokemon.add(new Terrapile());   Missing Art
//        pokemon.add(new Chozumi());   Missing Art
//        pokemon.add(new Zumi());   Missing Art
//        pokemon.add(new Weebud());   Member of line Not Finished
//        pokemon.add(new Whoopsey());   Member of line Not Finished
//        pokemon.add(new Wilterales());   Missing Art
//        pokemon.add(new Fingel());   Member of line Not Finished
//        pokemon.add(new Celefin());   Missing Art
//        pokemon.add(new Pterangel());   Missing Art
//        pokemon.add(new Burcrub());   Missing Art
//        pokemon.add(new Forticlawd());   Missing Art
//        pokemon.add(new Origull());   Member of line Not Finished
//        pokemon.add(new Crane());   Missing Art
        pokemon.add(new Macaboo());
        pokemon.add(new Spectross(new Stats(441, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Gloshroom());
        pokemon.add(new Phosporus(new Stats(435, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Istobat());
        pokemon.add(new Arabat(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Thermate());   Member of line Not Finished
//        pokemon.add(new Babburn());   Missing Art
        pokemon.add(new Cropiki(new Stats(312, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Dwarpy());
        pokemon.add(new Bonafant());
        pokemon.add(new Wisdaum());
        pokemon.add(new Surchin());
        pokemon.add(new Submurchin());
        pokemon.add(new Nimbleak(new Stats(387, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Dojoku());
        pokemon.add(new Fumaji(new Stats(455, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Furatle(new Stats(455, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Fusecto(new Stats(455, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
//        pokemon.add(new Femewliar());   Member of line Not Finished
//        pokemon.add(new Niarsith());   Missing Art
        pokemon.add(new Welpyre());
        pokemon.add(new Keenine());
        pokemon.add(new Shisapien(new Stats(546, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Silnun());
        pokemon.add(new Amivelv(new Stats(423, StatArchetype.BULKY_SUPPORT, List.of(StatType.ATTACK))));
        pokemon.add(new Nebulent());
        pokemon.add(new Draligne());
        pokemon.add(new Mushcap(new Stats(378, StatArchetype.FAST_SUPPORT, List.of(StatType.DEFENCE))));
        pokemon.add(new Belyad(new Stats(425, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Petishell());
        pokemon.add(new Primorse(new Stats(444, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Puffoon(new Stats(444, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Egenpus(new Stats(398, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Slugly());
        pokemon.add(new Toxnail(new Stats(421, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Mandibrine(new Stats(423, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.ATTACK))));
        pokemon.add(new Petrifern());
        pokemon.add(new Serrarbo());
        pokemon.add(new Ruminelk());
        pokemon.add(new Ancervus(new Stats(495, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Ampin());
        pokemon.add(new Sharquake());
        pokemon.add(new Polykelp(new Stats(483, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        pokemon.add(new Venchill(new Stats(365, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Fungeon(new Stats(525, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))));
//        pokemon.add(new Pixidra());   Missing Art
        pokemon.add(new Genbrisk(new Stats(640, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Voltwin(new Stats(298, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
    }

}
