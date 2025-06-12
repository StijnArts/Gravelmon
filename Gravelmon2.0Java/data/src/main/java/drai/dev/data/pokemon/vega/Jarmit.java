package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jarmit extends Pokemon {
    public Jarmit() {
        super( "Jarmit",
                Type.GHOST,
                new Stats(75	,
                        55	,
                        95	,
                        55	,
                        95	,
                        20),
                List.of(Ability.STENCH), Ability.STENCH,
                17, 656,
                new Stats(0,1,0,1,0,0), 45,
                0.5,
                168, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("It likes to hide in the shadows. It is usually asleep, but no one can stop it once it starts an uproar."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.SPITE,5),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,10),
                        new MoveLearnSetEntry(Move.ENDURE,14),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,20),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.DEEP_YAWN,29),
                        new MoveLearnSetEntry(Move.LIFE_DRAIN,34),
                        new MoveLearnSetEntry(Move.GRUDGE,40),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,44),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,48),
                        new MoveLearnSetEntry(Move.SLACK_OFF,54),
                        new MoveLearnSetEntry(Move.POSSESS,60),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.DIZZY_WHIRL,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.LICK,"egg"),
                        new MoveLearnSetEntry(Move.MAGNUM_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.MEDITATE,"egg"),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                        new MoveLearnSetEntry(Move.NIGHTMARE,"egg"),
                        new MoveLearnSetEntry(Move.RAGE,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.TONEDEAF,"egg"),
                        new MoveLearnSetEntry(Move.VENGEANCE,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(32)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .cantSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
