package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Luminose extends drai.dev.gravelmon.pokemon.Pokemon {
    public Luminose() {
        super("Luminose",
                Type.NORMAL,Type.PSYCHIC,
                new Stats(80,
                        55,
                        85,
                        85,
                        105,
                        75),
                List.of(Ability.INTIMIDATE), Ability.INTIMIDATE,
                11, 358,
                new Stats(0,0,0,0,2,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Early-Route Normal Rodent Pokemon ------'Luminose strains during evolution from Molit. Its exposed skull and star-nose finally enable it to use its psychic powers when evolved.'"),
                List.of(),
                List.of(                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Luminose");

    }


}
