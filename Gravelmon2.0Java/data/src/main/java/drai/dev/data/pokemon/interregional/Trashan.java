package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Trashan extends drai.dev.data.pokemon.Pokemon {
    public Trashan() {
        super("Trashan",
                Type.STEEL, Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("scrapiteer", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,5),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,8),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,11),
                        new MoveLearnSetEntry(Move.METAL_CLAW,15),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,22),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,26),
                        new MoveLearnSetEntry(Move.METAL_SOUND,29),
                        new MoveLearnSetEntry(Move.POISON_JAB,33),
                        new MoveLearnSetEntry(Move.SCARY_FACE,36),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,38),
                        new MoveLearnSetEntry(Move.TOXIC,43),
                        new MoveLearnSetEntry(Move.CROSS_POISON,46),
                        new MoveLearnSetEntry(Move.GUILLOTINE,51)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Trashan");

    }


}
