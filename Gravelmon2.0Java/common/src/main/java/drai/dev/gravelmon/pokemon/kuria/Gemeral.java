package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gemeral extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gemeral() {
        super("Gemeral",
                Type.ROCK,Type.LIGHT,
                new Stats(56,
                        40,
                        94,
                        80,
                        74,
                        31),
                List.of(Ability.STURDY), Ability.SAP_SIPPER,
                7, 326,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                86, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of("The crystal Gemeral grow on their back allows them to take in energy. They store massive amounts of energy within and only release it when they feel threatened."),
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
           setLangFileName("Gemeral");

    }


}
