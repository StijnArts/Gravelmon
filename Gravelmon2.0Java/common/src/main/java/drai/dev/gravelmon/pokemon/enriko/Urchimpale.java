package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Urchimpale extends drai.dev.gravelmon.pokemon.Pokemon {
    public Urchimpale() {
        super("Urchimpale",
                Type.POISON,Type.STEEL,
                new Stats(60,
                        120,
                        100,
                        50,
                        90,
                        45),
                List.of(Ability.POISON_POINT,Ability.ROUGH_SKIN,Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                14, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                156, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It gathers sharp trash and metal scrap and glues it onto its body using sludge and mud. The poison it naturally produces adds to the already dangerous rust on the metal it collects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,1),
                        new MoveLearnSetEntry(Move.ACID,6),
                        new MoveLearnSetEntry(Move.SHARPEN,10),
                        new MoveLearnSetEntry(Move.WORK_UP,13),
                        new MoveLearnSetEntry(Move.ROLLOUT,17),
                        new MoveLearnSetEntry(Move.POISON_FANG,21),
                        new MoveLearnSetEntry(Move.METAL_BURST,25),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,28),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,34),
                        new MoveLearnSetEntry(Move.REST,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,46),
                        new MoveLearnSetEntry(Move.GYRO_BALL,52)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 25, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
