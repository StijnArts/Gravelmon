package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Mochrema extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mochrema() {
        super("Mochrema",
                Type.GROUND,Type.FAIRY,
                new Stats(110,
                        30,
                        78,
                        82,
                        100,
                        75),
                List.of(Ability.FLAME_BODY), Ability.SWEET_VEIL,
                9, 165,
                new Stats(1,0,0,0,1,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mochrema has a constant stream of foamy substance seeping out of pours in its skin around its head and neck. Its head is partially hollow, and a supply of dark, sweet sap is stored on top. One sip of the sap was said to be a cure all- from depression to headaches to severe illnesses. Scientific research concluded that that's not entirely true, but it still tastes great nonetheless."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.ABSORB,3),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.TWINEEDLE,13),
                        new MoveLearnSetEntry(Move.MAGNITUDE,16),
                        new MoveLearnSetEntry(Move.SPIKES,20),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,24),
                        new MoveLearnSetEntry(Move.SYNTHESIS,27),
                        new MoveLearnSetEntry(Move.AMNESIA,31),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,36),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.LEECH_SEED,46),
                        new MoveLearnSetEntry(Move.MOONBLAST,50)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 51, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL, Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mochrema");

    }


}
