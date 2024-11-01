package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pixpud extends drai.dev.data.pokemon.Pokemon {
    public Pixpud() {
        super("Pixpud",
                Type.GROUND,Type.GRASS,
                new Stats(200,
                        60,
                        115,
                        50,
                        115,
                        60),
                List.of(Ability.HARVEST), Ability.HARVEST,
                0, 0,
                new Stats(0,0,0,0,0,0), 25,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Beloved by all and celebrated on the day of harvest with feasts. When Pixpud blesses a field, it can become a flourising landscape overnight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pixpud");

    }


}
