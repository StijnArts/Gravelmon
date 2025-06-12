package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Desperasca extends drai.dev.data.pokemon.Pokemon {
    public Desperasca() {
        super("Desperasca",
                Type.GRASS, Type.FIGHTING,
                new Stats(76,
                        88,
                        50,
                        55,
                        77,
                        99),
                List.of(Ability.DEFIANT,Ability.SAND_FORCE,Ability.STEADFAST), Ability.STEADFAST,
                14, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It skillfully delivers powerful kicks and blows on its foe, surely knocking them out. After knocking them out, it leaves a kiss mark on them as a warning sign to others."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.LEECH_SEED,15),
                        new MoveLearnSetEntry(Move.SEED_BOMB,20),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,24),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.MUD_SHOT,34),
                        new MoveLearnSetEntry(Move.BULK_UP,38),
                        new MoveLearnSetEntry(Move.BODY_SLAM,43),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,47),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,53)
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Desperasca");

    }


}
