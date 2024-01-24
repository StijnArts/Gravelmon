package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Petrawl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Petrawl() {
        super("Petrawl",
                Type.ROCK,Type.FIGHTING,
                new Stats(50,
                        50,
                        90,
                        20,
                        50,
                        10),
                List.of(Ability.SAND_FORCE,Ability.SOLID_ROCK,Ability.CLEAR_BODY), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Even a powerful explosion won't scratch its skin. Petrawl fences with other Pokemon twice its size to in an attempt to grow stronger."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Petrawl");

    }


}
