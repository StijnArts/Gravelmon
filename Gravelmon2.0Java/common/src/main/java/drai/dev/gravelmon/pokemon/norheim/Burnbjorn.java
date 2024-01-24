package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Burnbjorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Burnbjorn() {
        super("Burnbjorn",
                Type.FIRE,Type.NORMAL,
                new Stats(80,
                        113,
                        85,
                        84,
                        90,
                        80),
                List.of(Ability.BLAZE,Ability.TOUGH_CLAWS,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Surroudning the neck of a Burnbjorn is a collection of the finest honey, hardened and nearly unbreakable. This large Pokemon uses burst of fire sparingly due to its raw power and its care for the forests. Various Pokemon are attracted to the sweet smell of Burnbjorn, but it does not like to be bothered."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Burnbjorn");

    }


}
