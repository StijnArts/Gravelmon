package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Fatom extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fatom() {
        super("Fatom",
                Type.ELECTRIC,
                new Stats(54,
                        87,
                        56,
                        113,
                        110,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Fatom congregate in areas of high electromagnetic activity. They absorb as much energy as they can hold and release it all in an EMP burst."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.CHARGE,12),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,16),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,20),
                        new MoveLearnSetEntry(Move.SOLARCHARGER,24),
                        new MoveLearnSetEntry(Move.BEACHTIDE,31),
                        new MoveLearnSetEntry(Move.AMNESIA,33),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,41),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,45),
                        new MoveLearnSetEntry(Move.AQUA_RING,52),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,58)                 ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 43, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fatom");

    }


}
