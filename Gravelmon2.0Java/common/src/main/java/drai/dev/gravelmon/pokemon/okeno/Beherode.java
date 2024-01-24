package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Beherode extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beherode() {
        super("Beherode",
                Type.ROCK,
                new Stats(84,
                        115,
                        142,
                        48,
                        76,
                        40),
                List.of(Ability.WEAK_ARMOR,Ability.SAND_FORCE,Ability.SAND_STREAM), Ability.SAND_STREAM,
                8, 165,
                new Stats(0,1,2,0,0,0), 45,
                0.5,
                223, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The rock layer covering its body is constantly eroding into thin sand. Beherode uses its huge arms to create dens inside caves by crushing rock, where they raise Ignew."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"tm"),
                        new MoveLearnSetEntry(Move.SHARPEN,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beherode");

    }


}
