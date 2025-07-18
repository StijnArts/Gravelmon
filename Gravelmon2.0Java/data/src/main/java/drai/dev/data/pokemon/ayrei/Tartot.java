package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tartot extends Pokemon {
    public Tartot() {
        super("Tartot",
                Type.WATER, Type.NORMAL,
                new Stats(100,40,70,5,75,70),
                List.of(Ability.WATER_BUBBLE, Ability.UNAWARE), Ability.FILTER,
                3, 24,
                new Stats(1,0,0,0,0,0), 60,
                0.5,
                68, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_2, EggGroup.FIELD),
                List.of("The bubbly coating encapsulating its body is nigh-impenetrable. Scientists have been studying its behaviour in different environments for quite some time."),
                List.of(new EvolutionEntry("teranigrade", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_TEMPERATE.getId() + ":" + Biome.IS_TEMPERATE.getName()),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")),
                                List.of()),
                        new EvolutionEntry("teranigrade", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_ARID.getId() + ":" + Biome.IS_ARID.getName()),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")),
                                List.of(Aspect.FIRE)),
                        new EvolutionEntry("teranigrade", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_COLD.getId() + ":" + Biome.IS_COLD.getName()),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")),
                                List.of(Aspect.ICE)),
                        new EvolutionEntry("teranigrade", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_NETHER.getId() + ":" + Biome.IS_NETHER.getName()),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")),
                                List.of(Aspect.POISON))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 1),
                        new MoveLearnSetEntry(Move.HAZE, 15),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 18),
                        new MoveLearnSetEntry(Move.AQUA_RING, 21),
                        new MoveLearnSetEntry(Move.BODY_SLAM, 24),
                        new MoveLearnSetEntry(Move.PROTECT, 27),
                        new MoveLearnSetEntry(Move.SURF, 30),
                        new MoveLearnSetEntry(Move.ICY_WIND, 33),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, 36),
                        new MoveLearnSetEntry(Move.REST, 39),
                        new MoveLearnSetEntry(Move.AMNESIA, 44),
                        new MoveLearnSetEntry(Move.WATER_SPOUT, 49),
                        new MoveLearnSetEntry(Move.RECOVER, 54),

                        new MoveLearnSetEntry(Move.AMNESIA, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE, "tutor"),
                        new MoveLearnSetEntry(Move.BLIZZARD, "tutor"),
                        new MoveLearnSetEntry(Move.BLOCK, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE, "tutor"),
                        new MoveLearnSetEntry(Move.BRINE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DIVE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HAIL, "tutor"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.WATERFALL, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL, "tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tutor")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(4)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);

    }
}
