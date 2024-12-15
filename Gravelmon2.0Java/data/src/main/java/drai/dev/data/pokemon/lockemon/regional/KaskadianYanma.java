package drai.dev.data.pokemon.lockemon.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class KaskadianYanma extends Pokemon {
    public KaskadianYanma(String name, Aspect aspect) {
        super(name, aspect,"KaskadianYanma",
                Type.BUG, Type.DRAGON,
                new Stats(65, 65, 45, 75, 45, 95),
                List.of(Ability.SWARM, Ability.MAGIC_GUARD), Ability.ARCANUM,
                12, 380,
                new Stats(0,0,0,0,0,1), 75,
                0.5,
                78, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("yanmage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.DRAGONS_DICE.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,11),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,14),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,22),
                        new MoveLearnSetEntry(Move.UPROAR,27),
                        new MoveLearnSetEntry(Move.BUG_BITE,30),
                        new MoveLearnSetEntry(Move.DRAGONS_DICE,33),
                        new MoveLearnSetEntry(Move.HYPNOSIS,38),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,43),
                        new MoveLearnSetEntry(Move.SCREECH,46),
                        new MoveLearnSetEntry(Move.UTURN,49),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,54),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.FEINT,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm")
                        ),
                List.of(Label.GEN2,Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 39, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Yanma");
        this.setCanFly(true);
    }
}
