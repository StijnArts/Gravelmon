package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Planchelt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Planchelt() {
        super("Planchelt",
                Type.GHOST,Type.STEEL,
                new Stats(61,
                        60,
                        50,
                        60,
                        50,
                        18),
                List.of(Ability.FRISK), Ability.CURSED_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Planchelt are said to be the souls of children who misused their toys and tortured harmless creatures, cursed to live in a the body of a raggedy little ball of fluff. They are actually quite cheerful Pokemon, and enjoy playing with one another and collecting trinkets."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Planchelt");

    }


}
