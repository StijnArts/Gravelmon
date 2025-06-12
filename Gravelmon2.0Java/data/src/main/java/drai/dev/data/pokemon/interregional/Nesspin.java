package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nesspin extends drai.dev.data.pokemon.Pokemon {
    public Nesspin() {
        super("Nesspin",
                Type.DRAGON, Type.STEEL,
                new Stats(93,
                        83,
                        100,
                        114,
                        83,
                        72),
                List.of(Ability.VOLT_ABSORB), Ability.JUMPIN,
                18, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,6),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,18),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,24),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,42),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,48),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,54),
                        new MoveLearnSetEntry(Move.METAL_BURST,60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,66)                 ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(44)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nesspin");

    }


}
