package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Casanauta extends drai.dev.data.pokemon.Pokemon {
    public Casanauta() {
        super("Casanauta",
                Type.POISON, Type.PSYCHIC,
                new Stats(70,
                        100,
                        60,
                        50,
                        95,
                        125),
                List.of(Ability.RIVALRY,Ability.SUCTION_CUPS,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                10, 165,
                new Stats(0,0,0,0,0,2), 90,
                1.0,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_3),
                List.of("As part of its courtship ritual, it present a bouquet of torn-off Tentacruel tentacles as a gift to a Sirenara. The more potent the venom, the more likely she will accept the Casanauta's offer."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.CAPTIVATE,1),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,1),
                        new MoveLearnSetEntry(Move.TOXIC,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,1),
                        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.OCTAZOOKA,1),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.CROSS_POISON,1),
                        new MoveLearnSetEntry(Move.CUDDLE,1),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,1),

                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.ALLURINGVOICE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
