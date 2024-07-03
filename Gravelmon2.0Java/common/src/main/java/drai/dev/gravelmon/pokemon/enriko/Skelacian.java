package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Skelacian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Skelacian() {
        super("Skelacian",
                Type.WATER, Type.GHOST,
                new Stats(39,
                        111,
                        44,
                        106,
                        38,
                        107),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Clinging to what little life force it had, the discarded cocoon turns into a spirit Pokemon, relentlessly defending the Zuupie that it previously harbored."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.HYPNOSIS,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.WILLOWISP,17),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.ABYSSAL_LURE,37),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46)          ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 33, 56, .02, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Skelacian");

    }


}
