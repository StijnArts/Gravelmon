package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianDruddigon extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianDruddigon() {
        super("Druddigon",
                Type.DRAGON,Type.ROCK,
                new Stats(77,
                        120,
                        90,
                        50,
                        100,
                        48),
                List.of(Ability.STAMINA), Ability.STAMINA,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("The various crystals growing on its body absorb and store heat, allowing it to live in colder climates without freezing."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Druddigon");

    }


}
