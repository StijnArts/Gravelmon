package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PorytlegZ extends drai.dev.data.pokemon.Pokemon {
    public PorytlegZ() {
        super("PorytlegZ",
                Type.ELECTRIC, Type.DARK,
                new Stats(75,
                        90,
                        65,
                        90,
                        80,
                        100),
                List.of(Ability.INFESTEDDRIVE,Ability.SIMPLE,Ability.DOWNLOAD), Ability.DOWNLOAD,
                16, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The Dubious Disk causes Porytleg's bugs to go haywire, taking full control. It loves to plug into PCs, corrupting them and consuming the Pokemon held within."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONVERSION_2,1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,8),
                        new MoveLearnSetEntry(Move.METAL_CLAW,14),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,18),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,24),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,29),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,32),
                        new MoveLearnSetEntry(Move.COIL,38),
                        new MoveLearnSetEntry(Move.REVENGE,43),
                        new MoveLearnSetEntry(Move.IRON_HEAD,48)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Porytleg-Z");

    }


}
