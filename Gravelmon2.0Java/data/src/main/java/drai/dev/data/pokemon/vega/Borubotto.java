package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Borubotto extends Pokemon {
    public Borubotto() {
        super( "Borubotto",
                Type.STEEL,
                new Stats(84	,111	,113	,81,	68	,73),
                List.of(Ability.DOWNLOAD), Ability.HEATPROOF,
                17, 1003,
                new Stats(0,1,2,0,0,0), 90,
                0.5,
                196, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.BIND,4),
                        new MoveLearnSetEntry(Move.CHARGE,8),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,16),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,20),
                        new MoveLearnSetEntry(Move.DISCHARGE,24),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.GEAR_GRIND,32),
                        new MoveLearnSetEntry(Move.LOCKON,36),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,40),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,44),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,48),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tutor"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tutor")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 59, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD))
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.4, 0.3,
                List.of());
    }
}
