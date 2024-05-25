package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lepiterros extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lepiterros() {
        super("Lepiterros",
                Type.BUG,
                new Stats(60,
                        20,
                        30,
                        40,
                        30,
                        20),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                17, 165,
                new Stats(0,0,0,2,0,1), 25,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokemon appears in legends, where its wings were said to contain the secrets of the world. Its said it would share this knowledge with those who sought it out with kind and pure intent."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WANDERLUST,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,7),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,11),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,16),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,22),
                        new MoveLearnSetEntry(Move.AFTER_YOU,24),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,38),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,42),
                        new MoveLearnSetEntry(Move.HURRICANE,50),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,58),
                        new MoveLearnSetEntry(Move.EARTH_POWER,66),
                        new MoveLearnSetEntry(Move.MOONBLAST,72),
                        new MoveLearnSetEntry(Move.WANDERLUST,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 65, .0004, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HILLS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lepiterros");

    }


}
