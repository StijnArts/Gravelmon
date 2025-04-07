package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Royalert extends Pokemon {
    public Royalert() {
        super( "Royalert",
                Type.FIRE, Type.GROUND,
                new Stats(90,
                        120,
                        100,
                        70,
                        75,
                        75),
                List.of(Ability.BLAZE), Ability.FLAME_BODY,
                12, 648,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                209, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_FANG,1),
                        new MoveLearnSetEntry(Move.CRIMSON_DIVE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.EMBER,3),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,7),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,13),
                        new MoveLearnSetEntry(Move.BULLDOZE,16),
                        new MoveLearnSetEntry(Move.MAGNITUDE,18),
                        new MoveLearnSetEntry(Move.ROAR,23),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,26),
                        new MoveLearnSetEntry(Move.WILLOWISP,31),
                        new MoveLearnSetEntry(Move.FIRE_FANG,36),
                        new MoveLearnSetEntry(Move.REGAL_FANG,36),
                        new MoveLearnSetEntry(Move.CRUNCH,42),
                        new MoveLearnSetEntry(Move.SCARY_FACE,50),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,64),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.BURROW,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tutor"),
                        new MoveLearnSetEntry(Move.SPIKES,"tutor"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.BOLD_BLAZE,"tutor"),
                        new MoveLearnSetEntry(Move.TERRAFIRM,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tutor"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.SOIL_THROW,"egg"),
                        new MoveLearnSetEntry(Move.HOWL,"egg"),
                        new MoveLearnSetEntry(Move.MAGMA_RING,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"egg")
                ),
                List.of(Label.DENEB),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
