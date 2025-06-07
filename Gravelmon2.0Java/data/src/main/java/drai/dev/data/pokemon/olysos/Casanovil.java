package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Casanovil extends drai.dev.data.pokemon.Pokemon {
    public Casanovil() {
        super("Casanovil",
                Type.GHOST, Type.DARK,
                new Stats(70,
                        90,
                        60,
                        80,
                        60,
                        110),
                List.of(Ability.CURSED_BODY,Ability.CUTE_CHARM), Ability.INFILTRATOR,
                16, 544,
                new Stats(0,1,0,0,0,2), 90,
                0.875,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("In moonlit caves, Casanovil's slender silhouette becomes even more elusive. It is said that the echoes of its haunting laughter linger, serving as a warning to those who dare trust too easily in the dark. Casanovil's alluring gaze can captivate even the most resolute trainers. Once ensnared, victims often find themselves drawn into a web of deception, their trust shattered by the Deceitful Devil Pokémon's cunning maneuvers."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Casanovil");

    }


}
