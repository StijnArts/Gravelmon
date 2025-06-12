package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tekichu extends drai.dev.data.pokemon.Pokemon {
    public Tekichu(Stats stats) {
        super("Tekichu",
                Type.ELECTRIC, Type.FIGHTING,
                stats,
                List.of(Ability.RUBBERBODY,Ability.LIGHTNING_ROD,Ability.COMBATSKIN), Ability.COMBATSKIN,
                9, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tekichu suddenly appeared out of nowhere. For some reason, they have a strong hatred for Pikachu. They can withstand any electrical attacks or harsh combat due to their tough, durable rubber skin. Further research has concluded that Tekichu was manufactured and programmed to hate Pikachu. Who created them remains a mystery."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,12),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,14),
                        new MoveLearnSetEntry(Move.SPARK,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.FORCE_PALM,24),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,27),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,31),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,37),
                        new MoveLearnSetEntry(Move.ELECTRICCHEER,41),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,46),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,52),
                        new MoveLearnSetEntry(Move.PLASMA_FISTS,55),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,60)                  ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tekichu");

    }


}
