package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Joltter extends drai.dev.data.pokemon.Pokemon {
    public Joltter() {
        super("Joltter",
                Type.ELECTRIC,
                new Stats(60,
                        68,
                        48,
                        45,
                        61,
                        60),
                List.of(Ability.MOTOR_DRIVE,Ability.STATICTOUCH), Ability.GALVANIZE,
                4, 136,
                new Stats(0,0,0,1,0,0), 100,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Joltter stay close to their family throughout most of their young life. If one gets seperated from its pack, it will bury itself in the dirt until someone comes to save it."),
                List.of(new EvolutionEntry("boltter", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(            new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,13),
                        new MoveLearnSetEntry(Move.CHARM,17),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,21),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,25),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,29),
                        new MoveLearnSetEntry(Move.DIG,33),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.ELECTRIFY,41),
                        new MoveLearnSetEntry(Move.SUPER_FANG,45),
                        new MoveLearnSetEntry(Move.BOUNCE,53),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,57)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Joltter");

    }


}
