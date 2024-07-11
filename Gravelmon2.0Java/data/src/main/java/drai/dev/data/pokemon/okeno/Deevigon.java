package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Deevigon extends drai.dev.data.pokemon.Pokemon {
    public Deevigon() {
        super("Maligon",
                Type.DRAGON,
                new Stats(63,
                        78,
                        74,
                        74,
                        58,
                        58),
                List.of(Ability.OUTBURST), Ability.CONTRARY,
                12, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                145, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Its vicious attitude makes it extremely hard to form a bond with. It takes a skilled trainer to make a Maligon value them as partners."),
                List.of(new EvolutionEntry("caballgon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,5),
                        new MoveLearnSetEntry(Move.RAGE,8),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,10),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,19),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,22),
                        new MoveLearnSetEntry(Move.SHOVEOFF,26),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,29),
                        new MoveLearnSetEntry(Move.PURSUIT,33),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,37),
                        new MoveLearnSetEntry(Move.BERSERKFURY,43),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,47),
                        new MoveLearnSetEntry(Move.OUTRAGE,55),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 17, 34, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maligon");

    }


}
