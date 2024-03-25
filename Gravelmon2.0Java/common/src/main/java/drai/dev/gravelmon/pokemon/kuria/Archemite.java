package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Archemite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Archemite() {
        super("Archemite",
                Type.ROCK,
                new Stats(125,
                        115,
                        125,
                        50,
                        70,
                        50),
                List.of(Ability.SOLID_ROCK), Ability.TOUGH_CLAWS,
                22, 2599,
                new Stats(2,0,2,0,0,0), 45,
                0.5,
                223, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Archemite are considered the toughest stones in the entire world, even being able to take a meteor impact and come out unscathed. Though sometimes they drop their defenses to make their claws sharper."),
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
           setLangFileName("Archemite");

    }


}
