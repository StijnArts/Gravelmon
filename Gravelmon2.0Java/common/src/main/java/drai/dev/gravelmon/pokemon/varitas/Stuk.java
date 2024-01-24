package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Stuk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stuk() {
        super("Stuk",
                Type.GROUND,
                new Stats(105,
                        105,
                        75,
                        65,
                        100,
                        50),
                List.of(Ability.ARENA_TRAP,Ability.GOOEY,Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("Its tar-like body has seeped into the bones stuck in it which allows it to control them. It subdues prey with its clawed arm and drags them in with its other sticky arm to absorb them and add their bones to itself."),
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
           setLangFileName("Stuk");

    }


}
