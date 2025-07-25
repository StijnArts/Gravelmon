package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fleesquach extends drai.dev.data.pokemon.Pokemon {
    public Fleesquach() {
        super("Fleesquach",
                Type.NORMAL, Type.GROUND,
                new Stats(100,
                        120,
                        150,
                        75,
                        100,
                        55),
                List.of(Ability.DRY_SKIN), Ability.INTIMIDATE,
                32, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.75,
                280, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("The only evidence of Fleesquach existing is a blurry video taken decades ago. Other cases of Fleesquach sightings are quickly laughed off or ignored."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.SUPERPOWER,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(45)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Fleesquach");

    }


}
