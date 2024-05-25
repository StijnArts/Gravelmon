package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dratt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dratt() {
        super("Dratt",
                Type.GRASS, Type.DRAGON,
                new Stats(40,
                        50,
                        45,
                        50,
                        45,
                        50),
                List.of(Ability.CHLOROPHYLL), Ability.CHLOROPHYLL,
                4, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("drowler", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(                 new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,3),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.SNAP_TRAP,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,11),
                        new MoveLearnSetEntry(Move.INGRAIN,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,17),
                        new MoveLearnSetEntry(Move.SEED_BOMB,21),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.LEECH_SEED,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,31),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.LEAF_STORM,40),
                        new MoveLearnSetEntry(Move.OUTRAGE,46)       ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 6, 27, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dratt");

    }


}
