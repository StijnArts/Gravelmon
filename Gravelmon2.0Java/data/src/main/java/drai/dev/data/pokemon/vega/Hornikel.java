package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hornikel extends Pokemon {
    public Hornikel() {
        super( "Hornikel",
                Type.STEEL,
                new Stats(55	,
                        105	,
                        80	,
                        60	,
                        50	,
                        40),
                List.of(Ability.STURDY), Ability.ROCK_HEAD,
                11, 257,
                new Stats(0,2,0,0,0,1), 90,
                0.5,
                152, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Due to its ability to withstand even harsh environments, it makes a very useful companion for Pokemon Rangers."),
                List.of(new EvolutionEntry("goabalt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,7),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,16),
                        new MoveLearnSetEntry(Move.BITE,18),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,23),
                        new MoveLearnSetEntry(Move.STOMP,29),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,34),
                        new MoveLearnSetEntry(Move.METAL_SOUND,41),
                        new MoveLearnSetEntry(Move.BOUNCE,47),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,52),
                        new MoveLearnSetEntry(Move.METAL_BLAST,59),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.BOUNCE,"egg"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"egg"),
                        new MoveLearnSetEntry(Move.DARK_ROAR,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.FISSURE,"egg"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.ROAR,"egg"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"egg"),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SPARK,"egg"),
                        new MoveLearnSetEntry(Move.STARDUST,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.VENGEANCE,"egg"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS, Biome.IS_HILLS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
