package drai.dev.data.pokemon.kuria;


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
public class Drajinn extends drai.dev.data.pokemon.Pokemon {
    public Drajinn() {
        super("Drajinn",
                Type.DRAGON,
                new Stats(70,
                        100,
                        110,
                        90,
                        110,
                        40),
                List.of(Ability.STURDY), Ability.SOLID_ROCK,
                12, 474,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Drajinn have outgrown their home, but are now stuck and unable to fully emerge. Despite this, they will still live their lives as if there's nothing wrong."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BITE,3),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,6),
                        new MoveLearnSetEntry(Move.ASSURANCE,9),
                        new MoveLearnSetEntry(Move.TAUNT,12),
                        new MoveLearnSetEntry(Move.SLASH,15),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,18),
                        new MoveLearnSetEntry(Move.METAL_CLAW,21),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,27),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,30),
                        new MoveLearnSetEntry(Move.IRON_HEAD,33),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,39),
                        new MoveLearnSetEntry(Move.OUTRAGE,42),
                        new MoveLearnSetEntry(Move.GUILLOTINE,45),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,48)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 36, 51, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Drajinn");

    }


}
