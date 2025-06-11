package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Awesurge extends drai.dev.data.pokemon.Pokemon {
    public Awesurge() {
        super("Awesurge",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(95,
                        85,
                        85,
                        110,
                        90,
                        95),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                18, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("These speedy yet large Pokemon never set foot on the ground. They are seen competing with other’s of it’s kind, appearing as light trails, as they race and battle for dominance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.CHARGE,10),
                        new MoveLearnSetEntry(Move.SPARK,15),
                        new MoveLearnSetEntry(Move.AIR_SLASH,20),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,25),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,30),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,35),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TWISTER,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN, Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Awesurge");

    }


}
