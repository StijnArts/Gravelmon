package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Spirashell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spirashell() {
        super("Spirashell",
                Type.BUG, Type.POISON,
                new Stats(45,
                        28,
                        55,
                        38,
                        30,
                        23),
                List.of(Ability.SHELL_ARMOR), Ability.POISON_POINT,
                5, 165,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Spirashell rapidly spins in place and buries itself into the sea bed to wait for evolution. Sometimes they are dug up by collectors, only to suffer a nasty sting."),
                List.of(new EvolutionEntry("sealestial", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,10),
                        new MoveLearnSetEntry(Move.PROTECT,15),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 11, 21, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
