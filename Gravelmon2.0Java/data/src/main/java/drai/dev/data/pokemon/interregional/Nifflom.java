package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nifflom extends drai.dev.data.pokemon.Pokemon {
    public Nifflom() {
        super("Nifflom",
                Type.QUESTION_MARK,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,10),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.PROTECT,30),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,70),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,80),
                        new MoveLearnSetEntry(Move.GYRO_BALL,90)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .mythical()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nifflom");

    }


}
