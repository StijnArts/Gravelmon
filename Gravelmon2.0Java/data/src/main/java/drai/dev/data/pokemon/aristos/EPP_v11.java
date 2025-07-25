package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class EPP_v11 extends drai.dev.data.pokemon.Pokemon {
    public EPP_v11() {
        super("EPP_v11",
                Type.ELECTRIC,
                new Stats(105,
                        80,
                        60,
                        90,
                        85,
                        90),
                List.of(Ability.ADAPTABILITY), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,7),
                        new MoveLearnSetEntry(Move.CHARM,9),
                        new MoveLearnSetEntry(Move.ROLLOUT,12),
                        new MoveLearnSetEntry(Move.SPARK,15),
                        new MoveLearnSetEntry(Move.SOFTBOILED,18),
                        new MoveLearnSetEntry(Move.EGG_BOMB,23),
                        new MoveLearnSetEntry(Move.PROTECT,26),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,29),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.ZING_ZAP,39)           ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .isThundering()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("EPP_v1.1");
        addAdditionalEvolution("porygon", new EvolutionEntry("EPP_v11", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.WEATHER,"true"))));

    }


}
