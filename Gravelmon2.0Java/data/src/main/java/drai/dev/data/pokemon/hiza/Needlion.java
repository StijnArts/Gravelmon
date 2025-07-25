package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Needlion extends drai.dev.data.pokemon.Pokemon {
    public Needlion() {
        super("Needlion",
                Type.POISON, Type.FLYING,
                new Stats(55,
                        80,
                        55,
                        50,
                        60,
                        65),
                List.of(Ability.POISON_TOUCH,Ability.SUPER_LUCK,Ability.SNIPER), Ability.SNIPER,
                9, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                126, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Needlion's venom was used to poison weapons during ancient times. Its venom is the only cure to those inflicted with it."),
                List.of(new EvolutionEntry("manecore", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.POISON_STING,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.ROAR,21),
                        new MoveLearnSetEntry(Move.ASSIST,25),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,28),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,33),
                        new MoveLearnSetEntry(Move.POISON_JAB,37),
                        new MoveLearnSetEntry(Move.EMBARGO,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,45)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Needlion");

    }


}
