package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kokesheity extends drai.dev.data.pokemon.Pokemon {
    public Kokesheity() {
        super("Kokesheity",
                Type.FAIRY, Type.LIGHT,
                new Stats(75,
                        65,
                        70,
                        116,
                        70,
                        91),
                List.of(Ability.SERENE_GRACE,Ability.WONDER_SKIN), Ability.PIXILATE,
                12, 175,
                new Stats(0,0,0,2,0,0), 45,
                1.0,
                193, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Kokosheity love the spotlight. They make friends very quickly and are often seen on TV or performing on stages all around the world."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,12),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,18),
                        new MoveLearnSetEntry(Move.MIMIC,24),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,30),
                        new MoveLearnSetEntry(Move.SLASH,36),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,42),
                        new MoveLearnSetEntry(Move.CHARM,48),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,54),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,60)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kokesheity");

    }


}
