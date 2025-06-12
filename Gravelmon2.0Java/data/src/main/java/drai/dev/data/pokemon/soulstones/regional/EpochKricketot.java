package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochKricketot extends drai.dev.data.pokemon.Pokemon {
    public EpochKricketot(String name, Aspect aspect) {
        super(name, aspect, "EpochKricketot",
                Type.BUG,Type.SOUND,
                new Stats(47,
                        20,
                        30,
                        36,
                        50,
                        47),
                List.of(Ability.SHED_SKIN,Ability.SWARM), Ability.VIRTUOSO,
                3, 22,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("During the evening, they will put on concerts for other wild Pokemon in the habitat."),
                List.of(new EvolutionEntry("epochkricketune", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(
                        new MoveLearnSetEntry(Move.SWEETNOTHINGS,9),
                        new MoveLearnSetEntry(Move.RALLENTANDO,22),
                        new MoveLearnSetEntry(Move.MIND_READER,26),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,30),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,34),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.BOOMBURST,56),
                        new MoveLearnSetEntry(Move.HALLELUJAH,14),
                        new MoveLearnSetEntry(Move.FAESBLESSING,46),
                        new MoveLearnSetEntry(Move.REVERB,1),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,42),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,5),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,44),
                        new MoveLearnSetEntry(Move.DEFEND_ORDER,42),
                        new MoveLearnSetEntry(Move.SILVER_WIND,18),
                        new MoveLearnSetEntry(Move.PERISH_SONG,50),
                        new MoveLearnSetEntry(Move.INSTRUCT,38),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGY,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.FLUTTER,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HIVEMIND,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NECTARTAP,"tm"),
                        new MoveLearnSetEntry(Move.ODETOJOY,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWSCALES,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.STACCATO,"egg"),
                        new MoveLearnSetEntry(Move.LUNAR_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"egg"),
                        new MoveLearnSetEntry(Move.ELEGY,"egg"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kricketot");

    }


}
