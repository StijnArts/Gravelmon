package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.ultraspace.*;

import java.util.*;

public class Ultraspace extends drai.dev.data.games.registry.Game {
    public Ultraspace() {
        super("Ultraspace");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Amphibrain());   
        pokemon.add(new Croatex(new Stats(490, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Jawminate());   
        pokemon.add(new Imposibeast(new Stats(490, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Knuclaw());   
        pokemon.add(new Huntitan(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
//        pokemon.add(new Bl00p(new Stats(0, StatArchetype.SPECIAL_WALL,
//                List.of(StatType.SPEED))));      MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Squatchy(new Stats(0, StatArchetype.SPECIAL_WALL,
//                List.of(StatType.SPEED))));      MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Flapfini(new Stats(0, StatArchetype.SPECIAL_WALL,
//                List.of(StatType.SPEED))));      MEMBER OF LINE NOT FINISHED
        pokemon.add(new Wiskurry());   
        pokemon.add(new Wrinklaw(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Turfowl());
        pokemon.add(new Turgato());   
        pokemon.add(new Turojet(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Buptic());   
        pokemon.add(new Croptic(new Stats(460, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));      
        pokemon.add(new Eleslink());   
        pokemon.add(new Eleconda(new Stats(455, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Puffgi());   
        pokemon.add(new Mushboom(new Stats(450, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
//        pokemon.add(new Lingopan());   Missing Art
//        pokemon.add(new Eelien());   Missing Art
//        pokemon.add(new Moonraena());   Missing Art
//        pokemon.add(new Cubirite());   Missing Art
//        pokemon.add(new 403508());   Missing Art
        pokemon.add(new Outepede(new Stats(430, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Grosscean(new Stats(440, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Aylien(new Stats(360, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Sharcoe(new Stats(330, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Bullvanize(new Stats(410, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Craycrane());
        pokemon.add(new Papiral(new Stats(310, StatArchetype.FAST_SUPPORT,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Gluttiny(new Stats(310, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Stakube(new Stats(310, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Cereblow(new Stats(310, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Flekskeeto(new Stats(310, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
//        pokemon.add(new 465342());   Missing Art
//        pokemon.add(new Dracoma());   Missing Art
        pokemon.add(new Garlick());  
        pokemon.add(new Ghoulic());  
        pokemon.add(new Oniion());
//        pokemon.add(new 838783());   Missing Art
//        pokemon.add(new 841511());   Missing Art
//        pokemon.add(new 658638());   Missing Art
        pokemon.add(new Screechean(new Stats(420, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Sulgast(new Stats(400, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Goonanas(new Stats(390, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Worminder(new Stats(410, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Chainitie(new Stats(400, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Barbaris(new Stats(390, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Galaxey(new Stats(380, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Sculptean(new Stats(410, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Cerebranch(new Stats(510, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPEED))));      
        pokemon.add(new Inclemight(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
    }

}
