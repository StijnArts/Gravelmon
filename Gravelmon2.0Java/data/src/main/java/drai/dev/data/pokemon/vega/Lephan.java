package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lephan extends Pokemon {
    public Lephan() {
        super( "Lephan",
                Type.GROUND,
                new Stats(49	,
                        50	,
                        50	,
                        60,
                        71	,
                        35),
                List.of(Ability.SYNCHRONIZE), Ability.INSOMNIA,
                13, 934,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                86, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is powerful enough to carry a person on its back. Apparently, the ride it gives is very comfortable."),
                List.of(new EvolutionEntry("ganerth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,9),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,14),
                        new MoveLearnSetEntry(Move.MUD_SHOT,18),
                        new MoveLearnSetEntry(Move.SPIKES,22),
                        new MoveLearnSetEntry(Move.PALEOBREATH,27),
                        new MoveLearnSetEntry(Move.SANDBLAST,31),
                        new MoveLearnSetEntry(Move.IMPRISON,35),
                        new MoveLearnSetEntry(Move.SONIC_SAND,40),
                        new MoveLearnSetEntry(Move.TRICK,44),
                        new MoveLearnSetEntry(Move.STONE_EDGE,48),
                        new MoveLearnSetEntry(Move.FISSURE,53),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,57),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.BURROW,"egg"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.GRAVITY_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                        new MoveLearnSetEntry(Move.RECOVER,"egg"),
                        new MoveLearnSetEntry(Move.REFLECT,"egg"),
                        new MoveLearnSetEntry(Move.ROAR,"egg"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.STARDUST,"egg"),
                        new MoveLearnSetEntry(Move.STOMP,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
