package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shakoruma extends drai.dev.data.pokemon.Pokemon {
    public Shakoruma() {
        super("Shakoruma",
                Type.WATER,Type.FIRE,
                new Stats(60,
                        125,
                        80,
                        115,
                        60,
                        90),
                List.of(Ability.STORM_DRAIN,Ability.TECHNICIAN), Ability.COLOR_CHANGE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("Shakoruma's strong arms are capable of punching faster than bullets, creating vacuums in the water that explode with the heat of the sun. Its eyes are able to see millions more colors than humans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,1),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.BUBBLE,3),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,7),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,13),
                        new MoveLearnSetEntry(Move.AQUA_JET,18),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,21),
                        new MoveLearnSetEntry(Move.MINIMIZE,26),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,31),
                        new MoveLearnSetEntry(Move.WATERFALL,36),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,40),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,44),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,50),
                        new MoveLearnSetEntry(Move.HYDROPUNCH,55),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,61),
                        new MoveLearnSetEntry(Move.AGILITY,66),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Shakoruma");

    }


}
