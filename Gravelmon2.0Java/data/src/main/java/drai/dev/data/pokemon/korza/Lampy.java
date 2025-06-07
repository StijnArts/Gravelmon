package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lampy extends drai.dev.data.pokemon.Pokemon {
    public Lampy() {
        super("Lampy",
                Type.FIRE,Type.BUG,
                new Stats(22,
                        63,
                        47,
                        66,
                        34,
                        68),
                List.of(Ability.ILLUMINATE,Ability.FLASH_FIRE), Ability.SIMPLE,
                3, 27,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("A handy pokemon for travelers and campers, as their flames can be used for long distance communcation and emergencies. Most often seen during hot, humid nights."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SINGE,8),
                        new MoveLearnSetEntry(Move.FLASH,11),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.LIGHTUP,19),
                        new MoveLearnSetEntry(Move.INCINERATE,23),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,26),
                        new MoveLearnSetEntry(Move.UTURN,29),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,33),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,36),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,39),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,43),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,47)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Lampy");

    }


}
