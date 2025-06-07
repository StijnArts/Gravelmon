package drai.dev.data.pokemon.ayrei;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Enchantowl extends drai.dev.data.pokemon.Pokemon {
    public Enchantowl() {
        super("Enchantowl",
                Type.PSYCHIC,Type.FLYING,
                new Stats(100,
                        50,
                        50,
                        90,
                        120,
                        100),
                List.of(Ability.INSOMNIA,Ability.KEEN_EYE), null,
                16, 408,
                new Stats(2,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("When it needs to think, it rotates its head 180 degrees to sharpen its intellectual power."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.REFLECT,12),
                        new MoveLearnSetEntry(Move.AIR_SLASH,18),
                        new MoveLearnSetEntry(Move.DREAM_EATER,53),
                        new MoveLearnSetEntry(Move.SWIFT,28),
                        new MoveLearnSetEntry(Move.MOONBLAST,43),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,23),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,15),
                        new MoveLearnSetEntry(Move.HYPNOSIS,48),
                        new MoveLearnSetEntry(Move.PSYCHIC,0),
                        new MoveLearnSetEntry(Move.UPROAR,33),
                        new MoveLearnSetEntry(Move.CONFUSION,9),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ROOST,38),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1)                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Enchantowl");

    }


}
