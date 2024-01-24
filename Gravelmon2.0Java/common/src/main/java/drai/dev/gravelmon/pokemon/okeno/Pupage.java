package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pupage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pupage() {
        super("Pupage",
                Type.BUG,Type.FAIRY,
                new Stats(40,
                        30,
                        60,
                        30,
                        40,
                        20),
                List.of(Ability.SHIELD_DUST), Ability.PLOTTWIST,
                8, 165,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Evo Rest Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REST,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pupage");

    }


}
