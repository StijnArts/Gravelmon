package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Simburn extends drai.dev.data.pokemon.Pokemon {
    public Simburn() {
        super("Simburn",
                Type.FIRE,
                new Stats(50,
                        55,
                        35,
                        55,
                        30,
                        55),
                List.of(Ability.INTIMIDATE,Ability.RIVALRY), Ability.MOXIE,
                4, 90,
                new Stats(0,0,0,1,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Simburn have a big appetite for fighting. Because of this they often attack pokemon that are bigger then themselves."),
                List.of(new EvolutionEntry("felectroar", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Simburn");

    }


}
