package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochWurmple extends drai.dev.data.pokemon.Pokemon {
    public EpochWurmple(String name, Aspect aspect) {
        super(name, aspect, "EpochWurmple",
                Type.BUG,Type.PSYCHIC,
                new Stats(45,
                        20,
                        35,
                        20,
                        45,
                        30),
                List.of(Ability.TELEPATHY,Ability.GLUTTONY), Ability.COMPOUND_EYES,
                3, 36,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It is able to telepathically sense small insects that it can feed on making its ability to hunt for prey very easy."),
                List.of(new EvolutionEntry("epochsilcoon", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 12, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wurmple");

    }


}
