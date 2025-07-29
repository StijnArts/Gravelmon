package drai.dev.data.games.other;


import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.ayrei.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Vanguard extends Game {
    public static final Game INSTANCE = new Vanguard();
    private Vanguard() {
        super("Vanguard");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new AyreianSpearow("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianFearow("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVenonat("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDoduo("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHitmonlee("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHitmonchan("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianJynx("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSnorlax("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDratini("", Aspect.AYREIAN).addLabels(Label.PSEUDO_LEGENDARY).useDefaultCry());
        addNewPokemon(new AyreianDragonair("", Aspect.AYREIAN).addLabels(Label.PSEUDO_LEGENDARY).useDefaultCry());
        addNewPokemon(new AyreianDragonite("", Aspect.AYREIAN).addLabels(Label.PSEUDO_LEGENDARY).useDefaultCry());
        addNewPokemon(new AyreianLapras("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVulpix("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianNinetales("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVulpixOne("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianNinetalesOne("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianBulbasaur("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianIvysaur("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianVenusaur("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianCharmander("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianCharmeleon("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianCharizard("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianSquirtle("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianWartortle("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianBlastoise("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianCaterpie("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMetapod("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianButterfree("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRattata("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRaticate("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPidgey("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPidgeotto("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPidgeot("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDiglett("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDugtrio("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAbra("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianKadabra("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAlakazam("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGrimer("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMuk("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGastly("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHaunter("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGengar("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVoltorb("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianElectrode("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPinsir("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTogepi("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTogetic("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHoppip("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSkiploom("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianJumpluff("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMantine("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPhanpy("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDonphan("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHitmontop("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSmoochum("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianChikorita("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianBayleef("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianMeganium("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianCyndaquil("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianQuilava("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianTyphlosion("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianTotodile("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianCroconaw("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianFeraligatr("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianSpinarak("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAriados("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianStantler("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTreecko("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianGrovyle("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianSceptile("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianTorchic("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianCombusken("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianBlaziken("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());

        addNewPokemon(new AyreianMudkip("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianMarshtomp("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianSwampert("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());

        addNewPokemon(new AyreianZigzagoon("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianLinoone("", Aspect.AYREIAN).useDefaultCry());
//        addNewPokemon(new AyreianShroomish("", Aspect.AYREIAN).useDefaultCry());
//        addNewPokemon(new AyreianBreloom("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRalts("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianKirlia("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGardevoir("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTropius("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSnorunt("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGlalie("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianNosepass("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAron("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianLairon("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAggron("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRoselia("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianNumel("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianCamerupt("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTrapinch("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVibrava("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianFlygon("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSwablu("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAltaria("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianLunatone("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRelicanth("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAbsol("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPachirisu("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMunchlax("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRiolu("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianLucario("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMantyke("", Aspect.AYREIAN).fishingSpawnFromExisting().useDefaultCry());
        addNewPokemon(new AyreianGallade("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianShinx("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianLuxio("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianLuxray("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianBudew("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRoserade("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDrifloon("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDrifblim("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianFroslass("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSnivy("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianServine("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianSerperior("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianTepig("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianPignite("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianEmboar("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianPidove("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTranquill("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianUnfezant("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSandile("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianKrokorok("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianKrookodile("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianAxew("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianFraxure("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHaxorus("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDruddigon("", Aspect.AYREIAN).useDefaultCry());
//        addNewPokemon(new AyreianHydreigon("", Aspect.AYREIAN).useDefaultCry());//MEMBER OF LINE NOT FINISHED
        addNewPokemon(new AyreianTimburr("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGurdurr("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianConkeldurr("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianDeerling("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSawsbuck("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVenipede("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianWhirlipede("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianScolipede("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDwebble("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianArchen("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianArcheops("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMinccino("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianCinccino("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianDucklett("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSwanna("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVanillite("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVanillish("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianVanilluxe("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianSkiddo("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGogoat("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPhantump("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTrevenant("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPancham("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPangoro("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianCarbink("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianKlefki("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPumpkaboo("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGourgeist("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianNoibat("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianNoivern("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianFennekin("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianBraixen("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianDelphox("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianTyrunt("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianTyrantrum("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianLitleo("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianPyroar("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianCutiefly("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianRibombee("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMimikyu("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianYungoos("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGumshoos("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianGrookey("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianThwackey("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianRillaboom("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianSizzlipede("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianCentiskorch("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianHatenna("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHattrem("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianHatterene("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianObstagoon("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianAlcremie("", Aspect.AYREIAN).useDefaultCry());

        addNewPokemon(new AyreianSprigatito("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianFloragato("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianMeowscarada("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianQuaxly("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianQuaxwell("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());
        addNewPokemon(new AyreianQuaquaval("", Aspect.AYREIAN).addLabels(Label.STARTER).useDefaultCry());

        addNewPokemon(new AyreianMagnemite("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianMagneton("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new Magnemelt());
        addNewPokemon(new AyreianLuvdisc("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new Loathedisc());
        addNewPokemon(new Gyropass());
        addPokedexPokemon("corsola");
        addNewPokemon(new Amacorala());
        addNewPokemon(new Solacor());
        addPokedexPokemon("dunsparce");
        addNewPokemon(new Dunmyth());
        addNewPokemon(new Dundragon());
        addNewPokemon(new Wolfum());
        addNewPokemon(new Supiritto());
        addNewPokemon(new Infernadeer());
        addNewPokemon(new Cradecart());
        addNewPokemon(new Sylure());
        addNewPokemon(new Syrallure());
        addNewPokemon(new Syrenade());
        addNewPokemon(new Tartot());
        addNewPokemon(new Teranigrade());
        addNewPokemon(new Setsarec());
//        addNewPokemon(new Panvolt()); //MISSING ART
//        addNewPokemon(new Simivolt()); //MISSING ART
//        addNewPokemon(new Klawbby()); //MISSING ART
        addNewPokemon(new Dunemoth());
        addNewPokemon(new Dofrio());
        addNewPokemon(new Siginome());
        addNewPokemon(new Khortares());
        addNewPokemon(new Reincarnape());
        addNewPokemon(new Togenix());
        addNewPokemon(new Reapatisse());
        addNewPokemon(new Habaneevil());
        addNewPokemon(new Gatiriopteryx());
        addNewPokemon(new Therapex());
        addNewPokemon(new Astralaxy());
        addNewPokemon(new Masimuthi());
        addNewPokemon(new Wraifanggal());
        addNewPokemon(new Mujineon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Spareon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Almireon().addLabels(Label.EEVEELUTION));
//        addNewPokemon(new Quartzeon()); //MISSING ART
        addNewPokemon(new Evoleon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Caeleon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Saureon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Burreon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Halluceon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Vultema());
        addNewPokemon(new Parlomai());
        addNewPokemon(new Valevant());
        addNewPokemon(new Narwail());
        addNewPokemon(new Morphias());
//        addNewPokemon(new Posuirin()); //MISSING ART
        addNewPokemon(new Svetrier());
        addNewPokemon(new Drukknir());
        addNewPokemon(new Sleihesnire());
//        addNewPokemon(new Golmachina()); //MISSING ART
        addPokedexPokemon("applin, flapple, appletun");
        addNewPokemon(new Applidunn());
        addPokedexPokemon("dipplin, hydrapple");
        addNewPokemon(new AyreianFletchling("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new AyreianFletchinder("", Aspect.AYREIAN).useDefaultCry());
        addNewPokemon(new Fleumflame());
        addNewPokemon(new Frigideer());
//        addNewPokemon(new Sakushido()); //MISSING ART
    }
}
