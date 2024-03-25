package drai.dev.gravelmon.pokemon.enjin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pterabonk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pterabonk() {
        super("Pterabonk",
                Type.STEEL,Type.FLYING,
                new Stats(60,
                        95,
                        65,
                        44,
                        51,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,1,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FLYING),
                List.of("Added Dec 21 2021 Etymology: ptera / pterodactyl + bonk Evo line: Complete"),
                List.of(),
                List.of(                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pterabonk");

    }


}
