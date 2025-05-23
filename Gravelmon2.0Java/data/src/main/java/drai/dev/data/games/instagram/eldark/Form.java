package drai.dev.data.games.instagram.eldark;


import drai.dev.data.pokemon.form.*;
import drai.dev.data.pokemon.form.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Form extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Form();
    private Form() {
        super("form");
    }
//https://www.instagram.com/pformedition/
    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {


//        addNewPokemon(new FormanChansey("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanTangela("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanMrmime("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanElectabuzz("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanMagmar("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanPorygon("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanSnorlax("", Aspect.FORMAN));//Member of line not finished

//        addNewPokemon(new FormanMarill("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanSudowoodo("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanAipom("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanYanma("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanMurkrow("", Aspect.FORMAN)); //Member of line not finished
//        addNewPokemon(new FormanMisdreavus("", Aspect.FORMAN)); //Member of line not finished
//        addNewPokemon(new For manWobbuffet("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanGligar("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanSneasel("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanSwinub("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanPiloswine("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanMantine("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanPorygon2("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanStantler("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanElekid("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanBlissey("", Aspect.FORMAN));//Member of line not finished

        addNewPokemon(new FormanBulbasaur("", Aspect.FORMAN));
        addNewPokemon(new Spiksaur());
        addNewPokemon(new Gemsaur());
        addNewPokemon(new FormanCharmander("", Aspect.FORMAN));
        addNewPokemon(new Glameleon());
        addNewPokemon(new Glacizard());
        addNewPokemon(new FormanSquirtle("", Aspect.FORMAN));
        addNewPokemon(new Driltos());
        addNewPokemon(new Oniturl());
        addNewPokemon(new FormanCaterpie("", Aspect.FORMAN));
        addNewPokemon(new Bloboon());
        addNewPokemon(new Glowfly());
        addNewPokemon(new FormanWeedle("", Aspect.FORMAN));
        addNewPokemon(new Shilcoon());
        addNewPokemon(new Onguasp());
        addNewPokemon(new FormanPidgey("", Aspect.FORMAN));
        addNewPokemon(new Pidgobolt());
        addNewPokemon(new Pidgoblast());
        addNewPokemon(new Pidgoice());
        addNewPokemon(new FormanRattata("", Aspect.FORMAN));
        addNewPokemon(new Rattataff());
        addNewPokemon(new FormanSpearow("", Aspect.FORMAN));
        addNewPokemon(new FormanFearow("", Aspect.FORMAN));
        addNewPokemon(new FormanEkans("", Aspect.FORMAN));
        addNewPokemon(new Adnocana());
        addNewPokemon(new Xichu());
        addNewPokemon(new FormanPikachu("", Aspect.FORMAN));
        addNewPokemon(new Raychu());
        addNewPokemon(new FormanSandshrew("", Aspect.FORMAN));
        addNewPokemon(new Toxslash());

        addNewPokemon(new FormanNidoranfemale("", Aspect.FORMAN));
        addNewPokemon(new FormanNidorina("", Aspect.FORMAN));
        addNewPokemon(new FormanNidoqueen("", Aspect.FORMAN));
        addNewPokemon(new FormanNidoranmale("", Aspect.FORMAN));
        addNewPokemon(new FormanNidorino("", Aspect.FORMAN));
        addNewPokemon(new FormanNidoking("", Aspect.FORMAN));
        addNewPokemon(new Clefar());
        addNewPokemon(new FormanClefairy("", Aspect.FORMAN));
        addNewPokemon(new Clefagon());
        addNewPokemon(new Pupree());
        addNewPokemon(new FormanVulpix("", Aspect.FORMAN));
        addNewPokemon(new FormanNinetales("", Aspect.FORMAN));
        addNewPokemon(new Sugarpuff());
        addNewPokemon(new FormanJigglypuff("", Aspect.FORMAN));
        addNewPokemon(new Wigglcream());
        addNewPokemon(new FormanZubat("", Aspect.FORMAN));
        addNewPokemon(new FormanGolbat("", Aspect.FORMAN));
        addNewPokemon(new FormanCrobat("", Aspect.FORMAN));
        addNewPokemon(new FormanOddish("", Aspect.FORMAN));
        addNewPokemon(new Egloom());
        addNewPokemon(new Egubloom());
        addNewPokemon(new Groomoot());
        addNewPokemon(new Parant());
        addNewPokemon(new FormanParas("", Aspect.FORMAN));
        addNewPokemon(new Traffasict());
        addNewPokemon(new FormanVenonat("", Aspect.FORMAN));
        addNewPokemon(new Venowhip());
        addNewPokemon(new FormanDiglett("", Aspect.FORMAN));
        addNewPokemon(new FormanDugtrio("", Aspect.FORMAN));
        addNewPokemon(new Kittur());
        addNewPokemon(new FormanMeowth("", Aspect.FORMAN));
        addNewPokemon(new Disturr());
        addNewPokemon(new FormanPsyduck("", Aspect.FORMAN));
        addNewPokemon(new FormanGolduck("", Aspect.FORMAN));
        addNewPokemon(new Wiseduck());
        addNewPokemon(new FormanMankey("", Aspect.FORMAN));
        addNewPokemon(new Apoar());
        addNewPokemon(new Pudyro());
        addNewPokemon(new FormanGrowlithe("", Aspect.FORMAN));
        addNewPokemon(new Arckore());
        addNewPokemon(new FormanPoliwag("", Aspect.FORMAN));
        addNewPokemon(new Polibarb());
        addNewPokemon(new Polispike());
        addNewPokemon(new Polivibe());
        addNewPokemon(new FormanAbra("", Aspect.FORMAN));
        addNewPokemon(new Hokus());
        addNewPokemon(new Pokus());
        addNewPokemon(new FormanMachop("", Aspect.FORMAN));
        addNewPokemon(new Machogre());
        addNewPokemon(new Machking());
        addNewPokemon(new FormanBellsprout("", Aspect.FORMAN));
        addNewPokemon(new Lilibell());
        addNewPokemon(new Lyocribell());
        addNewPokemon(new Tentalpha());
        addNewPokemon(new FormanTentacool("", Aspect.FORMAN));
        addNewPokemon(new Tentaomega());
        addNewPokemon(new FormanGeodude("", Aspect.FORMAN));
        addNewPokemon(new Golspin());
        addNewPokemon(new Golbeast());
        addNewPokemon(new FormanPonyta("", Aspect.FORMAN));
        addNewPokemon(new Kelocean());
        addNewPokemon(new FormanSlowpoke("", Aspect.FORMAN));
        addNewPokemon(new FormanSlowbro("", Aspect.FORMAN));
        addNewPokemon(new FormanSlowking("", Aspect.FORMAN));
        addNewPokemon(new FormanMagnemite("", Aspect.FORMAN));
        addNewPokemon(new Magneraid());
        addNewPokemon(new FormanFarfetchd("", Aspect.FORMAN));
        addNewPokemon(new Headfetchd());
        addNewPokemon(new Kiddu());
        addNewPokemon(new FormanDoduo("", Aspect.FORMAN));
        addNewPokemon(new Dradrio());
        addNewPokemon(new FormanSeel("", Aspect.FORMAN));
        addNewPokemon(new Leomach());
        addNewPokemon(new FormanGrimer("", Aspect.FORMAN));
        addNewPokemon(new Grumbie());
        addNewPokemon(new FormanShellder("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanCloyster("", Aspect.FORMAN));
        addNewPokemon(new FormanGastly("", Aspect.FORMAN));
        addNewPokemon(new FormanHaunter("", Aspect.FORMAN));
        addNewPokemon(new FormanGengar("", Aspect.FORMAN));
        addNewPokemon(new Pebbix());
        addNewPokemon(new FormanOnix("", Aspect.FORMAN));
        addNewPokemon(new FormanSteelix("", Aspect.FORMAN));
        addNewPokemon(new FormanDrowzee("", Aspect.FORMAN));
        addNewPokemon(new Saitro());
        addNewPokemon(new FormanKrabby("", Aspect.FORMAN));
        addNewPokemon(new Kingcava());
        addNewPokemon(new FormanVoltorb("", Aspect.FORMAN));
        addNewPokemon(new Boomrod());
        addNewPokemon(new FormanExeggcute("", Aspect.FORMAN));
        addNewPokemon(new Exatoxicy());
        addNewPokemon(new FormanCubone("", Aspect.FORMAN));
        addNewPokemon(new FormanMarowak("", Aspect.FORMAN));
        addNewPokemon(new Dreadnok());
        addNewPokemon(new FormanTyrogue("", Aspect.FORMAN));
        addNewPokemon(new FormanHitmonlee("", Aspect.FORMAN));
        addNewPokemon(new FormanHitmonchan("", Aspect.FORMAN));
        addNewPokemon(new FormanHitmontop("", Aspect.FORMAN));
        addNewPokemon(new Lickitin());
        addNewPokemon(new FormanLickitung("", Aspect.FORMAN));
        addNewPokemon(new FormanKoffing("", Aspect.FORMAN));
        addNewPokemon(new FormanWeezing("", Aspect.FORMAN));
        addNewPokemon(new FormanRhyhorn("", Aspect.FORMAN));
        addNewPokemon(new Rhyneros());
        addNewPokemon(new Kangabo());
        addNewPokemon(new FormanKangaskhan("", Aspect.FORMAN));
        addNewPokemon(new Kangatank());
        addNewPokemon(new FormanHorsea("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanSeadra("", Aspect.FORMAN));
        addNewPokemon(new Dradna());
        addNewPokemon(new FormanGoldeen("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new Sealio());
        addNewPokemon(new FormanStaryu("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new Starwe());
        addNewPokemon(new FormanScyther("", Aspect.FORMAN));
        addNewPokemon(new Sickleor());
        addNewPokemon(new FormanSmoochum("", Aspect.FORMAN));
        addNewPokemon(new FormanJynx("", Aspect.FORMAN));
        addNewPokemon(new FormanPinsir("", Aspect.FORMAN));
        addNewPokemon(new Pinsiraff());
        addNewPokemon(new FormanTauros("", Aspect.FORMAN));
        addNewPokemon(new FormanMagikarp("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new Jormydos().fishingSpawnFromExisting());
        addNewPokemon(new Locras());
        addNewPokemon(new FormanLapras("", Aspect.FORMAN));
        addNewPokemon(new FormanDitto("", Aspect.FORMAN));
        addNewPokemon(new Animon());
        addNewPokemon(new FormanEevee("", Aspect.FORMAN));
        addNewPokemon(new Everieon());
        addNewPokemon(new Naunyte());
        addNewPokemon(new Arganon());
        addNewPokemon(new Dubato());
        addNewPokemon(new Metapede());
        addNewPokemon(new Golderis());
        addNewPokemon(new FormanArticuno("", Aspect.FORMAN));
        addNewPokemon(new FormanZapdos("", Aspect.FORMAN));
        addNewPokemon(new FormanMoltres("", Aspect.FORMAN));
        addNewPokemon(new FormanDratini("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanDragonair("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new Dragorai());
        addNewPokemon(new Mewters());
        addNewPokemon(new Meu());
        addNewPokemon(new FormanChikorita("", Aspect.FORMAN));
        addNewPokemon(new Sawtears());
        addNewPokemon(new Helgold());
        addNewPokemon(new FormanCyndaquil("", Aspect.FORMAN));
        addNewPokemon(new Jestruff());
        addNewPokemon(new Puppetdra());
        addNewPokemon(new FormanTotodile("", Aspect.FORMAN));
        addNewPokemon(new Dracro());
        addNewPokemon(new Savagaitor());
        addNewPokemon(new FormanSentret("", Aspect.FORMAN));
        addNewPokemon(new FormanFurret("", Aspect.FORMAN));
        addNewPokemon(new FormanHoothoot("", Aspect.FORMAN));
        addNewPokemon(new Nownowl());
        addNewPokemon(new FormanLedyba("", Aspect.FORMAN));
        addNewPokemon(new FormanLedian("", Aspect.FORMAN));
        addNewPokemon(new Starledi());
        addNewPokemon(new FormanSpinarak("", Aspect.FORMAN));
        addNewPokemon(new FormanAriados("", Aspect.FORMAN));
        addNewPokemon(new FormanChinchou("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new Algaphin());
        addNewPokemon(new FormanTogepi("", Aspect.FORMAN));
        addNewPokemon(new Togesik());
        addNewPokemon(new FormanNatu("", Aspect.FORMAN));
        addNewPokemon(new Watu());
        addNewPokemon(new FormanMareep("", Aspect.FORMAN));
        addNewPokemon(new FormanFlaaffy("", Aspect.FORMAN));
        addNewPokemon(new Venomare());
        addNewPokemon(new FormanHoppip("", Aspect.FORMAN));
        addNewPokemon(new Katinop());
        addNewPokemon(new Danditen());
        addNewPokemon(new Kotora());
        addNewPokemon(new Littora());
        addNewPokemon(new Fangtora());
        addNewPokemon(new Cubter());
        addNewPokemon(new Ligaqua());
        addNewPokemon(new FormanSunkern("", Aspect.FORMAN));
        addNewPokemon(new Stakean());
        addNewPokemon(new FormanWooper("", Aspect.FORMAN));
        addNewPokemon(new Bulblotel());
        addNewPokemon(new Kurstraw());
        addNewPokemon(new Metakurs());
        addNewPokemon(new FormanUnown("", Aspect.FORMAN));
        addNewPokemon(new Chainown());
        addNewPokemon(new Twinz());
        addNewPokemon(new FormanGirafarig("", Aspect.FORMAN));
        addNewPokemon(new FormanPineco("", Aspect.FORMAN));
        addNewPokemon(new FormanForretress("", Aspect.FORMAN));
        addNewPokemon(new Crystshell());
        addNewPokemon(new FormanDunsparce("", Aspect.FORMAN));
        addNewPokemon(new Dunrada());
        addNewPokemon(new FormanSnubbull("", Aspect.FORMAN));
        addNewPokemon(new FormanGranbull("", Aspect.FORMAN));
        addNewPokemon(new FormanQwilfish("", Aspect.FORMAN));
        addNewPokemon(new FormanShuckle("", Aspect.FORMAN));
        addNewPokemon(new FormanHeracross("", Aspect.FORMAN));
        addNewPokemon(new Herapaltin());
        addNewPokemon(new FormanTeddiursa("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new Swabear());
        addNewPokemon(new Slugem());
        addNewPokemon(new FormanSlugma("", Aspect.FORMAN));
        addNewPokemon(new Macargold());
        addNewPokemon(new FormanCorsola("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanRemoraid("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new Siscorp());
        addNewPokemon(new FormanDelibird("", Aspect.FORMAN));
        addNewPokemon(new FormanSkarmory("", Aspect.FORMAN));
        addNewPokemon(new FormanHoundour("", Aspect.FORMAN));
        addNewPokemon(new FormanHoundoom("", Aspect.FORMAN));
        addNewPokemon(new FormanPhanpy("", Aspect.FORMAN));
        addNewPokemon(new FormanDonphan("", Aspect.FORMAN));
        addNewPokemon(new FormanSmeargle("", Aspect.FORMAN));
        addNewPokemon(new Milalien());
        addNewPokemon(new FormanLarvitar("", Aspect.FORMAN));
        addNewPokemon(new Toothitar());
        addNewPokemon(new Rodanitar());
        addNewPokemon(new FormanRaikou("", Aspect.FORMAN));
        addNewPokemon(new FormanEntei("", Aspect.FORMAN));
        addNewPokemon(new FormanSuicune("", Aspect.FORMAN));
        addNewPokemon(new FormanLugia("", Aspect.FORMAN));
        addNewPokemon(new FormanHooh("", Aspect.FORMAN));
        addNewPokemon(new Celeby());
        addNewPokemon(new FormanTreecko("", Aspect.FORMAN));
        addNewPokemon(new Muecko());
        addNewPokemon(new Skeptile());
        addNewPokemon(new FormanTorchic("", Aspect.FORMAN));
        addNewPokemon(new Galatoo());
        addNewPokemon(new Secrebuyo());
        addNewPokemon(new FormanMudkip("", Aspect.FORMAN));
        addNewPokemon(new Salathyst());
        addNewPokemon(new Soljailer());
    }

}
