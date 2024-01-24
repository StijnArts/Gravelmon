package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grublin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grublin() {
        super("Grublin",
                Type.BUG,Type.WATER,
                new Stats(40,
                        40,
                        20,
                        40,
                        20,
                        40),
                List.of(Ability.WIMP_OUT), Ability.RATTLED,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Splash Normal - Struggle BugSTAB Bug 8 Bug BiteSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,8)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grublin");

    }


}
