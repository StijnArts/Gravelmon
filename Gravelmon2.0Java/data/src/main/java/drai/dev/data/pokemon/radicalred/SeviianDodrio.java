package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianDodrio extends Pokemon {
    public SeviianDodrio(String name, Aspect aspect) {
        super(name, aspect,"SeviianDodrio",
                Type.FIRE, Type.GROUND,
                new Stats(65, 125, 65, 40, 65, 110),
                List.of(Ability.ROCK_HEAD, Ability.EARLY_BIRD), Ability.ANGER_POINT,
                14, 392,
                new Stats(0, 2, 0, 0, 0, 1), 45,
                0.5,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER, 1),
                        new MoveLearnSetEntry(Move.PECK, 1),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL, 5),
                        new MoveLearnSetEntry(Move.RAGE, 1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, 1),
                        new MoveLearnSetEntry(Move.RAGE, 8),
                        new MoveLearnSetEntry(Move.BULLDOZE, 12),
                        new MoveLearnSetEntry(Move.PURSUIT, 15),
                        new MoveLearnSetEntry(Move.PLUCK, 19),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, 22),
                        new MoveLearnSetEntry(Move.AGILITY, 26),
                        new MoveLearnSetEntry(Move.DRILL_RUN, 29),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 38),
                        new MoveLearnSetEntry(Move.JUMP_KICK, 43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, 47),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 52),
                        new MoveLearnSetEntry(Move.WILLOWISP, 56),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, 60),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 64),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH, 68),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.DIG, "tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT, "tm"),
                        new MoveLearnSetEntry(Move.PLUCK, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tm"),
                        new MoveLearnSetEntry(Move.ROOST, "tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "egg"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.UTURN, "tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tm"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tm"),
                        new MoveLearnSetEntry(Move.BLAZE_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.DRILL_RUN, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.ASSURANCE, "egg"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, "egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "egg"),
                        new MoveLearnSetEntry(Move.HAZE, "egg"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN1),
                0, List.of(),
                new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_ISLAND)
    .setAntiBiomes(Biome.IS_COLD, Biome.IS_ARID)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Dodrio");
    }
}