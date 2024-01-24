package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Thermoni extends drai.dev.gravelmon.pokemon.Pokemon {
    public Thermoni() {
        super("Thermoni",
                Type.FLYING,Type.ELECTRIC,
                new Stats(105,
                        100,
                        140,
                        105,
                        60,
                        40),
                List.of(Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Thermoni live high up in the atmosphere and lounge around in the highest mountains of Qamor. They are incredibly aggressive and territorial and tend to get into vicious fights with one another to display dominance. Thermoni channel their immense electric power through their orbs, it also helps them concentrate and keep calm. If they were to lose their orb they would succumb to an intense straight of anger until the orb is back in their possession."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERCELL,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thermoni");

    }


}
