package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leafin extends drai.dev.data.pokemon.Pokemon {
    public Leafin() {
        super("Leafin",
                Type.GRASS,
                new Stats(50,
                        66,
                        51,
                        41,
                        53,
                        53),
                List.of(Ability.OVERGROW), Ability.SHARPNESS,
                6, 91,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("The sharp leaf on its head is used to cut through tall grass and vegetation, so it can move more swiftly. Leafin pack a powerful bite despite being usually docile."),
                List.of(new EvolutionEntry("sharkage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(           new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.LEAFTURN,7),
                        new MoveLearnSetEntry(Move.RAGE,10),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,13),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.SLAM,20),
                        new MoveLearnSetEntry(Move.SCARY_FACE,24),
                        new MoveLearnSetEntry(Move.CRUNCH,31),
                        new MoveLearnSetEntry(Move.XSCISSOR,35),
                        new MoveLearnSetEntry(Move.THRASH,44),
                        new MoveLearnSetEntry(Move.VERDANTTAIL,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,56),
                        new MoveLearnSetEntry(Move.LEAF_STORM,62)             ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_TAIGA))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Leafin");

    }


}
