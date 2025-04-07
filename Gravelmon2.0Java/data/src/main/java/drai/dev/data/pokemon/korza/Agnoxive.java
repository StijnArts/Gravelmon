package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Agnoxive extends drai.dev.data.pokemon.Pokemon {
    public Agnoxive() {
        super("Agnoxive",
                Type.STEEL,Type.BUG,
                new Stats(100,
                        95,
                        85,
                        60,
                        60,
                        120),
                List.of(Ability.LIMBER), Ability.MOTOR_DRIVE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Capable of incredible speeds along straight paths, and are often found on abandoned railways scattered across the region. As they expend energy, toxic fumes are released into the atmosphere."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.POISON_FANG,5),
                        new MoveLearnSetEntry(Move.PESTER,10),
                        new MoveLearnSetEntry(Move.BOLTIN,14),
                        new MoveLearnSetEntry(Move.BUG_BITE,21),
                        new MoveLearnSetEntry(Move.POISON_JAB,25),
                        new MoveLearnSetEntry(Move.STEAMROLLER,29),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,33),
                        new MoveLearnSetEntry(Move.CROSS_POISON,39),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,43),
                        new MoveLearnSetEntry(Move.MEGAHORN,47),
                        new MoveLearnSetEntry(Move.IRON_TAIL,51),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,55),
                        new MoveLearnSetEntry(Move.FELL_STINGER,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Agnoxive");

    }


}
