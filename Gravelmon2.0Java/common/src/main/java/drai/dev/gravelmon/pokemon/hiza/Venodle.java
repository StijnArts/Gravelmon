package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Venodle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Venodle() {
        super("Venodle",
                Type.POISON,
                new Stats(30,
                        45,
                        45,
                        45,
                        45,
                        30),
                List.of(Ability.SHED_SKIN,Ability.UNNERVE,Ability.SAND_VEIL), Ability.SAND_VEIL,
                8, 165,
                new Stats(0,0,0,1,0,0), 225,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("Its fangs are still too small and fragile to be used to bite. It will instead spit poison and try to blind its foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.GLARE,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,26),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,31),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.WRING_OUT,41),
                        new MoveLearnSetEntry(Move.COIL,46),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Venodle");

    }


}
