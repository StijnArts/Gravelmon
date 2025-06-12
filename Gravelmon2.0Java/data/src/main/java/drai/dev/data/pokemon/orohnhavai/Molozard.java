package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Molozard extends drai.dev.data.pokemon.Pokemon {
    public Molozard() {
        super("Molozard",
                Type.FIRE,
                new Stats(68,
                        102,
                        61,
                        102,
                        57,
                        126),
                List.of(Ability.FRISK,Ability.LIMBER,Ability.DRY_SKIN), Ability.DRY_SKIN,
                11, 165,
                new Stats(0,0,0,1,0,1), 47,
                0.5,
                136, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Molozard, despite gaining a more devilish appearance and attitude, aren't insanely aggressive. They love trainers that feed them often. They're said to bring 'misfortune' (via explosions) to those who mistreat them. The chemicals stored in their tails are highly explosive. They can detach and fling the tail bomb at its enemies or drop them behind if being chased. The tail then explodes, causing severe burns on their target."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,12),
                        new MoveLearnSetEntry(Move.ENDURE,16),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,19),
                        new MoveLearnSetEntry(Move.TORMENT,22),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,25),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,28),
                        new MoveLearnSetEntry(Move.FLAME_BURST,32),
                        new MoveLearnSetEntry(Move.FIRE_LASH,36),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,42),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,47),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,53),
                        new MoveLearnSetEntry(Move.EXPLOSION,60),
                        new MoveLearnSetEntry(Move.SPITE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Molozard");

    }


}
