package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sweetinel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sweetinel() {
        super("Sweetinel",
                Type.FAIRY,
                new Stats(105,
                        90,
                        100,
                        70,
                        100,
                        50),
                List.of(Ability.SWEET_VEIL), Ability.SWEET_VEIL,
                8, 165,
                new Stats(3,0,0,0,0,0), 30,
                0.5,
                180, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("The glutton Sweetinel hoards insane ammounts of food and will fiercely guard its stock till it's all finished."),
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
           setLangFileName("Sweetinel");

    }


}
