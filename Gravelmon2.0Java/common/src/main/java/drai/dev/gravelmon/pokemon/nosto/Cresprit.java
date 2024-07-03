package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Cresprit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cresprit() {
        super("Cresprit",
                Type.GHOST,
                new Stats(61,
                        73,
                        85,
                        59,
                        55,
                        67),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("spectmare", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"\"cobblemon:reaper_cloth\"")))),
                List.of(        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.POUND,8),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,12),
                        new MoveLearnSetEntry(Move.CURSE,16),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,20),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,28),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,32),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,36),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,40),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,44),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,48),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,52),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,56)                 ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 47, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cresprit");

    }


}
