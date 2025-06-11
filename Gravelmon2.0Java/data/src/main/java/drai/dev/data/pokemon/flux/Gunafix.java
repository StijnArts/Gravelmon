package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gunafix extends Pokemon {
    public Gunafix() {
        super("Gunafix",
                Type.FIGHTING,
                new Stats(50,
                        60,
                        68,
                        24,
                        42,
                        31),
                List.of(Ability.STEELY_SPIRIT), Ability.IRON_FIST,
                6, 214,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                55, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE, EggGroup.MONSTER),
                List.of("In the wild, it picks apart rocks deep underground to feed on rare ores. It has adapted to urban environments by taking refuge in factories."),
                List.of(new EvolutionEntry("Fixinit", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,5),
                        new MoveLearnSetEntry(Move.VISE_GRIP,9),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.VITAL_THROW,16),
                        new MoveLearnSetEntry(Move.SLACK_OFF,19),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,23),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,33),
                        new MoveLearnSetEntry(Move.METAL_BURST,37),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,40),
                        new MoveLearnSetEntry(Move.IRON_TAIL,44),
                        new MoveLearnSetEntry(Move.SUPERPOWER,47),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .belowY(20)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
