package drai.dev.gravelmon.games.pokemmo.firstbatch;

import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.pokemon.atlas.Barkindle;


public class Atlas extends drai.dev.gravelmon.games.registry.Game {
    public Atlas() {        super("Atlas");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Fawnlora());
        pokemon.add(new Botaneer());
        pokemon.add(new Forelk());

        pokemon.add(new Baneep());
        pokemon.add(new Bannawk());
        pokemon.add(new Phoenan());

        pokemon.add(new Instick());
        pokemon.add(new Inscepter());
        pokemon.add(new Chloradise());

        pokemon.add(new Nawdile());
        pokemon.add(new Aliblador());
        pokemon.add(new Razorvile());

        //Fire
        pokemon.add(new Scorchet());
        pokemon.add(new Torchet());
        pokemon.add(new Regalient());

        pokemon.add(new Vulkidna());
        pokemon.add(new Heatreme());
        pokemon.add(new Ekiama());

        pokemon.add(new Ruflame());
        pokemon.add(new Reparch());
        pokemon.add(new Slymander());

        pokemon.add(new Barkindle());
        pokemon.add(new Wolflaze());
        pokemon.add(new Wolverize());

        //Water
        pokemon.add(new Finjoy());
        pokemon.add(new Finlock());
        pokemon.add(new Gandolph());

        pokemon.add(new Pumpel());
        pokemon.add(new Hydrank());
        pokemon.add(new Hydromedary());

        pokemon.add(new Caimar());
        pokemon.add(new Torpeed());
        pokemon.add(new Damasoar());

        pokemon.add(new Watuber());
        pokemon.add(new Berswade());
        pokemon.add(new Chambrawl());

        pokemon.add(new Roachem());
        pokemon.add(new Enkroach());
        pokemon.add(new Squabling());
        pokemon.add(new Suburvian());
        pokemon.add(new Horrendove());
        pokemon.add(new Rattoi());
        pokemon.add(new Skweakrat());
        pokemon.add(new Elastikrat());
        pokemon.add(new Foutune());
        pokemon.add(new Harmorial());
        pokemon.add(new Vermini());
        pokemon.add(new Vermpent());
        pokemon.add(new Seedent());
        pokemon.add(new Nuttone());
        pokemon.add(new Flutterbi());
        pokemon.add(new Stellarva());
        pokemon.add(new Crescoon());
        pokemon.add(new Moothnite());
        pokemon.add(new Bullirt());
        pokemon.add(new Dirterrier());
        pokemon.add(new Kitture());
        pokemon.add(new Fashewn());
        pokemon.add(new Lightwin());
        pokemon.add(new Hoowhip());
        pokemon.add(new Maidnite());
        pokemon.add(new Lickypop());
        pokemon.add(new Caramelix());
        pokemon.add(new Slithair());
        pokemon.add(new Nunette());
        pokemon.add(new Sisanne());
        pokemon.add(new Manna());
        pokemon.add(new Lemb());
        pokemon.add(new Vegelamb());
        pokemon.add(new Geomoss());
        pokemon.add(new Dialith());
        pokemon.add(new Solmec());
        pokemon.add(new Akakira());
        pokemon.add(new Barilbil());
        pokemon.add(new Haibril());
        pokemon.add(new Yolken());
        pokemon.add(new Roostegg());
        pokemon.add(new Secheel());
        pokemon.add(new Lannelid());
        pokemon.add(new Nyglow());
        pokemon.add(new Nyglare());
        pokemon.add(new Neonite());
        pokemon.add(new Tankton());
        var crocodily = new Crocodily();
        pokemon.add(crocodily);
//        pokemon.add(new OkenianCrocodily(crocodily.getPokedexNumber())); //Member of line not Finished
        pokemon.add(new Logrodile());
        pokemon.add(new Jawligator());
        pokemon.add(new Squirest());
        pokemon.add(new Phantomail());
        pokemon.add(new Pitchzall());
        pokemon.add(new Strikezall());
        pokemon.add(new Moppup());
        pokemon.add(new Shampooch());
        pokemon.add(new Skibis());
        pokemon.add(new Flamingant());
        pokemon.add(new Birchee());
        pokemon.add(new Birchop());
        pokemon.add(new Birchard());
        pokemon.add(new Silkch());
        pokemon.add(new Cachoe());
        pokemon.add(new Silxie());
        var dustar = new Dustar();
        pokemon.add(dustar);
        pokemon.add(new OkenianDustar("", Aspect.OKENIAN));
        pokemon.add(new Clustar());
        pokemon.add(new Astervoid());
        pokemon.add(new Compella());
        pokemon.add(new Esterite());
        pokemon.add(new Badgrow());
        pokemon.add(new Wreclaw());
        pokemon.add(new Criminook());
        pokemon.add(new Bandicrook());
        pokemon.add(new Dartibi());
        pokemon.add(new Revolpod());
        pokemon.add(new Gigadozer());
        pokemon.add(new Coralony());
        pokemon.add(new Barreef());
        pokemon.add(new Musshield());
        pokemon.add(new Anenemy());
        pokemon.add(new Shoaly());
        pokemon.add(new Tanchor());
        pokemon.add(new Petat());
        pokemon.add(new Pangai());
        pokemon.add(new Tamarawk());
        pokemon.add(new Bouldalo());
        pokemon.add(new Cindera());
        pokemon.add(new Caldona());
        pokemon.add(new Stelnova());
        pokemon.add(new Bashbee());
        pokemon.add(new Woolam());
        pokemon.add(new Alpalaine());
        pokemon.add(new Battenbae());
        pokemon.add(new Brickler());
        pokemon.add(new Hurdwall());
        pokemon.add(new Toxitube());
        pokemon.add(new Gassaster());
        pokemon.add(new Stalagrunt());
        pokemon.add(new Stalagang());

        pokemon.add(new Freezef());
        pokemon.add(new Treezen());
        pokemon.add(new Echidnum());
        pokemon.add(new Thundret());
        pokemon.add(new Sandshar());
        pokemon.add(new Sharkastle());
        pokemon.add(new Wisper());
        pokemon.add(new Wispette());
        pokemon.add(new Bubbauld());
        pokemon.add(new Bauldron());
        pokemon.add(new Ghoulotine());
        pokemon.add(new Guilloceive());
        pokemon.add(new Needow());
        pokemon.add(new Needoon());
        pokemon.add(new Needella());
        pokemon.add(new Polynett());
//        pokemon.add(new DhiomanPolynett());Member of line Not Finished
        pokemon.add(new Polyzap());
        pokemon.add(new Jollancer());
        pokemon.add(new Krillzaingel());
        pokemon.add(new Algrain());
        pokemon.add(new Kelpush());
        pokemon.add(new Kelprash());
        pokemon.add(new Gemmo());
////        pokemon.add(new Torrojo()); Missing Art
        pokemon.add(new Barrose());
        pokemon.add(new Baobloat());
        pokemon.add(new Festiata());
        pokemon.add(new Luchaburro());
        pokemon.add(new Osstrike());
        pokemon.add(new Prickub());
        pokemon.add(new Hiberneedle());
        pokemon.add(new Thorlock());
        pokemon.add(new Sandevil());
        pokemon.add(new Sandemonium());
        pokemon.add(new Cheecub());
        pokemon.add(new Speeda());
        pokemon.add(new Princeo());
        pokemon.add(new Reileo());
        pokemon.add(new Sandan());
        pokemon.add(new Sandtome());
        pokemon.add(new Phantrait());
        pokemon.add(new Vanitom());
        pokemon.add(new Velosoil());
        pokemon.add(new Rapterra());
        pokemon.add(new Titanodon());
        pokemon.add(new Whelter());
        pokemon.add(new Refhuge());
        pokemon.add(new Gammar());
        pokemon.add(new Zaptang());
        pokemon.add(new Mimish());
        pokemon.add(new Eelord());
        pokemon.add(new Aquaro());
        pokemon.add(new Aquarcher());
        pokemon.add(new Icee());
        pokemon.add(new Fraxeel());
        pokemon.add(new Colosseel());
        pokemon.add(new Snowoof());
        pokemon.add(new Blizzund());
        pokemon.add(new Hoofrost());
        pokemon.add(new Glacyak());
        pokemon.add(new Ragtoc());
        pokemon.add(new Chronotoc());
//        pokemon.add(new Glacyte()); Missing Art
//        pokemon.add(new Zentipreeze()); Member of line Not Finished
        pokemon.add(new Herokolus());
        pokemon.add(new Diskobolus());
        pokemon.add(new Atolus());
        pokemon.add(new Sauntler());
        pokemon.add(new Grevetiery());
        pokemon.add(new Necrogeist());
        pokemon.add(new Shimm());
        pokemon.add(new Zhimm());
        pokemon.add(new Shalazhimm());
        pokemon.add(new Fumystic());
        pokemon.add(new Fumeseous());
        pokemon.add(new Vimana());
        pokemon.add(new Vimanzia());

        pokemon.add(new Yokeye());
        pokemon.add(new Ghouch());
        pokemon.add(new Spireye());
//        pokemon.add(new Akute()); Member of line Not Finished
//        pokemon.add(new Oburious()); Missing Art
//        pokemon.add(new Anglondor()); Missing Art
        pokemon.add(new Polypus());
        pokemon.add(new Scubella());
        pokemon.add(new Galaguana());
        pokemon.add(new Reparine());
        pokemon.add(new Orbranch());
        pokemon.add(new Juraseed());
        pokemon.add(new Carnaceous());
        pokemon.add(new Carnibble());
        pokemon.add(new Carnosteus());
        pokemon.add(new Dilophang());
        pokemon.add(new Dilophright());
        pokemon.add(new Mampth());
        pokemon.add(new Mammolaya());
        pokemon.add(new Mesoth());
        pokemon.add(new Megatherice());
        pokemon.add(new Paow());
        pokemon.add(new Ganpaow());
        pokemon.add(new Yanpaow());
        pokemon.add(new Beaniscule());
        pokemon.add(new Beanormous());
        pokemon.add(new Visclaw());
        pokemon.add(new Edifierce());
        pokemon.add(new Aurorelk());
        pokemon.add(new Phanfrica());
        pokemon.add(new Penguinsula());
        pokemon.add(new Phanta());
        pokemon.add(new Lepiterros());
        pokemon.add(new Orotolas());
        pokemon.add(new Devilicious());

    }

}
