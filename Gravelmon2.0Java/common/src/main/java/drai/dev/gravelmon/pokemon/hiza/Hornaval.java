package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hornaval extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hornaval() {
        super("Hornaval",
                Type.ICE,Type.WATER,
                new Stats(80,
                        100,
                        70,
                        110,
                        70,
                        95),
                List.of(Ability.THICK_FAT,Ability.LIGHTNING_ROD,Ability.REFRIGERATE), Ability.REFRIGERATE,
                19, 165,
                new Stats(0,1,0,1,0,0), 60,
                0.5,
                187, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("The sturdy ice coating on its horn is surprisingly sturdy, making it safer to use it in combat. Because of this, it is not afraid to get into fights."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,12),
                        new MoveLearnSetEntry(Move.REST,16),
                        new MoveLearnSetEntry(Move.SNORE,20),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,28),
                        new MoveLearnSetEntry(Move.ENCORE,35),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.SURF,46),
                        new MoveLearnSetEntry(Move.BLIZZARD,52),
                        new MoveLearnSetEntry(Move.HAIL,58),
                        new MoveLearnSetEntry(Move.SHEER_COLD,64)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 33, 55, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN)),
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
