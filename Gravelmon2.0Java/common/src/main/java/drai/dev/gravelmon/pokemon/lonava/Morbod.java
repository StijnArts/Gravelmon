package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Morbod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Morbod() {
        super("Morbod",
                Type.DARK,
                new Stats(40,
                        35,
                        35,
                        50,
                        40,
                        90),
                List.of(Ability.UNNERVE,Ability.RATTLED,Ability.INTIMIDATE), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its glowing eyes and aloof personality startle many that stumble upon it, allowing it to avoid capture. Cryptozoologists suspect that Morbod play a significant part in local folktales, with their eerie cries resembling crying babies."),
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
           setLangFileName("Morbod");

    }


}
