package drai.dev.gravelmon.pokemon.orbis.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Wobbuffet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wobbuffet(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Wobbuffet",
                Type.PSYCHIC,
                new Stats(190,
                        33,
                        58,
                        33,
                        58,
                        33),
                List.of(Ability.SHADOW_TAG), Ability.TELEPATHY,
                13, 285,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Wobbuffet does nothing but endure attacks—it won't attack on its own. However, it won't endure an attack on its tail. When that happens, the Pokémon will try to take the foe with it using Destiny Bond."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,1),
                        new MoveLearnSetEntry(Move.COUNTER,1),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,1),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wobbuffet");

    }


}
