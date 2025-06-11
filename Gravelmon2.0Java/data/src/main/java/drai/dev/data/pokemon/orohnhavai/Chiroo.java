package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Chiroo extends drai.dev.data.pokemon.Pokemon {
    public Chiroo() {
        super("Chiroo",
                Type.NORMAL,
                new Stats(100,
                        15,
                        20,
                        10,
                        25,
                        60),
                List.of(Ability.HEALER), Ability.REGENERATOR,
                3, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.125,
                110, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("These Pokemon are commonly found near daycares. They love to snuggle up to eggs and keep them warm, hoping to hatch them faster."),
                List.of(new EvolutionEntry("trairoo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"190")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,6),
                        new MoveLearnSetEntry(Move.PECK,11),
                        new MoveLearnSetEntry(Move.ROOST,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,21),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,26),
                        new MoveLearnSetEntry(Move.REFRESH,31),
                        new MoveLearnSetEntry(Move.AMNESIA,36),
                        new MoveLearnSetEntry(Move.EGG_BOMB,41),
                        new MoveLearnSetEntry(Move.HEAL_BELL,46),
                        new MoveLearnSetEntry(Move.REFLECT,51),
                        new MoveLearnSetEntry(Move.DRILL_PECK,56),
                        new MoveLearnSetEntry(Move.BATON_PASS,61),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,66)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Chiroo");

    }


}
