package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Acard extends drai.dev.gravelmon.pokemon.Pokemon {
    public Acard() {
        super("Acard",
                Type.GHOST,
                new Stats(100,
                        85,
                        70,
                        75,
                        80,
                        70),
                List.of(Ability.CURSED_BODY), Ability.CURSED_BODY,
                3, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCREECH,4),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,7),
                        new MoveLearnSetEntry(Move.SPITE,10),
                        new MoveLearnSetEntry(Move.WILLOWISP,16),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,19),
                        new MoveLearnSetEntry(Move.HEX,22),
                        new MoveLearnSetEntry(Move.CURSE,26),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,30),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,34),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,38),
                        new MoveLearnSetEntry(Move.TRICK,42),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,48)
                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 23, 54, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Acard");

    }


}
