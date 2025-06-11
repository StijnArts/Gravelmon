package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Parceps extends drai.dev.data.pokemon.Pokemon {
    public Parceps() {
        super("Parceps",
                Type.GRASS, Type.FIGHTING,
                new Stats(75,
                        115,
                        90,
                        40,
                        60,
                        100),
                List.of(Ability.NATURAL_CURE,Ability.NO_GUARD,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,0,0,0,0,2), 80,
                0.85,
                120, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It takes pride in the musculature of its immensely powerful legs. If another Parceps enters its territory, they have a 'pose-off', the loser being exiled from the area."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,11),
                        new MoveLearnSetEntry(Move.SYNTHESIS,18),
                        new MoveLearnSetEntry(Move.JUMP_KICK,25),
                        new MoveLearnSetEntry(Move.BOUNCE,30),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,36),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,45),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Parceps");

    }


}
