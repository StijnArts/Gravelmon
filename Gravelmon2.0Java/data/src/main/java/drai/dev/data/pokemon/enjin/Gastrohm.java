package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gastrohm extends drai.dev.data.pokemon.Pokemon {
    public Gastrohm() {
        super("Gastrohm",
                Type.ELECTRIC,
                new Stats(48,
                        44,
                        48,
                        57,
                        68,
                        35),
                List.of(Ability.SUPERCHARGE), Ability.PERPLEXING,
                3, 150,
                new Stats(0,0,0,0,1,0), 45,
                0.75,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_3),
                List.of("Gastrohm's feelers contain special cells that deliver a strong shock when touched. It can charge the feelers to make them glow, which is how it communicates with others in the damp caves it inhabits."),
                List.of(new EvolutionEntry("mollectric", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,7),
                        new MoveLearnSetEntry(Move.CHARGE,12),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,15),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,18),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,22),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,25),
                        new MoveLearnSetEntry(Move.RECOVER,29),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,34),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,40),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,46),
                        new MoveLearnSetEntry(Move.THUNDER,51),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SPARK,"tm"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);

    }


}
