package drai.dev.data.pokemon.fliga;


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
import drai.dev.data.pokemon.fliga.*;
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
public class Calaloof extends drai.dev.data.pokemon.Pokemon {
    public Calaloof() {
        super("Calaloof",
                Type.NORMAL,
                new Stats(52,
                        58,
                        47,
                        59,
                        55,
                        44),
                List.of(Ability.CUTE_CHARM,Ability.STICKY_HOLD), Ability.OWN_TEMPO,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Calaloof are timid Pokémon, and like to hide most of their face within discarded bags. These scaredy-pods are capable of a light hypnosis by shifting colors on their suction pods, but this has proven less effective on Pokémon of higher intelligence."),
                List.of(new EvolutionEntry("Cephalofear", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
                List.of(        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.FAKE_OUT,8),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,18),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,23),
                        new MoveLearnSetEntry(Move.CURSE,27),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,32),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,37),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,42),
                        new MoveLearnSetEntry(Move.SCARY_FACE,46),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,51),
                        new MoveLearnSetEntry(Move.LAST_RESORT,56),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,61)                ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Calaloof");

    }


}
