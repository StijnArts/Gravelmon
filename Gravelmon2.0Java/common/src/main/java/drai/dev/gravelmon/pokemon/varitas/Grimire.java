package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grimire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grimire() {
        super("Grimire",
                Type.GROUND,
                new Stats(80,
                        80,
                        50,
                        40,
                        50,
                        25),
                List.of(Ability.ARENA_TRAP,Ability.GOOEY,Ability.STICKY_HOLD), Ability.STICKY_HOLD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("A creature made of mud and bones that mysteriously came to life similarly to Grimer, hence its name. Through only recently discovered, research suggests that it has actually existed before Grimer which has caused some debate over its naming."),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimire");

    }


}
