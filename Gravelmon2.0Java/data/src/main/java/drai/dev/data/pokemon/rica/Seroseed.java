package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Seroseed extends drai.dev.data.pokemon.Pokemon {
    public Seroseed() {
        super("Seroseed",
                Type.GRASS,
                new Stats(60,
                        80,
                        80,
                        35,
                        40,
                        50),
                List.of(Ability.FIREPROOF), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 230,
                0.5,
                69, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Leech Seed Grass - Grass Whistle Grass - Wood HammerSTAB Grass - Harden Normal - Retaliate Normal - Stun Spore Grass - Sleep Powder Grass - Horn LeechSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_LEECH,1)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Seroseed");

    }


}
