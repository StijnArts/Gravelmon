package drai.dev.gravelmon.pokemon.azure.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class MysticRiolu extends Pokemon {
    public MysticRiolu(int dexNo) {
        super(dexNo,"MysticRiolu",
                Type.FAIRY,
                new Stats(70, 40, 40, 60, 40, 35),
                List.of(Ability.OBLIVIOUS), Ability.STEELWORKER,
                7, 202,
                new Stats(1,0,0,0,0,0), 75,
                0.875,
                57, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(new EvolutionEntry("mysticlucario", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"180"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"\"night\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,4),
                        new MoveLearnSetEntry(Move.ENCORE,8),
                        new MoveLearnSetEntry(Move.AFTER_YOU,12),
                        new MoveLearnSetEntry(Move.BULLDOZE,16),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,20),
                        new MoveLearnSetEntry(Move.MOONLIGHT,24),
                        new MoveLearnSetEntry(Move.GRAVITY,28),
                        new MoveLearnSetEntry(Move.METEOR_MASH,32),
                        new MoveLearnSetEntry(Move.EARTH_POWER,36),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,44),
                        new MoveLearnSetEntry(Move.CALM_MIND,48)
                        ),
                List.of(Label.GEN4,Label.AZURE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 28, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Riolu");
    }
}
