package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Deerit extends drai.dev.data.pokemon.Pokemon {
    public Deerit() {
        super("Deerit",
                Type.FAIRY,Type.DRAGON,
                new Stats(56,
                        103,
                        52,
                        94,
                        42,
                        63),
                List.of(Ability.FOREWARN), Ability.WONDER_SKIN,
                11, 380,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Seen as protectors of untouched wilderness, watching over flora and fauna alike. Deerit's horns have powerful healing abilities."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WISH,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,7),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,11),
                        new MoveLearnSetEntry(Move.AGILITY,16),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,26),
                        new MoveLearnSetEntry(Move.BOUNCE,32),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,37),
                        new MoveLearnSetEntry(Move.MOONBLAST,44),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,52),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,69)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Deerit");

    }


}
