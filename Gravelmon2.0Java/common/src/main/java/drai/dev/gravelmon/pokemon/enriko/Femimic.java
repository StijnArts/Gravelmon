package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Femimic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Femimic() {
        super("Femimic",
                Type.FAIRY,Type.DARK,
                new Stats(85,
                        110,
                        50,
                        110,
                        80,
                        20),
                List.of(Ability.ARENA_TRAP), Ability.CUTE_CHARM,
                8, 165,
                new Stats(1,0,0,0,0,0), 180,
                0.0,
                93, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Pretending to be a damsel in distress, this sneaky sprite waits for people to come and 'save' it, lowering their guard for an easy strike."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,1),
                        new MoveLearnSetEntry(Move.SCREECH,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.ATTRACT,18),
                        new MoveLearnSetEntry(Move.SLUDGE,24),
                        new MoveLearnSetEntry(Move.SWEET_KISS,28),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,32),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.DARK_PULSE,40),
                        new MoveLearnSetEntry(Move.MOONLIGHT,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,48),
                        new MoveLearnSetEntry(Move.GUILLOTINE,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Femimic");

    }


}
