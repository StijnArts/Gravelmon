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
public class VesitanXerneas extends drai.dev.data.pokemon.Pokemon {
    public VesitanXerneas(String name, Aspect aspect) {
        super(name, aspect, "VesitanXerneas",
                Type.FAIRY,Type.GRASS,
                new Stats(126,
                        131,
                        95,
                        99,
                        131,
                        98),
                List.of(Ability.FAIRY_AURA), null,
                30, 2150,
                new Stats(3,0,0,0,0,0), 70,
                -1.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Legenden nach kann dieses Pokémon ewiges Leben spenden. Es erscheint in einer mysteriösen Waldform."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,51),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,10),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,80),
                        new MoveLearnSetEntry(Move.OUTRAGE,93),
                        new MoveLearnSetEntry(Move.MOONBLAST,35),
                        new MoveLearnSetEntry(Move.HORN_LEECH,55),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,5),
                        new MoveLearnSetEntry(Move.PSYCH_UP,59),
                        new MoveLearnSetEntry(Move.GRAVITY,18),
                        new MoveLearnSetEntry(Move.GEOMANCY,26),
                        new MoveLearnSetEntry(Move.MEGAHORN,44),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,1),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.SEED_BOMB,72),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,88),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,63)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Xerneas");

    }


}
