package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Velopard extends drai.dev.data.pokemon.Pokemon {
    public Velopard() {
        super("Velopard",
                Type.ICE, Type.ELECTRIC,
                new Stats(70,
                        72,
                        50,
                        105,
                        70,
                        118),
                List.of(Ability.SNOW_CLOAK), Ability.SNOW_CLOAK,
                17, 165,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                177, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its roar can create thunderbolts, so it lives high up in the mountains to avoid forest fires. It is an extremely furtive Pokemon and its cubs are never seen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.SCREECH,10),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,15),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,22),
                        new MoveLearnSetEntry(Move.ROAR,26),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,37),
                        new MoveLearnSetEntry(Move.MINIMIZE,41),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,45),
                        new MoveLearnSetEntry(Move.BLIZZARD,50),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,53),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,58),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,64),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Velopard");

    }


}
