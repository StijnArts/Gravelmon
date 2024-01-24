package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Melant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Melant() {
        super("Melant",
                Type.FIRE,Type.GROUND,
                new Stats(65,
                        45,
                        65,
                        45,
                        65,
                        15),
                List.of(Ability.MAGMA_ARMOR), Ability.TRUANT,
                8, 165,
                new Stats(0,0,1,0,0,0), 250,
                0.25,
                50, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Melant's body cools down and hardens as it sleeps. When its active it can reach extreme temperatures."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.YAWN,9),
                        new MoveLearnSetEntry(Move.INCINERATE,14),
                        new MoveLearnSetEntry(Move.MAGNITUDE,18),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,23),
                        new MoveLearnSetEntry(Move.EARTH_POWER,25),
                        new MoveLearnSetEntry(Move.BODY_SLAM,32),
                        new MoveLearnSetEntry(Move.SNORE,35),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,47),
                        new MoveLearnSetEntry(Move.ERUPTION,50)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Melant");

    }


}
