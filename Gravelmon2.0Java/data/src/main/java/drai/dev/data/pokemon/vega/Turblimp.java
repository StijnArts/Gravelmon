package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Turblimp extends Pokemon {
    public Turblimp() {
        super( "Turblimp",
                Type.POISON, Type.FIRE,
                new Stats(84	,
                        50,
                        80	,
                        101,
                        115,
                        55),
                List.of(Ability.LEVITATE), Ability.OWN_TEMPO,
                7, 210,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                153, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It exales a stange gas from its mouth. The gas is powerful enough to paralyze anything that inhales it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.PROTECT,8),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,13),
                        new MoveLearnSetEntry(Move.POISON_GAS,15),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,20),
                        new MoveLearnSetEntry(Move.MIST,22),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,27),
                        new MoveLearnSetEntry(Move.TOXIC,29),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,31),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,36),
                        new MoveLearnSetEntry(Move.REFLECT,40),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,40),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,47),
                        new MoveLearnSetEntry(Move.PSYCH_UP,51),
                        new MoveLearnSetEntry(Move.TOXIN_SPRAY,58),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"egg"),
                        new MoveLearnSetEntry(Move.ERUPTION,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"egg"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"egg"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"egg"),
                        new MoveLearnSetEntry(Move.POSSESS,"egg"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"egg"),
                        new MoveLearnSetEntry(Move.SLUDGE,"egg"),
                        new MoveLearnSetEntry(Move.SOUL_BREAK,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS, Biome.IS_SKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
