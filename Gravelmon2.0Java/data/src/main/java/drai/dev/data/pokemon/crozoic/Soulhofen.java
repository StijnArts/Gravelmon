package drai.dev.data.pokemon.crozoic;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Soulhofen extends drai.dev.data.pokemon.Pokemon {
    public Soulhofen() {
        super("Shaelseum",
                Type.ROCK, Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOLID_ROCK, Ability.CURSED_BODY), Ability.SPIRITBOUND,
                13, 890,
                new Stats(0, 0, 3, 0, 0, 0), 45,
                0.0,
                225, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("shaelseum", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TOMBSTONER, 1),
                        new MoveLearnSetEntry(Move.BONEMERANG, 1),
                        new MoveLearnSetEntry(Move.SHADOW_BONE, 1),
                        new MoveLearnSetEntry(Move.BONE_RUSH, 1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, 1),
                        new MoveLearnSetEntry(Move.WIDE_GUARD, 1),
                        new MoveLearnSetEntry(Move.NATURE_POWER, 1),
                        new MoveLearnSetEntry(Move.LIQUEFACTION, 1),
                        new MoveLearnSetEntry(Move.HYDROKINESIS, 1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 1),
                        new MoveLearnSetEntry(Move.BLOCK, 1),
                        new MoveLearnSetEntry(Move.BIDE, "tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING, "tm"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.CURSE, "tm"),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.DIG, "tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE, "tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE, "tm"),
                        new MoveLearnSetEntry(Move.FISSURE, "tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, "tm"),
                        new MoveLearnSetEntry(Move.HEX, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.HYDROKINESIS, "tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.INFESTATION, "tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tm"),
                        new MoveLearnSetEntry(Move.LIQUEFACTION, "tm"),
                        new MoveLearnSetEntry(Move.MIMIC, "tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, "tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAGE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tm"),
                        new MoveLearnSetEntry(Move.ROUND, "tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tm"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tm"),
                        new MoveLearnSetEntry(Move.SNORE, "tm"),
                        new MoveLearnSetEntry(Move.SPIKES, "tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tm"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER, "tm"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, "tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tm"),
                        new MoveLearnSetEntry(Move.TOMBSTONER, "tm"),
                        new MoveLearnSetEntry(Move.TORMENT, "tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tm")),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE, Biome.IS_MOUNTAIN)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
