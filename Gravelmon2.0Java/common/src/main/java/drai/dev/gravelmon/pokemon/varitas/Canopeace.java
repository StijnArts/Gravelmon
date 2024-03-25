package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Canopeace extends drai.dev.gravelmon.pokemon.Pokemon {
    public Canopeace() {
        super("Canopeace",
                Type.GRASS,Type.PSYCHIC,
                new Stats(125,
                        20,
                        100,
                        85,
                        115,
                        40),
                List.of(Ability.FILTER,Ability.FLOWER_VEIL,Ability.TANGLING_HAIR), Ability.TANGLING_HAIR,
                12, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("It has a very friendly, easygoing personality that makes it a great companion for anyone. It often sits quietly to meditate and absorb sun rays with the flowers on its head which helps its long grassy hair grow."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,3),
                        new MoveLearnSetEntry(Move.LEAFAGE,8),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,38),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,43),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,48)                    ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 38, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Canopeace");

    }


}
