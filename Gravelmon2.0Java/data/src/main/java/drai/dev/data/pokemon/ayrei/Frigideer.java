package drai.dev.data.pokemon.ayrei;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Frigideer extends drai.dev.data.pokemon.Pokemon {
    public Frigideer() {
        super("Frigideer",
                Type.NORMAL,Type.ICE,
                new Stats(83,
                        125,
                        102,
                        65,
                        65,
                        65),
                List.of(Ability.INTIMIDATE,Ability.FRISK), null,
                14, 712,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Loyal to a fault, it and Rapidash were in a constant rivarly as the preferred mount of kings. The metal that adorns its body is heatproof."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,38),
                        new MoveLearnSetEntry(Move.ME_FIRST,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,23),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.STOMP,13),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,50),
                        new MoveLearnSetEntry(Move.JUMP_KICK,47),
                        new MoveLearnSetEntry(Move.HYPNOSIS,10),
                        new MoveLearnSetEntry(Move.AVALANCHE,33),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43),
                        new MoveLearnSetEntry(Move.MOUNTAIN_GALE,0),
                        new MoveLearnSetEntry(Move.MUDSLAP,16),
                        new MoveLearnSetEntry(Move.LUNGE,55),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,21),
                        new MoveLearnSetEntry(Move.ICE_SHARD,7),
                        new MoveLearnSetEntry(Move.BULK_UP,27),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.RAGE,"egg"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"egg")),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PEAK)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Frigideer");

    }


}
