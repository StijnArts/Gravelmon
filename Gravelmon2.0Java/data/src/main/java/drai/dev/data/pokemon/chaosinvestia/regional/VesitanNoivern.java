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
public class VesitanNoivern extends drai.dev.data.pokemon.Pokemon {
    public VesitanNoivern(String name, Aspect aspect) {
        super(name, aspect, "VesitanNoivern",
                Type.FAIRY,Type.DRAGON,
                new Stats(90,
                        89,
                        85,
                        123,
                        97,
                        85),
                List.of(Ability.FRISK,Ability.INFILTRATOR), null,
                15, 850,
                new Stats(0,0,0,2,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Es fliegt in finsterer, mondloser Nacht umher und macht Jagd auf achtlose Beute. Ist bei Dunkelheit jedem Gegner überlegen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,18),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPER_FANG,45),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,54),
                        new MoveLearnSetEntry(Move.BOOMBURST,75),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,54),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,31),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,60),
                        new MoveLearnSetEntry(Move.GUST,11),
                        new MoveLearnSetEntry(Move.WING_ATTACK,16),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,5),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.WHIRLWIND,42),
                        new MoveLearnSetEntry(Move.TAILWIND,35),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.ROOST,27),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,40),
                        new MoveLearnSetEntry(Move.MOONLIGHT,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,49)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Noivern");

    }


}
