package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Findolf extends Pokemon {
    public Findolf() {
        super("Findolf",
                Type.WATER,
                new Stats(69,
                        50,
                        43,
                        50,
                        43,
                        60),
                List.of(Ability.TORRENT), Ability.MOXIE,
                7, 195,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.MONSTER),
                List.of("A resilient Pokemon that thrives on land as well as it does in the water. To defend itself, it sprays a forceful water jet from the blowhole on its head."),
                List.of(new EvolutionEntry("delfender", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.SUPERSONIC,8),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,18),
                        new MoveLearnSetEntry(Move.FROST_BREATH,22),
                        new MoveLearnSetEntry(Move.LIQUIDATION,25),
                        new MoveLearnSetEntry(Move.BODY_SLAM,29),
                        new MoveLearnSetEntry(Move.SAFEGUARD,32),
                        new MoveLearnSetEntry(Move.SUPERPOWER,36),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
