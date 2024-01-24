package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Magnit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magnit() {
        super("Magnit",
                Type.ELECTRIC,Type.STEEL,
                new Stats(37,
                        58,
                        70,
                        40,
                        40,
                        20),
                List.of(Ability.MAGNET_PULL,Ability.CLEAR_BODY,Ability.BATTERY), Ability.BATTERY,
                8, 165,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_3),
                List.of("- Vise Grip Normal 5 Charge Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.CHARGE,5)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magnit");

    }


}
