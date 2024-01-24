package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cephamore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cephamore() {
        super("Cephamore",
                Type.POISON,Type.PSYCHIC,
                new Stats(40,
                        45,
                        45,
                        45,
                        55,
                        60),
                List.of(Ability.CUTE_CHARM,Ability.SUCTION_CUPS,Ability.TELEPATHY), Ability.TELEPATHY,
                8, 165,
                new Stats(0,0,0,0,0,1), 220,
                0.5,
                58, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_3),
                List.of("These tiny Pokémon swarm swimmers in great numbers out of curiosity, sensing their thoughts. They mean no harm, but they secrete a toxic fluid that can sicken people."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.ALLURINGVOICE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cephamore");

    }


}
