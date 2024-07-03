package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Insulatex extends Pokemon {
    public Insulatex() {
        super("Insulatex",
                Type.ELECTRIC,
                new Stats(63,
                        72,
                        81,
                        72,
                        108,
                        45),
                List.of(Ability.ILLUMINATE, Ability.PLUS), Ability.BATTERY,
                11, 761,
                new Stats(0,0,0,0,2,0), 90,
                -1,
                154, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its entire body is a battery that can store and discharge power at 99% efficiency. If it overcharges, it enters a wild frenzy."),
                List.of(new EvolutionEntry("negawatt", EvolutionType.LEVEL_UP, false, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"cobblemon:electirizer\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.STORED_POWER,7),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,11),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,19),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,23),
                        new MoveLearnSetEntry(Move.REFLECT,23),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,27),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,31),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,35),
                        new MoveLearnSetEntry(Move.COIL,43),
                        new MoveLearnSetEntry(Move.POWER_WHIP,47),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,51),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,55)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 26, 50, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
