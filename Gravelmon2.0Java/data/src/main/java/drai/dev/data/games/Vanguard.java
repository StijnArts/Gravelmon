package drai.dev.data.games;


import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.ayrei.Firomenis;
import drai.dev.data.pokemon.ayrei.Merlicun;
import drai.dev.data.pokemon.ayrei.Solacor;
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

public class Vanguard extends Game {
    public Vanguard() {
        super("Vanguard");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Magnemelt());
        pokemon.add(new Fleumingo());
        pokemon.add(new Loathedisc());
        pokemon.add(new Gyropass());
        pokemon.add(new Amacorala());
        pokemon.add(new Solacor());
        pokemon.add(new Dunmyth());
        pokemon.add(new Dundragon());
        pokemon.add(new Wolfum());
        pokemon.add(new Supiritto());
        pokemon.add(new Infernadeer());
        pokemon.add(new Cradecart());
        pokemon.add(new Sylure());
        pokemon.add(new Syrallure());
        pokemon.add(new Syrenade());
        pokemon.add(new Tartot());
        pokemon.add(new Teranigrade());
        pokemon.add(new Setsarec());
        //TODO
//        pokemon.add(new Panvolt()); //MISSING ART
//        pokemon.add(new Simivolt()); //MISSING ART
//        pokemon.add(new Klawbby()); //MISSING ART
        pokemon.add(new Dunemoth());
        pokemon.add(new Dofrio());
        pokemon.add(new Siginome());
        pokemon.add(new Khortares());
        pokemon.add(new Reincarnape());
        pokemon.add(new Togenix());
        pokemon.add(new Reapatisse());
        pokemon.add(new Habaneevil());
        pokemon.add(new Gatiriopteryx()); //TODO fossil
        pokemon.add(new Therapex()); //TODO fossil
        pokemon.add(new Astralaxy()); //TODO fossil
        pokemon.add(new Masimuthi());
        pokemon.add(new Wraifanggal());
        pokemon.add(new Mujineon());
        pokemon.add(new Spareon());
        pokemon.add(new Almireon());
//        pokemon.add(new Quartzeon()); //MISSING ART
        pokemon.add(new Evoleon());
        pokemon.add(new Caeleon());
        pokemon.add(new Saureon());
        pokemon.add(new Burreon());
        pokemon.add(new Halluceon());
        pokemon.add(new Vultema());
        pokemon.add(new Parlomai());
        pokemon.add(new Valevant());
        pokemon.add(new Narwail());
        pokemon.add(new Morphias());
//        pokemon.add(new Posuirin()); //MISSING ART
        pokemon.add(new Svetrier());
        pokemon.add(new Drukknir());
        pokemon.add(new Sleihesnire());
//        pokemon.add(new Golmachina()); //MISSING ART
    }
}
