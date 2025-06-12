package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kaskazog extends Pokemon {
    public Kaskazog() {
        super("Kaskazog",
                Type.POISON, Type.FAIRY,
                new Stats(75,
                        85,
                        65,
                        110,
                        65,
                        120),
                List.of(Ability.POISON_TOUCH, Ability.DRUIDRY), Ability.PRANKSTER,
                6, 140,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                180, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.TAUNT,8),
                        new MoveLearnSetEntry(Move.FLATTER,12),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,16),
                        new MoveLearnSetEntry(Move.VENOSHOCK,20),
                        new MoveLearnSetEntry(Move.MUD_SHOT,24),
                        new MoveLearnSetEntry(Move.SWAGGER,28),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,32),
                        new MoveLearnSetEntry(Move.TOXIC,36),
                        new MoveLearnSetEntry(Move.MOONLIGHT,40),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,48),
                        new MoveLearnSetEntry(Move.PSYCHIC,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FEINT,"egg"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
