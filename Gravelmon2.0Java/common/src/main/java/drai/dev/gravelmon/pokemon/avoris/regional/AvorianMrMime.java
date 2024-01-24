package drai.dev.gravelmon.pokemon.avoris.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AvorianMrMime extends drai.dev.gravelmon.pokemon.Pokemon {
    public AvorianMrMime() {
        super("MrMime",
                Type.FIGHTING,Type.FAIRY,
                new Stats(60,
                        100,
                        65,
                        55,
                        90,
                        90),
                List.of(Ability.VITAL_SPIRIT), Ability.IRON_FIST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It combines dancing with boxing, clowning on its opponents to frustrate them. Then it delivers powerful strikes to knock them out. Its sweet aroma is known to make foes dizzy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,"tm"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm")                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mr. Mime");

    }


}
