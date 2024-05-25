package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Astralf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Astralf() {
        super("Astralf",
                Type.COSMIC,
                new Stats(81,
                        81,
                        56,
                        43,
                        56,
                        63),
                List.of(Ability.OBLIVIOUS,Ability.SAP_SIPPER), Ability.UNAWARE,
                9, 312,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                132, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("cosmoose", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(           new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.KINESIS,5),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,7),
                        new MoveLearnSetEntry(Move.PSYBEAM,12),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,18),
                        new MoveLearnSetEntry(Move.SAFEGUARD,20),
                        new MoveLearnSetEntry(Move.PSYSHOCK,25),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.CALM_MIND,33),
                        new MoveLearnSetEntry(Move.PSYCHIC,37),
                        new MoveLearnSetEntry(Move.PSYCH_UP,41),
                        new MoveLearnSetEntry(Move.RECOVER,57)             ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 9, 28, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Astralf");

    }


}
