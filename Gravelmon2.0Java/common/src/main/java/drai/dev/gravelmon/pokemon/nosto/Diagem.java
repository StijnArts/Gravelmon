package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Diagem extends drai.dev.gravelmon.pokemon.Pokemon {
    public Diagem() {
        super("Diagem",
                Type.ROCK,Type.PSYCHIC,
                new Stats(77,
                        124,
                        100,
                        22,
                        85,
                        72),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,1,1,0,0,0), 60,
                0.0,
                168, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- ConfusionSTAB Psychic - Flash Normal 4 Rock ThrowSTAB Rock 8 PsywaveSTAB Psychic 11 Ancient PowerSTAB Rock 15 Hypnosis Psychic 19 Brutal Swing Dark 23 Bulldoze Ground 29 Magic Coat Psychic 34 Knock Off Dark 39 Zen HeadbuttSTAB Psychic 44 Rock SlideSTAB Rock 50 Stealth Rock Rock 57 PsyshockSTAB Psychic 65 Head SmashSTAB Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,4),
                        new MoveLearnSetEntry(Move.PSYWAVE,8),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,11),
                        new MoveLearnSetEntry(Move.HYPNOSIS,15),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,19),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,29),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,34),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,39),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,44),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,50),
                        new MoveLearnSetEntry(Move.PSYSHOCK,57),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,65)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Diagem");

    }


}
