package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianButterfree extends Pokemon {
    public AyreianButterfree(String name, Aspect aspect) {
        super(name, aspect,"AyreianButterfree",
                Type.BUG, Type.ELECTRIC,
                new Stats(70,55,85,85,105,70),
                List.of(Ability.SURGE_SURFER), Ability.COMPOUND_EYES,
                17, 320,
                new Stats(0,0,0,1,2,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It uses its wings to stun it's prey for an easy catch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 1),
                        new MoveLearnSetEntry(Move.CHARGE, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.PURSUIT, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 5),
                        new MoveLearnSetEntry(Move.ELECTROWEB, 8),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 13),
                        new MoveLearnSetEntry(Move.PROTECT, 17),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 22),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, 25),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, 28),
                        new MoveLearnSetEntry(Move.TAILWIND, 30),
                        new MoveLearnSetEntry(Move.RAGE_POWDER, 34),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, 36),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 40),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE, 44),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE, 48),

                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, "tutor"),
                        new MoveLearnSetEntry(Move.AIR_SLASH, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BATON_PASS, "tutor"),
                        new MoveLearnSetEntry(Move.BIDE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFUSION, "tutor"),
                        new MoveLearnSetEntry(Move.CURSE, "tutor"),
                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, "tutor"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FLASH, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GUST, "tutor"),
                        new MoveLearnSetEntry(Move.HARDEN, "tutor"),
                        new MoveLearnSetEntry(Move.HEADBUTT, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HURRICANE, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.INFESTATION, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.MIMIC, "tutor"),
                        new MoveLearnSetEntry(Move.MORNING_SUN, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.NIGHTMARE, "tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_POWDER, "tutor"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYBEAM, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.PSYWAVE, "tutor"),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.RAGE, "tutor"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SILVER_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.STRING_SHOT, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.STUN_SPORE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SUPERSONIC, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TACKLE, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.TELEPORT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TWISTER, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.WHIRLWIND, "tutor")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Butterfree");
        setCanFly(true);
    }
}
