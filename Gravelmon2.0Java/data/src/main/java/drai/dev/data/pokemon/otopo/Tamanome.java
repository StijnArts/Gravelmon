package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tamanome extends drai.dev.data.pokemon.Pokemon {
    public Tamanome() {
        super("Tamanome",
                Type.NORMAL,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                3, 32,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                92, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("This Pokemon has a unique genetic structure, in which it can evolve based on the favouritism of certain parameters. Its form will change depending on how it has been treated."),
                List.of(new EvolutionEntry("tamakomu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"))),
                        new EvolutionEntry("honokomu", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:hp_up"),
                        new EvolutionEntry("tatakomu", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:protein"),
                        new EvolutionEntry("mizukomu", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:iron"),
                        new EvolutionEntry("majokomu", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:calcium"),
                        new EvolutionEntry("damakomu", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:zinc"),
                        new EvolutionEntry("sokukomu", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:carbos")),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.BITE,17),
                        new MoveLearnSetEntry(Move.COVET,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.CHARM,29),
                        new MoveLearnSetEntry(Move.BATON_PASS,30),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,32),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,35),
                        new MoveLearnSetEntry(Move.PROTECT,37),
                        new MoveLearnSetEntry(Move.LAST_RESORT,40),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,45)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tamanome");

    }


}
