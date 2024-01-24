package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Lauvader extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lauvader() {
        super("Lauvader",
                Type.GRASS,Type.STEEL,
                new Stats(100,
                        70,
                        95,
                        80,
                        85,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(3,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("New Ability - Absent Minded: All of the users stats excluding health have a 50% chance to reset at the begin of the next turn (i.e. stat effects, stat boosts and downgrades dissapear)."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFIDE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,39),
                        new MoveLearnSetEntry(Move.HEAL_BELL,44),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,49),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,54),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,59)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lauvader");

    }


}
