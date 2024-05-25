package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Destropod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Destropod() {
        super("Destropod",
                Type.WATER,
                new Stats(80,
                        80,
                        80,
                        90,
                        85,
                        85),
                List.of(Ability.SWIFT_SWIM), Ability.SUNSCREEN,
                21, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("It is said when angered, they can whip up tsunamis at will. Surfers enjoy having Destropod as company, because they secrete a film that acts as an excellent sunscreen."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.SURF,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.SPLASH,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 43, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH, Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
