package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochSilcoon extends drai.dev.data.pokemon.Pokemon {
    public EpochSilcoon(String name, Aspect aspect) {
        super(name, aspect, "EpochSilcoon",
                Type.BUG,Type.PSYCHIC,
                new Stats(40,
                        20,
                        55,
                        15,
                        50,
                        65),
                List.of(Ability.TELEPATHY,Ability.CLEAR_BODY), Ability.OVERCOAT,
                6, 100,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("While it is in the cocoon stage, it uses its budding psychic powers to camouflage itself from predators."),
                List.of(new EvolutionEntry("epochbeautifly", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 21, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Silcoon");

    }


}
