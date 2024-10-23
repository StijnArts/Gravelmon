package drai.dev.data.pokemon.lagoone;


import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.mushi.*;
import drai.dev.data.pokemon.theos.*;
import drai.dev.data.pokemon.kuria.*;
import drai.dev.data.pokemon.ottora.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mongratis.*;
import drai.dev.data.pokemon.ultraspace.*;
import drai.dev.data.pokemon.urzavos.*;
import drai.dev.data.pokemon.terranov.*;
import drai.dev.data.pokemon.enjin.*;
import drai.dev.data.pokemon.mystis.*;
import drai.dev.data.pokemon.pastelisland.*;
import drai.dev.data.pokemon.neonintendo.*;
import drai.dev.data.pokemon.tokas.*;
import drai.dev.data.pokemon.panjaea.*;
import drai.dev.data.pokemon.cyare.*;
import drai.dev.data.pokemon.olysos.*;
import drai.dev.data.pokemon.nodorro.*;
import drai.dev.data.pokemon.orbis.*;
import drai.dev.data.pokemon.avalos.*;
import drai.dev.data.pokemon.ruskow.*;
import drai.dev.data.pokemon.otopo.*;
import drai.dev.data.pokemon.goetia.*;
import drai.dev.data.pokemon.ionos.*;
import drai.dev.data.pokemon.lagoone.*;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.avoris.*;
import drai.dev.data.pokemon.enriko.*;
import drai.dev.data.pokemon.ferroa.*;
import drai.dev.data.pokemon.hiza.*;
import drai.dev.data.pokemon.hub.*;
import drai.dev.data.pokemon.interregional.*;
import drai.dev.data.pokemon.isiah.*;
import drai.dev.data.pokemon.junnin.*;
import drai.dev.data.pokemon.lonava.*;
import drai.dev.data.pokemon.mythire.*;
import drai.dev.data.pokemon.nosto.*;
import drai.dev.data.pokemon.novrai.*;
import drai.dev.data.pokemon.oceane.*;
import drai.dev.data.pokemon.okeno.*;
import drai.dev.data.pokemon.orohnhavai.*;
import drai.dev.data.pokemon.qamor.*;
import drai.dev.data.pokemon.rica.*;
import drai.dev.data.pokemon.varitas.*;
import drai.dev.data.pokemon.aristos.*;
import drai.dev.data.pokemon.midamis.*;
import drai.dev.data.pokemon.norheim.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Torshell extends drai.dev.data.pokemon.Pokemon {
    public Torshell() {
        super("Torshell",
                Type.FIRE,
                new Stats(50,
                        47,
                        56,
                        59,
                        43,
                        60),
                List.of(Ability.BLAZE), Ability.BLAZE,
                5, 35,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Their high body temperatures causes the sand in their nests to turn into glass. The flames on its head change into various patterns according to their emotions."),
                List.of(new EvolutionEntry("emberaid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(            new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 1),
                        new MoveLearnSetEntry(Move.ROAR, 12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 16),
                        new MoveLearnSetEntry(Move.PROTECT, 20),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 24),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 28),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 35),
                        new MoveLearnSetEntry(Move.BODY_PRESS, 40),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, 48),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 56),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 64),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 72),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, 80),
                        new MoveLearnSetEntry(Move.ERUPTION, 88)            ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Torshell");

    }


}
