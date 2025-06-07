package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stickisticky extends drai.dev.data.pokemon.Pokemon {
    public Stickisticky() {
        super("Stickisticky",
                Type.FAIRY,
                new Stats(110,
                        45,
                        30,
                        75,
                        150,
                        45),
                List.of(Ability.THICK_FAT,Ability.SWEET_VEIL), Ability.MISTY_SURGE,
                8, 130,
                new Stats(0,0,0,0,2,0), 100,
                0.5,
                231, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of("- Explosion Normal - Misty ExplosionSTAB Fairy - Play Nice Normal - Stockpile Normal"),
                List.of(),
                List.of(                      ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Stickisticky");

    }


}
