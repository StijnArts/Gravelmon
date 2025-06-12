package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gleamur extends drai.dev.data.pokemon.Pokemon {
    public Gleamur() {
        super("Gleamur",
                Type.ELECTRIC,
                new Stats(75,
                        60,
                        60,
                        100,
                        85,
                        110),
                List.of(Ability.STATIC,Ability.CHEEK_POUCH,Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                8, 165,
                new Stats(0,0,0,0,0,2), 60,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("After dark is when they are most active. Due to the energy stored in their body, which causes their fur to shine, they can be seen high-jumping while appearing to be shooting stars at a distance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,9),
                        new MoveLearnSetEntry(Move.CHARGE,12),
                        new MoveLearnSetEntry(Move.NUZZLE,15),
                        new MoveLearnSetEntry(Move.SWIFT,17),
                        new MoveLearnSetEntry(Move.SPARK,20),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,23),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,26),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,29),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,35),
                        new MoveLearnSetEntry(Move.CHARM,38),
                        new MoveLearnSetEntry(Move.WISH,41),
                        new MoveLearnSetEntry(Move.DISCHARGE,44),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gleamur");

    }


}
