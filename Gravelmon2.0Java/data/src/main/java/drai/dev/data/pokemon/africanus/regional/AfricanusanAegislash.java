package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanAegislash extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanAegislash(String name, Aspect aspect) {
        super(name, aspect, "Aegislash",
                Type.STEEL,Type.FIGHTING,
                new Stats(90,
                        140,
                        130,
                        65,
                        85,
                        70),
                List.of(Ability.BATTLE_ARMOR), null,
                17, 530,
                new Stats(0,0,2,0,1,0), 222,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Cuando consigue un alma de gran héreo,evoluciona. Siendo un Pokémon digno de cónsules durante generaciones."),
                List.of(),
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
                        new MoveLearnSetEntry(Move.MANDOBLE,55),
                        new MoveLearnSetEntry(Move.BITTER_BLADE,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,20)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 51, 58, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aegislash");

    }


}
