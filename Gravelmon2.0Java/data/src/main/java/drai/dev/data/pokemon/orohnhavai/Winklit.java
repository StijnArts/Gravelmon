package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Winklit extends drai.dev.data.pokemon.Pokemon {
    public Winklit() {
        super("Winklit",
                Type.ELECTRIC,
                new Stats(50,
                        40,
                        40,
                        60,
                        55,
                        65),
                List.of(Ability.STATIC,Ability.CHEEK_POUCH,Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                3, 165,
                new Stats(0,0,0,0,0,1), 120,
                0.5,
                70, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The electricity it stores from running causes its fur to shine. At night, they glow in the dark."),
                List.of(new EvolutionEntry("gleamur", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")
                ),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Winklit");

    }


}
