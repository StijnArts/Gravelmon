package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Psyalii extends drai.dev.data.pokemon.Pokemon {
    public Psyalii() {
        super("Psyalii",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TORRENT), Ability.TORRENT,
                6, 36,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Slow to warm up to its trainer, this 'Mon is very skittish and shy. It prefers to confuse foes from a distance, and will cry if approached too suddenly."),
                List.of(new EvolutionEntry("dusynap", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_LUKEWARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Psyalii");

    }


}
