package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sharkage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sharkage() {
        super("Sharkage",
                Type.GRASS,
                new Stats(62,
                        87,
                        63,
                        51,
                        65,
                        77),
                List.of(Ability.OVERGROW), Ability.SHARPNESS,
                8, 220,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Armed with sharp fins, teeth and claws, most Pokémon don't dare challenge it. It likes chewing on hard objects like rock and metal to strengthen its growing teeth."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sharkage");

    }


}
