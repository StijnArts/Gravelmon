package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Beetil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beetil() {
        super("Beetil",
                Type.BUG, Type.FLYING,
                new Stats(60,
                        80,
                        90,
                        50,
                        45,
                        70),
                List.of(Ability.SHELL_ARMOR,Ability.KEEN_EYE,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It eats leaves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LEER,9),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,15),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,19),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,22),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.COUNTER,31),
                        new MoveLearnSetEntry(Move.IRON_HEAD,34),
                        new MoveLearnSetEntry(Move.SCARY_FACE,38),
                        new MoveLearnSetEntry(Move.SUPERPOWER,41),
                        new MoveLearnSetEntry(Move.MEGAHORN,45),
                        new MoveLearnSetEntry(Move.PINCH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beetil");

    }


}
