package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Diagem extends drai.dev.gravelmon.pokemon.Pokemon {
    public Diagem() {
        super("Diagem",
                Type.ROCK, Type.PSYCHIC,
                new Stats(77,
                        124,
                        100,
                        22,
                        85,
                        72),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,1,1,0,0,0), 60,
                0.0,
                168, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
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
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.OCEAN_RUINS),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
