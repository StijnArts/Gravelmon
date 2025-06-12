package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Macatherm extends drai.dev.data.pokemon.Pokemon {
    public Macatherm() {
        super("Macatherm",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The buoyant organ around its waist inflates during the winter, letting it float on the surface of the hot springs it frequents. They are often seen seasoning their food in the spring water before eating it, suggesting humanlike intelligence."),
                List.of(new EvolutionEntry("geyserilla", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(      new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,18),
                        new MoveLearnSetEntry(Move.FLASH,20),
                        new MoveLearnSetEntry(Move.AGILITY,23),
                        new MoveLearnSetEntry(Move.FLAME_BURST,26),
                        new MoveLearnSetEntry(Move.ICYCHARGE,28),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,32),
                        new MoveLearnSetEntry(Move.BOUNCE,34),
                        new MoveLearnSetEntry(Move.LIGHTUP,39),
                        new MoveLearnSetEntry(Move.ICE_BEAM,41),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,45),
                        new MoveLearnSetEntry(Move.METEORSHOWER,48),
                        new MoveLearnSetEntry(Move.ACROBATICS,51),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,53),
                        new MoveLearnSetEntry(Move.BLIZZARD,55)                 ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Macatherm");

    }


}
