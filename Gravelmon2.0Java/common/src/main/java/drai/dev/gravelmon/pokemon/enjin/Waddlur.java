package drai.dev.gravelmon.pokemon.enjin;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Waddlur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Waddlur() {
        super("Waddlur",
                Type.ICE, Type.DRAGON,
                new Stats(65,
                        25,
                        55,
                        30,
                        55,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 59,
                new Stats(1,0,0,0,0,0), 90,
                0.5,
                57, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Waddlur come down from the mountains at midnight to walk the streets of remote towns, either solitary or in small groups. Their outstretched arms give the image they are looking for a warm embrace. They always vanish before dawn."),
                List.of(new EvolutionEntry("cuddlur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"220")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.MIST,15),
                        new MoveLearnSetEntry(Move.ICE_SHARD,18),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.ICE_BALL,24),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.WORK_UP,37),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,42),
                        new MoveLearnSetEntry(Move.MOUNTAIN_GALE,48),
                        new MoveLearnSetEntry(Move.THRASH,55)
                ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Waddlur");

    }


}
