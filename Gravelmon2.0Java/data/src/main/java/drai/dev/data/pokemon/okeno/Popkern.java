package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Popkern extends drai.dev.data.pokemon.Pokemon {
    public Popkern() {
        super("Popkern",
                Type.GRASS,
                new Stats(30,
                        30,
                        60,
                        60,
                        30,
                        30),
                List.of(Ability.FLARE_BOOST,Ability.OWN_TEMPO,Ability.LEAF_GUARD), Ability.LEAF_GUARD,
                2, 165,
                new Stats(0,0,1,0,0,0), 235,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("This Pokemon's organism is mostly composed of water and thus is very sensible to changes in the weather. If Popkern ever reaches elevated temperatures, it will evolve."),
                List.of(new EvolutionEntry("pipkorn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.FLAME_CHARGE.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.SEEDSHOT,3),
                        new MoveLearnSetEntry(Move.LEECH_SEED,6),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,9),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.GROWTH,15),
                        new MoveLearnSetEntry(Move.SYNTHESIS,17),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,20),
                        new MoveLearnSetEntry(Move.ENDEAVOR,24),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,31),
                        new MoveLearnSetEntry(Move.OVERHEAT,36),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Popkern");

    }


}
