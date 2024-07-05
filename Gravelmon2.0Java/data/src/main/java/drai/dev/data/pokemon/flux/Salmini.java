package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class Salmini extends Pokemon {
    public Salmini() {
        super("Salmini",
                Type.WATER,
                new Stats(42,
                        41,
                        48,
                        43,
                        46,
                        60),
                List.of(Ability.RATTLED, Ability.RUN_AWAY), Ability.SWIFT_SWIM,
                4, 6,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.WATER_2, EggGroup.WATER_1),
                List.of("When it finds things on the riverbed, it tends to carry them around in its mouth. Some think its preferences can help predict how it evolves."),
                List.of(new EvolutionEntry("salmosaultfreshwater", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,
                                                "\""+ Biome.IS_RIVER.getId() + ":" + Biome.IS_RIVER.getName() +"\""))),
                        new EvolutionEntry("salmosaultsaltwater", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,
                                                "\""+ Biome.IS_OCEAN.getId() + ":" + Biome.IS_OCEAN.getName() +"\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.YAWN,16),
                        new MoveLearnSetEntry(Move.FLAIL,19),
                        new MoveLearnSetEntry(Move.WATERFALL,23),
                        new MoveLearnSetEntry(Move.AGILITY,26),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,30),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,33),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,37),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg")
                        ),
                List.of(Label.URANIUM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 5, 21, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_ARID, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
    }
}
