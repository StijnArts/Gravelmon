package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Descargot extends Pokemon {
    public Descargot() {
        super("Descargot",
                Type.GRASS, Type.ELECTRIC,
                new Stats(90,65,85,50,90,70),
                List.of(Ability.OVERGROW), Ability.REGENERATOR,
                9, 150,
                new Stats(1,0,0,0,1,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("gastesla", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.WITHDRAW, 1),
                        new MoveLearnSetEntry(Move.ABSORB, 6),
                        new MoveLearnSetEntry(Move.STUN_SPORE, 11),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 16),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 22),
                        new MoveLearnSetEntry(Move.SYNTHESIS, 27),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, 32),
                        new MoveLearnSetEntry(Move.DISCHARGE, 36),
                        new MoveLearnSetEntry(Move.PROTECT, 41),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, 46),
                        new MoveLearnSetEntry(Move.AMNESIA, 51),
                        new MoveLearnSetEntry(Move.THUNDER, 57),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "egg"),
                        new MoveLearnSetEntry(Move.SLAM, "egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "egg"),
                        new MoveLearnSetEntry(Move.GROWTH, "egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, "egg"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE,Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_ARID))),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
