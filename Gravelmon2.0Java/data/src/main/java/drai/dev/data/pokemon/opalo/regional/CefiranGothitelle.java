package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class CefiranGothitelle extends Pokemon {
    public CefiranGothitelle(String name, Aspect aspect) {
        super(name, aspect,"CefiranGothitelle",
                Type.GHOST, Type.FIRE,
                new Stats(70,55,95,65,95,110),
                List.of(Ability.FLAME_BODY), Ability.CURSED_BODY,
                15, 440,
                new Stats(0,0,0,0,0,3), 50,
                0,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.CONFUSION, 1),
                        new MoveLearnSetEntry(Move.TICKLE, 1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, 1),
                        new MoveLearnSetEntry(Move.CONFUSION, 3),
                        new MoveLearnSetEntry(Move.EMBER, 7),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, 10),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP, 14),
                        new MoveLearnSetEntry(Move.PSYBEAM, 16),
                        new MoveLearnSetEntry(Move.CHARM, 19),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 24),
                        new MoveLearnSetEntry(Move.PSYSHOCK, 25),
                        new MoveLearnSetEntry(Move.MEAN_LOOK, 28),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, 31),
                        new MoveLearnSetEntry(Move.HEX, 34),
                        new MoveLearnSetEntry(Move.PSYCHIC, 39),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, 41),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 54),
                        new MoveLearnSetEntry(Move.INFERNO, 59),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 63)
                ),
                List.of(Label.GEN5,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 56, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_SOUL_FIRE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Gothitelle");
        addAdditionalEvolution("gothorita", new EvolutionEntry("gothitelle cefiran", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_NETHER.getId() + ":" + Biome.IS_NETHER.getName() +"\""))));
    }
}
