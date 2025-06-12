package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gormhyena extends drai.dev.data.pokemon.Pokemon {
    public Gormhyena() {
        super("Gormhyena",
                Type.GROUND, Type.DARK,
                new Stats(101,
                        85,
                        96,
                        56,
                        80,
                        50),
                List.of(Ability.GLUTTONY,Ability.THICK_FAT), Ability.MOXIE,
                16, 0,
                new Stats(0,0,0,0,0,0), 70,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This lazy Pokémon rather order food from its pre evolved form than to go on a hunt itself. Whenever Gormhyena is brought any food it never shares it with the rest of the pack. This always results in a fight."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,8),
                        new MoveLearnSetEntry(Move.SAND_TOMB,13),
                        new MoveLearnSetEntry(Move.SCREECH,17),
                        new MoveLearnSetEntry(Move.DIG,21),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,24),
                        new MoveLearnSetEntry(Move.SANDSTORM,30),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.SANDSHOT,39),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,44),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.SPIKES,55),
                        new MoveLearnSetEntry(Move.FISSURE,62)                  ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 47, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gormhyena");

    }


}
