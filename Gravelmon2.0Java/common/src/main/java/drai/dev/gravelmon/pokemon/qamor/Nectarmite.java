package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Nectarmite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nectarmite() {
        super("Nectarmite",
                Type.BUG,
                new Stats(118,
                        80,
                        70,
                        51,
                        88,
                        93),
                List.of(Ability.POWERLEECH,Ability.SCAVENGE,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Nectarmite work diligently in their nests keeping out dangerous Pokemon, attacking intruders, and caring for their young. They cling to ceilings so when an unsuspecting foe walks by they can usher a sneak attack from above. They are able to absorb and add an organism's energy directly into their sap reserve."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_LIFE,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nectarmite");

    }


}
