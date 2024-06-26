package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianAriados extends Pokemon {
    public AyreianAriados(String name, Aspect aspect) {
        super(name, aspect,"AyreianAriados",
                Type.BUG, Type.DARK,
                new Stats(70,90,65,115,95,65),
                List.of(Ability.MOLD_BREAKER, Ability.LONG_REACH), Ability.SNIPER,
                11, 335,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.BUG),
                List.of("It can blast a blinding light from its back to scare away predators."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1),
                        new MoveLearnSetEntry(Move.PURSUIT, 1),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 5),
                        new MoveLearnSetEntry(Move.INFESTATION, 8),
                        new MoveLearnSetEntry(Move.FLASH, 12),
                        new MoveLearnSetEntry(Move.BUG_BITE, 15),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 19),
                        new MoveLearnSetEntry(Move.SNARL, 22),
                        new MoveLearnSetEntry(Move.SLASH, 25),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, 29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 32),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 37),
                        new MoveLearnSetEntry(Move.XSCISSOR, 41),
                        new MoveLearnSetEntry(Move.PSYCHIC, 46),
                        new MoveLearnSetEntry(Move.DARK_PULSE, 50),
                        new MoveLearnSetEntry(Move.SPIKES, 55),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES, 55),
                        new MoveLearnSetEntry(Move.STICKY_WEB, 58),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, 63),

                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.INFESTATION, "tutor"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tutor"),

                        new MoveLearnSetEntry(Move.PSYBEAM, "egg"),
                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.SONIC_BOOM, "egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS, "egg"),
                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES, "egg"),
                        new MoveLearnSetEntry(Move.TWINEEDLE, "egg"),
                        new MoveLearnSetEntry(Move.ELECTROWEB, "egg"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER, "egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN, "egg"),
                        new MoveLearnSetEntry(Move.LUNGE, "egg")
                ),
                List.of(Label.VANGUARD, Label.GEN2),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 53, 0.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.25, 0.3,
                List.of());
        this.setLangFileName("Ariados");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
