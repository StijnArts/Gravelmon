package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochDitto extends drai.dev.data.pokemon.Pokemon {
    public EpochDitto(String name, Aspect aspect) {
        super(name, aspect, "EpochDitto",
                Type.COSMIC,
                new Stats(48,
                        48,
                        48,
                        48,
                        48,
                        48),
                List.of(Ability.LIMBER,Ability.UNBURDEN), Ability.IMPOSTER,
                3, 40,
                new Stats(1,0,0,0,0,0), 100,
                -1.0,
                101, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("A species that is the subject of intense study by researchers. Some say that it is matter that came from outer space."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRANSFORM,1)                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ditto");

    }


}
