package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Decomposite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Decomposite() {
        super("Decomposite",
                Type.POISON,Type.DARK,
                new Stats(70,
                        115,
                        60,
                        60,
                        150,
                        75),
                List.of(Ability.REGENERATOR), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("Anything grabbed by its tentacles is instantly bended to its will. The husks of former hosts are arranged in its lair like trophies."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Decomposite");

    }


}
