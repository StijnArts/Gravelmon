package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Campyre extends drai.dev.data.pokemon.Pokemon {
    public Campyre() {
        super("Campyre",
                Type.FIRE,
                new Stats(41,
                        56,
                        65,
                        87,
                        65,
                        41),
                List.of(Ability.FLAME_BODY), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,0,0,1,0,0), 222,
                0.5,
                67, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("will burn ur butt"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOLD_HANDS,1)                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Campyre");

    }


}
