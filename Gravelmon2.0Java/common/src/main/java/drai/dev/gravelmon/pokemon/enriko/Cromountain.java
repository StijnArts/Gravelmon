package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cromountain extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cromountain() {
        super("Cromountain",
                Type.ICE,Type.FIGHTING,
                new Stats(85,
                        135,
                        80,
                        70,
                        70,
                        60),
                List.of(Ability.TINTED_LENS), Ability.NO_GUARD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Cromountain's DNA is frighteningly similar to human DNA. They are gentle giants, preferring to play with tools as opposed to fighting."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cromountain");

    }


}
