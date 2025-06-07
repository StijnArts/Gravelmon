package drai.dev.data.games.pokemmo.done;

import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//Done https://pokengine.org/collections/10vvpsw8/Atlas
public class Atlas extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Atlas();
    private Atlas() {        super("Atlas");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Fawnlora().addLabels(Label.STARTER));
        addNewPokemon(new Botaneer().addLabels(Label.STARTER));
        addNewPokemon(new Forelk().addLabels(Label.STARTER));

        addNewPokemon(new Baneep().addLabels(Label.STARTER));
        addNewPokemon(new Bannawk().addLabels(Label.STARTER));
        addNewPokemon(new Phoenan().addLabels(Label.STARTER));

        addNewPokemon(new Instick().addLabels(Label.STARTER));
        addNewPokemon(new Inscepter().addLabels(Label.STARTER));
        addNewPokemon(new Chloradise().addLabels(Label.STARTER));

        addNewPokemon(new Nawdile().addLabels(Label.STARTER));
        addNewPokemon(new Aliblador().addLabels(Label.STARTER));
        addNewPokemon(new Razorvile().addLabels(Label.STARTER));

        //Fire
        addNewPokemon(new Scorchet().addLabels(Label.STARTER));
        addNewPokemon(new Torchet().addLabels(Label.STARTER));
        addNewPokemon(new Regalient().addLabels(Label.STARTER));

        addNewPokemon(new Vulkidna().addLabels(Label.STARTER));
        addNewPokemon(new Heatreme().addLabels(Label.STARTER));
        addNewPokemon(new Ekiama().addLabels(Label.STARTER));

        addNewPokemon(new Ruflame().addLabels(Label.STARTER));
        addNewPokemon(new Reparch().addLabels(Label.STARTER));
        addNewPokemon(new Slymander().addLabels(Label.STARTER));

        addNewPokemon(new Barkindle().addLabels(Label.STARTER));
        addNewPokemon(new Wolflaze().addLabels(Label.STARTER));
        addNewPokemon(new Wolverize().addLabels(Label.STARTER));

        //Water
        addNewPokemon(new Finjoy().addLabels(Label.STARTER));
        addNewPokemon(new Finlock().addLabels(Label.STARTER));
        addNewPokemon(new Gandolph().addLabels(Label.STARTER));

        addNewPokemon(new Pumpel().addLabels(Label.STARTER));
        addNewPokemon(new Hydrank().addLabels(Label.STARTER));
        addNewPokemon(new Hydromedary().addLabels(Label.STARTER));

        addNewPokemon(new Caimar().addLabels(Label.STARTER));
        addNewPokemon(new Torpeed().addLabels(Label.STARTER));
        addNewPokemon(new Damasoar().addLabels(Label.STARTER));

        addNewPokemon(new Watuber().addLabels(Label.STARTER));
        addNewPokemon(new Berswade().addLabels(Label.STARTER));
        addNewPokemon(new Chambrawl().addLabels(Label.STARTER));

        addNewPokemon(new Roachem());
        addNewPokemon(new Enkroach());
        addNewPokemon(new Squabling());
        addNewPokemon(new Suburvian());
        addNewPokemon(new Horrendove());
        addNewPokemon(new Rattoi());
        addNewPokemon(new Skweakrat());
        addNewPokemon(new Elastikrat());
        addNewPokemon(new Foutune());
        addNewPokemon(new Harmorial());
        addNewPokemon(new Vermini());
        addNewPokemon(new Vermpent());
        addNewPokemon(new Seedent());
        addNewPokemon(new Nuttone());
        addNewPokemon(new Flutterbi());
        addNewPokemon(new Stellarva());
        addNewPokemon(new Crescoon());
        addNewPokemon(new Moothnite());
        addNewPokemon(new Bullirt());
        addNewPokemon(new Dirterrier());
        addNewPokemon(new Kitture());
        addNewPokemon(new Fashewn());
        addNewPokemon(new Lightwin());
        addNewPokemon(new Hoowhip());
        addNewPokemon(new Maidnite());
        addNewPokemon(new Lickypop());
        addNewPokemon(new Caramelix());
        addNewPokemon(new Slithair());
        addNewPokemon(new Nunette());
        addNewPokemon(new Sisanne());
        addNewPokemon(new Manna());
        addNewPokemon(new Lemb());
        addNewPokemon(new Vegelamb());
        addNewPokemon(new Geomoss());
        addNewPokemon(new Dialith());
        addNewPokemon(new Solmec());
        addNewPokemon(new Akakira());
        addNewPokemon(new Barilbil());
        addNewPokemon(new Haibril());
        addNewPokemon(new Yolken());
        addNewPokemon(new Roostegg());
        addNewPokemon(new Secheel());
        addNewPokemon(new Lannelid());
        addNewPokemon(new Nyglow());
        addNewPokemon(new Nyglare());
        addNewPokemon(new Neonite());
        addNewPokemon(new Tankton());
        var crocodily = new Crocodily();
        addNewPokemon(crocodily);
//        addNewPokemon(new OkenianCrocodily(crocodily.getPokedexNumber())); //Member of line not Finished
        pokedex.remove("crocodily-okenian");
        addNewPokemon(new Logrodile());
        addNewPokemon(new Jawligator());
        addNewPokemon(new Squirest());
        addNewPokemon(new Phantomail());
        addNewPokemon(new Pitchzall());
        addNewPokemon(new Strikezall());
        addNewPokemon(new Moppup());
        addNewPokemon(new Shampooch());
        addNewPokemon(new Skibis());
        addNewPokemon(new Flamingant());
        addNewPokemon(new Birchee());
        addNewPokemon(new Birchop());
        addNewPokemon(new Birchard());
        addNewPokemon(new Silkch());
        addNewPokemon(new Cachoe());
        addNewPokemon(new Silxie());
        var dustar = new Dustar();
        addNewPokemon(dustar);
        addNewPokemon(new OkenianDustar("", Aspect.OKENIAN));
        pokedex.remove("dustar-okenian");
        addNewPokemon(new Clustar());
        addNewPokemon(new Astervoid());
        addNewPokemon(new Compella());
        addNewPokemon(new Esterite());
        addNewPokemon(new Badgrow());
        addNewPokemon(new Wreclaw());
        addNewPokemon(new Criminook());
        addNewPokemon(new Bandicrook());
        addNewPokemon(new Dartibi());
        addNewPokemon(new Revolpod());
        addNewPokemon(new Gigadozer());
        addNewPokemon(new Coralony());
        addNewPokemon(new Barreef());
        addNewPokemon(new Musshield());
        addNewPokemon(new Anenemy());
        addNewPokemon(new Shoaly());
        addNewPokemon(new Tanchor());
        addNewPokemon(new Petat());
        addNewPokemon(new Pangai());
        addNewPokemon(new Tamarawk());
        addNewPokemon(new Bouldalo());
        addNewPokemon(new Cindera());
        addNewPokemon(new Caldona());
        addNewPokemon(new Stelnova());
        addNewPokemon(new Bashbee());
        addNewPokemon(new Woolam());
        addNewPokemon(new Alpalaine());
        addNewPokemon(new Battenbae());
        addNewPokemon(new Brickler());
        addNewPokemon(new Hurdwall());
        addNewPokemon(new Toxitube());
        addNewPokemon(new Gassaster());
        addNewPokemon(new Stalagrunt());
        addNewPokemon(new Stalagang());

        addNewPokemon(new Freezef());
        addNewPokemon(new Treezen());
        addNewPokemon(new Echidnum());
        addNewPokemon(new Thundret());
        addNewPokemon(new Sandshar());
        addNewPokemon(new Sharkastle());
        addNewPokemon(new Wisper());
        addNewPokemon(new Wispette());
        addNewPokemon(new Bubbauld());
        addNewPokemon(new Bauldron());
        addNewPokemon(new Ghoulotine());
        addNewPokemon(new Guilloceive());
        addNewPokemon(new Needow());
        addNewPokemon(new Needoon());
        addNewPokemon(new Needella());
        addNewPokemon(new Polynett());
        addNewPokemon(new DhiomanPolynett("", Aspect.DHIOMAN));
        addNewPokemon(new Polyzap());
        addNewPokemon(new Jollancer());
        addNewPokemon(new Krillzaingel());
        addNewPokemon(new Algrain());
        addNewPokemon(new Kelpush());
        addNewPokemon(new Kelprash());
        addNewPokemon(new Gemmo());
////        addNewPokemon(new Torrojo()); Missing Art
        addNewPokemon(new Barrose());
        addNewPokemon(new Baobloat());
        addNewPokemon(new Festiata());
        addNewPokemon(new Luchaburro());
        addNewPokemon(new Osstrike());
        addNewPokemon(new Prickub());
        addNewPokemon(new Hiberneedle());
        addNewPokemon(new Thorlock());
        addNewPokemon(new Sandevil());
        addNewPokemon(new Sandemonium());
        addNewPokemon(new Cheecub());
        addNewPokemon(new Speeda());
        addNewPokemon(new Princeo());
        addNewPokemon(new Reileo());
        addNewPokemon(new Sandan());
        addNewPokemon(new Sandtome());
        addNewPokemon(new Phantrait());
        addNewPokemon(new Vanitom());
        addNewPokemon(new Velosoil());
        addNewPokemon(new Rapterra());
        addNewPokemon(new Titanodon());
        addNewPokemon(new Whelter());
        addNewPokemon(new Refhuge());
        addNewPokemon(new Gammar());
        addNewPokemon(new Zaptang());
        addNewPokemon(new Mimish());
        addNewPokemon(new Eelord());
        addNewPokemon(new Aquaro());
        addNewPokemon(new Aquarcher());
        addNewPokemon(new Icee());
        addNewPokemon(new Fraxeel());
        addNewPokemon(new Colosseel());
        addNewPokemon(new Snowoof());
        addNewPokemon(new Blizzund());
        addNewPokemon(new Hoofrost());
        addNewPokemon(new Glacyak());
        addNewPokemon(new Ragtoc());
        addNewPokemon(new Chronotoc());
//        addNewPokemon(new Glacyte()); Missing Art
//        addNewPokemon(new Zentipreeze()); Member of line Not Finished
        addNewPokemon(new Herokolus());
        addNewPokemon(new Diskobolus());
        addNewPokemon(new Atolus());
        addNewPokemon(new Sauntler());
        addNewPokemon(new Grevetiery());
        addNewPokemon(new Necrogeist());
        addNewPokemon(new Shimm());
        addNewPokemon(new Zhimm());
        addNewPokemon(new Shalazhimm());
        addNewPokemon(new Fumystic());
        addNewPokemon(new Fumeseous());
        addNewPokemon(new Vimana());
        addNewPokemon(new Vimanzia());

        addNewPokemon(new Yokeye());
        addNewPokemon(new Ghouch());
        addNewPokemon(new Spireye());
//        addNewPokemon(new Akute()); Member of line Not Finished
//        addNewPokemon(new Oburious()); Missing Art
//        addNewPokemon(new Anglondor()); Missing Art
        addNewPokemon(new Polypus());
        addNewPokemon(new Scubella());
        addNewPokemon(new Galaguana());
        addNewPokemon(new Reparine());
        addNewPokemon(new Orbranch());
        addNewPokemon(new Juraseed());
        addNewPokemon(new Carnaceous());
        addNewPokemon(new Carnibble());
        addNewPokemon(new Carnosteus());
        addNewPokemon(new Dilophang());
        addNewPokemon(new Dilophright());
        addNewPokemon(new Mampth());
        addNewPokemon(new Mammolaya());
        addNewPokemon(new Mesoth());
        addNewPokemon(new Megatherice());
        addNewPokemon(new Paow().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Ganpaow().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Yanpaow().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Beaniscule());
        addNewPokemon(new Beanormous());
        addNewPokemon(new Visclaw());
        addNewPokemon(new Edifierce());
        addNewPokemon(new Aurorelk().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Phanfrica().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Penguinsula().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Phanta().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Lepiterros().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Orotolas().addLabels(Label.LEGENDARY));
        addNewPokemon(new Devilicious().addLabels(Label.MYTHICAL));

    }

}
