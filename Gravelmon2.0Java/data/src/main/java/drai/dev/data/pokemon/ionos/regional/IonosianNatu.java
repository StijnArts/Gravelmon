package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianNatu extends drai.dev.data.pokemon.Pokemon {
    public IonosianNatu(String name, Aspect aspect) {
        super(name, aspect, "Natu",
                Type.FLYING, Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Unlike its Johtonian relative, Ionian Natu has a long pair of legs to make easier for it to spy on the vast, open landscapes where it resides. The stilt-like legs may also save it time when sinking into quicksand; as it often dozes off during long days of admiring the horizon. The former psychic ability of this Pokémon has blown away by the wind; a away of preparing it for its demise without knowing the cause of it."),
                List.of(new EvolutionEntry("xatu ionosian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Natu");

    }


}
