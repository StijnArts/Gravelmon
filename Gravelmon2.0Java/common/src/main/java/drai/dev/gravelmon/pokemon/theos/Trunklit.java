package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Trunklit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trunklit() {
        super("Trunklit",
                Type.FIRE,Type.GROUND,
                new Stats(80,
                        45,
                        70,
                        70,
                        45,
                        20),
                List.of(Ability.WHITE_SMOKE), Ability.BERSERK,
                10, 1050,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Trunklit release puffs of smoke from their nose to create shapes. Humans in the ancient times would use the soot leftover to create artwork and tell stories."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trunklit");

    }


}
