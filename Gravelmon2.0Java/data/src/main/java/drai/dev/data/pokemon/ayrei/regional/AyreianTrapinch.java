package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianTrapinch extends Pokemon {
    public AyreianTrapinch(String name, Aspect aspect) {
        super(name, aspect,"AyreianTrapinch",
                Type.BUG, Type.POISON,
                new Stats(45,35,45,10,65,45),
                List.of(Ability.CORROSION), Ability.CORROSION,
                7, 150,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.DRAGON),
                List.of("The magma in its body reaches 2,200 degrees Fahrenheit. Its hump gets smaller when it uses Fire-type moves."),
                List.of(new EvolutionEntry("ayreianvibrava", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 1),
                        new MoveLearnSetEntry(Move.ASTONISH, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 1),
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY, 12),
                        new MoveLearnSetEntry(Move.SLUDGE, 16),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 20),
                        new MoveLearnSetEntry(Move.SNARL, 24),
                        new MoveLearnSetEntry(Move.VENOSHOCK, 28),
                        new MoveLearnSetEntry(Move.ICY_WIND, 32),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 38),
                        new MoveLearnSetEntry(Move.TOXIC, 44),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.AIR_SLASH, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLIZZARD, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE, "tutor"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FLY, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.MUD_SHOT, "tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tutor"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT, "tutor"),
                        new MoveLearnSetEntry(Move.SCREECH, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),

                        new MoveLearnSetEntry(Move.QUICK_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.GUST, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER, "egg"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "egg"),
                        new MoveLearnSetEntry(Move.FEINT, "egg"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION, "egg")
                ),
                List.of(Label.GEN3,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
        this.setLangFileName("Trapinch");
    }
}
