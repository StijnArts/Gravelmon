package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wyrmlagar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wyrmlagar() {
        super("Wyrmlagar",
                Type.BUG,Type.DRAGON,
                new Stats(80,
                        115,
                        84,
                        100,
                        80,
                        81),
                List.of(Ability.INTIMIDATE), Ability.OUTBURST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wyrmlagar can grow tremendously in size. Its shadow appears the same as a Gyarados. Legends tell of this Pokémon, corrupting entire lakes."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wyrmlagar");

    }


}
