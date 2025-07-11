package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Metunn extends Pokemon {
    public Metunn() {
        super("Metunn",
                Type.PSYCHIC, Type.GHOST,
                new Stats(200, 120, 180, 120, 180, 200),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                UnitConverter.feetToMeters(2, 9), UnitConverter.lbsToKg(1110),
                new Stats(0,3,0,0,0,0), 60,
                -1,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1)
                ),
                List.of(Label.BLAZING_EMERALD, Label.JOKE),
                1, List.of(
                        new ItemDrop("gravelmon:ancient_glyph",10, 1,1)),
                new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .atNight()
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	

        this.setPreEvolution("unown");
        this.setCanFly(true);
        addAdditionalEvolution("unown", new EvolutionEntry("metunn", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:ancient_glyph"));
    }
}
