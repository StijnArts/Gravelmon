package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Buboros extends drai.dev.data.pokemon.Pokemon {
    public Buboros() {
        super("Buboros",
                Type.GRASS,Type.POISON,
                new Stats(93,
                        67,
                        85,
                        97,
                        71,
                        87),
                List.of(Ability.HARVEST), Ability.HARVEST,
                15, 535,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("This pokemon uses its tail as a loud warning to stay out of the way. Buboros' tail berries are so delicious that pokemon can't resist trying to sneak up and get a bite."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.VINE_WHIP,6),
                        new MoveLearnSetEntry(Move.POISON_FANG,13),
                        new MoveLearnSetEntry(Move.BULLET_SEED,17),
                        new MoveLearnSetEntry(Move.STUN_SPORE,22),
                        new MoveLearnSetEntry(Move.POISON_TAIL,27),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,31),
                        new MoveLearnSetEntry(Move.LEECH_SEED,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,44),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,49),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,54),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,58),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,63),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,67)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Buboros");

    }


}
