package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Amoebolt extends drai.dev.data.pokemon.Pokemon {
    public Amoebolt() {
        super("Amoebolt",
                Type.WATER, Type.ELECTRIC,
                new Stats(90,
                        30,
                        75,
                        105,
                        90,
                        65),
                List.of(Ability.POISON_HEAL), Ability.COLOR_CHANGE,
                17, 165,
                new Stats(0,0,0,2,0,0), 80,
                0.5,
                172, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_2),
                List.of("Pollutants processed by its cytoplasm are converted into electrical energy. This makes it one of the most versatile Pokemon when it comes to environmental preservation, being both a reliable source of renewable energy and a cleaner of oceanic pollution."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,9),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.RECOVER,18),
                        new MoveLearnSetEntry(Move.AQUA_RING,23),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,27),
                        new MoveLearnSetEntry(Move.SCALD,36),
                        new MoveLearnSetEntry(Move.SAFEGUARD,40),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,47),
                        new MoveLearnSetEntry(Move.DISCHARGE,50),
                        new MoveLearnSetEntry(Move.HAZE,60),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 22, 43, .56, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
