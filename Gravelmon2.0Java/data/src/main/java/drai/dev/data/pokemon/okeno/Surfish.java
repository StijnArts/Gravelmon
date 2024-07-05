package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Surfish extends drai.dev.data.pokemon.Pokemon {
    public Surfish() {
        super("Surfish",
                Type.WATER, Type.FLYING,
                new Stats(60,
                        60,
                        60,
                        85,
                        60,
                        125),
                List.of(Ability.SWIFT_SWIM), Ability.UNBURDEN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("- Water GunSTAB Water - Twister Dragon - Astonish Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Surfish");

    }


}
