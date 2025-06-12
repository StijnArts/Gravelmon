package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Eevern extends drai.dev.data.pokemon.Pokemon {
    public Eevern() {
        super("eevern",
                Type.DRAGON, Type.NORMAL,
                new Stats(66,
                        66,
                        66,
                        66,
                        66,
                        66),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("roargyle", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:hard_stone"),
                        new EvolutionEntry("flamengon", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:black_belt"),
                        new EvolutionEntry("fantasmaug", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:sharp_beak")
                ),
                List.of(            new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,7),
                        new MoveLearnSetEntry(Move.TAUNT,11),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,14),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,18),
                        new MoveLearnSetEntry(Move.BITE,23),
                        new MoveLearnSetEntry(Move.UTURN,27),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,36),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,51),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,57)           ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("eevern");

    }


}
