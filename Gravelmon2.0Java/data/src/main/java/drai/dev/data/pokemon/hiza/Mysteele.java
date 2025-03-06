package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mysteele extends drai.dev.data.pokemon.Pokemon {
    public Mysteele() {
        super("Mysteele",
                Type.BUG, Type.PSYCHIC,
                new Stats(88,
                        42,
                        85,
                        85,
                        157,
                        40),
                List.of(Ability.INFILTRATOR), Ability.FOREWARN,
                23, 165,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Because it concentrates all its power on its crystal ball, if it loses its crystal it will lose all its psychic powers. The crystal can awaken the power contained in other Pokemon."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,11),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,29),
                        new MoveLearnSetEntry(Move.LUNGE,35),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,40),
                        new MoveLearnSetEntry(Move.POWER_SWAP,40),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,40),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,45),
                        new MoveLearnSetEntry(Move.PSYCHIC,50)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mysteele");

    }


}
