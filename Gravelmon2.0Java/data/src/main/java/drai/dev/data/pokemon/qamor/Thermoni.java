package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Thermoni extends drai.dev.data.pokemon.Pokemon {
    public Thermoni() {
        super("Thermoni",
                Type.FLYING, Type.ELECTRIC,
                new Stats(105,
                        100,
                        140,
                        105,
                        60,
                        40),
                List.of(Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                18, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Thermoni live high up in the atmosphere and lounge around in the highest mountains of Qamor. They are incredibly aggressive and territorial and tend to get into vicious fights with one another to display dominance. Thermoni channel their immense electric power through their orbs, it also helps them concentrate and keep calm. If they were to lose their orb they would succumb to an intense straight of anger until the orb is back in their possession."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.AIR_BUBBLE,1),
                        new MoveLearnSetEntry(Move.CLOUD_CRASH,1),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.SUPERCELL,1),
                        new MoveLearnSetEntry(Move.ZING_ZAP,1),
                        new MoveLearnSetEntry(Move.ION_DELUGE,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.STORED_POWER,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.SUPERCELL,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 51, 64, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
