package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gumpeito extends drai.dev.data.pokemon.Pokemon {
    public Gumpeito() {
        super("Gumpeito",
                Type.GRASS,Type.FLYING,
                new Stats(55,
                        60,
                        85,
                        85,
                        45,
                        127),
                List.of(Ability.SWEET_VEIL), Ability.IRON_BARBS,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                160, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Gumpeito's large, broad leaves are used to glide between trees. Its coating is so hard that the inner sap erupts out in certain weak areas, such as its leaves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,4),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,10),
                        new MoveLearnSetEntry(Move.BULLET_SEED,14),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,20),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,25),
                        new MoveLearnSetEntry(Move.AIR_SLASH,29),
                        new MoveLearnSetEntry(Move.ACROBATICS,33),
                        new MoveLearnSetEntry(Move.SYNTHESIS,37),
                        new MoveLearnSetEntry(Move.LEECH_SEED,41),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,45),
                        new MoveLearnSetEntry(Move.STUN_SPORE,48),
                        new MoveLearnSetEntry(Move.SPIKES,53),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,59)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Gumpeito");

    }


}
