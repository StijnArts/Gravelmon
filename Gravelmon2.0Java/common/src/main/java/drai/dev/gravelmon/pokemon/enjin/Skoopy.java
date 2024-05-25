package drai.dev.gravelmon.pokemon.enjin;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Skoopy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Skoopy() {
        super("Skoopy",
                Type.ICE, Type.FAIRY,
                new Stats(50,
                        50,
                        35,
                        85,
                        85,
                        45),
                List.of(Ability.ICE_BODY), Ability.MAGIC_GUARD,
                3, 11,
                new Stats(0,0,0,1,0,0), 0,
                0.4,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of("These Pokemon love practicing their magic, often freezing anything they can find. Whilst their magic is annoying to some, it can be very useful during hot summer days."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1)                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Skoopy");

    }


}
