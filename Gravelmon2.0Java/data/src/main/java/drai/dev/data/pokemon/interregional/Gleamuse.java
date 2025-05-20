package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gleamuse extends drai.dev.data.pokemon.Pokemon {
    public Gleamuse() {
        super("Gleamuse",
                Type.ELECTRIC,
                new Stats(68,
                        43,
                        52,
                        92,
                        63,
                        122),
                List.of(Ability.EARLY_BIRD), Ability.INSOMNIA,
                5, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,4),
                        new MoveLearnSetEntry(Move.SPARK,7),
                        new MoveLearnSetEntry(Move.ENCORE,10),
                        new MoveLearnSetEntry(Move.SWITCHEROO,13),
                        new MoveLearnSetEntry(Move.SWIFT,16),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,19),
                        new MoveLearnSetEntry(Move.COPYCAT,22),
                        new MoveLearnSetEntry(Move.CHARGE,26),
                        new MoveLearnSetEntry(Move.DISCHARGE,31),
                        new MoveLearnSetEntry(Move.BATON_PASS,34),
                        new MoveLearnSetEntry(Move.AGILITY,37),
                        new MoveLearnSetEntry(Move.LAST_RESORT,40),
                        new MoveLearnSetEntry(Move.THUNDER,43),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,46),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,49)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 34, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gleamuse");

    }


}
