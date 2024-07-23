package drai.dev.data.games.pokemmo.secondbatch;



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

import java.util.*;

public class Urzavos extends drai.dev.data.games.registry.Game {
    public Urzavos() {
        super("Urzavos");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Spritten());
        pokemon.add(new Predageist());
        pokemon.add(new Phanther());
        pokemon.add(new Ambystar());   
        pokemon.add(new Amphibula());   
        pokemon.add(new Galaxalotl(new Stats(530, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Psyalii());   
        pokemon.add(new Dusynap());   
        pokemon.add(new Injelligent(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Squiruff());
        pokemon.add(new Scuffrel());
        pokemon.add(new Peap());   
        pokemon.add(new Peafuddle());   
        pokemon.add(new Peadazzled(new Stats(490, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Peaknighted(new Stats(490, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Ahrimini(new Stats(370, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED))));      
        pokemon.add(new Prikkle());   
        pokemon.add(new Pinzineedl(new Stats(430, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Lizleaf());   
        pokemon.add(new Thistliz());   
        pokemon.add(new Brambazard(new Stats(460, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Hayboo());   
        pokemon.add(new Effighast(new Stats(450, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Skeinter());   
        pokemon.add(new Aracknit(new Stats(440, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Rodoll());   
        pokemon.add(new Verplushie(new Stats(445, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        pokemon.add(new Brrbear());
        pokemon.add(new Brrzolt());
        pokemon.add(new Plumbee());
        pokemon.add(new Pupoke());   
        pokemon.add(new Briarasp(new Stats(480, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Elemuttal());   
        pokemon.add(new Caniflame(new Stats(450, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Thounder(new Stats(450, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Permafruff(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Snatchirp());   
        pokemon.add(new Corvosene(new Stats(440, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Constellapin(new Stats(370, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Ichorot());
        pokemon.add(new Statikub());   
        pokemon.add(new Urzap());   
        pokemon.add(new Batteary(new Stats(500, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Bawlmire());   
        pokemon.add(new Miserooze());   
        pokemon.add(new Depressoil(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Hilaribat());   
        pokemon.add(new Histerijeist(new Stats(470, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));      
        pokemon.add(new Parasuck());   
        pokemon.add(new Hemorobbin(new Stats(460, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Sedimollusk());
        pokemon.add(new Gastropow());
        pokemon.add(new Mosshroud());
        pokemon.add(new Murkreep());
        pokemon.add(new Bateeny());
        pokemon.add(new Bathemoth(new Stats(478, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Brachiboing());
        pokemon.add(new Soaropod(new Stats(480, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        pokemon.add(new Souropod());
        pokemon.add(new Apatoplek(new Stats(480, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Whirlifern());
        pokemon.add(new Ferneurosis(new Stats(478, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Luminlite());
        pokemon.add(new Luminlux());   
        pokemon.add(new Lumineye());
        pokemon.add(new Prickity());   
        pokemon.add(new Ruffhaws());
    }

}
