package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glowva extends drai.dev.data.pokemon.Pokemon {
    public Glowva() {
        super("Glowva",
                Type.BUG, Type.ELECTRIC,
                new Stats(55,
                        30,
                        25,
                        68,
                        55,
                        30),
                List.of(Ability.ILLUMINATE), Ability.SWARM,
                3, 0,
                new Stats(1,0,0,1,0,0), 200,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("sectalamp", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.FLASH,3),
                        new MoveLearnSetEntry(Move.STRING_SHOT,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,8),
                        new MoveLearnSetEntry(Move.ELECTROWEB,11)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Glowva");

    }


}
