package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Zerbrahg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zerbrahg() {
        super("Zerbrahg",
                Type.PSYCHIC,
                new Stats(40,
                        80,
                        60,
                        120,
                        120,
                        65),
                List.of(Ability.PRANKSTER,Ability.ANALYTIC,Ability.RATTLED), Ability.RATTLED,
                18, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Curious beings, Zerbarhg typically try to avoid contact with other Pokemon, but rather study them from afar. No one has yet to discover what this research is for."),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.CONFUSION,1),
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
                        new MoveLearnSetEntry(Move.RECOVER,57)                 ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 37, 53, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END, Biome.IS_BADLANDS))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zerbrahg");

    }


}
