package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.mushi.*;
import drai.dev.data.pokemon.olysos.Grimlin;
import drai.dev.data.pokemon.olysos.regional.*;
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
import drai.dev.data.pokemon.crozoic.*;
import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.africanus.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.ayrei.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.chaosinvestia.regional.*;
import drai.dev.data.pokemon.soulstones.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.olysos.*;

import java.util.*;

public class Olysos extends drai.dev.data.games.registry.Game {
    public Olysos() {
        super("Olysos");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Cubtus());
        pokemon.add(new Paddorn());
        pokemon.add(new Maanzagaro());
        pokemon.add(new Flambah());
        pokemon.add(new Ramligh());
        pokemon.add(new Vulkynamo());
        pokemon.add(new Sharkin());
        pokemon.add(new Mawrine());
        pokemon.add(new Orcanfrak());
//        pokemon.add(new Phasmox());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Teumixen());   Missing Art
//        pokemon.add(new Arfruff());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Laelupus());   Missing Art
        pokemon.add(new Woodpeckit());
        pokemon.add(new Peckster());
        pokemon.add(new Peckussion());
        pokemon.add(new Inferpillar());
        pokemon.add(new Flamupet());
        pokemon.add(new Flamothra(new Stats(420, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
//        pokemon.add(new Gnaphid());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Locusteror());   Missing Art
//        pokemon.add(new Punling());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Floretaya());   Missing Art
//        pokemon.add(new Grandrupe());   Missing Art
        pokemon.add(new Happetite());
        pokemon.add(new Serposter());
        pokemon.add(new Venobat());
        pokemon.add(new Noseferatu(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Tryprock());
        pokemon.add(new Trypagnet());
        pokemon.add(new Trypolisk());
        pokemon.add(new Grimlin());
        pokemon.add(new Grumpelstil());
        pokemon.add(new Oozegrim());
//        pokemon.add(new Kopiuzu());  MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Kebuzu());   Missing Art
//        pokemon.add(new Purazu());   Missing Art
//        pokemon.add(new Molore());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Minerolt());   Missing Art
//        pokemon.add(new Lunuhu());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Oracowl());   Missing Art
//        pokemon.add(new Plagfowl());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Misphecy());   Missing Art
//        pokemon.add(new Piedow());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Ceryneer());   Missing Art
//        pokemon.add(new Kabby());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Avalak());   Missing Art
//        pokemon.add(new Bubby());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Coarsent());   Missing Art
//        pokemon.add(new Yinyan());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Vivater());  MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Hydrona());   Missing Art
//        pokemon.add(new Squishid());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Squidgeist());   Missing Art
//        pokemon.add(new Qoxipus());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Plaxista());   Missing Art
//        pokemon.add(new Lapili());   MEMBER OF LINE NOT FINISHED
        pokemon.add(new Tasmon());
        pokemon.add(new Casanovil());
//        pokemon.add(new Lavaleon());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Chamelaze());   Missing Art
        pokemon.add(new Lavyrm());
        pokemon.add(new Maganon());
        pokemon.add(new Eruptinon());
        pokemon.add(new Tortorge());
        pokemon.add(new Alphayena(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))));
        pokemon.add(new Pepstep());
        pokemon.add(new Devilance());
//        pokemon.add(new Twoghast());   Missing Art
//        pokemon.add(new Forcaken());   Missing Art
//        pokemon.add(new Scrolock());   Missing Art
        pokemon.add(new Skarawel());
//        pokemon.add(new Traplat());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Trapolem());   Missing Art
        pokemon.add(new Allnown());
//        pokemon.add(new Mageleon());   Missing Art
//        pokemon.add(new Chereon());   Missing Art
        pokemon.add(new Rustank());
        pokemon.add(new Steamare());
//        pokemon.add(new Artikit());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Sabretal());   Missing Art
//        pokemon.add(new Solsaur());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Spinerno());   Missing Art
//        pokemon.add(new Snugub());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Plushug());   Missing Art
//        pokemon.add(new Draconaut());MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Nebulazer());   Missing Art
//        pokemon.add(new Velocidron());   Missing Art
//        pokemon.add(new Cupidove());   Missing Art
//        pokemon.add(new Kismean());   Missing Art
        pokemon.add(new Kryuu());
        pokemon.add(new Kryoalis());
        pokemon.add(new Phyuu());
        pokemon.add(new Phosos());
        pokemon.add(new Anyuu());
        pokemon.add(new Anufelis());
        pokemon.add(new Kaisaos());
        pokemon.add(new Monokron());
        pokemon.add(new Klepeck());
        pokemon.add(new Magusong(new Stats(440, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
//        pokemon.add(new Yukibi());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Yukiku());   Missing Art
//        pokemon.add(new Safrion());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Saffry());   Missing Art
//        pokemon.add(new Nagamufin());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Mediva());   Missing Art
//        pokemon.add(new Ladivy());   Missing Art
//        pokemon.add(new Terrino());   Missing Art
//        pokemon.add(new Mermana());   Missing Art
//        pokemon.add(new Fabumera());   Missing Art
//        pokemon.add(new Dideep());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Searkat());   Missing Art
//        pokemon.add(new Mosaile());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Krokoblok());   Missing Art
//        pokemon.add(new Mosalegod());   Missing Art
//        pokemon.add(new Flufflet());   Missing Art
//        pokemon.add(new Chrysow());   Missing Art
//        pokemon.add(new Worrym());   Missing Art
//        pokemon.add(new Sangorko());   Missing Art
        pokemon.add(new Zombark(new Stats(380, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));
        pokemon.add(new Serenine(new Stats(380, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   
    }

}
