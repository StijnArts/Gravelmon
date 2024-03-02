package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Deecoin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Deecoin() {
        super("Deecoin",
                Type.STEEL,Type.BUG,
                new Stats(40,
                        55,
                        65,
                        45,
                        50,
                        35),
                List.of(Ability.STURDY), Ability.STURDY,
                2, 165,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("When it forages in the dirt for food, its back points up and looks like a coin. When something attracted by the shine comes close, Deecoin becomes startled and attacks."),
                List.of(new EvolutionEntry("bankarak", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,6),
                        new MoveLearnSetEntry(Move.BUG_BITE,9),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,12),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,17),
                        new MoveLearnSetEntry(Move.ROLLOUT,20),
                        new MoveLearnSetEntry(Move.CURSE,23),
                        new MoveLearnSetEntry(Move.SPIKES,28),
                        new MoveLearnSetEntry(Move.PAYBACK,31),
                        new MoveLearnSetEntry(Move.EXPLOSION,34),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,39),
                        new MoveLearnSetEntry(Move.GYRO_BALL,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,45)
                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 31, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID, SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Deecoin");

    }


}
