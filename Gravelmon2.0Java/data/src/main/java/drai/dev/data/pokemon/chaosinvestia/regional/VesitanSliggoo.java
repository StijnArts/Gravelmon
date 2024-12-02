package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanSliggoo extends drai.dev.data.pokemon.Pokemon {
    public VesitanSliggoo(String name, Aspect aspect) {
        super(name, aspect, "VesitanSliggoo",
                Type.DRAGON,Type.PSYCHIC,
                new Stats(68,
                        75,
                        60,
                        60,
                        83,
                        113),
                List.of(Ability.SAP_SIPPER,Ability.HYDRATION), null,
                8, 175,
                new Stats(0,0,0,0,0,2), 20,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Es verjagt Gegner durch Absonderung eines alles zersetzenden Schleims. Die zurückgebildeten Augäpfel des Pokémon gewähren ihm keine Sicht."),
                List.of(new EvolutionEntry("goodra vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,38),
                        new MoveLearnSetEntry(Move.FLAIL,28),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BIDE,13),
                        new MoveLearnSetEntry(Move.BODY_SLAM,32),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,18),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.PROTECT,9)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 52, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sliggoo");

    }


}
