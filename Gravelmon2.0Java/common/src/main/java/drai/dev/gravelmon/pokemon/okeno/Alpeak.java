package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Alpeak extends drai.dev.gravelmon.pokemon.Pokemon {
    public Alpeak() {
        super("Alpeak",
                Type.NORMAL, Type.ICE,
                new Stats(102,
                        94,
                        90,
                        60,
                        91,
                        94),
                List.of(Ability.FUR_COAT), Ability.MOUNTAINEER,
                8, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                230, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Alpeak's thick fur protects it from the cold of the mountain summits it lives in."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.MILK_DRINK,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Alpeak");

    }


}
