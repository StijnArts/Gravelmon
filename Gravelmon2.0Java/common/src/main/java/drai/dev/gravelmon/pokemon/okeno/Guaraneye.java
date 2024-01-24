package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Guaraneye extends drai.dev.gravelmon.pokemon.Pokemon {
    public Guaraneye() {
        super("Guaraneye",
                Type.PSYCHIC,Type.GRASS,
                new Stats(59,
                        44,
                        107,
                        107,
                        107,
                        66),
                List.of(Ability.CLAIRVOYANCE,Ability.COMPOUND_EYES,Ability.FOREWARN), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Hypnosis Psychic Wish Normal Psycho Shift Psychic Stored PowerSTAB Psychic Hex Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Guaraneye");

    }


}
