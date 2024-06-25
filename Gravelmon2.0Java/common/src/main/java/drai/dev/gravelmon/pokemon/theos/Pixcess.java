package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Pixcess extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pixcess() {
        super("Pixcess",
                Type.POISON, Type.FAIRY,
                new Stats(57,
                        40,
                        65,
                        86,
                        73,
                        49),
                List.of(Ability.SHIELD_DUST), Ability.SERENE_GRACE,
                8, 68,
                new Stats(0,0,0,2,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution, Pixcess are able to greater control their spores allowing them to be used to greater effect in battle."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pixcess");

    }


}
