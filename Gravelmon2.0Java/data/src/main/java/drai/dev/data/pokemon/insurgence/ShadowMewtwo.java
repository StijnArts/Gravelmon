package drai.dev.data.pokemon.insurgence;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ShadowMewtwo extends Pokemon {
    public ShadowMewtwo(String name, Aspect aspect) {
        super(name, aspect,"ShadowMewtwo",
                Type.PSYCHIC, Type.DARK,
                new Stats(106, 110, 90 , 154, 90, 130),
                List.of(Ability.INTIMIDATE), Ability.INTIMIDATE,
                21, 1220,
                new Stats(0,0,0,3,0,0), 3,
                -1,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,1),
                        new MoveLearnSetEntry(Move.SWIFT,8),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,15),
                        new MoveLearnSetEntry(Move.PSYCH_UP,22),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,29),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,36),
                        new MoveLearnSetEntry(Move.POWER_SWAP,43),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,43),
                        new MoveLearnSetEntry(Move.RECOVER,50),
                        new MoveLearnSetEntry(Move.PSYCHIC,57),
                        new MoveLearnSetEntry(Move.BARRIER,64),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,70),
                        new MoveLearnSetEntry(Move.AMNESIA,79),
                        new MoveLearnSetEntry(Move.MIST,86),
                        new MoveLearnSetEntry(Move.ME_FIRST,93),
                        new MoveLearnSetEntry(Move.PSYSTRIKE,100),
                        new MoveLearnSetEntry(Move.DARK_NOVA,100)
                        ),
                List.of(Label.GEN1,Label.INSURGENCE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
    }
}
