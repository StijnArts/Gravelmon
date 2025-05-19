package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Banneshee extends drai.dev.data.pokemon.Pokemon {
    public Banneshee() {
        super("Banneshee",
                Type.GHOST,Type.FAIRY,
                new Stats(70,
                        130,
                        75,
                        100,
                        55,
                        100),
                List.of(Ability.INFILTRATOR), Ability.CURSED_BODY,
                15, 104,
                new Stats(0,0,0,0,0,0), 40,
                0.25,
                214, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Banneshee's screams are powerful enough to paralyze anyone who hears them. People who come in contact with this pokemon tend to develop a phobia of mannequins. Its fingers are sharp enough to cut through bone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,12),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,16),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,20),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,25),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,30),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,33),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,41),
                        new MoveLearnSetEntry(Move.MOONBLAST,46),
                        new MoveLearnSetEntry(Move.PERISH_SONG,53),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,57),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Banneshee");

    }


}
