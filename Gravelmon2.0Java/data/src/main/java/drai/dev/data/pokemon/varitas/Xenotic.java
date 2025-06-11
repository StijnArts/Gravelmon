package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Xenotic extends drai.dev.data.pokemon.Pokemon {
    public Xenotic() {
        super("Xenotic",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(60,
                        25,
                        80,
                        90,
                        100,
                        60),
                List.of(Ability.LEVITATE,Ability.ANALYTIC), Ability.TECHNICIAN,
                11, 0,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is highly intelligent and adept at tinkering with machines so it builds a special helmet to both amplify its psychic power and help it move around. Sightings of it floating through the sky were thought to be hoaxes until its relatively recent discovery."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BADLANDS).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Xenotic");

    }


}
