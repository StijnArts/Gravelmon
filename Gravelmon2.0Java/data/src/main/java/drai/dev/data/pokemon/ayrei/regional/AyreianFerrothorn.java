package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianFerrothorn extends drai.dev.data.pokemon.Pokemon {
    public AyreianFerrothorn(String name, Aspect aspect) {
        super(name, aspect, "Ferrothorn",
                Type.POISON,Type.STEEL,
                new Stats(74,
                        94,
                        131,
                        20,
                        54,
                        116),
                List.of(Ability.IRON_BARBS,Ability.POISON_POINT), null,
                10, 1100,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("They attach themselves to cave ceilings, firing steel spikes at targets passing beneath them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,40),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,30),
                        new MoveLearnSetEntry(Move.EXPLOSION,56),
                        new MoveLearnSetEntry(Move.CURSE,43),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,20),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.GYRO_BALL,49),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,25),
                        new MoveLearnSetEntry(Move.INGRAIN,15)                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ferrothorn");

    }


}
