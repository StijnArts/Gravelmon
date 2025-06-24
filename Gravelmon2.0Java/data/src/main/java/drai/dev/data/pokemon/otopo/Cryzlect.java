package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cryzlect extends drai.dev.data.pokemon.Pokemon {
    public Cryzlect() {
        super("Cryzlect",
                Type.ELECTRIC, Type.ROCK,
                new Stats(70,
                        70,
                        110,
                        120,
                        25,
                        100),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                24, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The crystals interwoven within its rocky structure conduct electricity allowing this rock type to float. It emits a tuneful crisp chime when a crystal is hit."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.THUNDER,1),
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,1),
                        new MoveLearnSetEntry(Move.CRYSTALDEFENSE,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,1),
                        new MoveLearnSetEntry(Move.DISCHARGE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
           setLangFileName("Cryzlect");

    }


}
