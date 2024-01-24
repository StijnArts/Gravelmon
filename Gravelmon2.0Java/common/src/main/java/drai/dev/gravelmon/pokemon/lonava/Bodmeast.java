package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bodmeast extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bodmeast() {
        super("Bodmeast",
                Type.DARK,
                new Stats(65,
                        60,
                        60,
                        75,
                        65,
                        115),
                List.of(Ability.UNNERVE,Ability.RATTLED,Ability.INTIMIDATE), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The subject of many local legends, these evasive creatures have become known as the Beasts of Tonbury. No official records of Bodmeast exist, only blurry photographs, pawprints, and the occasional clump of its sharp, wiry fur."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bodmeast");

    }


}
