package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Arachnoir extends drai.dev.data.pokemon.Pokemon {
    public Arachnoir() {
        super("Arachnoir",
                Type.DARK,Type.BUG,
                new Stats(70,
                        123,
                        90,
                        82,
                        84,
                        70),
                List.of(Ability.ANALYTIC,Ability.TECHNICIAN), Ability.MOXIE,
                16, 620,
                new Stats(0,2,0,0,0,1), 30,
                1.0,
                234, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.HUMAN_LIKE),
                List.of("Note: custom ability Profitient instead of analitic: Strengthens moves when moving last. If the oponent misses it's move, this pokemon may crit."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIDER_WEB,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,1),
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,4),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,10),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,14),
                        new MoveLearnSetEntry(Move.SCARY_FACE,20),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,26),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,33),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,40),
                        new MoveLearnSetEntry(Move.STICKY_WEB,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,50),
                        new MoveLearnSetEntry(Move.LUNGE,56),
                        new MoveLearnSetEntry(Move.DARK_PULSE,65)),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Arachnoir");

    }


}
