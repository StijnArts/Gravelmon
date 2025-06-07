package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Oniclops extends drai.dev.data.pokemon.Pokemon {
    public Oniclops() {
        super("Oniclops",
                Type.GHOST,Type.NORMAL,
                new Stats(90,
                        112,
                        71,
                        80,
                        60,
                        98),
                List.of(Ability.VITAL_SPIRIT), Ability.CURSED_BODY,
                18, 245,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                230, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("An enigmatic creature, believed to come from the underworld to steal souls from humans and pokemon alike. They seem to prefer targeting other ghosts, specifically Rosarei and Obakern, as they're easier victims."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIRITFLAME,1),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Oniclops");

    }


}
