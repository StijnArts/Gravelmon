package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class CefiranFlygon extends Pokemon {
    public CefiranFlygon(int dexNo) {
        super(dexNo,"CefiranFlygon",
                Type.BUG, Type.DRAGON,
                new Stats(80,100,80,100,80,80),
                List.of(Ability.STEALTH_WINGED), Ability.STEALTH_WINGED,
                20, 820,
                new Stats(0,1,0,2,0,0), 45,
                0.5,
                270, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SONIC_BOOM, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 1),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, 1),
                        new MoveLearnSetEntry(Move.SAND_TOMB, 1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 4),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 7),
                        new MoveLearnSetEntry(Move.SAND_TOMB, 10),
                        new MoveLearnSetEntry(Move.MUDSLAP, 13),
                        new MoveLearnSetEntry(Move.TACKLE, 17),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 21),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 25),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 29),
                        new MoveLearnSetEntry(Move.SCREECH, 34),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 35),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 39),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 44),
                        new MoveLearnSetEntry(Move.BOOMBURST, 49),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 55)
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 45, 52, 0.02, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Flygon");
        setCanFly(true);
    }
}
