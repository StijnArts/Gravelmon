package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tadilly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tadilly() {
        super("Tadilly",
                Type.WATER, Type.GRASS,
                new Stats(60,
                        25,
                        55,
                        65,
                        85,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("lillake", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(                  new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.BUBBLE,3),
                        new MoveLearnSetEntry(Move.GROWTH,7),
                        new MoveLearnSetEntry(Move.SING,10),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,36),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,42)       ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
