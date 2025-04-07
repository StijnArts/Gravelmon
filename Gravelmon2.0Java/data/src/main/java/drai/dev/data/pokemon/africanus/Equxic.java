package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Equxic extends drai.dev.data.pokemon.Pokemon {
    public Equxic() {
        super("Equxic",
                Type.WATER,Type.POISON,
                new Stats(75,
                        80,
                        88,
                        62,
                        53,
                        57),
                List.of(Ability.SWIFT_SWIM), null,
                10, 225,
                new Stats(0,0,1,0,0,1), 45,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Equxic es la evolución de Hipporos, usa su veneno para cazar, en esta forma empieza a usar el poder de sus devastadores coletazos, aunque aún no sabe controlarlos."),
                List.of(new EvolutionEntry("Marecampus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,28),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,32),
                        new MoveLearnSetEntry(Move.POISON_TAIL,20),
                        new MoveLearnSetEntry(Move.AQUA_JET,24),
                        new MoveLearnSetEntry(Move.CROSS_POISON,36)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.ULTRA_RARE, 16, 40, 3.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Equxic");

    }


}
