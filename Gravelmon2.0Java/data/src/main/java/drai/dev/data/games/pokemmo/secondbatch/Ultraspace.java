package drai.dev.data.games.pokemmo.secondbatch;



import drai.dev.data.pokemon.ultraspace.*;
import drai.dev.data.pokemon.ultraspace.Turfowl;
import drai.dev.data.attributes.*;

import java.util.*;

public class Ultraspace extends drai.dev.data.games.registry.Game {
    public Ultraspace() {
        super("Ultraspace");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Amphibrain());   
        pokemon.add(new Croatex(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Jawminate());   
        pokemon.add(new Imposibeast(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Knuclaw());   
        pokemon.add(new Huntitan(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Bl00p(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Squatchy(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Flapfini(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Wiskurry());   
        pokemon.add(new Wrinklaw(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Turfowl());
        pokemon.add(new Turgato());   
        pokemon.add(new Turojet(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Buptic());   
        pokemon.add(new Croptic(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Eleslink());   
        pokemon.add(new Eleconda(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Puffgi());   
        pokemon.add(new Mushboom(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
//        pokemon.add(new Lingopan());   Missing Art
//        pokemon.add(new Eelien());   Missing Art
//        pokemon.add(new Moonraena());   Missing Art
//        pokemon.add(new Cubirite());   Missing Art
//        pokemon.add(new 403508());   Missing Art
        pokemon.add(new Outepede(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Grosscean(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Aylien(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Sharcoe(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Bullvanize(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Craycrane());
        pokemon.add(new Papiral(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Gluttiny(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Stakube(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Cereblow(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Flekskeeto(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
//        pokemon.add(new 465342());   Missing Art
//        pokemon.add(new Dracoma());   Missing Art
        pokemon.add(new Garlick());  
        pokemon.add(new Ghoulic());  
        pokemon.add(new Oniion());
//        pokemon.add(new 838783());   Missing Art
//        pokemon.add(new 841511());   Missing Art
//        pokemon.add(new 658638());   Missing Art
        pokemon.add(new Screechean(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Sulgast(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Goonanas(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Worminder(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Chainitie(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Barbaris(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Galaxey(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Sculptean(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Cerebranch(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
        pokemon.add(new Inclemight(new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));   
    }

}
