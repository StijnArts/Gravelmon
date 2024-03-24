package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Duolecule extends drai.dev.gravelmon.pokemon.Pokemon {
    public Duolecule() {
        super("Duolecule",
                Type.WATER,
                new Stats(90,
                        40,
                        85,
                        85,
                        85,
                        85),
                List.of(Ability.HYDRATION), Ability.HYDRATION,
                5, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.0,
                141, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Its body constantly changes in appearance due to the intriguing way its molecules are arranged. In this form, Duolecule's squishy body can squeeze through small holes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COOLDOWN,1),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,4),
                        new MoveLearnSetEntry(Move.WATER_SPORT,8),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,12),
                        new MoveLearnSetEntry(Move.MINIMIZE,16),
                        new MoveLearnSetEntry(Move.ICY_WIND,20),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.STORED_POWER,28),
                        new MoveLearnSetEntry(Move.RECOVER,32),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,36),
                        new MoveLearnSetEntry(Move.TICKLE,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,44),
                        new MoveLearnSetEntry(Move.OVERHEAT,48),
                        new MoveLearnSetEntry(Move.SHEER_COLD,52)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 27, 1.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Duolecule");

    }


}
