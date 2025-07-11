package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Olynx extends drai.dev.data.pokemon.Pokemon {
    public Olynx() {
        super("Olynx",
                Type.GROUND,
                new Stats(89,
                        104,
                        70,
                        70,
                        80,
                        104),
                List.of(Ability.SAND_VEIL), Ability.SAND_RUSH,
                18, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                233, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SOLIDKICK,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                new MoveLearnSetEntry(Move.MUD_SPORT,4),
                new MoveLearnSetEntry(Move.MAGNITUDE,7),
                new MoveLearnSetEntry(Move.ROAR,10),
                new MoveLearnSetEntry(Move.DIG,14),
                new MoveLearnSetEntry(Move.HEAVY_SLAM,21),
                new MoveLearnSetEntry(Move.SAND_TOMB,27),
                new MoveLearnSetEntry(Move.CRUNCH,30),
                new MoveLearnSetEntry(Move.SANDSHOT,37),
                new MoveLearnSetEntry(Move.REST,39),
                new MoveLearnSetEntry(Move.EARTHQUAKE,44),
                new MoveLearnSetEntry(Move.FISSURE,51),
                new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                new MoveLearnSetEntry(Move.REST,"tm"),
                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                new MoveLearnSetEntry(Move.ROUND,"tm"),
                new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                new MoveLearnSetEntry(Move.DIG,"tm"),
                new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                new MoveLearnSetEntry(Move.FACADE,"tm"),
                new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                new MoveLearnSetEntry(Move.SWIFT,"tm"),
                new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm")             ),
        List.of(Label.NOSTO),
                0, List.of(
        ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Olynx");

    }


}
