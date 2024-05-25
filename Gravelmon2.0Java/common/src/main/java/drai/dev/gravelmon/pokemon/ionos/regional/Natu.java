package drai.dev.gravelmon.pokemon.ionos.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Natu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Natu(int dex) {
        super(dex, "Natu",
                Type.FLYING, Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Unlike its Johtonian relative, Ionian Natu has a long pair of legs to make easier for it to spy on the vast, open landscapes where it resides. The stilt-like legs may also save it time when sinking into quicksand; as it often dozes off during long days of admiring the horizon. The former psychic ability of this Pokémon has blown away by the wind; a away of preparing it for its demise without knowing the cause of it."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Natu");

    }


}
