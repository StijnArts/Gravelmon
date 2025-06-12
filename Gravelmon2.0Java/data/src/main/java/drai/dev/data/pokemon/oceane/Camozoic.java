package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Camozoic extends drai.dev.data.pokemon.Pokemon {
    public Camozoic() {
        super("Camozoic",
                Type.ROCK, Type.GROUND,
                new Stats(85,
                        75,
                        90,
                        75,
                        90,
                        65),
                List.of(Ability.STURDY), Ability.STURDY,
                5, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                168, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.BULLDOZE,12),
                        new MoveLearnSetEntry(Move.ROCK_THROW,16),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,18),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,24),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,30),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,34),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.EXPLOSION,44),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.STONE_EDGE,54)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
