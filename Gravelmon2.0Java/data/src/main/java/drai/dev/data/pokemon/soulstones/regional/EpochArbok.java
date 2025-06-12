package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochArbok extends drai.dev.data.pokemon.Pokemon {
    public EpochArbok(String name, Aspect aspect) {
        super(name, aspect, "EpochArbok",
                Type.GROUND,Type.POISON,
                new Stats(55,
                        110,
                        69,
                        100,
                        65,
                        69),
                List.of(Ability.CORROSION,Ability.SAND_SPIT), Ability.LEECHINGFANGS,
                18, 650,
                new Stats(0,2,0,0,0,0), 100,
                0.5,
                153, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("The poison of an Arbok is so corrosive that it can melt steel beams. It is able to manipulate the face on its body into different shapes to fool its prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RATTLETAIL,1),
                        new MoveLearnSetEntry(Move.CONTINENTALRIFT,58),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.DIG,37),
                        new MoveLearnSetEntry(Move.THOUSAND_WAVES,47),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,62),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,51),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,17),
                        new MoveLearnSetEntry(Move.CRUNCH,41),
                        new MoveLearnSetEntry(Move.SANDJET,7),
                        new MoveLearnSetEntry(Move.HYPNOSIS,28),
                        new MoveLearnSetEntry(Move.COIL,44),
                        new MoveLearnSetEntry(Move.TOXIC,44),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,54),
                        new MoveLearnSetEntry(Move.VENOMDRAIN,33),
                        new MoveLearnSetEntry(Move.BULLDOZE,24),
                        new MoveLearnSetEntry(Move.POISON_FANG,20),
                        new MoveLearnSetEntry(Move.STEAMROLLER,14),
                        new MoveLearnSetEntry(Move.POISON_STING,4),
                        new MoveLearnSetEntry(Move.ALLERGY,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENTGLARE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.CRUELWHIP,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGONBLOOD,"tm"),
                        new MoveLearnSetEntry(Move.DUNEBLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GOBLINSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.MINDDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.QUICKSAND,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_DESERT)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Arbok");

    }


}
