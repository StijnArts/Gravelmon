package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianSwablu extends Pokemon {
    public AyreianSwablu(String name, Aspect aspect) {
        super(name, aspect,"AyreianSwablu",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(55,70,55,55,70,75),
                List.of(Ability.LEVITATE, Ability.FLUFFY), Ability.GUTS,
                4, 12,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.DRAGON),
                List.of("While cute and seemingly docile, it angers really quickly. They nest in areas most often hit by thunderstorms."),
                List.of(new EvolutionEntry("ayreianaltaria", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.GUST, 1),
                        new MoveLearnSetEntry(Move.GROWL, 3),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 6),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 9),
                        new MoveLearnSetEntry(Move.TWISTER, 13),
                        new MoveLearnSetEntry(Move.ROUND, 16),
                        new MoveLearnSetEntry(Move.SPARK, 19),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 22),
                        new MoveLearnSetEntry(Move.PLUCK, 25),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, 28),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE, 34),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 39),
                        new MoveLearnSetEntry(Move.COTTON_GUARD, 42),
                        new MoveLearnSetEntry(Move.PERISH_SONG, 48),

                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tutor"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE, "tutor"),
                        new MoveLearnSetEntry(Move.FLY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),

                        new MoveLearnSetEntry(Move.AGILITY, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, "egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE, "egg"),
                        new MoveLearnSetEntry(Move.HAZE, "egg"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "egg"),
                        new MoveLearnSetEntry(Move.POWER_SWAP, "egg"),
                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.RAGE, "egg"),
                        new MoveLearnSetEntry(Move.ROOST, "egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "egg")
                ),
                List.of(Label.GEN3,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO, Biome.IS_CHERRY_GROVE, Biome.IS_VOLCANIC)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Swablu");
        setCanFly(true);
    }
}
