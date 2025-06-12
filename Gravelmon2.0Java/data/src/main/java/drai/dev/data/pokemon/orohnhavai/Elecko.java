package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Elecko extends drai.dev.data.pokemon.Pokemon {
    public Elecko() {
        super("Elecko",
                Type.ELECTRIC,
                new Stats(70,
                        60,
                        65,
                        125,
                        80,
                        100),
                List.of(Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                11, 165,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                210, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Commonly found in urban cities, it runs across wires to gather electricity and charge itself. Contact with a supercharged Elecko will send electric shocks throughout your body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.CHARGE,9),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,13),
                        new MoveLearnSetEntry(Move.REFLECT,17),
                        new MoveLearnSetEntry(Move.BITE,21),
                        new MoveLearnSetEntry(Move.DISCHARGE,25),
                        new MoveLearnSetEntry(Move.CRUNCH,29),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,33),
                        new MoveLearnSetEntry(Move.DARK_PULSE,37),
                        new MoveLearnSetEntry(Move.AGILITY,41),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,45),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(28)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Elecko");

    }


}
