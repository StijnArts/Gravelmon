package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Webbind extends drai.dev.gravelmon.pokemon.Pokemon {
    public Webbind() {
        super("Webbind",
                Type.BUG,
                new Stats(75,
                        65,
                        75,
                        20,
                        80,
                        15),
                List.of(Ability.STICKY_HOLD), Ability.STICKY_HOLD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Webbind's body is covered in incredibly sticky webbing. Large clumps of them can often be found stuck together along with various debris."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STICKY_WEB,1)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Webbind");

    }


}
