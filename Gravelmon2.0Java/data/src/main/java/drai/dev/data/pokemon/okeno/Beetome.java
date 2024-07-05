package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Beetome extends drai.dev.data.pokemon.Pokemon {
    public Beetome() {
        super("Beetome",
                Type.BUG, Type.FAIRY,
                new Stats(55,
                        80,
                        100,
                        58,
                        100,
                        42),
                List.of(Ability.SHIELD_DUST), Ability.PLOTTWIST,
                7, 165,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It's said that when Beetome eat books, they become smarter. A lot of trainers feed them dictionaries and literature classics because of this, but there is no scientific proof for that."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,17),
                        new MoveLearnSetEntry(Move.PIXIEDUST,19),
                        new MoveLearnSetEntry(Move.SECRET_POWER,22),
                        new MoveLearnSetEntry(Move.INFESTATION,25),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,28),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,30),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,33),
                        new MoveLearnSetEntry(Move.EMBARGO,36),
                        new MoveLearnSetEntry(Move.EPILOGUE,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,45),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,50),
                        new MoveLearnSetEntry(Move.MEGAHORN,55)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 32, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD))
                ), List.of(),
                List.of(SpawnPreset.NEAR_BOOKSHELVES),
                0.28, 0.3,
                List.of());
           setLangFileName("Beetome");

    }


}
