package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Drakuleech extends drai.dev.data.pokemon.Pokemon {
    public Drakuleech() {
        super("Drakuleech",
                Type.DRAGON, Type.DARK,
                new Stats(60,
                        55,
                        75,
                        80,
                        55,
                        65),
                List.of(Ability.POWERLEECH,Ability.NOCTURNAL), Ability.UNDERLING,
                9, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                78, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It lives in dark caves, feasting on the lifeforce of unsuspecting passersby to grow stronger. Those it feasts on are reported to become very sick, looking almost lifeless."),
                List.of(new EvolutionEntry("nosfernal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Drakuleech");

    }


}
