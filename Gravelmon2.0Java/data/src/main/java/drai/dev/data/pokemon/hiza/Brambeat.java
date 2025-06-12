package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Brambeat extends drai.dev.data.pokemon.Pokemon {
    public Brambeat() {
        super("Brambeat",
                Type.GRASS, Type.FIGHTING,
                new Stats(52,
                        65,
                        57,
                        40,
                        40,
                        41),
                List.of(Ability.IRON_FIST), Ability.VITAL_SPIRIT,
                10, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Brambeat are small but feisty, they are often fighting each other for a good spot near the waterhole."),
                List.of(new EvolutionEntry("baobash", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))
                ),
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
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,47),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,53)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Brambeat");

    }


}
