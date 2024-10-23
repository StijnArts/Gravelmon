package drai.dev.data.games.pokemmo;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.hub.Confectious;
import drai.dev.data.pokemon.hub.Garbadjinn;
import drai.dev.data.pokemon.varitas.*;
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
import drai.dev.data.pokemon.africanus.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.ayrei.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.chaosinvestia.regional.*;
import drai.dev.data.pokemon.soulstones.*;
import drai.dev.data.pokemon.soulstones.regional.*;

import java.util.*;

public class Varitas extends drai.dev.data.games.registry.Game {
    public Varitas() {
        super("Varitas");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Pinecoon()); Member of line Not Finished
//        pokemon.add(new Vigileaf()); Missing Art
//        pokemon.add(new Enforester()); Missing Art
//        pokemon.add(new Scorchion()); Member of line Not Finished
        pokemon.add(new Capillar());
        pokemon.add(new Beacoon());
        pokemon.add(new Fulgoryu());
        pokemon.add(new Feebleg());
        pokemon.add(new Webbind());
        pokemon.add(new Taranterror());
        pokemon.add(new Dorsel());
        pokemon.add(new Riverous(new Stats(451, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Stalacbite());
        pokemon.add(new Stalagoyle(new Stats(410, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Cloddle()); Missing Art
//        pokemon.add(new Temperock()); Missing Art
//        pokemon.add(new Diamondure()); Missing Art
        pokemon.add(new Claggy());
        pokemon.add(new Scrachty());
        pokemon.add(new Meansprout());
        pokemon.add(new Meanstalk());
        pokemon.add(new Sinistalk(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Burnewt()); Missing Art
//        pokemon.add(new Amphiburn()); Missing Art
//        pokemon.add(new Oilimander()); Missing Art
//        pokemon.add(new Boowee()); Missing Art
//        pokemon.add(new Stridoar()); Missing Art
//        pokemon.add(new Byteau()); Missing Art
        pokemon.add(new Hoofin(new Stats(378, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Cervidrake()); Missing Art
        pokemon.add(new Wardrab());
        pokemon.add(new Menasuit());
        pokemon.add(new Dapperition());
//        pokemon.add(new Oddancer()); Missing Art
//        pokemon.add(new Dancentric()); Missing Art
        pokemon.add(new Plumplasm());
        pokemon.add(new Phantomnom(new Stats(461, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Sudoferno()); //Missing Art
//        pokemon.add(new MrCrime()); Missing Art
        pokemon.add(new Germite());
        pokemon.add(new Gastropox());
        pokemon.add(new Agitwin());
        pokemon.add(new Naeglerium());
        pokemon.add(new Dicell(new Stats(325, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Minicule());
        pokemon.add(new Atomix());
        pokemon.add(new Kwiklik());
        pokemon.add(new Binarray(new Stats(476, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))));
        pokemon.add(new Purradox(new Stats(423, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        pokemon.add(new Grimpire(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Hatterage()); Missing Art;
//        pokemon.add(new Knifish()); Missing Art
//        pokemon.add(new Pisword()); Mising Art
        pokemon.add(new Volcamone(new Stats(354, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
//        pokemon.add(new Nauticlown()); Missing Art
//        pokemon.add(new Bluega()); Member of line Not Finished
//        pokemon.add(new Narwave()); Missing Art
//        pokemon.add(new Bleakoat());Member of line Not Finished
//        pokemon.add(new Punchill());Missing Art
//        pokemon.add(new Snowbrawl());Missing Art
//        pokemon.add(new Whizoom());Missing Art
//        pokemon.add(new Urnaround());Missing Art
        pokemon.add(new Tanklang());
        pokemon.add(new Goopipe());
        pokemon.add(new Piplex());
        pokemon.add(new Sinklutter(new Stats(512, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        pokemon.add(new Galactix()); Missing Art
//        pokemon.add(new Marowing()); Missing Art

        pokemon.add(new Dustout(new Stats(498, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Kirinirik(new Stats(550, StatArchetype.MIXED_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Coreef()); Missing Art
//        pokemon.add(new Jollibird()); Missing Art
//        pokemon.add(new Smeartiste()); Missing Art
        pokemon.add(new Concealeon());
        pokemon.add(new Pestilint());
        pokemon.add(new Carvesta());
        pokemon.add(new Molcarona());
        pokemon.add(new Grimire());
        pokemon.add(new Stuk());
        pokemon.add(new Fretal());
        pokemon.add(new Canopeace());
        pokemon.add(new Grassola());
        pokemon.add(new Graceola());
        pokemon.add(new Severm());
        pokemon.add(new Infesteed());
        pokemon.add(new Frankensteen());
        pokemon.add(new Sporges());
        pokemon.add(new Mirrorigus());
        pokemon.add(new Porygon0());
//        pokemon.add(new Frostooth());Member of line Not Finished
//        pokemon.add(new Jawcicle()); Missing Art
//        pokemon.add(new Alliglacier()); Missing Art
        pokemon.add(new Snarlax());
        pokemon.add(new Lasaur());
        pokemon.add(new Lectrosaur());
        pokemon.add(new Confectious());
        pokemon.add(new Garbadjinn());
        pokemon.add(new Togetect());
    }

}
