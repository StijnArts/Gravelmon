package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Frutifeye extends drai.dev.gravelmon.pokemon.Pokemon {
    public Frutifeye() {
        super("Frutifeye",
                Type.PSYCHIC, Type.GRASS,
                new Stats(45,
                        36,
                        36,
                        75,
                        75,
                        50),
                List.of(Ability.CLAIRVOYANCE,Ability.KEEN_EYE,Ability.FOREWARN), Ability.FOREWARN,
                6, 165,
                new Stats(0,0,0,0,1,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of(""),
                List.of(new EvolutionEntry("guaraneye", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,5),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,8),
                        new MoveLearnSetEntry(Move.MIND_READER,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,18),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,22),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,25),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,29),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,31),
                        new MoveLearnSetEntry(Move.WORRY_SEED,36),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,40),
                        new MoveLearnSetEntry(Move.MEMENTO,47),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,52),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 31, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"false"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Frutifeye");

    }


}
