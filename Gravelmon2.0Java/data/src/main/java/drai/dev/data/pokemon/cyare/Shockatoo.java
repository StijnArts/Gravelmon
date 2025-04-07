package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shockatoo extends drai.dev.data.pokemon.Pokemon {
    public Shockatoo() {
        super("Shockatoo",
                Type.ELECTRIC, Type.FLYING,
                new Stats(60,
                        72,
                        55,
                        68,
                        55,
                        90),
                List.of(Ability.STATIC,Ability.EARLY_BIRD), Ability.INNER_FOCUS,
                7, 100,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                139, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Rival Shockatoos are typically seen in lightning storms, building up energy and racing to see which is the strongest. Merely tapping their body can lead to brief electric shocks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FLASH,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,9),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,13),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,16),
                        new MoveLearnSetEntry(Move.WHIRLWIND,21),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,25),
                        new MoveLearnSetEntry(Move.ROOST,30),
                        new MoveLearnSetEntry(Move.DRILL_PECK,34),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,39),
                        new MoveLearnSetEntry(Move.AGILITY,44),
                        new MoveLearnSetEntry(Move.AIR_SLASH,50),
                        new MoveLearnSetEntry(Move.THUNDER,57)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shockatoo");

    }


}
