package drai.dev.gravelmon.pokemon.enjin;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Nudibolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nudibolt() {
        super("Nudibolt",
                Type.ELECTRIC,
                new Stats(85,
                        81,
                        85,
                        102,
                        117,
                        60),
                List.of(Ability.SUPERCHARGE), Ability.PERPLEXING,
                19, 900,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_3),
                List.of("The many feelers emerging from its back have triple the amount of shock-cells compared to the feelers on its face. The glowing colors it creates when it charges its feelers are quite mesmerizing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.ION_DELUGE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,15),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,18),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,23),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,27),
                        new MoveLearnSetEntry(Move.RECOVER,32),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,36),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,45),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,53),
                        new MoveLearnSetEntry(Move.THUNDER,62),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SPARK,"tm"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);

    }


}
