package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rose extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rose() {
        super("Rose",
                Type.GRASS,Type.FAIRY,
                new Stats(77,
                        71,
                        120,
                        84,
                        97,
                        81),
                List.of(Ability.TANTRUM,Ability.FLOWER_VEIL,Ability.CHLOROPHYLL), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("corsage"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAPPYSLAP,1),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,3),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,5),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,8),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.HELPING_HAND,15),
                        new MoveLearnSetEntry(Move.CUDDLE,19),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,24),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,29),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,32),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,35),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,39),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,43),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,50),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,56),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rose");

    }


}
