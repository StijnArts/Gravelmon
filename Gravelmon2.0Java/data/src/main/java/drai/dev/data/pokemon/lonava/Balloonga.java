package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Balloonga extends drai.dev.data.pokemon.Pokemon {
    public Balloonga() {
        super("Balloonga",
                Type.ICE, Type.FLYING,
                new Stats(55,
                        55,
                        55,
                        45,
                        45,
                        70),
                List.of(Ability.THICK_FAT,Ability.REFRIGERATE,Ability.AIRBORNE), Ability.AIRBORNE,
                9, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("Their balloons consist of an elastic film made from ice and filled with internally-converted helium. As a result, Balloonga can fly!"),
                List.of(new EvolutionEntry("aeroluga", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.AIRBUBBLE,1),
                        new MoveLearnSetEntry(Move.TAILWIND,3),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,6),
                        new MoveLearnSetEntry(Move.HAZE,9),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,12),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.SPIT_UP,18),
                        new MoveLearnSetEntry(Move.ICE_BALL,21),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,24),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,27),
                        new MoveLearnSetEntry(Move.IRON_HEAD,30),
                        new MoveLearnSetEntry(Move.ICE_BEAM,33),
                        new MoveLearnSetEntry(Move.DIVE,36),
                        new MoveLearnSetEntry(Move.EXPLOSION,42),
                        new MoveLearnSetEntry(Move.SHEER_COLD,48),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.COLDSNAP,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm")                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

        setCanFly(true);

    }


}
