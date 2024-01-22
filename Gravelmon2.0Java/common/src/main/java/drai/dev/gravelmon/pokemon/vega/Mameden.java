package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mameden extends Pokemon {
    public Mameden() {
        super( "Mameden",
                Type.ELECTRIC,
                new Stats(50	,50	,40	,70	,45,	65),
                List.of(Ability.MOTOR_DRIVE), Ability.MAGNET_PULL,
                6, 525,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                208, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS, EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("daiomu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,6),
                        new MoveLearnSetEntry(Move.SPARK,9),
                        new MoveLearnSetEntry(Move.ROLLOUT,11),
                        new MoveLearnSetEntry(Move.SCREECH,13),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,16),
                        new MoveLearnSetEntry(Move.SWIFT,20),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,22),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,26),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,29),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,34),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.EXPLOSION,41),
                        new MoveLearnSetEntry(Move.GYRO_BALL,46),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,50),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.METAL_SOUND,"egg"),
                        new MoveLearnSetEntry(Move.RECYCLE,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"egg"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"egg"),
                        new MoveLearnSetEntry(Move.SWIFT,"egg"),
                        new MoveLearnSetEntry(Move.DYNASWORD,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"egg"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.BARRIER,"egg"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"egg"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 2, 22, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.4, 0.3,
                List.of());
    }
}
