package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Wicruet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wicruet() {
        super("Wicruet",
                Type.FIGHTING,Type.WATER,
                new Stats(40,
                        70,
                        40,
                        35,
                        40,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,1,0,0,0,0), 75,
                0.0,
                57, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("A very persistent Mon, Wicruet can gather a following like no other. Its vessel contains water, which is thought to symbolise the sweat and tears it pours into attaining evolution. Legends state that a holy man once visited Tonbury Town with a Wicruet."),
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
           setLangFileName("Wicruet");

    }


}
