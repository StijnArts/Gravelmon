package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Growlain extends drai.dev.data.pokemon.Pokemon {
    public Growlain() {
        super("Growlain",
                Type.ROCK, Type.DRAGON,
                new Stats(80,
                        120,
                        130,
                        80,
                        70,
                        100),
                List.of(Ability.INFURIATE), Ability.INFURIATE,
                42, 0,
                new Stats(0,1,2,0,0,0), 35,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A legendary beast of the Ancient Kingdom. Was referred to as the 'Warrior', and was cursed to grow bones as heavy armor to inhibit it's brutality. This failed, however, and now Growlian seeks an opponent strong enough to give it its eternal slumber."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.ROCK_THROW, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 3),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 6),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, 10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 13),
                        new MoveLearnSetEntry(Move.PROTECT, 17),
                        new MoveLearnSetEntry(Move.HEADBUTT, 21),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 27),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 30),
                        new MoveLearnSetEntry(Move.FACADE, 34),
                        new MoveLearnSetEntry(Move.ROLLOUT, 36),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 40),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 43),
                        new MoveLearnSetEntry(Move.DRACO_METEOR, 48),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 54),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, 58),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, 65),
                        new MoveLearnSetEntry(Move.METEOR_MASH, 69)              ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(65)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Growlain");

    }


}
