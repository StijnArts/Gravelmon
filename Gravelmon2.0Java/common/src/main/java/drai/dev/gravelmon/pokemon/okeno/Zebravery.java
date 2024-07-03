package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Zebravery extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zebravery() {
        super("Zebravery",
                Type.FIGHTING,
                new Stats(78,
                        105,
                        95,
                        62,
                        80,
                        100),
                List.of(Ability.QUICK_FEET,Ability.INNER_FOCUS,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("High Jump KickSTAB Fighting Power Trick Psychic Me First Normal Switcheroo Dark"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.POWER_TRICK,"tm"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zebravery");

    }


}
