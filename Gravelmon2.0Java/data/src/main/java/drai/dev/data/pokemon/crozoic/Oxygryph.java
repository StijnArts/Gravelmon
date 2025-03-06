package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Oxygryph extends drai.dev.data.pokemon.Pokemon {
    public Oxygryph() {
        super("Oxygryph",
                Type.BUG,Type.DRAGON,
                new Stats(65,
                        60,
                        55,
                        85,
                        80,
                        115),
                List.of(Ability.SWIFTDODGE), Ability.SWIFTDODGE,
                12, 114,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                161, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FLYING),
                List.of("Three pairs of wings give it unparalleled maneuverability in the air. Because it's so light, it can freely leap between clouds as if they were completely solid."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCHICNOISE,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,1),
                        new MoveLearnSetEntry(Move.UTURN,1),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.DRILL_PECK,1),
                        new MoveLearnSetEntry(Move.DRAGON_WING,1),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Oxygryph");

    }


}
