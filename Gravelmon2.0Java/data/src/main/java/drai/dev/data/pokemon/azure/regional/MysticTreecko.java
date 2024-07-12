package drai.dev.data.pokemon.azure.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class MysticTreecko extends Pokemon {
    public MysticTreecko(String name, Aspect aspect) {
        super(name, aspect,"MysticTreecko",
                Type.FLYING,
                new Stats(40, 35, 45, 55, 65, 70),
                List.of(Ability.LIMBER), Ability.KEEN_EYE,
                5, 50,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON, EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("mysticgrovyle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,2),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GUST,8),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,16),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,20),
                        new MoveLearnSetEntry(Move.METRONOME,24),
                        new MoveLearnSetEntry(Move.AFTER_YOU,28),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,32),
                        new MoveLearnSetEntry(Move.SAFEGUARD,36),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,40),
                        new MoveLearnSetEntry(Move.BATON_PASS,44),
                        new MoveLearnSetEntry(Move.LAST_RESORT,48),
                        new MoveLearnSetEntry(Move.WISH,52)
                        ),
                List.of(Label.GEN3,Label.AZURE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_ARID))),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Treecko");
        setCanFly(true);
    }
}
