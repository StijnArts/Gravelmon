package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Munsun extends drai.dev.gravelmon.pokemon.Pokemon {
    public Munsun() {
        super("Munsun",
                Type.FLYING,Type.ELECTRIC,
                new Stats(70,
                        60,
                        90,
                        70,
                        50,
                        20),
                List.of(Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Munsun are often seen as symbols of childishness and whimsy, despite their constant pouty face. The orb they carry around is the source of their power, without it they would not be able to generate electricity or create cloud platforms. As they gain experience, their orb grows in size and power."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Munsun");

    }


}
