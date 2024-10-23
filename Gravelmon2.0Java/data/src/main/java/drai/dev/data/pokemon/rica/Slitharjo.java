package drai.dev.data.pokemon.rica;


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
public class Slitharjo extends drai.dev.data.pokemon.Pokemon {
    public Slitharjo() {
        super("Slitharjo",
                Type.GHOST,Type.GROUND,
                new Stats(130,
                        70,
                        60,
                        95,
                        60,
                        100),
                List.of(Ability.MIMICRY,Ability.INFILTRATOR), Ability.REGENERATOR,
                15, 10,
                new Stats(2,0,0,0,0,0), 75,
                0.0,
                181, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_3),
                List.of("With a body that seems neither liquid or solid, this Pokémon slithers around like a shadow. Although harmless, it startles those who are caught offguard when it rises from the ground."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.MUDSPORTN,6),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,10),
                        new MoveLearnSetEntry(Move.MUD_SHOT,14),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,21),
                        new MoveLearnSetEntry(Move.MUD_BOMB,24),
                        new MoveLearnSetEntry(Move.RECOVER,27),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,30),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,33),
                        new MoveLearnSetEntry(Move.JUMPSCARE,37),
                        new MoveLearnSetEntry(Move.SUCKERPUNCHN,41),
                        new MoveLearnSetEntry(Move.MUDSLIDE,45),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,50),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,56),
                        new MoveLearnSetEntry(Move.GLARE,60),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,70),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.ENDUREN,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.WRING_OUT,"tm"),
                        new MoveLearnSetEntry(Move.MISTN,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slitharjo");

    }


}
