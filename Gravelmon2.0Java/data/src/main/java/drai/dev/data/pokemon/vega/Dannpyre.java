package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dannpyre extends Pokemon {
    public Dannpyre() {
        super( "Dannpyre",
                Type.DARK, Type.FLYING,
                new Stats(79,
                        55,
                        50,
                        104,
                        88,
                        98),
                List.of(Ability.PRANKSTER), Ability.INFILTRATOR,
                11, 147,
                new Stats(0,0,0,0,0,2), 60,
                0.5,
                155, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ANGRY_SWARM,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,10),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,12),
                        new MoveLearnSetEntry(Move.TAUNT,17),
                        new MoveLearnSetEntry(Move.WING_ATTACK,21),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,23),
                        new MoveLearnSetEntry(Move.EXSANGUINATE,28),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,33),
                        new MoveLearnSetEntry(Move.HYPNOSIS,36),
                        new MoveLearnSetEntry(Move.AIR_SLASH,42),
                        new MoveLearnSetEntry(Move.NIGHTMARE,47),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,50),
                        new MoveLearnSetEntry(Move.WORMHOLE,56),
                        new MoveLearnSetEntry(Move.SNARL,"tutor"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.UTURN,"tutor"),
                        new MoveLearnSetEntry(Move.ENCORE,"tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.DEFOG,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg"),
                        new MoveLearnSetEntry(Move.LEER,"egg"),
                        new MoveLearnSetEntry(Move.SNARL,"egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.VILE_VENOM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.GLORY_WING,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.DEFOG,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg"),
                        new MoveLearnSetEntry(Move.LEER,"egg"),
                        new MoveLearnSetEntry(Move.SNARL,"egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .cantSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
