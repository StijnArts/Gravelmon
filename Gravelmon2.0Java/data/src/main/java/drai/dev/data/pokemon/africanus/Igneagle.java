package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Igneagle extends drai.dev.data.pokemon.Pokemon {
    public Igneagle() {
        super("Igneagle",
                Type.FIRE,Type.FLYING,
                new Stats(67,
                        78,
                        50,
                        90,
                        60,
                        70),
                List.of(Ability.BLAZE,Ability.FLASH_FIRE), null,
                7, 160,
                new Stats(0,0,0,1,0,0), 255,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Igneagle es la evolución de Harreg, es un pokémon muy activo, cómo consecuencia suele robar armas y montar jaleo, pero si está de tu lado, será una gran ayuda."),
                List.of(new EvolutionEntry("Imperiavem", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.STEEL_WING,20),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,24),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,27),
                        new MoveLearnSetEntry(Move.ACROBATICS,32),
                        new MoveLearnSetEntry(Move.ROOST,17),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,16)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 3.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Igneagle");

    }


}
