package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crinclub extends drai.dev.data.pokemon.Pokemon {
    public Crinclub() {
        super("Crinclub",
                Type.WATER,
                new Stats(50,
                        50,
                        150,
                        50,
                        135,
                        50),
                List.of(Ability.BATTLE_ARMOR), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A mon which has survived millions of years. Their ancestors had very tough bodies, allowing their skeletons to survive to be strong fossils scattered throughout the region's rocks. Crinclub in modern times carve out these fossils and wear them as both weaponry and armor."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,4),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.HARDEN,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.AQUA_RING,22),
                        new MoveLearnSetEntry(Move.DIVE,26),
                        new MoveLearnSetEntry(Move.MINIMIZE,30),
                        new MoveLearnSetEntry(Move.FLAIL,36),
                        new MoveLearnSetEntry(Move.ENSNARE,41),
                        new MoveLearnSetEntry(Move.COUNTER,45),
                        new MoveLearnSetEntry(Move.RECOVER,49),
                        new MoveLearnSetEntry(Move.LIQUIDATION,53),
                        new MoveLearnSetEntry(Move.COIL,57),
                        new MoveLearnSetEntry(Move.WRING_OUT,62),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,69),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Crinclub");

    }


}
