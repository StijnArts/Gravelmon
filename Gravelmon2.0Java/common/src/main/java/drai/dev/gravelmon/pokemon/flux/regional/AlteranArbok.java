package drai.dev.gravelmon.pokemon.flux.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AlteranArbok extends Pokemon {
    public AlteranArbok(String name, Aspect aspect) {
        super(name, aspect,"AlteranArbok",
                Type.FIGHTING,
                new Stats(60, 100, 74, 60, 79, 75),
                List.of(Ability.GUTS, Ability.SHED_SKIN), Ability.TECHNICIAN,
                18, 700,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Alteran ARBOK has developed a longer tail compared to its Kantonian form, allowing it to wrangle prey with ease or let loose a flurry of powerful whips."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRANGLE,1),
                        new MoveLearnSetEntry(Move.FIRE_LASH,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.GLARE,12),
                        new MoveLearnSetEntry(Move.SCREECH,17),
                        new MoveLearnSetEntry(Move.REVENGE,20),
                        new MoveLearnSetEntry(Move.STOCKPILE,27),
                        new MoveLearnSetEntry(Move.SWALLOW,27),
                        new MoveLearnSetEntry(Move.SPIT_UP,27),
                        new MoveLearnSetEntry(Move.ENDURE,32),
                        new MoveLearnSetEntry(Move.REVERSAL,39),
                        new MoveLearnSetEntry(Move.QUASH,44),
                        new MoveLearnSetEntry(Move.POWER_WHIP,51),
                        new MoveLearnSetEntry(Move.TAUNT,56),
                        new MoveLearnSetEntry(Move.COIL,63),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,68),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"egg")
                        ),
                List.of(Label.GEN1,Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 45, 0.55, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Arbok");
        this.setPortraitXYZ(0,1.8,0);
    }
}
