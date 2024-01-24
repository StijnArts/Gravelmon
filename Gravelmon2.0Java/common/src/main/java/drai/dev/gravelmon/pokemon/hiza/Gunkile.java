package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gunkile extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gunkile() {
        super("Gunkile",
                Type.POISON,Type.WATER,
                new Stats(45,
                        66,
                        45,
                        59,
                        50,
                        52),
                List.of(Ability.STRONG_JAW), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Gunkile can inject a powerful poison by latching onto larger fish and take them down. They can also use this technique to cross strong currents by using other fish's strenght."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BITE,3),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,9),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.DIVE,25),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,33),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.AQUA_JET,40),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,47),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52),
                        new MoveLearnSetEntry(Move.TOXIC,58)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gunkile");

    }


}
