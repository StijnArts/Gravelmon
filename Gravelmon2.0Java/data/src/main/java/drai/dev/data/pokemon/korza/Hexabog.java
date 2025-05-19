package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hexabog extends drai.dev.data.pokemon.Pokemon {
    public Hexabog() {
        super("Hexabog",
                Type.PSYCHIC,Type.FAIRY,
                new Stats(86,
                        63,
                        79,
                        121,
                        103,
                        60),
                List.of(Ability.MAGICIAN), Ability.POISON_HEAL,
                10, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hexabog prefer to live in deep forests and marshes in solitude to avoid people who try to harvest their precious fungi. When encountered, they can sense hostility and will poison under the guise of helpfulness."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,12),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,17),
                        new MoveLearnSetEntry(Move.POISON_GAS,22),
                        new MoveLearnSetEntry(Move.PSYWAVE,26),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,30),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,34),
                        new MoveLearnSetEntry(Move.RECOVER,38),
                        new MoveLearnSetEntry(Move.PIXIEDUST,42),
                        new MoveLearnSetEntry(Move.MOONBLAST,46),
                        new MoveLearnSetEntry(Move.CALM_MIND,51),
                        new MoveLearnSetEntry(Move.PSYCHIC,56),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hexabog");

    }


}
