package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sarcospike extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sarcospike() {
        super("Sarcospike",
                Type.STEEL,Type.FIRE,
                new Stats(80,
                        97,
                        125,
                        80,
                        125,
                        38),
                List.of(Ability.FLASH_FIRE,Ability.CURSED_BODY), Ability.AFTERMATH,
                23, 1745,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                200, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Sarcospike stand in one place all day seemingly lifeless, but as soon as something comes close, they pierce it with their spikes and store it in their body to burn it alive. They let out a faint, sad laugh while burning their victim."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sarcospike");

    }


}
