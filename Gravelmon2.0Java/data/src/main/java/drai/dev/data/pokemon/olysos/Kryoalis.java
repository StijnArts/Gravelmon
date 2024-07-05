package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kryoalis extends drai.dev.data.pokemon.Pokemon {
    public Kryoalis() {
        super("Kryoalis",
                Type.ICE, Type.DRAGON,
                new Stats(80,
                        70,
                        80,
                        140,
                        80,
                        140),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                64, 1964,
                new Stats(0,0,0,2,0,1), 3,
                0.0,
                220, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("In the stillness of the night, this guardian serpent graces the skies, leaving behind a mesmerizing aurora spectacle that captivates all who witness it. As it soars through the heavens, its scales emit an otherworldly glow, creating an enchanting dance of lights that mirrors the beauty of the northern lights. Many ancient tales speak of Kryoalis guiding lost souls with its soothing glow, ensuring they find their way through the vast, snow-covered landscapes."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kryoalis");

    }


}
