package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sarcofomoth extends drai.dev.data.pokemon.Pokemon {
    public Sarcofomoth() {
        super("Sarcofomoth",
                Type.BUG, Type.DARK,
                new Stats(90,
                        50,
                        63,
                        87,
                        75,
                        50),
                List.of(Ability.IMMUNITY,Ability.CURSED_BODY), Ability.EFFECT_SPORE,
                9, 50,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Because it has been present since ancient times, the spores it produces are far more powerful than those released by other Bug Pokemon. You should never look it in the eyes directly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_LIFE,4),
                        new MoveLearnSetEntry(Move.SCREECH,7),
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.TWINEEDLE,13),
                        new MoveLearnSetEntry(Move.VENOSHOCK,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,19),
                        new MoveLearnSetEntry(Move.SPIKES,22),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,28),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,31),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,34),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,37),
                        new MoveLearnSetEntry(Move.TOXIC,40),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,43),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,46),
                        new MoveLearnSetEntry(Move.BUG_BITE,49),
                        new MoveLearnSetEntry(Move.DARK_PULSE,52),
                        new MoveLearnSetEntry(Move.HEX,55),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,58)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sarcofomoth");

    }


}
