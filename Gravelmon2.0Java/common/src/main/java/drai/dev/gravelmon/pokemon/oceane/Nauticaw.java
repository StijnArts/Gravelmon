package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nauticaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nauticaw() {
        super("Nauticaw",
                Type.NORMAL,Type.FLYING,
                new Stats(58,
                        75,
                        50,
                        65,
                        52,
                        75),
                List.of(Ability.SWIFT_SWIM), Ability.MULTISCALE,
                8, 165,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                131, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_2),
                List.of("Hardened scales adorn the top of Seaparrot's head, which it uses to headbutt wildly when enraged. The gills have grown so large that they can produce strong gusts of wind."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nauticaw");

    }


}
