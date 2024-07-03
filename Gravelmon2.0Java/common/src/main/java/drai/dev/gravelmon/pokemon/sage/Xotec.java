package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Xotec extends Pokemon {
    public Xotec() {
        super("Xotec",
                Type.PSYCHIC, Type.STEEL,
                new Stats(100, 100,100,100,100,100),
                List.of(Ability.MAGIC_GUARD), Ability.MAGIC_BOUNCE,
                6, 358,
                new Stats(1,1,1,0,0,0), 3,
                -1,
                270, ExperienceGroup.SLOW,
                70,
                300, List.of(EggGroup.UNDISCOVERED),
                //TODO check back for pokedex entry
                List.of(""),
                List.of(),
                List.of(
                        //TODO check back for signature move
                        new MoveLearnSetEntry(Move.PAY_DAY,1),
                        new MoveLearnSetEntry(Move.HEAL_BELL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.CONFUSION,10),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,15),
                        new MoveLearnSetEntry(Move.METAL_SOUND,26),
                        new MoveLearnSetEntry(Move.HYPNOSIS,32),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,38),
                        new MoveLearnSetEntry(Move.POWER_GEM,45),
                        new MoveLearnSetEntry(Move.MOONLIGHT,50),
                        new MoveLearnSetEntry(Move.PSYCHIC,56),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,60),
                        new MoveLearnSetEntry(Move.HEALING_WISH,68),
                        new MoveLearnSetEntry(Move.IRON_HEAD,75),
                        new MoveLearnSetEntry(Move.METAL_BURST,79),
                        new MoveLearnSetEntry(Move.AMNESIA,83),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,88),
                        new MoveLearnSetEntry(Move.STORED_POWER,91),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_WILL,"tm")
                        ),
                List.of(Label.SAGE),
                3, List.of(
                        new ItemDrop("minecraft:sand",90, 3,10)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 55, 0.0005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.18, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
