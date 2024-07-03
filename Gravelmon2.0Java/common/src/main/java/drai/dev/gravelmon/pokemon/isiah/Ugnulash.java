package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Ugnulash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ugnulash() {
        super("Ugnulash",
                Type.NORMAL,
                new Stats(90,
                        90,
                        85,
                        55,
                        75,
                        90),
                List.of(Ability.GUTS,Ability.ANGER_POINT,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                17, 165,
                new Stats(1,1,0,0,0,0), 45,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WORK_UP,5),
                        new MoveLearnSetEntry(Move.PAYBACK,10),
                        new MoveLearnSetEntry(Move.ASSURANCE,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,20),
                        new MoveLearnSetEntry(Move.SCARY_FACE,25),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,30),
                        new MoveLearnSetEntry(Move.RAGING_BULL,35),
                        new MoveLearnSetEntry(Move.REST,40),
                        new MoveLearnSetEntry(Move.SWAGGER,45),
                        new MoveLearnSetEntry(Move.THRASH,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,55),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,60)),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ugnulash");

    }


}
