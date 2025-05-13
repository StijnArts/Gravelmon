package drai.dev.data.games.pokemmo.done;

import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//Done
public class Atlas extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Atlas();
    private Atlas() {        super("Atlas");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Fawnlora());
        addNewPokemon(new Botaneer());
        addNewPokemon(new Forelk());

        addNewPokemon(new Baneep());
        addNewPokemon(new Bannawk());
        addNewPokemon(new Phoenan());

        addNewPokemon(new Instick());
        addNewPokemon(new Inscepter());
        addNewPokemon(new Chloradise());

        addNewPokemon(new Nawdile());
        addNewPokemon(new Aliblador());
        addNewPokemon(new Razorvile());

        //Fire
        addNewPokemon(new Scorchet());
        addNewPokemon(new Torchet());
        addNewPokemon(new Regalient());

        addNewPokemon(new Vulkidna());
        addNewPokemon(new Heatreme());
        addNewPokemon(new Ekiama());

        addNewPokemon(new Ruflame());
        addNewPokemon(new Reparch());
        addNewPokemon(new Slymander());

        addNewPokemon(new Barkindle());
        addNewPokemon(new Wolflaze());
        addNewPokemon(new Wolverize());

        //Water
        addNewPokemon(new Finjoy());
        addNewPokemon(new Finlock());
        addNewPokemon(new Gandolph());

        addNewPokemon(new Pumpel());
        addNewPokemon(new Hydrank());
        addNewPokemon(new Hydromedary());

        addNewPokemon(new Caimar());
        addNewPokemon(new Torpeed());
        addNewPokemon(new Damasoar());

        addNewPokemon(new Watuber());
        addNewPokemon(new Berswade());
        addNewPokemon(new Chambrawl());

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
        addNewPokemon(new Paow());
        addNewPokemon(new Ganpaow());
        addNewPokemon(new Yanpaow());
        addNewPokemon(new Beaniscule());
        addNewPokemon(new Beanormous());
        addNewPokemon(new Visclaw());
        addNewPokemon(new Edifierce());
        addNewPokemon(new Aurorelk());
        addNewPokemon(new Phanfrica());
        addNewPokemon(new Penguinsula());
        addNewPokemon(new Phanta());
        addNewPokemon(new Lepiterros());
        addNewPokemon(new Orotolas());
        addNewPokemon(new Devilicious());

    }

}
