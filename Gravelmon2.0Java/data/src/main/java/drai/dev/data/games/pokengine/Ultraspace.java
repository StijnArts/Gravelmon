package drai.dev.data.games.pokengine;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.ultraspace.*;

import java.util.*;

public class Ultraspace extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Ultraspace();
    private Ultraspace() {
        super("Ultraspace", "https://pokengine.org/search?query=mons+region:03wglvg1");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Amphibrain());
        addNewPokemon(new Croatex(new Stats(540, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Jawminate());
        addNewPokemon(new Imposibeast(new Stats(540, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Knuclaw());
        addNewPokemon(new Huntitan(new Stats(540, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        addNewPokemon(new Bl00p(new Stats(0, StatArchetype.SPECIAL_WALL,
//                List.of(StatType.SPEED))));MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Squatchy(new Stats(0, StatArchetype.SPECIAL_WALL,
//                List.of(StatType.SPEED))));MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new Flapfini(new Stats(0, StatArchetype.SPECIAL_WALL,
//                List.of(StatType.SPEED))));MEMBER OF LINE NOT FINISHED
        addNewPokemon(new Wiskurry());
        addNewPokemon(new Wrinklaw(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Turfowl());
        addNewPokemon(new Turgato());
        addNewPokemon(new Turojet(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Buptic());
        addNewPokemon(new Croptic(new Stats(490, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        addNewPokemon(new Eleslink());
        addNewPokemon(new Eleconda(new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Puffgi());
        addNewPokemon(new Mushboom(new Stats(490, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new Lingopan());Missing Art
//        addNewPokemon(new Eelien());Missing Art
//        addNewPokemon(new Moonraena());Missing Art
//        addNewPokemon(new Cubirite());Missing Art
//        addNewPokemon(new 403508());Missing Art
        addNewPokemon(new Outepede(new Stats(500, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Grosscean(new Stats(440, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Aylien(new Stats(460, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Sharcoe(new Stats(430, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Bullvanize(new Stats(480, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Craycrane());
        addNewPokemon(new Papiral(new Stats(310, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Gluttiny(new Stats(310, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Stakube(new Stats(310, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Cereblow(new Stats(310, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Flekskeeto(new Stats(310, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
//        addNewPokemon(new 465342());Missing Art
//        addNewPokemon(new Dracoma());Missing Art
        addNewPokemon(new Garlick());  
        addNewPokemon(new Ghoulic());  
        addNewPokemon(new Oniion());
//        addNewPokemon(new 838783());Missing Art
//        addNewPokemon(new 841511());Missing Art
//        addNewPokemon(new 658638());Missing Art
        addNewPokemon(new Screechean(new Stats(570, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Sulgast(new Stats(570, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Goonanas(new Stats(570, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Worminder(new Stats(570, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Chainitie(new Stats(570, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Barbaris(new Stats(570, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Galaxey(new Stats(570, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Sculptean(new Stats(570, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Cerebranch(new Stats(600, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));
        addNewPokemon(new Inclemight(new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
    }

}
