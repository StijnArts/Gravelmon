package drai.dev.data.pokemon.myth.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MythianNoivern extends Pokemon {
    public MythianNoivern(String name, Aspect aspect) {
        super(name, aspect,"MythianNoivern",
                Type.SOUND, Type.ICE,
                new Stats(95,50,40,150,115,110),
                List.of(Ability.SNOW_WARNING, Ability.SNOW_CLOAK), Ability.ANTICIPATION,
                15, 850,
                new Stats(0, 0, 0, 0, 2, 0), 45,
                0.5,
                187, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.DRAGON, EggGroup.FLYING),
                List.of("The ultrasonic waves it emits from its ears can reduce a large boulder to pebbles. It swoops out of the dark to attack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 1),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 1),
                        new MoveLearnSetEntry(Move.MOONLIGHT, 1),
                        new MoveLearnSetEntry(Move.POPSHOT, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GUST, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 12),
                        new MoveLearnSetEntry(Move.ICY_WIND, 16),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 20),
                        new MoveLearnSetEntry(Move.BITE, 24),
                        new MoveLearnSetEntry(Move.SONAR_PULSE, 28),
                        new MoveLearnSetEntry(Move.TWISTER, 32),
                        new MoveLearnSetEntry(Move.AURORA_BEAM, 36),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 40),
                        new MoveLearnSetEntry(Move.GLACIER_PULSE, 44),
                        new MoveLearnSetEntry(Move.ROOST, 48),
                        new MoveLearnSetEntry(Move.SOUNDWAVE, 53),
                        new MoveLearnSetEntry(Move.HURRICANE, 56),
                        new MoveLearnSetEntry(Move.BOOMBURST, 60)
                ),
                List.of(Label.RADICAL_RED, Label.GEN6),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 61, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GLACIAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Noivern");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
        this.setCanFly(true);
        addAdditionalEvolution("noibat", new EvolutionEntry("noivern mythian", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"48"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_GLACIAL.getId() + ":" + Biome.IS_GLACIAL.getName()))));
    }
}
