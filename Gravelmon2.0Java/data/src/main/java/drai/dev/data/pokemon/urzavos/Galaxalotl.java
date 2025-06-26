package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Galaxalotl extends drai.dev.data.pokemon.Pokemon {
    public Galaxalotl(Stats stats) {
        super("Galaxalotl",
                Type.FIRE, Type.FAIRY,
                stats,
                List.of(Ability.BLAZE), Ability.BLAZE,
                22, 2177,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FAIRY),
                List.of("A curious 'Mon that loves to hug all those it comes across, even stronger foes. They are stronger on clear, moonlit nights, and use a mysterious power to bounce around in the air."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Galaxalotl");

    }


}
