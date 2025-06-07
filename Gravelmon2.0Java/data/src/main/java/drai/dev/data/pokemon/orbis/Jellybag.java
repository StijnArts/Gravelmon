package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jellybag extends drai.dev.data.pokemon.Pokemon {
    public Jellybag() {
        super("Jellybag",
                Type.GHOST,
                new Stats(40,
                        30,
                        35,
                        55,
                        65,
                        55),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                2, 1,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                49, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Jellybag are unique in the way they dispose of every item they see, no matter what it is."),
                List.of(new EvolutionEntry("trasphin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Jellybag");

    }


}
