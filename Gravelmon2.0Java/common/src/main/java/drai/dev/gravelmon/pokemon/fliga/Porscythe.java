package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Porscythe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Porscythe() {
        super("Porscythe",
                Type.STEEL, Type.DARK,
                new Stats(55,
                        110,
                        70,
                        80,
                        60,
                        105),
                List.of(Ability.SWIFT_SWIM), Ability.DEFIANT,
                9, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Porposcythe swim in the ocean at high speeds, using this to their advantage. Using their cunning but cruel intellect, they slash through prey or incoming threats using their blade-like mouth."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BEAT_UP,1),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,11),
                        new MoveLearnSetEntry(Move.METAL_CLAW,13),
                        new MoveLearnSetEntry(Move.ASSURANCE,16),
                        new MoveLearnSetEntry(Move.SWAGGER,20),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,22),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,24),
                        new MoveLearnSetEntry(Move.TORMENT,27),
                        new MoveLearnSetEntry(Move.LASH_OUT,31),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,34),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,39),
                        new MoveLearnSetEntry(Move.METEOR_MASH,43),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,49),
                        new MoveLearnSetEntry(Move.SWITCHEROO,53)
                ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 13, 29, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Porscythe");
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

    }


}
