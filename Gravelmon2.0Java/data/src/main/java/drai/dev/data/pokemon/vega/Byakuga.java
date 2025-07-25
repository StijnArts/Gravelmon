package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Byakuga extends Pokemon {
    public Byakuga() {
        super( "Byakuga",
                Type.ICE, Type.ELECTRIC,
                new Stats(84	,111	,70	,55,	65,	130),
                List.of(Ability.RIVALRY), Ability.MOTOR_DRIVE,
                19, 963,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                212, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DARK_PULSE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.DARK_ROAR,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,7),
                        new MoveLearnSetEntry(Move.DARK_ROAR,11),
                        new MoveLearnSetEntry(Move.CHARM,14),
                        new MoveLearnSetEntry(Move.BITE,20),
                        new MoveLearnSetEntry(Move.HAIL,24),
                        new MoveLearnSetEntry(Move.ICY_WIND,27),
                        new MoveLearnSetEntry(Move.ICE_FANG,30),
                        new MoveLearnSetEntry(Move.FROST_BREATH,34),
                        new MoveLearnSetEntry(Move.ROAR,39),
                        new MoveLearnSetEntry(Move.CRUNCH,43),
                        new MoveLearnSetEntry(Move.FROSTBITE,53),
                        new MoveLearnSetEntry(Move.HAZE,61),
                        new MoveLearnSetEntry(Move.BLIZZARD,68),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.VILE_VENOM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tutor"),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,"tutor"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tutor"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PICK,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.WORMHOLE,"tutor"),
                        new MoveLearnSetEntry(Move.BLACK_HOLE,"tutor"),
                        new MoveLearnSetEntry(Move.ASSIST,"egg"),
                        new MoveLearnSetEntry(Move.CHROME_BALL,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.ICING,"egg"),
                        new MoveLearnSetEntry(Move.LEER,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.SHEER_COLD,"egg"),
                        new MoveLearnSetEntry(Move.SNARL,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.SWIFT,"egg"),
                        new MoveLearnSetEntry(Move.TORMENT,"egg"),
                        new MoveLearnSetEntry(Move.VENGEANCE,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(54)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
