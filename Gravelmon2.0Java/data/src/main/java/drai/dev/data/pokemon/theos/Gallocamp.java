package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gallocamp extends drai.dev.data.pokemon.Pokemon {
    public Gallocamp() {
        super("Gallocamp",
                Type.WATER, Type.FAIRY,
                new Stats(55,
                        55,
                        65,
                        95,
                        75,
                        80),
                List.of(Ability.TORRENT), Ability.DAZZLING,
                14, 460,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                143, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Gallocamp are very playful and energetic. They have the ability to run on water, often putting on shows to entertain wild Pokémon."),
                List.of(new EvolutionEntry("aquastrian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).setAntiBiomes(Biome.IS_ARID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanWalkOnWater(true);
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Gallocamp");

    }


}
