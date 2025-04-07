package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanHonedge extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanHonedge(String name, Aspect aspect) {
        super(name, aspect, "Honedge",
                Type.STEEL,Type.FIGHTING,
                new Stats(50,
                        100,
                        90,
                        25,
                        45,
                        30),
                List.of(Ability.STURDY), null,
                8, 20,
                new Stats(0,0,1,0,0,0), 222,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Las espadas forjadas en tierra Hispana eran usadas por soldados, y una vez estos morían, si habían luchado con valor, se reencarnaban en estos pokémon."),
                List.of(new EvolutionEntry("doublade africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.ARM_THRUST,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ANCHOR_SHOT,35),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,47),
                        new MoveLearnSetEntry(Move.SLASH,29),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,32),
                        new MoveLearnSetEntry(Move.METAL_SOUND,8),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,18),
                        new MoveLearnSetEntry(Move.PURSUIT,13),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,5),
                        new MoveLearnSetEntry(Move.POWER_TRICK,39),
                        new MoveLearnSetEntry(Move.IRON_HEAD,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,20),
                        new MoveLearnSetEntry(Move.METAL_SOUND,"egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"egg")                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 32, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Honedge");

    }


}
