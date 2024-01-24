package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Devilicious extends drai.dev.gravelmon.pokemon.Pokemon {
    public Devilicious() {
        super("Devilicious",
                Type.NORMAL,Type.FAIRY,
                new Stats(60,
                        50,
                        90,
                        60,
                        90,
                        65),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                8, 165,
                new Stats(0,0,1,0,1,0), 0,
                0.5,
                145, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Devilicious spends its days sleeping, hiding out among plush toys in children's rooms. At night, it awakens and the fun begins."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,11),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,15),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,21),
                        new MoveLearnSetEntry(Move.SWALLOW,25),
                        new MoveLearnSetEntry(Move.TRICKORTREAT,31),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,35),
                        new MoveLearnSetEntry(Move.DARK_PULSE,41),
                        new MoveLearnSetEntry(Move.MOONLIGHT,45),
                        new MoveLearnSetEntry(Move.SWEETDECAY,51),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,55),
                        new MoveLearnSetEntry(Move.BELCH,60)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Devilicious");

    }


}
