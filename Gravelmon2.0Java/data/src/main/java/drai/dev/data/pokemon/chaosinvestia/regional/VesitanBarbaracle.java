package drai.dev.data.pokemon.chaosinvestia.regional;


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
import drai.dev.data.pokemon.crozoic.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanBarbaracle extends drai.dev.data.pokemon.Pokemon {
    public VesitanBarbaracle(String name, Aspect aspect) {
        super(name, aspect, "VesitanBarbaracle",
                Type.ROCK,Type.STEEL,
                new Stats(90,
                        110,
                        130,
                        50,
                        63,
                        100),
                List.of(Ability.TOUGH_CLAWS,Ability.STURDY), null,
                13, 960,
                new Stats(0,2,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.WATER_1),
                List.of("Arme und Beine verfügen über eigene Gehirne, was ihnen relative Bewegungsfreiheit gewährt. Sie ordnen sich jedoch zumeist den Befehlen des Kopfes unter."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,44),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,33),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,60),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.SLASH,13),
                        new MoveLearnSetEntry(Move.CLAMP,20),
                        new MoveLearnSetEntry(Move.SKULL_BASH,65),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,28),
                        new MoveLearnSetEntry(Move.METAL_CLAW,39),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,55),
                        new MoveLearnSetEntry(Move.WITHDRAW,7),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,24),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,18),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,37),
                        new MoveLearnSetEntry(Move.IRON_HEAD,48),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,50)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 33, 45, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DRIPSTONE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Barbaracle");

    }


}
