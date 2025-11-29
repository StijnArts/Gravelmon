package drai.dev.data.games.pokengine;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.tokas.*;
import drai.dev.data.pokemon.tokas.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tokas extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Tokas();
    private Tokas() {
        super("Tokas", "https://pokengine.org/collections/10lc2j53/Tokas");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Frungus());
        addNewPokemon(new Mushribbit());
        addNewPokemon(new Toadrule(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Oinklit());
        addNewPokemon(new Hamferno());
        addNewPokemon(new Infernoink(new Stats(532, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Bufflow());
        addNewPokemon(new Brinalo());
        addNewPokemon(new Bisonami(new Stats(525, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Trilbin());
        addNewPokemon(new Bintone());
        addNewPokemon(new Beatrob(new Stats(512, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Erliber());
        addNewPokemon(new Getzawyrm(new Stats(535, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Nutub());
        addNewPokemon(new Bubinuter(new Stats(470, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Mortoise(new Stats(456, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Clunkey(new Stats(456, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Arachute());
        addNewPokemon(new Parachnid(new Stats(487, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Scuddle());
        addNewPokemon(new Crustancient(new Stats(487, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Nozlox());
        addNewPokemon(new Hydrox(new Stats(479, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Dewmite());
        addNewPokemon(new Fountic(new Stats(435, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Obstick());
        addNewPokemon(new Stalkturnal(new Stats(454, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Walok());
        addNewPokemon(new Binduga(new Stats(487, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Gliduki());
        addNewPokemon(new Tukaleap(new Stats(476, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Cattack(new Stats(387, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new TokassianMagby("", Aspect.TOKASSIAN));
        addNewPokemon(new TokassianMagmar(new Stats(495, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE)),"", Aspect.TOKASSIAN));
        addNewPokemon(new Koroka());
        addNewPokemon(new Goroka(new Stats(478, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Snoboon());
        addNewPokemon(new Boonball());
        addNewPokemon(new Abomboon(new Stats(523, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Gexom());
        addNewPokemon(new Gectidact(new Stats(542, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Finpin());
        addNewPokemon(new Merpin());
        addNewPokemon(new Mermace(new Stats(500, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        addNewPokemon(new Aarkweird());Missing Art
//        addNewPokemon(new Myrmerize());Missing Art
//        addNewPokemon(new Tamindash());Missing Art
        addNewPokemon(new Corozard());
        addNewPokemon(new Biolazard(new Stats(498, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Gravelo());
        addNewPokemon(new Minerapt());
        addNewPokemon(new Outcroptor(new Stats(534, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Grebur());
        addNewPokemon(new Grebloo(new Stats(480, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Parazyme());
        addNewPokemon(new Cytocite(new Stats(470, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Snifflet());
        addNewPokemon(new Fridgehog());
        addNewPokemon(new Iciquill(new Stats(522, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.ATTACK))));
        addNewPokemon(new Gestup());
        addNewPokemon(new Phantoll());
        addNewPokemon(new Springeist(new Stats(521, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
    }

}
