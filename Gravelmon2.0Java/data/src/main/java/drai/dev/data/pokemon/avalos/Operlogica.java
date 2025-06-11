package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Operlogica extends drai.dev.data.pokemon.Pokemon {
    public Operlogica() {
        super("Operlogica",
                Type.STEEL, Type.PSYCHIC,
                new Stats(107,
                        101,
                        139,
                        127,
                        89,
                        7),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                62, 4531,
                new Stats(0,0,3,0,0,0), 5,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Codename: UB-31 Computer. A member of the Ultra Beast family, this metal monstrosity is almost completely man-made, save for a small biological substance that seems to rest at it's core. Operlogica is marked as extremely dangerous, as it comes with a rouge's gallery of armaments' to dispose of it's enemies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.THUNDER,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,1)                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Operlogica");

    }


}
