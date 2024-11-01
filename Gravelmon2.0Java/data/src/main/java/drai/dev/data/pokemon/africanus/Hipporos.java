package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hipporos extends drai.dev.data.pokemon.Pokemon {
    public Hipporos() {
        super("Hipporos",
                Type.WATER,
                new Stats(60,
                        60,
                        65,
                        45,
                        42,
                        45),
                List.of(Ability.SWIFT_SWIM), null,
                7, 160,
                new Stats(0,0,0,1,0,0), 255,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Hipporos es un pequeño hipocampo, le gusta jugar y come insectos y pequeños peces, sus escamas le protegen y sus bigote le avisan de peligros, usa su veneno para debilitar a sus presas, suelen ser pasivos y agradables con los humanos."),
                List.of(new EvolutionEntry("equxic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,16),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.POISON_STING,10)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Hipporos");

    }


}
