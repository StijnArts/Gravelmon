package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Poxic extends drai.dev.data.pokemon.Pokemon {
    public Poxic() {
        super("Poxic",
                Type.POISON,
                new Stats(15,
                        15,
                        35,
                        55,
                        85,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("veyerus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(              new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.PROTECT,16),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,23),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,29),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,34),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,38),
                        new MoveLearnSetEntry(Move.METAL_BURST,41),
                        new MoveLearnSetEntry(Move.TOXIC,48),
                        new MoveLearnSetEntry(Move.MEMENTO,54),
                        new MoveLearnSetEntry(Move.LIQUIDMETAL,60),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,66)           ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Poxic");

    }


}
