package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fatfish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fatfish() {
        super("Fatfish",
                Type.WATER,
                new Stats(75,
                        35,
                        60,
                        35,
                        60,
                        20),
                List.of(Ability.CUTE_CHARM,Ability.SWIFT_SWIM,Ability.THICK_FAT), Ability.THICK_FAT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its appearance is disturbing and its smell is off-putting, but this Pokémon has the strange ability to charm almost any opponent."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.CHARM,3),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.ATTRACT,11),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,14),
                        new MoveLearnSetEntry(Move.AQUA_RING,18),
                        new MoveLearnSetEntry(Move.SLAM,22),
                        new MoveLearnSetEntry(Move.AQUA_JET,28)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fatfish");

    }


}
