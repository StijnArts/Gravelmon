package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Candore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Candore() {
        super("Candore",
                Type.ROCK,Type.FAIRY,
                new Stats(30,
                        50,
                        100,
                        20,
                        90,
                        20),
                List.of(Ability.WEAK_ARMOR,Ability.SWEET_VEIL,Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                8, 165,
                new Stats(0,0,1,0,0,0), 200,
                0.0,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It loves to gnaw on rocks—it considers precious gems a sweet treat. To keep its body clean, it will wander into wave-battered sea caves and be smoothed down by erosion."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Candore");

    }


}
