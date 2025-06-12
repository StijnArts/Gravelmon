package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Derpants extends drai.dev.data.pokemon.Pokemon {
    public Derpants() {
        super("Derpants",
                Type.POISON, Type.NORMAL,
                new Stats(72,
                        34,
                        44,
                        54,
                        55,
                        56),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It lives an amphibious lifestyle, as it is constantly producing a sweat-like poisonous film around itself that repels water."),
                List.of(new EvolutionEntry("laundronaut", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.DISABLE,12),
                        new MoveLearnSetEntry(Move.SLUDGE,15),
                        new MoveLearnSetEntry(Move.MUD_SHOT,18),
                        new MoveLearnSetEntry(Move.MINIMIZE,21),
                        new MoveLearnSetEntry(Move.TOXIC,26),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,29),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,32),
                        new MoveLearnSetEntry(Move.SCREECH,37),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,40),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,43),
                        new MoveLearnSetEntry(Move.BELCH,46),
                        new MoveLearnSetEntry(Move.MEMENTO,48)
                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Derpants");

    }


}
