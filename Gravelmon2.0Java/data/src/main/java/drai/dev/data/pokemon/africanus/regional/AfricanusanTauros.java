package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanTauros extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanTauros(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanTauros",
                Type.NORMAL,Type.STEEL,
                new Stats(90,
                        95,
                        95,
                        95,
                        45,
                        55),
                List.of(Ability.ANGER_POINT), null,
                14, 1300,
                new Stats(0,1,0,1,0,0), 45,
                1.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Le resulta imposible estarse quieto, por lo que los romanos les ponen una armadura desde que nacen, la cual sintetizan cómo su propia piel, ganando mucha resistencia y docilidad."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,11),
                        new MoveLearnSetEntry(Move.METAL_BURST,41),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,3),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,15),
                        new MoveLearnSetEntry(Move.FURIALEGION,55),
                        new MoveLearnSetEntry(Move.RAGE,5),
                        new MoveLearnSetEntry(Move.PAYBACK,24),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,63),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,8),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,35),
                        new MoveLearnSetEntry(Move.IRON_HEAD,19),
                        new MoveLearnSetEntry(Move.WORK_UP,29),
                        new MoveLearnSetEntry(Move.SWAGGER,48),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,71)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 47, 1.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tauros");

    }


}
