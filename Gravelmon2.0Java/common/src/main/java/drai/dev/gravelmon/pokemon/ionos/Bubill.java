package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bubill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bubill() {
        super("Bubill",
                Type.FIRE, Type.DARK,
                new Stats(60,
                        79,
                        50,
                        79,
                        66,
                        60),
                List.of(Ability.FLASH_FIRE), Ability.UNNERVE,
                6, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Whenever children are taken away by Daimonize and dragged to the underworld, they eventually turn into Bubill. A mean spirited Pokémon that doesn't play well with others. The intense and fiery glare of Bubill can burn rocks and trees to cinder and ash."),
                List.of(new EvolutionEntry("daimonize", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WILLOWISP,4),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.BULK_UP,11),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.NIGHTBALL,18),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,22),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,39),
                        new MoveLearnSetEntry(Move.DARK_PULSE,43),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,46)
                ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bubill");

    }


}
