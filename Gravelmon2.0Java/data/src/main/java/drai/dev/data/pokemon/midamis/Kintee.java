package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kintee extends drai.dev.data.pokemon.Pokemon {
    public Kintee() {
        super("Kintee",
                Type.FIGHTING,
                new Stats(50,
                        70,
                        55,
                        45,
                        40,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("kinett", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,4),
                        new MoveLearnSetEntry(Move.REVENGE,8),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,12),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,16),
                        new MoveLearnSetEntry(Move.SCARY_FACE,20),
                        new MoveLearnSetEntry(Move.VITAL_THROW,24),
                        new MoveLearnSetEntry(Move.STRENGTH,29),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,32),
                        new MoveLearnSetEntry(Move.BULK_UP,36),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,40),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,44),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,52)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }


}
