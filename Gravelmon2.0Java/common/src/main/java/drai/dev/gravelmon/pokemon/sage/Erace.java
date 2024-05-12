package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Erace extends Pokemon {
    public Erace() {
        super("Erace",
                Type.STEEL, Type.ELECTRIC,
                new Stats(70, 110, 90, 85, 130, 95),
                List.of(Ability.FILTER), Ability.ELECTRIC_SURGE,
                29, 2898,
                new Stats(0,1,0,0,2,0), 3,
                -1,
                261, ExperienceGroup.SLOW,
                70,
                200, List.of(EggGroup.UNDISCOVERED),
                List.of("Thought to be damaged beyond repair, Erace was retrofitted with state-of-the-art technology. Its new, advanced body can even withstand atmospheric re-entry."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.LOCKON,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,10),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,19),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,28),
                        new MoveLearnSetEntry(Move.IRON_HEAD,37),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,46),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,55),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,64),
                        new MoveLearnSetEntry(Move.THUNDER,73),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,82),
                        new MoveLearnSetEntry(Move.EXPLOSION,91),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,100),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.STOKE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm")
                        ),
                List.of(Label.SAGE),
                3, List.of(
                        new ItemDrop("minecraft:redstone_block",90, 3,10)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 55, 0.0005, List.of(
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.MINY,"251")
                ), List.of(),
                List.of(SpawnPreset.UNDERGROUND),
                1.4, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
