package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tofigur extends drai.dev.data.pokemon.Pokemon {
    public Tofigur() {
        super("Tofigur",
                Type.PSYCHIC,
                new Stats(70,
                        35,
                        45,
                        99,
                        99,
                        75),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                17, 165,
                new Stats(0,0,0,0,0,0), 85,
                0.5,
                140, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It is curious and seems to study the three dimensional world around it. If one were to look at it from the side, they would find it to be infinitely thin and dangerously sharp."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.CONVERSION,7),
                        new MoveLearnSetEntry(Move.CONVERSION_2,10),
                        new MoveLearnSetEntry(Move.PSYWAVE,16),
                        new MoveLearnSetEntry(Move.SWIFT,20),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,24),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,28),
                        new MoveLearnSetEntry(Move.PSYBEAM,30),
                        new MoveLearnSetEntry(Move.CALM_MIND,34),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,38),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,44)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Tofigur");

    }


}
