package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.mastenia.MastenianVolbeat;
import drai.dev.data.pokemon.mastenia.regional.*;
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

public class Mastenia extends drai.dev.data.games.registry.Game {
    public Mastenia() {
        super("Mastenia");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new MastenianShroomish("", Aspect.MASTENIAN));
        pokemon.add(new MastenianBreloom("", Aspect.MASTENIAN));
        pokemon.add(new MastenianChinchou("", Aspect.MASTENIAN));
        pokemon.add(new MastenianLanturn("", Aspect.MASTENIAN));
        pokemon.add(new MastenianTorchic("", Aspect.MASTENIAN));
        pokemon.add(new MastenianCombusken("", Aspect.MASTENIAN));
        pokemon.add(new MastenianPsyduck("", Aspect.MASTENIAN));
        pokemon.add(new MastenianGolduck("", Aspect.MASTENIAN));
        pokemon.add(new MastenianTreecko("", Aspect.MASTENIAN));
        pokemon.add(new MastenianGrovyle("", Aspect.MASTENIAN));
        pokemon.add(new MastenianIllumise("", Aspect.MASTENIAN));
        pokemon.add(new MastenianVolbeat("", Aspect.MASTENIAN));
        pokemon.add(new MastenianKomala("", Aspect.MASTENIAN));
        pokemon.add(new MastenianLarvitar("", Aspect.MASTENIAN));
        pokemon.add(new MastenianPupitar("", Aspect.MASTENIAN));
        pokemon.add(new MastenianMudkip("", Aspect.MASTENIAN));
        pokemon.add(new MastenianTentacool("", Aspect.MASTENIAN));
        pokemon.add(new MastenianWooper("", Aspect.MASTENIAN));
//        pokemon.add(new Kididna());   Missing Stats
//        pokemon.add(new Hididna());   Missing Stats
        pokemon.add(new Wreckidna());
//        pokemon.add(new Platykid());   Missing Stats
//        pokemon.add(new Platysus());   Missing Stats
        pokemon.add(new Searopod());
//        pokemon.add(new Bwibble());   Missing Stats
//        pokemon.add(new Sailizard());   Missing Stats
        pokemon.add(new Dracurrent());
        pokemon.add(new Cereusaur());
        pokemon.add(new Savazard());
        pokemon.add(new Boltoise());
        pokemon.add(new Deceptile());
        pokemon.add(new Henquinn());
//        pokemon.add(new Chromerge());   Missing Stats
//        pokemon.add(new Devidare());   Missing Stats
//        pokemon.add(new Rochpillar());   Missing Stats
//        pokemon.add(new Roccoon());   Missing Stats
//        pokemon.add(new Papilitite());   Missing Stats
//        pokemon.add(new Burblu());   Missing Stats
//        pokemon.add(new Crestrike());   Missing Stats
//        pokemon.add(new Faewren());   Missing Stats
//        pokemon.add(new Psychu());   Missing Stats
//        pokemon.add(new Bombat());   Missing Stats
//        pokemon.add(new Bombarbat());   Missing Stats
//        pokemon.add(new Worrish());   Missing Stats
//        pokemon.add(new Tuleep());   Missing Stats
//        pokemon.add(new Ceremonia());   Missing Stats
//        pokemon.add(new Terrainiac());   Missing Stats
//        pokemon.add(new Quagfire());   Missing Stats
//        pokemon.add(new Tasmeanie());   Missing Stats
//        pokemon.add(new Tasmighty());   Missing Stats
//        pokemon.add(new Sparkatoo());   Missing Stats
//        pokemon.add(new Kiwee());   Missing Stats
//        pokemon.add(new Kookabrra());   Missing Art
//        pokemon.add(new Didoge());   Missing Stats
//        pokemon.add(new Dingdog());   Missing Stats
//        pokemon.add(new Curseed());   Missing Stats
//        pokemon.add(new Tauntrunk());   Missing Stats
//        pokemon.add(new Grumfish());   Missing Stats
//        pokemon.add(new Crocoshy());   Missing Stats
//        pokemon.add(new Savagnile());   Missing Stats
//        pokemon.add(new Macrabi());   Missing Stats
        pokemon.add(new Crabutan());
//        pokemon.add(new Elefleur());   Missing Stats
//        pokemon.add(new Elefret());   Missing Stats
        pokemon.add(new Bubbit());
//        pokemon.add(new Bunomi());   Missing Stats
//        pokemon.add(new Bunelania());   Missing Stats
//        pokemon.add(new Delfine());   Missing Stats
//        pokemon.add(new Tentarule());   Missing Stats
//        pokemon.add(new Gulligull());   Missing Stats
//        pokemon.add(new Albacross());   Missing Stats
        pokemon.add(new Abyssmulk());
//        pokemon.add(new Nonono());   Missing Stats
        pokemon.add(new Serpyre());
//        pokemon.add(new Adaptoad()); Member of line not finished
//        pokemon.add(new Trancendo());   Missing Stats
//        pokemon.add(new Lizphard());   Missing Stats
//        pokemon.add(new Plasmuff());   Missing Stats
//        pokemon.add(new Phanpunk());   Missing Stats
//        pokemon.add(new Banshriek());   Missing Stats
//        pokemon.add(new Echoplasm());   Missing Stats
//        pokemon.add(new Leturte());   Missing Stats
//        pokemon.add(new Morturtle());   Missing Stats
//        pokemon.add(new Chickling());   Missing Stats
//        pokemon.add(new Strickhen());   Missing Stats
//        pokemon.add(new Kangaskid());   Missing Art
        pokemon.add(new Kingaskhan());
//        pokemon.add(new Boltbat());   Missing Stats
//        pokemon.add(new Roladuck());   Missing Stats
//        pokemon.add(new Wandix());   Missing Stats
//        pokemon.add(new Steadix());   Missing Stats
//        pokemon.add(new Magneflite());   Missing Stats
//        pokemon.add(new Magnozone());   Missing Stats
        pokemon.add(new Larvicous());
        pokemon.add(new Flyterror());
//        pokemon.add(new Mantism());   Missing Stats
//        pokemon.add(new Larvresta());   Missing Stats
//        pokemon.add(new Lunamoth());   Missing Stats
//        pokemon.add(new Mothumbra());   Missing Stats
//        pokemon.add(new Heatant());   Missing Stats
//        pokemon.add(new Durmor());   Missing Stats
//        pokemon.add(new Beetleer());   Missing Stats
//        pokemon.add(new Cryscrawler());   Missing Stats
        pokemon.add(new Esmezra());
//        pokemon.add(new Gonut());   Missing Stats
//        pokemon.add(new Frygirr());   Missing Stats
        pokemon.add(new Yipbun());
//        pokemon.add(new Detome());   Missing Stats
        pokemon.add(new Rogbaahl());
//        pokemon.add(new Reabuto());   Missing Stats
//        pokemon.add(new Mawvile());   Missing Stats
        pokemon.add(new Parasight());
//        pokemon.add(new Wakkabana());   Missing Stats
        pokemon.add(new Terrawr());
//        pokemon.add(new Scurple());   Missing Stats
        pokemon.add(new Scorperor());
//        pokemon.add(new Ogrean());   Missing Stats
//        pokemon.add(new Bebushi());   Missing Stats
//        pokemon.add(new Conferocious());   Missing Stats
        pokemon.add(new Hissmoke());
        pokemon.add(new Wulvlacine());
        pokemon.add(new Terratusk());
//        pokemon.add(new Drump()); Member of line Not Finished  Missing Stats
//        pokemon.add(new Fredoron()); Member of line Not Finished
        pokemon.add(new Tidaltar());
//        pokemon.add(new Palmguana());   Missing Stats
//        pokemon.add(new Ferocice());   Missing Stats
//        pokemon.add(new Turteller());   Missing Stats
//        pokemon.add(new Terrosect());   Missing Stats
        pokemon.add(new Resurexor());
        pokemon.add(new Obspeedian());
        pokemon.add(new Tecthanic());
        pokemon.add(new Paruwha());
//        pokemon.add(new Stunzeed());   Missing Art
    }

}
