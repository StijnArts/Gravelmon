package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fernocious extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fernocious() {
        super("Fernocious",
                Type.GRASS,Type.POISON,
                new Stats(65,
                        120,
                        84,
                        70,
                        65,
                        99),
                List.of(Ability.LEAF_GUARD,Ability.STENCH,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,1,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("http://thumbs.dreamstime.com/z/cycad-seeds-261310.jpg ---- http://www.chinadaily.com.cn/world/att/site1/20060814/xin_580803141952451585516.jpg"),
                List.of(),
                List.of(                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fernocious");

    }


}
