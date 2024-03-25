package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Solios extends drai.dev.gravelmon.pokemon.Pokemon {
    public Solios() {
        super("Solios",
                Type.FIRE,Type.PSYCHIC,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.SOLAR_POWER), Ability.SOLAR_POWER,
                5, 165,
                new Stats(0,0,0,3,0,0), 20,
                0.0,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.TELEPORT,7),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,14),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,21),
                        new MoveLearnSetEntry(Move.MORNING_SUN,28),
                        new MoveLearnSetEntry(Move.PSIBULLET,35),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,42),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,49),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,56),
                        new MoveLearnSetEntry(Move.SOLARFLARE,63),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,70),
                        new MoveLearnSetEntry(Move.SUNSTEEL_STRIKE,77)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Solios");

    }


}
