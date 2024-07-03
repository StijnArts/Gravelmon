package drai.dev.gravelmon.pokemon.uranium;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Mutios extends Pokemon {
    public Mutios() {
        super("Mutios",
                Type.GHOST, Type.WATER,
                new Stats(110,
                        100,
                        120,
                        110,
                        160,
                        100),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                48, 3592,
                new Stats(1,0,1,0,1,0), 3,
                0.5,
                360, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("B l a c k s h a d e p r o t e c t s"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ATOMIC_PUNCH,1),
                        new MoveLearnSetEntry(Move.NUCLEAR_WASTE,10),
                        new MoveLearnSetEntry(Move.HALFLIFE,30)
                ),
                List.of(Label.URANIUM, Label.LEGENDARY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GLACIAL)),
                        new SpawnCondition(SpawnConditionType.MINY, "200")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanFly(true);
    }
}
