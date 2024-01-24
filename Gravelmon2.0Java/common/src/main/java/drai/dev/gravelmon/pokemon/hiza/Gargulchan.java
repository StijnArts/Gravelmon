package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gargulchan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gargulchan() {
        super("Gargulchan",
                Type.ROCK,Type.FIGHTING,
                new Stats(80,
                        100,
                        170,
                        50,
                        80,
                        35),
                List.of(Ability.SAND_FORCE,Ability.SOLID_ROCK,Ability.CLEAR_BODY), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                227, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its fearful size and strength frightens Pokemon, it grows rare minerals on its back to attract people so it won't be lonely."),
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
           setLangFileName("Gargulchan");

    }


}
