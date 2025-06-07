package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranBonsly extends drai.dev.data.pokemon.Pokemon {
    public NodorranBonsly(String name, Aspect aspect) {
        super(name, aspect, "Bonsly",
                Type.GROUND,
                new Stats(45,
                        30,
                        45,
                        75,
                        80,
                        20),
                List.of(Ability.RATTLED,Ability.RUN_AWAY), Ability.DRY_SKIN,
                7, 90,
                new Stats(0,0,0,1,0,0), 155,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Bonsly is a good mimic, making it often mistaken for a real rooted carrot. although it can easily be recognized as a fake due to it's curling 'leaves'."),
                List.of(new EvolutionEntry("nodorransudowoodo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,5),
                        new MoveLearnSetEntry(Move.MUD_SHOT,8),
                        new MoveLearnSetEntry(Move.MIMIC,11),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,16),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.FLATTER,23),
                        new MoveLearnSetEntry(Move.NATURE_POWER,28),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,31),
                        new MoveLearnSetEntry(Move.COUNTER,35),
                        new MoveLearnSetEntry(Move.TAUNT,40)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(5).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.VERY_COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NEAR_CROPS).build(),
                List.of());
           setLangFileName("Bonsly");

    }


}
