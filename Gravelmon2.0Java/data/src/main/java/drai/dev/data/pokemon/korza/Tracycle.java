package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tracycle extends drai.dev.data.pokemon.Pokemon {
    public Tracycle() {
        super("Tracycle",
                Type.POISON,Type.FLYING,
                new Stats(85,
                        60,
                        75,
                        105,
                        85,
                        90),
                List.of(Ability.PICKUP,Ability.WEAK_ARMOR), Ability.OVERCOAT,
                10, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tracycle's spit is potent enough to break down most inorganic material to its basic form, such as plastic. They can then reshape the material for its own purpose."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,6),
                        new MoveLearnSetEntry(Move.PLUCK,11),
                        new MoveLearnSetEntry(Move.POISON_TAIL,15),
                        new MoveLearnSetEntry(Move.BARRIER,20),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,25),
                        new MoveLearnSetEntry(Move.ACROBATICS,29),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.SWITCHEROO,38),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,42),
                        new MoveLearnSetEntry(Move.RECYCLE,46),
                        new MoveLearnSetEntry(Move.ANTICOAGULANT,52),
                        new MoveLearnSetEntry(Move.ROOST,57),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,64),
                        new MoveLearnSetEntry(Move.HURRICANE,69)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tracycle");

    }


}
