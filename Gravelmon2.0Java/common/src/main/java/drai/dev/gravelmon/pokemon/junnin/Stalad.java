package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Stalad extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stalad() {
        super("Stalad",
                Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STURDY), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Bide Normal - Flash Normal 4 Rock ThrowSTAB Rock 8 Defense Curl Normal 12 Spikes Ground 15 Magnitude Ground 19 Rock Polish Rock 23 Explosion Normal 27 Rock SlideSTAB Rock 31 Rock TombSTAB Rock 35 Power GemSTAB Rock 39 Echoed Voice Normal 43 Smack DownSTAB Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,4),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,8),
                        new MoveLearnSetEntry(Move.SPIKES,12),
                        new MoveLearnSetEntry(Move.MAGNITUDE,15),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,19),
                        new MoveLearnSetEntry(Move.EXPLOSION,23),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,27),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,31),
                        new MoveLearnSetEntry(Move.POWER_GEM,35),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,39),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,43),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stalad");

    }


}