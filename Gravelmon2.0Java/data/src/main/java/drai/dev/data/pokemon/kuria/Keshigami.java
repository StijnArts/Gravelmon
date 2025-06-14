package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Keshigami extends drai.dev.data.pokemon.Pokemon {
    public Keshigami() {
        super("Keshigami",
                Type.FAIRY, Type.GHOST,
                new Stats(75,
                        45,
                        106,
                        80,
                        106,
                        75),
                List.of(Ability.RATTLED,Ability.TECHNICIAN), Ability.CURSED_BODY,
                12, 192,
                new Stats(0,0,1,0,1,0), 45,
                1.0,
                192, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Keshigami is extremely shy, and will avoid any confrontation if possible. They are very hard to bond with because of this, but can make a very good partner if you can get them to open up."),
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
	
           setLangFileName("Keshigami");

    }


}
