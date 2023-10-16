package com.gravelmon.common.gravelmon.pokemon.infinity.regional;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class EhgoShellder extends EghoPokemon {
    public EhgoShellder(int dexNo) {
        super(dexNo,"EhgoShellder",
                Type.WATER, Type.STEEL,
                new Stats(52, 40, 70, 55, 57, 31),
                List.of(Ability.IRON_BARBS), Ability.SUPER_LUCK,
                12, 410,
                new Stats(0,0,1,0,1,0), 190,
                0.875,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("This Shellder can often times be found attached to a Slowbro. When removed and left alone, it will hunt down other sea creatures to feed on."),
                List.of(new EvolutionEntry("skulkraken", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,9),
                        new MoveLearnSetEntry(Move.METAL_SOUND,13),
                        new MoveLearnSetEntry(Move.BUBBLE,15),
                        new MoveLearnSetEntry(Move.ABSORB,17),
                        new MoveLearnSetEntry(Move.AQUA_RING,19),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,23),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,27),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,33),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,36),
                        new MoveLearnSetEntry(Move.SPITE,38),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,42),
                        new MoveLearnSetEntry(Move.POISON_FANG,45),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,52),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.BELCH,"egg"),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg")
                        ),
                List.of(Label.GEN1,Label.INFINITY),
                2, List.of(
                        new ItemDrop("minecraft:iron_nugget",50, 1,2)
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 20, 34, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FREEZING))),
                List.of(SpawnPreset.UNDERWATER),
                0.23, 0.3,
                List.of());
        this.setLangFileName("Shellder");
        this.setPortraitXYZ(0,1.8,0);
                this.setPreEvolution("shellder");
    }
}
