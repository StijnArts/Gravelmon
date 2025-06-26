package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snatchirp extends drai.dev.data.pokemon.Pokemon {
    public Snatchirp() {
        super("Snatchirp",
                Type.DARK, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.PICKPOCKET), Ability.PICKUP,
                4, 91,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("These 'Mons are known to be bold enough to steal items right off of people, in broad daylight! They are obsessed with treasure, and often pick fight with other birds for their items."),
                List.of(new EvolutionEntry("corvosene", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Snatchirp");

    }


}
