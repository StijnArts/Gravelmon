package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Basshark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Basshark() {
        super("Basshark",
                Type.WATER,Type.ELECTRIC,
                new Stats(95,
                        80,
                        75,
                        105,
                        85,
                        80),
                List.of(Ability.MAGNET_PULL,Ability.LIQUID_VOICE,Ability.MEGA_LAUNCHER), Ability.MEGA_LAUNCHER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Basshark provides strong currents to the Ore Sea, creating whats known as the Gold Stream. It can launch other Pokémon with its powered tuck mouth; that also captures large quantities of Sardiner in the process."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1),
                        new MoveLearnSetEntry(Move.BOOMBURST,56)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Basshark");

    }


}
