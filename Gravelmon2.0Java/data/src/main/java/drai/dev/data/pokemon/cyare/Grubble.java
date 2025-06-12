package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grubble extends drai.dev.data.pokemon.Pokemon {
    public Grubble() {
        super("Grubble",
                Type.BUG,
                new Stats(35,
                        35,
                        25,
                        30,
                        30,
                        40),
                List.of(Ability.SHIELD_DUST), Ability.SHIELD_DUST,
                3, 27,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                39, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("pupive", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"7")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.FLAIL,20),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,25)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grubble");

    }


}
