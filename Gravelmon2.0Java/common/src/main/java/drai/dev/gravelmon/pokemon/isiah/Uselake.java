package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Uselake extends drai.dev.gravelmon.pokemon.Pokemon {
    public Uselake() {
        super("Uselake",
                Type.WATER,
                new Stats(37,
                        12,
                        25,
                        15,
                        36,
                        75),
                List.of(Ability.OBLIVIOUS), Ability.SUPER_LUCK,
                5, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                40, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("monartide", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))
                ),
                List.of(      new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.TACKLE,15),
                        new MoveLearnSetEntry(Move.FLAIL,25)),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 1, 33, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FRESHWATER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
