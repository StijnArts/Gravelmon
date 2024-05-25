package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Rubbage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rubbage() {
        super("Rubbage",
                Type.BUG,
                new Stats(30,
                        25,
                        60,
                        20,
                        60,
                        30),
                List.of(Ability.SWARM,Ability.SWARM), Ability.STENCH,
                3, 40,
                new Stats(0,0,1,0,1,0), 180,
                0.5,
                83, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("When the time comes for a Nappi to evolve, their bodies harden and darken resembling a trash bag. Despite their increased defences they are still incredibly timid and will remain in the dumpster it was born in."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rubbage");

    }


}
