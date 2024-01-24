package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ensencoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ensencoon() {
        super("Ensencoon",
                Type.GRASS,Type.BUG,
                new Stats(75,
                        75,
                        110,
                        60,
                        110,
                        30),
                List.of(Ability.OVERGROW,Ability.COMPOUND_EYES,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of("Despite being a cocoon, it is capable of limited movement. Air blowing through its shell's pores produces a flute-like sound."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ensencoon");

    }


}
