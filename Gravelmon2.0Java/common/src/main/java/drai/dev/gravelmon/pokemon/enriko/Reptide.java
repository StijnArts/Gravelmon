package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Reptide extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reptide() {
        super("Reptide",
                Type.WATER,Type.PSYCHIC,
                new Stats(100,
                        80,
                        90,
                        100,
                        100,
                        100),
                List.of(Ability.TORRENT), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                224, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It is manipulative, commanding fish Pokemon to work as toadies for it. The pearls adorning its body focus its psychic energy into powerful beams."),
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
           setLangFileName("Reptide");

    }


}
