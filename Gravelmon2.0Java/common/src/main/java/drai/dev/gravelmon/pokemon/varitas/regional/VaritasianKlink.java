package drai.dev.gravelmon.pokemon.varitas.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class VaritasianKlink extends drai.dev.gravelmon.pokemon.Pokemon {
    public VaritasianKlink(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Klink",
                Type.STEEL, Type.GROUND,
                new Stats(40,
                        55,
                        70,
                        45,
                        60,
                        30),
                List.of(Ability.PLUS,Ability.MINUS,Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                3, 165,
                new Stats(0,0,1,0,0,0), 130,
                0.0,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("At the price of one minigear atrophying, it has now developed a somewhat soft, flexible outer membrane. Though it often floats, its seems to enjoy rolling along the ground, as it helps it both move faster and generate energy faster."),
                List.of(new EvolutionEntry("varitasianklang", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.CHARGE,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,11),
                        new MoveLearnSetEntry(Move.GEAR_GRIND,16),
                        new MoveLearnSetEntry(Move.BIND,21),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,26),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,31),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,36),
                        new MoveLearnSetEntry(Move.SCREECH,39),
                        new MoveLearnSetEntry(Move.DISCHARGE,42),
                        new MoveLearnSetEntry(Move.METAL_SOUND,45),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,48),
                        new MoveLearnSetEntry(Move.LOCKON,50),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,54),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,57),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm")                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 30, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Klink");

    }


}
