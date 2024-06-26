package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class CefiranDelibird extends Pokemon {
    public CefiranDelibird(String name, Aspect aspect) {
        super(name, aspect,"CefiranDelibird",
                Type.DARK, Type.FLYING,
                new Stats(70,85,70,90,75,65),
                List.of(Ability.SKILL_LINK), Ability.PICKPOCKET,
                8, 550,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                130, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOUL_PLAY, 1),
                        new MoveLearnSetEntry(Move.PECK, 5),
                        new MoveLearnSetEntry(Move.LEER, 9),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 14),
                        new MoveLearnSetEntry(Move.TAUNT, 18),
                        new MoveLearnSetEntry(Move.PLUCK, 23),
                        new MoveLearnSetEntry(Move.SWAGGER, 28),
                        new MoveLearnSetEntry(Move.BULLET_SEED, 37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, 41),
                        new MoveLearnSetEntry(Move.DRILL_PECK, 45),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, 50),
                        new MoveLearnSetEntry(Move.DRILL_RUN, 54),
                        new MoveLearnSetEntry(Move.AGILITY, 60),
                        new MoveLearnSetEntry(Move.AURORA_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.PLUCK, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT, "egg"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, "egg"),
                        new MoveLearnSetEntry(Move.ICE_BALL, "egg"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN, "egg"),
                        new MoveLearnSetEntry(Move.SPLASH, "egg")
                ),
                List.of(Label.GEN2,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 45, 4.18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Delibird");
    }
}
