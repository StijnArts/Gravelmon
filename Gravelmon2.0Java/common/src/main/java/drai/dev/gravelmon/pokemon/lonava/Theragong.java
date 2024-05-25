package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Theragong extends drai.dev.gravelmon.pokemon.Pokemon {
    public Theragong() {
        super("Theragong",
                Type.STEEL, Type.FAIRY,
                new Stats(55,
                        75,
                        85,
                        55,
                        85,
                        25),
                List.of(Ability.CLEAR_BODY,Ability.HEAVY_METAL,Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                10, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                133, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Theragong emit calming vibrations from their metal disc. They're popular among complementary therapists, practitioners of alternative medicine and ASMR fanatics alike."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,4),
                        new MoveLearnSetEntry(Move.PAYBACK,8),
                        new MoveLearnSetEntry(Move.IMPRISON,12),
                        new MoveLearnSetEntry(Move.GYRO_BALL,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,20),
                        new MoveLearnSetEntry(Move.SAFEGUARD,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,28),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,44)),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 14, 42, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Theragong");

    }


}
