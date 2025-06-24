package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Curstocean extends drai.dev.data.pokemon.Pokemon {
    public Curstocean(Stats stats) {
        super("Curstocean",
                Type.GHOST,Type.FIRE,
                stats,
                List.of(Ability.CURSED_BODY), Ability.REGENERATOR,
                17, 366,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Shadow PunchSTAB Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,1)),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BEACH).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Curstocean");

    }


}
