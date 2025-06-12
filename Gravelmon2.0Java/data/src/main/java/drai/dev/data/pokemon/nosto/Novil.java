package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Novil extends drai.dev.data.pokemon.Pokemon {
    public Novil() {
        super("Novil",
                Type.GHOST, Type.DARK,
                new Stats(75,
                        30,
                        70,
                        30,
                        70,
                        35),
                List.of(Ability.CURSED_BODY), Ability.INTIMIDATE,
                3, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.0,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is said that if you stare into its eye for long enough, you will have visions of unspeakable horrors from the past."),
                List.of(new EvolutionEntry("azatome", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,7),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,22),
                        new MoveLearnSetEntry(Move.ASSURANCE,27),
                        new MoveLearnSetEntry(Move.DARK_PULSE,34),
                        new MoveLearnSetEntry(Move.MEMENTO,40)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Novil");

    }


}
