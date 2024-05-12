package drai.dev.gravelmon.pokemon.nodorro;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Snaize extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snaize() {
        super("Snaize",
                Type.GRASS,
                new Stats(60,
                        50,
                        55,
                        55,
                        55,
                        35),
                List.of(Ability.HARVEST,Ability.LEAF_GUARD), Ability.SAP_SIPPER,
                3, 200,
                new Stats(1,0,0,0,0,0), 200,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.DRAGON),
                List.of("Seedorn live in crop fields where they pretend to be a crop by rooting themselves into the ground. Where they feed on the nutrition the crops produce."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ABSORB,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.LEECH_SEED,17),
                        new MoveLearnSetEntry(Move.COIL,21),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,32),
                        new MoveLearnSetEntry(Move.SYNTHESIS,38),
                        new MoveLearnSetEntry(Move.LEAF_STORM,45)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snaize");

    }


}
