package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class GutsyCastform extends Pokemon {
    public GutsyCastform(int dexNo) {
        super(dexNo,"GutsyCastform",
                Type.FIGHTING,
                new Stats(70, 70, 70, 70, 70, 70),
                List.of(Ability.FORECAST), Ability.FORECAST,
                3, 8,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FAIRY, EggGroup.AMORPHOUS),
                List.of("Castform are artificial Pokemon created in the Hoenn region. Their biology is easily affected by weather and so they change form to better adapt to the weather present."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,10),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,10),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.HEADBUTT,15),
                        new MoveLearnSetEntry(Move.HAIL,20),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,20),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,20),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,25),
                        new MoveLearnSetEntry(Move.BLIZZARD,35),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,35),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,35),
                        new MoveLearnSetEntry(Move.HURRICANE,45),
                        new MoveLearnSetEntry(Move.AMNESIA,"egg"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"egg"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,"egg"),
                        new MoveLearnSetEntry(Move.HEX,"egg"),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,"egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm")
                        ),
                List.of(Label.LOCKEMON, Label.GEN3),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 5, 60, 1.0, List.of(
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Castform");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
