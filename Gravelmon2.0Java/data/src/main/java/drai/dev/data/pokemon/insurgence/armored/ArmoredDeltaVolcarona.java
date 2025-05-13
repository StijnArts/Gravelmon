package drai.dev.data.pokemon.insurgence.armored;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmoredDeltaVolcarona extends Pokemon {
    public ArmoredDeltaVolcarona(String name, Aspect aspect) {
        super(name, aspect,"ArmoredDeltaVolcarona",
                Type.DARK, Type.POISON,
                new Stats(85,
                        60,
                        85 ,
                        135,
                        137,
                        100),
                List.of(Ability.LEVITATE), Ability.ABSOLUTION,
                18, 640,
                new Stats(0,0,0,3,0,0), 15,
                .5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(new EvolutionEntry("deltavolcarona", EvolutionType.LEVEL_UP, List.of(), List.of())),
                List.of(
                ),
                List.of(Label.GEN1,Label.INSURGENCE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("deltavolcarona", new EvolutionEntry("armoreddeltavolcarona", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:netherite_helmet"));
    }
}
