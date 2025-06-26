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
        addNewPokemon(new AyreianSpearow("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFearow("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVenonat("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDoduo("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHitmonlee("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHitmonchan("", Aspect.AYREIAN));
        addNewPokemon(new AyreianJynx("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSnorlax("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDratini("", Aspect.AYREIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new AyreianDragonair("", Aspect.AYREIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new AyreianDragonite("", Aspect.AYREIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new AyreianLapras("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVulpix("", Aspect.AYREIAN));
        addNewPokemon(new AyreianNinetales("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVulpixOne("", Aspect.AYREIAN));
        addNewPokemon(new AyreianNinetalesOne("", Aspect.AYREIAN));

        addNewPokemon(new AyreianBulbasaur("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianIvysaur("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianVenusaur("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianCharmander("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianCharmeleon("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianCharizard("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianSquirtle("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianWartortle("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianBlastoise("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianCaterpie("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMetapod("", Aspect.AYREIAN));
        addNewPokemon(new AyreianButterfree("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRattata("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRaticate("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPidgey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPidgeotto("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPidgeot("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDiglett("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDugtrio("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAbra("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKadabra("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAlakazam("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGrimer("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMuk("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGastly("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHaunter("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGengar("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVoltorb("", Aspect.AYREIAN));
        addNewPokemon(new AyreianElectrode("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPinsir("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTogepi("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTogetic("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHoppip("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSkiploom("", Aspect.AYREIAN));
        addNewPokemon(new AyreianJumpluff("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMantine("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPhanpy("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDonphan("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHitmontop("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSmoochum("", Aspect.AYREIAN));

        addNewPokemon(new AyreianChikorita("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianBayleef("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianMeganium("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianCyndaquil("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianQuilava("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianTyphlosion("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianTotodile("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianCroconaw("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianFeraligatr("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianSpinarak("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAriados("", Aspect.AYREIAN));
        addNewPokemon(new AyreianStantler("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTreecko("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianGrovyle("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianSceptile("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianTorchic("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianCombusken("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianBlaziken("", Aspect.AYREIAN).addLabels(Label.STARTER));

        addNewPokemon(new AyreianMudkip("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianMarshtomp("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianSwampert("", Aspect.AYREIAN).addLabels(Label.STARTER));

        addNewPokemon(new AyreianZigzagoon("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLinoone("", Aspect.AYREIAN));
//        addNewPokemon(new AyreianShroomish("", Aspect.AYREIAN));
//        addNewPokemon(new AyreianBreloom("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRalts("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKirlia("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGardevoir("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTropius("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSnorunt("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGlalie("", Aspect.AYREIAN));

        addNewPokemon(new AyreianNosepass("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAron("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLairon("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAggron("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRoselia("", Aspect.AYREIAN));
        addNewPokemon(new AyreianNumel("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCamerupt("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTrapinch("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVibrava("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFlygon("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSwablu("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAltaria("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLunatone("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRelicanth("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAbsol("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPachirisu("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMunchlax("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRiolu("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLucario("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMantyke("", Aspect.AYREIAN).fishingSpawnFromExisting());
        addNewPokemon(new AyreianGallade("", Aspect.AYREIAN));

        addNewPokemon(new AyreianShinx("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLuxio("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLuxray("", Aspect.AYREIAN));
        addNewPokemon(new AyreianBudew("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRoserade("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDrifloon("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDrifblim("", Aspect.AYREIAN));

        addNewPokemon(new AyreianFroslass("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSnivy("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianServine("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianSerperior("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianTepig("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianPignite("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianEmboar("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianPidove("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTranquill("", Aspect.AYREIAN));
        addNewPokemon(new AyreianUnfezant("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSandile("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKrokorok("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKrookodile("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAxew("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFraxure("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHaxorus("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDruddigon("", Aspect.AYREIAN));
//        addNewPokemon(new AyreianHydreigon("", Aspect.AYREIAN));//MEMBER OF LINE NOT FINISHED
        addNewPokemon(new AyreianTimburr("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGurdurr("", Aspect.AYREIAN));
        addNewPokemon(new AyreianConkeldurr("", Aspect.AYREIAN));

        addNewPokemon(new AyreianDeerling("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSawsbuck("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVenipede("", Aspect.AYREIAN));
        addNewPokemon(new AyreianWhirlipede("", Aspect.AYREIAN));
        addNewPokemon(new AyreianScolipede("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDwebble("", Aspect.AYREIAN));
        addNewPokemon(new AyreianArchen("", Aspect.AYREIAN));
        addNewPokemon(new AyreianArcheops("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMinccino("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCinccino("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDucklett("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSwanna("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanillite("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanillish("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanilluxe("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSkiddo("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGogoat("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPhantump("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTrevenant("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPancham("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPangoro("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCarbink("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKlefki("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPumpkaboo("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGourgeist("", Aspect.AYREIAN));
        addNewPokemon(new AyreianNoibat("", Aspect.AYREIAN));
        addNewPokemon(new AyreianNoivern("", Aspect.AYREIAN));

        addNewPokemon(new AyreianFennekin("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianBraixen("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianDelphox("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianTyrunt("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTyrantrum("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLitleo("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPyroar("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCutiefly("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRibombee("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMimikyu("", Aspect.AYREIAN));

        addNewPokemon(new AyreianYungoos("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGumshoos("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGrookey("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianThwackey("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianRillaboom("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianSizzlipede("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCentiskorch("", Aspect.AYREIAN));

        addNewPokemon(new AyreianHatenna("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHattrem("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHatterene("", Aspect.AYREIAN));
        addNewPokemon(new AyreianObstagoon("", Aspect.AYREIAN));

        addNewPokemon(new AyreianAlcremie("", Aspect.AYREIAN));

        addNewPokemon(new AyreianSprigatito("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianFloragato("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianMeowscarada("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianQuaxly("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianQuaxwell("", Aspect.AYREIAN).addLabels(Label.STARTER));
        addNewPokemon(new AyreianQuaquaval("", Aspect.AYREIAN).addLabels(Label.STARTER));

        addNewPokemon(new AyreianMagnemite("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMagneton("", Aspect.AYREIAN));
        addNewPokemon(new Magnemelt());
        addNewPokemon(new AyreianLuvdisc("", Aspect.AYREIAN));
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
        addNewPokemon(new AyreianFletchling("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFletchinder("", Aspect.AYREIAN));
        addNewPokemon(new Fleumflame());
        addNewPokemon(new Frigideer());
//        addNewPokemon(new Sakushido()); //MISSING ART
    }
}
