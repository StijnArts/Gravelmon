package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Emberg extends drai.dev.data.pokemon.Pokemon {
    public Emberg() {
        super("Emberg",
                Type.FIRE,Type.GHOST,
                new Stats(45,
                        40,
                        65,
                        40,
                        65,
                        15),
                List.of(Ability.FLAME_BODY), Ability.REGENERATOR,
                5, 150,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                54, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FLYING),
                List.of("This Pokémon is born at sites of calamitous fires. Though still hot to the touch, its flames only burn at 200 degrees Fahrenheit."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,10),
                        new MoveLearnSetEntry(Move.WILLOWISP,15),
                        new MoveLearnSetEntry(Move.HEX,20),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,25),
                        new MoveLearnSetEntry(Move.SOFTBOILED,30),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Embergé");

    }


}
