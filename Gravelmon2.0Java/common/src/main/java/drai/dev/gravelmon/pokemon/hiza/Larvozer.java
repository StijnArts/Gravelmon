package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Larvozer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Larvozer() {
        super("Larvozer",
                Type.BUG,
                new Stats(80,
                        50,
                        120,
                        30,
                        50,
                        20),
                List.of(Ability.BULLETPROOF,Ability.HEAVY_METAL,Ability.SKILL_LINK), Ability.SKILL_LINK,
                9, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Larvozer's body has atleast 3 layers of armor protecting its body, the armor is so hard it can shrug off a direct hit from a cannonball."),
                List.of(new EvolutionEntry("armanzer", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,4),
                        new MoveLearnSetEntry(Move.METAL_CLAW,8),
                        new MoveLearnSetEntry(Move.BEAT_UP,12),
                        new MoveLearnSetEntry(Move.BUG_BITE,16),
                        new MoveLearnSetEntry(Move.BITE,20),
                        new MoveLearnSetEntry(Move.AGILITY,24),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.XSCISSOR,32),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.IRON_HEAD,44),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,48),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,52),
                        new MoveLearnSetEntry(Move.GUILLOTINE,56)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 43, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Larvozer");

    }


}
