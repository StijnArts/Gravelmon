package com.gravelmon.common.gravelmon.pokemon.infinity.regional;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class EhgoLotad extends EghoPokemon {
    public EhgoLotad(int dexNo) {
        super(dexNo,"EhgoLotad",
                Type.FIRE, Type.STEEL,
                new Stats(40, 30, 40, 50, 30, 30),
                List.of(Ability.HARVEST), Ability.DRY_SKIN,
                6, 80,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                44, ExperienceGroup.MEDIUM_SLOW,
                70,
                39, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("Lotad were used to carry ingredients for chefs many years ago, eventually adapting to serve other purposes in the kitchen. Lotad is a naturally occurring stove top."),
                List.of(new EvolutionEntry("egholombre", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,3),
                        new MoveLearnSetEntry(Move.RECYCLE,5),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.STOCKPILE,11),
                        new MoveLearnSetEntry(Move.REFRESH,13),
                        new MoveLearnSetEntry(Move.INCINERATE,15),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,19),
                        new MoveLearnSetEntry(Move.IRON_HEAD,23),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,31),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,37),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,45),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CINDER_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,"egg"),
                        new MoveLearnSetEntry(Move.SPIKES,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN3),
                4, List.of(
                        new ItemDrop("minecraft:egg",50, 1,2)
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 3, 22, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.LAVA_SURFACE),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Lotad");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
