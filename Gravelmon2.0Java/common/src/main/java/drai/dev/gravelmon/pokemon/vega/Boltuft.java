package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Boltuft extends Pokemon {
    public Boltuft() {
        super( "Boltuft",
                Type.STEEL,
                new Stats(64,	103,	59,	106,	59,	102),
                List.of(Ability.GALE_WINGS), Ability.VOLT_ABSORB,
                16, 315,
                new Stats(0,0,0,0,0,2), 25,
                0.5,
                196, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.PLUCK,11),
                        new MoveLearnSetEntry(Move.SPARK,15),
                        new MoveLearnSetEntry(Move.UPROAR,19),
                        new MoveLearnSetEntry(Move.ROOST,24),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,30),
                        new MoveLearnSetEntry(Move.AGILITY,36),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,43),
                        new MoveLearnSetEntry(Move.DISCHARGE,48),
                        new MoveLearnSetEntry(Move.HURRICANE,55),
        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                new MoveLearnSetEntry(Move.AGILITY,"tm"),
                new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                new MoveLearnSetEntry(Move.FACADE,"tm"),
                new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                new MoveLearnSetEntry(Move.SWIFT,"tm"),
                new MoveLearnSetEntry(Move.AIR_CUTTER,"tm"),
                new MoveLearnSetEntry(Move.ENDURE,"tm"),
                new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                new MoveLearnSetEntry(Move.UTURN,"tm"),
                new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                new MoveLearnSetEntry(Move.REST,"tm"),
                new MoveLearnSetEntry(Move.EERIE_IMPULSE,"tm"),
                new MoveLearnSetEntry(Move.FLY,"tm"),
                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                new MoveLearnSetEntry(Move.THUNDER,"tm"),
                new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 49, 9.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanFly(true);
    }
}
