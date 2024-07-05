package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grumpelstil extends drai.dev.data.pokemon.Pokemon {
    public Grumpelstil() {
        super("Grumpelstil",
                Type.DARK, Type.FIRE,
                new Stats(80,
                        120,
                        70,
                        60,
                        70,
                        80),
                List.of(Ability.PICKPOCKET,Ability.RIVALRY), Ability.FLASH_FIRE,
                15, 750,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("While they may seem festive, Grumpelstil is far from friendly. These Fire Trolls are notorious for their ambush tactics, lying in wait for unsuspecting prey and leaping out with surprising agility. Grumpelstil fiercely guards its territory, using a combination of intimidating postures and the flare of its fiery crown. Encroaching on its turf is ill-advised, as this Fire Troll Pokémon will not hesitate to defend its home with aggressive attacks. Trainers must exercise caution and respect boundar"),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grumpelstil");

    }


}
