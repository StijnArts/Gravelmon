package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bodmeast extends drai.dev.data.pokemon.Pokemon {
    public Bodmeast() {
        super("Bodmeast",
                Type.DARK,
                new Stats(65,
                        60,
                        60,
                        75,
                        65,
                        115),
                List.of(Ability.UNNERVE,Ability.RATTLED,Ability.INTIMIDATE), Ability.INTIMIDATE,
                14, 165,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The subject of many local legends, these evasive creatures have become known as the Beasts of Tonbury. No official records of Bodmeast exist, only blurry photographs, pawprints, and the occasional clump of its sharp, wiry fur."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FEINT,4),
                        new MoveLearnSetEntry(Move.SCRATCH,8),
                        new MoveLearnSetEntry(Move.PAY_DAY,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.ASSURANCE,24),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,29),
                        new MoveLearnSetEntry(Move.SCREECH,32),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,44)),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 44, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bodmeast");

    }


}
