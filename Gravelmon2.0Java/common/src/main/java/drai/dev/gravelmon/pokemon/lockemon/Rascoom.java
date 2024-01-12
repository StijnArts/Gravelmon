package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Rascoom extends Pokemon {
    public Rascoom() {
        super("Rascoom",
                Type.FIRE, Type.STEEL,
                new Stats(70,
                        130,
                        60,
                        90,
                        60,
                        115),
                List.of(Ability.CARBON_CAPTURE, Ability.AFTERMATH), Ability.STRONG_JAW,
                9, 1231,
                new Stats(0,2,0,0,0,0), 160,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,4),
                        new MoveLearnSetEntry(Move.INCINERATE,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.FIRE_FANG,16),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,24),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.IRON_HEAD,36),
                        new MoveLearnSetEntry(Move.TAUNT,40),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,44),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,48),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 45, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
    }
}
