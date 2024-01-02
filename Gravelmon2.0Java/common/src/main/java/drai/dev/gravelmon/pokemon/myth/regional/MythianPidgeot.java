package drai.dev.gravelmon.pokemon.myth.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class MythianPidgeot extends Pokemon {
    public MythianPidgeot(int dexNo) {
        super(dexNo,"MythianPidgeot",
                Type.ELECTRIC, Type.FLYING,
                new Stats( 83,80,75,101,70,70),
                List.of(Ability.KEEN_EYE,Ability.TANGLED_FEET), Ability.BIG_PECKS,
                15, 395,
                new Stats(0,0,0,3,0,0), 120,
                0.5,
                216, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It spreads its gorgeous wings widely to intimidate enemies. It races through the skies at Mach-2 speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.NUZZLE,17),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,21),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,25),
                        new MoveLearnSetEntry(Move.SWOOSH,29),
                        new MoveLearnSetEntry(Move.WING_ATTACK,33),
                        new MoveLearnSetEntry(Move.ROOST,37),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,41),
                        new MoveLearnSetEntry(Move.TALONSLASH,45),
                        new MoveLearnSetEntry(Move.AIR_SLASH,49),
                        new MoveLearnSetEntry(Move.THUNDER,53),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.DEFOG,"egg")
                ),
                List.of(Label.GEN1,Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 35, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN, Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Pidgeot");
        this.setCanFly(true);
    }
}
