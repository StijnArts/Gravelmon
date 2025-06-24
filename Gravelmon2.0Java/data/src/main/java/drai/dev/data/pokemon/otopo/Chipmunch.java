package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chipmunch extends drai.dev.data.pokemon.Pokemon {
    public Chipmunch() {
        super("Chipmunch",
                Type.NORMAL,
                new Stats(64,
                        35,
                        46,
                        29,
                        48,
                        31),
                List.of(Ability.RUN_AWAY,Ability.PICKUP), Ability.CHEEK_POUCH,
                9, 181,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Found in and around Otopo's metropolitan regions. Chipmunch will scavenge food whenever it can, which frequently ends in it falling asleep and waking up in an unfamiliar place."),
                List.of(new EvolutionEntry("munchilla", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.BIDE,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,11),
                        new MoveLearnSetEntry(Move.CRUNCH,16),
                        new MoveLearnSetEntry(Move.SUPER_FANG,18)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Chipmunch");

    }


}
