package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Negawatt extends Pokemon {
    public Negawatt() {
        super("Negawatt",
                Type.ELECTRIC, Type.DARK,
                new Stats(63,
                        126,
                        54,
                        108,
                        63,
                        99),
                List.of(Ability.ILLUMINATE, Ability.MINUS), Ability.ELECTRIC_SURGE,
                20, 900,
                new Stats(0,2,0,1,0,0), 45,
                -1,
                257, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its ruptured head constantly leaks power, requiring it to consume large amounts of electricity. It causes blackouts by attacking power lines."),
                List.of(),
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
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 44, 67, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
