package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Caballgon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caballgon() {
        super("Caballgon",
                Type.DRAGON,
                new Stats(89,
                        102,
                        91,
                        89,
                        78,
                        85),
                List.of(Ability.OUTBURST), Ability.CONTRARY,
                23, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                239, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Caballgon's breath is capable of making flowers whither and trees perish. After stomping the ground with its hooved feet, this Pokemon lifts off and flies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,5),
                        new MoveLearnSetEntry(Move.RAGE,8),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,10),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,19),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,22),
                        new MoveLearnSetEntry(Move.SHOVEOFF,26),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,29),
                        new MoveLearnSetEntry(Move.PURSUIT,33),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,39),
                        new MoveLearnSetEntry(Move.BERSERKFURY,46),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 56, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
