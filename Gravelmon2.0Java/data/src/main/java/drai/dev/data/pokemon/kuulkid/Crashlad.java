package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crashlad extends drai.dev.data.pokemon.Pokemon {
    public Crashlad() {
        super("Crashlad",
                Type.STEEL,Type.NORMAL,
                new Stats(50,
                        32,
                        45,
                        55,
                        32,
                        30),
                List.of(Ability.PANICSHIELD), Ability.PANICSHIELD,
                6, 0,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("It is a widely accepted theory that Crashlads came from another planet. It is still unclear to scientists if the metal plating worn by this pokemon is part of their skin."),
                List.of(new EvolutionEntry("tinvader", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:upgrade")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crashlad");

    }


}
