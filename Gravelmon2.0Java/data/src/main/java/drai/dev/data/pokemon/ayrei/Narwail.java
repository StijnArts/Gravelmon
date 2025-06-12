package drai.dev.data.pokemon.ayrei;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Narwail extends drai.dev.data.pokemon.Pokemon {
    public Narwail() {
        super("Narwail",
                Type.GHOST,Type.ICE,
                new Stats(100,
                        90,
                        100,
                        50,
                        90,
                        105),
                List.of(Ability.THICK_FAT,Ability.PERISH_BODY), null,
                23, 120,
                new Stats(0,0,0,0,0,3), 75,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("The furious spirits of hunted Dewgong have been reborn into Narwail. The cries of the wraiths swirling inside is the last thing heard by its prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_TAIL,39),
                        new MoveLearnSetEntry(Move.ENCORE,13),
                        new MoveLearnSetEntry(Move.POLTERGEIST,65),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,49),
                        new MoveLearnSetEntry(Move.BLIZZARD,69),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,27),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,1),
                        new MoveLearnSetEntry(Move.FLIP_TURN,33),
                        new MoveLearnSetEntry(Move.AQUA_RING,23),
                        new MoveLearnSetEntry(Move.AQUA_JET,31),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,61),
                        new MoveLearnSetEntry(Move.ICY_WIND,11),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,7),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.DISCORDANTSHRIEK,74),
                        new MoveLearnSetEntry(Move.SHATTERBLADE,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.SPECTRALHORDE,0),
                        new MoveLearnSetEntry(Move.ICE_SHARD,17),
                        new MoveLearnSetEntry(Move.PERISH_SONG,45),
                        new MoveLearnSetEntry(Move.ICE_BEAM,55),
                        new MoveLearnSetEntry(Move.HAIL,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(39)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Narwail");

    }


}
