package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Corvhugen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Corvhugen() {
        super("Corvhugen",
                Type.FLYING,Type.FIGHTING,
                new Stats(74,
                        115,
                        81,
                        74,
                        61,
                        90),
                List.of(Ability.TOUGH_CLAWS,Ability.STEADFAST,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                216, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Unlike Corviknight, Corvhugen has a padded knight's armor covering most of its body. This offers it more speed for agile combat; battles that don't last very long."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Corvhugen");

    }


}
