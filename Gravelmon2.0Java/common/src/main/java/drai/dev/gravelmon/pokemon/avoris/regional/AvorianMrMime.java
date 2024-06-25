package drai.dev.gravelmon.pokemon.avoris.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AvorianMrMime extends drai.dev.gravelmon.pokemon.Pokemon {
    public AvorianMrMime(String originalMon, Aspect aspect) {
        super(originalMon, aspect,  "AvorianMrMime",
                Type.FIGHTING, Type.FAIRY,
                new Stats(60,
                        100,
                        65,
                        55,
                        90,
                        90),
                List.of(Ability.VITAL_SPIRIT), Ability.IRON_FIST,
                14, 590,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It combines dancing with boxing, clowning on its opponents to frustrate them. Then it delivers powerful strikes to knock them out. Its sweet aroma is known to make foes dizzy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,1),
                        new MoveLearnSetEntry(Move.WORK_UP,1),
                        new MoveLearnSetEntry(Move.ENDURE,12),
                        new MoveLearnSetEntry(Move.FEINT,15),
                        new MoveLearnSetEntry(Move.FORCE_PALM,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,20),
                        new MoveLearnSetEntry(Move.CALM_MIND,23),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,25),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,28),
                        new MoveLearnSetEntry(Move.PSYCH_UP,31),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,33),
                        new MoveLearnSetEntry(Move.POWER_TRICK,36),
                        new MoveLearnSetEntry(Move.RECOVER,47),
                        new MoveLearnSetEntry(Move.AXE_KICK,53),
                        new MoveLearnSetEntry(Move.COUNTER,53),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.MIMIC,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,"egg"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"egg"),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"egg")                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 46, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FREEZING))),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Mr. Mime");

    }


}
