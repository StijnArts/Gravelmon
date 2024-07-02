package drai.dev.gravelmon.pokemon.infinity;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Kablowfish extends Pokemon {
    public Kablowfish() {
        super("Kablowfish",
                Type.WATER, Type.STEEL,
                new Stats(75, 95, 130, 75, 85, 65),
                List.of(Ability.POISON_POINT, Ability.SWIFT_SWIM), Ability.INTIMIDATE,
                17, 600,
                new Stats(0,1,2,0,0,0), 45,
                0.5,
                119, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.WATER_2),
                List.of("The inside of Kablowfish's body is so highly pressurized that just touching it can cause it to burst, releasing a large cloud of poisonous gas."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.IRON_TAIL,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.HARDEN,9),
                        new MoveLearnSetEntry(Move.MINIMIZE,9),
                        new MoveLearnSetEntry(Move.WATER_GUN,13),
                        new MoveLearnSetEntry(Move.ROLLOUT,17),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,21),
                        new MoveLearnSetEntry(Move.STOCKPILE,25),
                        new MoveLearnSetEntry(Move.SPIT_UP,25),
                        new MoveLearnSetEntry(Move.REVENGE,29),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.GYRO_BALL,37),
                        new MoveLearnSetEntry(Move.POISON_TAIL,43),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,47),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,51),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,55),
                        new MoveLearnSetEntry(Move.POISON_JAB,59),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,63),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,67),
                        new MoveLearnSetEntry(Move.IRON_HEAD,73),
                        new MoveLearnSetEntry(Move.METAL_BURST,80),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.ASTONISH,"egg"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg")
                        ),
                List.of(Label.INFINITY),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 44, 56, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_LUKEWARM_OCEAN,Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.34, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setPreEvolution("qwilfish");
        addAdditionalEvolution("qwilfish", new EvolutionEntry("kablowfish", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"\"cobblemon:metal_coat\""))));
    }
}
