package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Torquoise extends drai.dev.gravelmon.pokemon.Pokemon {
    public Torquoise() {
        super("Torquoise",
                Type.ICE,
                new Stats(80,
                        43,
                        121,
                        91,
                        102,
                        33),
                List.of(Ability.CLEAR_BODY,Ability.ICE_BODY,Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                100, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of("Despite their appearance, Torquoise's shells are composed of glittering ice crystals. Pressure has given this Pokémon's body the properties of real diamonds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,8),
                        new MoveLearnSetEntry(Move.ICE_SHARD,13),
                        new MoveLearnSetEntry(Move.GYRO_BALL,17),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,21),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,29),
                        new MoveLearnSetEntry(Move.CRYSTALDEFENSE,34),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,40),
                        new MoveLearnSetEntry(Move.TUCKIN,45),
                        new MoveLearnSetEntry(Move.POWER_GEM,50),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,58),
                        new MoveLearnSetEntry(Move.GLASSSTORM,62),
                        new MoveLearnSetEntry(Move.SHARPEN,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PIXIEDUST,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Torquoise");

    }


}
