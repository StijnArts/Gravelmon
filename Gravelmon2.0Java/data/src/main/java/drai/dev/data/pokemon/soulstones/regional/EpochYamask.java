package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochYamask extends drai.dev.data.pokemon.Pokemon {
    public EpochYamask(String name, Aspect aspect) {
        super(name, aspect, "EpochYamask",
                Type.SOUND,Type.GHOST,
                new Stats(38,
                        25,
                        45,
                        70,
                        80,
                        45),
                List.of(Ability.SOUNDPROOF,Ability.SYNCHRONIZE), Ability.VITAL_SPIRIT,
                5, 15,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("It rhythmically pounds away at its drum in a consistent pattern. It is not clear what the rhythm relates to or what it means."),
                List.of(new EvolutionEntry("epochcofagrigus", EvolutionType.ITEM_INTERACT, false, List.of(),
 List.of(), List.of(), "gravelmon:ocarina"),
                        new EvolutionEntry("epochrunerigus", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(), List.of(), "cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ENCORE,16),
                        new MoveLearnSetEntry(Move.BOOMINGBEATS,32),
                        new MoveLearnSetEntry(Move.DARKWHISPERS,4),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.DEATHWALTZ,56),
                        new MoveLearnSetEntry(Move.ROUND,12),
                        new MoveLearnSetEntry(Move.BOOMBURST,52),
                        new MoveLearnSetEntry(Move.NOISEPOLLUTION,44),
                        new MoveLearnSetEntry(Move.REVERB,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,8),
                        new MoveLearnSetEntry(Move.POWER_TRICK,60),
                        new MoveLearnSetEntry(Move.HEX,28),
                        new MoveLearnSetEntry(Move.SOULSHIELD,48),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SPIRITBARRAGE,20),
                        new MoveLearnSetEntry(Move.INSTRUCT,36),
                        new MoveLearnSetEntry(Move.ELEGY,24),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BLOODRITUAL,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.BURNINGOFUDA,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MACABREDANCE,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.ODETOJOY,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.POSSESSION,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOULSHIELD,"tm"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"egg"),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Yamask");

    }


}
