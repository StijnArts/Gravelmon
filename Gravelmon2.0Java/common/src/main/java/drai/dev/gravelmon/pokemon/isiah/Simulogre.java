package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Simulogre extends drai.dev.gravelmon.pokemon.Pokemon {
    public Simulogre() {
        super("Simulogre",
                Type.GROUND, Type.GRASS,
                new Stats(80,
                        80,
                        120,
                        90,
                        60,
                        70),
                List.of(Ability.BATTLE_ARMOR), Ability.NATURAL_CURE,
                18, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.POISON_STING,5),
                        new MoveLearnSetEntry(Move.SAND_TOMB,8),
                        new MoveLearnSetEntry(Move.SYNTHESIS,13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,16),
                        new MoveLearnSetEntry(Move.SPIKES,21),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,24),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,37),
                        new MoveLearnSetEntry(Move.SANDSTORM,40),
                        new MoveLearnSetEntry(Move.THORN_FALL,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,48)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Simulogre");

    }


}
