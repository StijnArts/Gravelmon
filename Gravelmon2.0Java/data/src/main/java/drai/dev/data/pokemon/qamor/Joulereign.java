package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Joulereign extends drai.dev.data.pokemon.Pokemon {
    public Joulereign() {
        super("Joulereign",
                Type.ELECTRIC, Type.DARK,
                new Stats(60,
                        105,
                        52,
                        59,
                        70,
                        144),
                List.of(Ability.DAZZLING), Ability.DAZZLING,
                16, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Joulereign Move with immense speed that leave a trail of static electricity in its wake. They are characterized by their ebony black, rich fur that they constantly groom and their shimmering diamond-shaped spots throughout its body."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.POWER_TRIP,10),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.FLATTER,20),
                        new MoveLearnSetEntry(Move.BITE,25),
                        new MoveLearnSetEntry(Move.SPARK,30),
                        new MoveLearnSetEntry(Move.TORMENT,35),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.BULLET_SEED,45),
                        new MoveLearnSetEntry(Move.CRUNCH,50),
                        new MoveLearnSetEntry(Move.AURA_WHEEL,55),
                        new MoveLearnSetEntry(Move.THRASH,60)                   ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Joulereign");

    }


}
