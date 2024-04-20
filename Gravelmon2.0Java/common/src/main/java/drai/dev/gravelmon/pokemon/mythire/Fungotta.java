package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fungotta extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fungotta() {
        super("Fungotta",
                Type.GROUND, Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.EFFECT_SPORE,Ability.DRY_SKIN,Ability.SPIRITBOUND), Ability.SPIRITBOUND,
                8, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("Fungotta usually live underground, but emerge during rainy weather to happily frolic in the downpour. Inhaling the clouds of spores this Pokemon creates induces fear."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fungotta");

    }


}
