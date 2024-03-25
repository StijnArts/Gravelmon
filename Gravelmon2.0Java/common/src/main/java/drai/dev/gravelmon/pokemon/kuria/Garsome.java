package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Garsome extends drai.dev.gravelmon.pokemon.Pokemon {
    public Garsome() {
        super("Garsome",
                Type.GRASS,Type.FIRE,
                new Stats(121,
                        81,
                        91,
                        111,
                        91,
                        50),
                List.of(Ability.UNHOLY,Ability.CURSED_BODY), Ability.ROOTED,
                19, 755,
                new Stats(3,0,0,0,0,0), 45,
                0.5,
                222, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.GRASS),
                List.of("Garsome takes in large amounts of nutrients from the soil, often killing plants all around it. It will then physically eat the plants as well. Its flames will burn more intense if its well-fed."),
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
           setLangFileName("Garsome");

    }


}
