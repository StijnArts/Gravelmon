package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Germinell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Germinell() {
        super("Germinell",
                Type.NORMAL,
                new Stats(85,
                        20,
                        10,
                        35,
                        60,
                        30),
                List.of(Ability.CLEAR_BODY,Ability.DAMP,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Germinell");

    }


}
