package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Iceteroid extends drai.dev.data.pokemon.Pokemon {
    public Iceteroid() {
        super("Iceteroid",
                Type.ICE, Type.ROCK,
                new Stats(104,
                        116,
                        200,
                        34,
                        40,
                        20),
                List.of(Ability.SHELL_ARMOR), Ability.ANGER_POINT,
                0, 0,
                new Stats(0,0,2,0,0,0), 30,
                0.0,
                180, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Multiple Glaceor collide together to form Iceteroid. Iceteroid possesses extremely difficult-to-pierce armour, making it a dangerous opponent in battle."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Iceteroid");

    }


}
