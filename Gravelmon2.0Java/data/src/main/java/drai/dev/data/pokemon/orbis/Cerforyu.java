package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cerforyu extends drai.dev.data.pokemon.Pokemon {
    public Cerforyu() {
        super("Cerforyu",
                Type.NORMAL, Type.FIRE,
                new Stats(225,
                        75,
                        5,
                        5,
                        115,
                        45),
                List.of(Ability.WARMHANDS), Ability.WARMHANDS,
                10, 290,
                new Stats(2,0,0,0,0,0), 30,
                0.0,
                395, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.REFRESH,9),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,12),
                        new MoveLearnSetEntry(Move.SOFTBOILED,16),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,20),
                        new MoveLearnSetEntry(Move.MINIMIZE,23),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,28),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,33),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,39),
                        new MoveLearnSetEntry(Move.HEALING_WISH,57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,64)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Cerforyu");

    }


}
