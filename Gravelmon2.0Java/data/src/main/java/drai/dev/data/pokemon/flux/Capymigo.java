package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Capymigo extends Pokemon {
    public Capymigo() {
        super("Capymigo",
                Type.NORMAL,
                new Stats(130,
                        35,
                        95,
                        70,
                        80,
                        40),
                List.of(Ability.FRIEND_GUARD, Ability.OBLIVIOUS), Ability.UNAWARE,
                10, 800,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                255, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.FAIRY),
                List.of("It has a tranquil nature and cannot be bothered by anything, even the most persistent annoyance. Just being near it is said to have a calming effect."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LIFE_DEW,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.CHARM,9),
                        new MoveLearnSetEntry(Move.REST,12),
                        new MoveLearnSetEntry(Move.SNORE,12),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.YAWN,18),
                        new MoveLearnSetEntry(Move.HEART_STAMP,23),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,28),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,33),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,38),
                        new MoveLearnSetEntry(Move.SLACK_OFF,43),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,48),
                        new MoveLearnSetEntry(Move.WISH,53),
                        new MoveLearnSetEntry(Move.SUPER_FANG,58),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,63),
                        new MoveLearnSetEntry(Move.NUZZLE,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS, Biome.IS_HILLS)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
