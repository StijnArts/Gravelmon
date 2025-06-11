package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mercryni extends Pokemon {
    public Mercryni() {
        super("Mercryni",
                Type.STEEL, Type.POISON,
                new Stats(95,
                        30,
                        75,
                        75,
                        65,
                        50),
                List.of(Ability.CORROSION, Ability.POISON_POINT), Ability.LIQUID_OOZE,
                4, 1240,
                new Stats(1,0,0,0,0,0), 75,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("When startled, Mercryni cry tears of mercury. Its sharp spikes are corroded and rusty. Touching the spikes or tears of a Mercryni may result in hospitalization."),
                List.of(new EvolutionEntry("meraculisk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"47")))),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.SLUDGE,13),
                        new MoveLearnSetEntry(Move.GYRO_BALL,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.IRON_HEAD,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.UPROAR,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .belowY(20)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
