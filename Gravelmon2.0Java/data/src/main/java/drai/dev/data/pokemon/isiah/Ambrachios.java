package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ambrachios extends drai.dev.data.pokemon.Pokemon {
    public Ambrachios() {
        super("Ambrachios",
                Type.ROCK, Type.ELECTRIC,
                new Stats(110,
                        65,
                        59,
                        98,
                        107,
                        55),
                List.of(Ability.STATIC), Ability.STATIC,
                35, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,7),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,13),
                        new MoveLearnSetEntry(Move.ROCK_THROW,19),
                        new MoveLearnSetEntry(Move.ENDURE,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,31),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,37),
                        new MoveLearnSetEntry(Move.STOMP,40),
                        new MoveLearnSetEntry(Move.ROAR,46),
                        new MoveLearnSetEntry(Move.POWER_GEM,55),
                        new MoveLearnSetEntry(Move.SCREECH,67),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,73)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OLD_GROWTH_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ambrachios");

    }


}
