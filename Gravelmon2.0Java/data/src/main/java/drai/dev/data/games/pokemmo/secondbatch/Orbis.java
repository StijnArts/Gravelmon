package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.ionos.IonosianMimeJr;
import drai.dev.data.pokemon.orbis.Pomdan;
import drai.dev.data.pokemon.orbis.*;
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

public class Orbis extends drai.dev.data.games.registry.Game {
    public Orbis() {
        super("Orbis");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new PokPalv1());
        pokemon.add(new Rascaloon());
        pokemon.add(new Raccowl());
        pokemon.add(new Squabbiz());
        pokemon.add(new Executove());
        pokemon.add(new Presigeont());
        pokemon.add(new Magpick());
        pokemon.add(new Magpeist());
        pokemon.add(new Nappi());
        pokemon.add(new Rubbage());
        pokemon.add(new Buzzero());
        pokemon.add(new Bulbillar());
        pokemon.add(new Glowva());
        pokemon.add(new Sectalamp());
//        pokemon.add(new Grubbrush());   Missing Stats
//        pokemon.add(new Pupallet());   Missing Stats
        pokemon.add(new Beasel());
        pokemon.add(new Squeebee());
        pokemon.add(new Baldy());
        pokemon.add(new Rubbaldy());
        pokemon.add(new Stickigum());
        pokemon.add(new Stickisticky());
//        pokemon.add(new Solseed());   Missing Stats
//        pokemon.add(new Suryala());   Missing Stats
//        pokemon.add(new Bellchsia());   Missing Stats
//        pokemon.add(new Fuchsiella());   Missing Stats
        pokemon.add(new Fuchsiadame());
        pokemon.add(new Blanfish());
        pokemon.add(new Dracolore());
        pokemon.add(new Kingulum());
        pokemon.add(new Acrown());
        pokemon.add(new Majestree());
        pokemon.add(new Timbug());
        pokemon.add(new Loustache());
        pokemon.add(new Spoutot());
        pokemon.add(new Fountier());
        pokemon.add(new Fonsdame());
        pokemon.add(new Cerforyu());
        pokemon.add(new Pampurr());
        pokemon.add(new Freyurr());
        pokemon.add(new Intimeow());
        pokemon.add(new Necromata());
        pokemon.add(new Caffiend());
        pokemon.add(new Baristroll());
        pokemon.add(new Delistork());
//        pokemon.add(new Trashlug());   Missing Stats
        pokemon.add(new Trashcargot());
        pokemon.add(new Chumpost());
        pokemon.add(new Componion());
        pokemon.add(new Badbud());
        pokemon.add(new Thorstle());
        pokemon.add(new Thistance());
        pokemon.add(new Nettic());
        pokemon.add(new Stinttle());
        pokemon.add(new Stimanic());
        pokemon.add(new Traffimite());
        pokemon.add(new Traffitron());
        pokemon.add(new Skenteur());
        pokemon.add(new Parfumou());
//        pokemon.add(new Searsage());   Missing Stats
        pokemon.add(new Frankfurnt());
//        pokemon.add(new Vermob());   Missing Stats
//        pokemon.add(new Verminion());   Missing Stats
        pokemon.add(new Vermicapone());
        pokemon.add(new Monsewer());
        pokemon.add(new Miremaid());
        pokemon.add(new Rubblock());
//        pokemon.add(new Debruin());   Missing Stats
        pokemon.add(new Bourubble());
//        pokemon.add(new Uninail());   Missing Stats
//        pokemon.add(new Desertusk());   Missing Stats
//        pokemon.add(new Burrorm());   Missing Stats
//        pokemon.add(new Burryrm());  Member of line Not Finished
        pokemon.add(new Baybee());
        pokemon.add(new Drillbee());
        pokemon.add(new Diggbee());
        pokemon.add(new Honarchee());
//        pokemon.add(new Tarexite());   Missing Stats
        pokemon.add(new Weyabitt());
        pokemon.add(new Weyatonne());
        pokemon.add(new Pomdan()); //Renamed from Pompuff
        pokemon.add(new Pufflepom());
//        pokemon.add(new Battrol());   Missing Stats
        pokemon.add(new Battrolor());
//        pokemon.add(new Kankrab());   Missing Stats
        pokemon.add(new Wrekrab());
        pokemon.add(new Sootot());
        pokemon.add(new Sweepmu());
        pokemon.add(new Palmbrella());
        pokemon.add(new Feistsea());
        pokemon.add(new Letharleo());
        pokemon.add(new Chickaring());
        pokemon.add(new Seadeek());
        pokemon.add(new Cappatross());
        pokemon.add(new Blufable());
        pokemon.add(new Conchle());
        pokemon.add(new Turtlantis());
//        pokemon.add(new Ittibitti());   Missing Stats
//        pokemon.add(new Nemish());   Missing Stats
//        pokemon.add(new Imprioni());   Missing Stats
//        pokemon.add(new Slugcus());   Missing Stats
//        pokemon.add(new Clownemone());   Missing Stats
        pokemon.add(new Finsail());
        pokemon.add(new Jellybag());
        pokemon.add(new Trasphin());
        pokemon.add(new Whaste());
//        pokemon.add(new Memoroot());   Missing Stats
        pokemon.add(new Spectralyra());
        pokemon.add(new Budgeaf());
        pokemon.add(new Gryphoyal());
        pokemon.add(new Zodiaking());
        pokemon.add(new Aburago());
//        pokemon.add(new Terraor());   Missing Stats
        pokemon.add(new Shadovizor());
        pokemon.add(new Whaloon());
        pokemon.add(new Orcloud());
        pokemon.add(new Deye());
        pokemon.add(new Pyroulette());
        pokemon.add(new Aerling());
        pokemon.add(new Cyclowyrm());
        pokemon.add(new Xephyron());
        pokemon.add(new Coralegion());
    }

}
