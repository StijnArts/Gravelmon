package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Emii extends drai.dev.gravelmon.pokemon.Pokemon {
    public Emii() {
        super("Emii",
                Type.FAIRY,Type.DARK,
                new Stats(88,
                        95,
                        85,
                        120,
                        90,
                        82),
                List.of(Ability.PRANKSTER), Ability.PRANKSTER,
                8, 165,
                new Stats(0,1,0,2,0,0), 3,
                1.0,
                270, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The spirit of an enraged, prankish boy. Emii's canon like arms can blast through even the densest of all objects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,24),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,30),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,36),
                        new MoveLearnSetEntry(Move.MOONBLAST,42),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,52),
                        new MoveLearnSetEntry(Move.DARK_PULSE,62),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,72)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Emii");

    }


}
