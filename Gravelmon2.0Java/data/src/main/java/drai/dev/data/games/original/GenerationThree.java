package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.elb.regional.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.ferran.regional.*;
import drai.dev.data.pokemon.form.regional.*;
import drai.dev.data.pokemon.ionos.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mastenia.regional.*;
import drai.dev.data.pokemon.mystis.regional.*;
import drai.dev.data.pokemon.nodorro.regional.*;
import drai.dev.data.pokemon.olysos.regional.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.aristos.regional.*;
import drai.dev.data.pokemon.avoris.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.data.pokemon.avalos.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.neonintendo.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

import java.util.*;

import static drai.dev.data.attributes.StatArchetype.PHYSICAL_ATTACKER;
import static drai.dev.data.attributes.StatArchetype.SPECIAL_ATTACKER;
import static drai.dev.data.attributes.StatType.*;

public class GenerationThree extends Game {
    public GenerationThree() {
        super("generation3");
    }

    @Override
    public void registerPokemon() {

//        pokemon.add(new FabelianRalts("", Aspect.FABELIAN).setUsesBigModel()); //TODO
//        pokemon.add(new FabelianKirlia("", Aspect.FABELIAN).setUsesBigModel());
//        pokemon.add(new FabelianSableye("", Aspect.FABELIAN).setUsesBigModel());
//        pokemon.add(new FabelianSwablu("", Aspect.FABELIAN).setUsesBigModel());
//        pokemon.add(new FabelianBeldum("", Aspect.FABELIAN).setUsesBigModel());
//        pokemon.add(new FabelianMetang("", Aspect.FABELIAN).setUsesBigModel());
//        pokemon.add(new FabelianMetagross("", Aspect.FABELIAN).setUsesBigModel());
//
//        pokemon.add(new MahalianTorkoal("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
//        pokemon.add(new MahalianPoochyena("", Aspect.MAHALIAN).setUsesBigModel());
//        pokemon.add(new MahalianMightyena("", Aspect.MAHALIAN).setUsesBigModel());
//
//        pokemon.add(new ElbianSlakoth("", Aspect.ELBIAN).setUsesBigModel()); //TODO
//        pokemon.add(new ElbianVigoroth("", Aspect.ELBIAN).setUsesBigModel());
//        pokemon.add(new ElbianGulpin("", Aspect.ELBIAN).setUsesBigModel());
//        pokemon.add(new ElbianSwalot("", Aspect.ELBIAN).setUsesBigModel());
//
//        pokemon.add(new FerranianBarboach("", Aspect.FERRANIAN).setUsesBigModel()); //TODO
//        pokemon.add(new FerranianWhiscash("", Aspect.FERRANIAN).setUsesBigModel());
//        pokemon.add(new FerranianSlakoth("", Aspect.FERRANIAN).setUsesBigModel());
//        pokemon.add(new FerranianVigoroth("", Aspect.FERRANIAN).setUsesBigModel());
//        pokemon.add(new FerranianWailord("", Aspect.FERRANIAN).setUsesBigModel());
//        pokemon.add(new FerranianBagon("", Aspect.FERRANIAN).setUsesBigModel());
//        pokemon.add(new FerranianShelgon("", Aspect.FERRANIAN).setUsesBigModel());
//        pokemon.add(new FerranianSalamence("", Aspect.FERRANIAN).setUsesBigModel());
//
//        pokemon.add(new RaianianWhismur("", Aspect.RAIANIAN).setUsesBigModel()); //TODO
//        pokemon.add(new RaianianLoudred("", Aspect.RAIANIAN).setUsesBigModel());
//        pokemon.add(new RaianianExploud("", Aspect.RAIANIAN, new Stats(490, PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
//        pokemon.add(new RaianianAbsol("", Aspect.RAIANIAN, new Stats(465, PHYSICAL_ATTACKER, List.of(ATTACK, ATTACK, ATTACK))).setUsesBigModel());
//        pokemon.add(new RaianianSalamence("", Aspect.RAIANIAN, new Stats(600, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
//
//        //TODO
//        pokemon.add(new TrizoranAbsol("", Aspect.TRIZORAN, new Stats(465, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
//
//        //TODO
//        pokemon.add(new NorseAbsol("", Aspect.NORSE, new Stats(465, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
//
//        pokemon.add(new FormanTreecko("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanTorchic("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanMudkip("", Aspect.FORMAN).setUsesBigModel());

//        pokemon.add(new MystisianAbsol("", Aspect.MYSTISIAN)); TODO

//        pokemon.add(new OlysosianMightyena("", Aspect.OLYSOSIAN)); TODO
//        pokemon.add(new OlysosianPoochyena("", Aspect.OLYSOSIAN));

//        pokemon.add(new NodorranTreecko("", Aspect.NODORRAN));  MEMBER OF LINE NOT FINISHED
//        pokemon.add(new NodorranGrovyle("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new NodorranSceptile("", Aspect.NODORRAN)); Missing art
//        pokemon.add(new NodorranNosepass("", Aspect.NODORRAN)); TODO

//        pokemon.add(new MastenianTreecko("", Aspect.MASTENIAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new MastenianGrovyle("", Aspect.MASTENIAN)); MISSING ART
//        pokemon.add(new MastenianTorchic("", Aspect.MASTENIAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new MastenianCombusken("", Aspect.MASTENIAN)); MISSING ART
//        pokemon.add(new MastenianMudkip("", Aspect.MASTENIAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new MastenianShroomish("", Aspect.MASTENIAN)); Missing Stats
//        pokemon.add(new MastenianBreloom("", Aspect.MASTENIAN, new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK)))); Missing Stats
//        pokemon.add(new MastenianIllumise("", Aspect.MASTENIAN)); MISSING ART
//        pokemon.add(new MastenianVolbeat("", Aspect.MASTENIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK)))); Missing Stats

        registerSoulstonesVariants();

        pokemon.add(new IonosianTrapinch("", Aspect.IONOSIAN));
        pokemon.add(new IonosianVibrava("", Aspect.IONOSIAN));
        pokemon.add(new IonosianFlygon("", Aspect.IONOSIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));

        pokemon.add(new AvalossianTreecko("Treecko", Aspect.Avalossian));
        pokemon.add(new AvalossianGrovyle("Grovyle", Aspect.Avalossian));
        pokemon.add(new AvalossianSceptile("Sceptile", Aspect.Avalossian));
        pokemon.add(new AvalossianRalts("Ralts", Aspect.Avalossian));
        pokemon.add(new AvalossianKirlia("Kirlia", Aspect.Avalossian));
        pokemon.add(new AvalossianGardevoir("Gardevoir", Aspect.Avalossian));
        pokemon.add(new AvalossianSlakoth("Slakoth", Aspect.Avalossian));
        pokemon.add(new AvalossianVigoroth("Vigoroth", Aspect.Avalossian));
        pokemon.add(new AvalossianNincada("Nincada", Aspect.Avalossian));
        pokemon.add(new AvalossianDuskull("Duskull", Aspect.Avalossian));
        pokemon.add(new AvalossianDusclops("Dusclops", Aspect.Avalossian));

        pokemon.add(new EnjinnianElectrike("", Aspect.ENJINNIAN));
        pokemon.add(new EnjinnianManectric("", Aspect.ENJINNIAN));

        pokemon.add(new EnjinnianSableye("Sableye", Aspect.ENJINNIAN));

        pokemon.add(new NeoCacnea("Cacnea", Aspect.NEO));

        pokemon.add(new NovranHuntail("Huntail", Aspect.NOVRAN));
        pokemon.add(new NovranGorebyss("Gorebyss", Aspect.NOVRAN));

        pokemon.add(new QamoranSpoink("Spoink", Aspect.QAMORAN));
        pokemon.add(new QamoranGrumpig("Grumpig", Aspect.QAMORAN));

        pokemon.add(new NorheimanMasquerain("Masquerain", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new NorheimanWailmer("Wailmer", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanNumel("Numel", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanCorphish("Corphish", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanCrawdaunt("Crawdaunt", Aspect.NORHEIMAN, new Stats(468, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));


        pokemon.add(new VaritasianSwablu("Swablu", Aspect.VARITASIAN));
        pokemon.add(new VaritasianAltaria("Altaria", Aspect.VARITASIAN));

        pokemon.add(new AvorianRoselia("Roselia", Aspect.AVORIAN));

        pokemon.add(new HizianNosepass("Nosepass", Aspect.HIZIAN));
        pokemon.add(new HizianSkitty("Skitty", Aspect.HIZIAN));
        pokemon.add(new HizianDelcatty("Delcatty", Aspect.HIZIAN));
        pokemon.add(new HizianAron("Aron", Aspect.HIZIAN));
        pokemon.add(new HizianLairon("Lairon", Aspect.HIZIAN));
        pokemon.add(new HizianAggron("Aggron", Aspect.HIZIAN));
        pokemon.add(new HizianLileep("Lileep", Aspect.HIZIAN));
        pokemon.add(new HizianCradily("Cradily", Aspect.HIZIAN));
        pokemon.add(new HizianAnorith("Anorith", Aspect.HIZIAN));
        pokemon.add(new HizianArmaldo("Armaldo", Aspect.HIZIAN));
        pokemon.add(new HizianTropius("Tropius", Aspect.HIZIAN));
        pokemon.add(new HizianLuvdisc("Luvdisc", Aspect.HIZIAN));

//        pokemon.add(new AristosianNumel(322)); Missing Art
//        pokemon.add(new AristosianTaillow(276)); Member of line not finished
//        pokemon.add(new AristosianNosepass(299)); Missing Art
        pokemon.add(new AristosianTropius("Tropius", Aspect.ARISTOSIAN));

        addEghoPokemon();

        addDeltaPokemon();

        addXPokemon();

        //Radical Red
        pokemon.add(new SeviianFeebas("Feebas", Aspect.SEVIIAN));
        pokemon.add(new SeviianMilotic("Milotic", Aspect.SEVIIAN));

        //Pokemon Flux
        pokemon.add(new AlteranShroomish("Shroomish", Aspect.ALTERAN));
        pokemon.add(new AlteranBreloom("Breloom", Aspect.ALTERAN));

        //Daybreak
        pokemon.add(new ArmiranSceptile("Sceptile", Aspect.ARMIRAN));
        pokemon.add(new ArmiranSwellow("Swellow", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianTreecko("", Aspect.AYREIAN));
        pokemon.add(new AyreianGrovyle("", Aspect.AYREIAN));
        pokemon.add(new AyreianSceptile("", Aspect.AYREIAN));
        pokemon.add(new AyreianZigzagoon("", Aspect.AYREIAN));
        pokemon.add(new AyreianLinoone("", Aspect.AYREIAN));
        pokemon.add(new AyreianShroomish("", Aspect.AYREIAN));
        pokemon.add(new AyreianBreloom("", Aspect.AYREIAN));
        pokemon.add(new AyreianRalts("", Aspect.AYREIAN));
        pokemon.add(new AyreianKirlia("", Aspect.AYREIAN));
        pokemon.add(new AyreianGardevoir("", Aspect.AYREIAN));
        pokemon.add(new AyreianTropius("", Aspect.AYREIAN));
        pokemon.add(new AyreianSnorunt("", Aspect.AYREIAN));
        pokemon.add(new AyreianGlalie("", Aspect.AYREIAN));

        pokemon.add(new AyreianTorchic("Torchic", Aspect.AYREIAN));
        pokemon.add(new AyreianCombusken("Combusken", Aspect.AYREIAN));
        pokemon.add(new AyreianBlaziken("Blaziken", Aspect.AYREIAN));
        pokemon.add(new AyreianNosepass("Nosepass", Aspect.AYREIAN));
        pokemon.add(new AyreianAron("Aron", Aspect.AYREIAN));
        pokemon.add(new AyreianLairon("Lairon", Aspect.AYREIAN));
        pokemon.add(new AyreianAggron("Aggron", Aspect.AYREIAN));
        pokemon.add(new AyreianRoselia("Roselia", Aspect.AYREIAN));
        pokemon.add(new AyreianNumel("Numel", Aspect.AYREIAN));
        pokemon.add(new AyreianCamerupt("Camerupt", Aspect.AYREIAN));
        pokemon.add(new AyreianTrapinch("Trapinch", Aspect.AYREIAN));
        pokemon.add(new AyreianVibrava("Vibrava", Aspect.AYREIAN));
        pokemon.add(new AyreianFlygon("Flygon", Aspect.AYREIAN));
        pokemon.add(new AyreianSwablu("Swablu", Aspect.AYREIAN));
        pokemon.add(new AyreianAltaria("Altaria", Aspect.AYREIAN));
        pokemon.add(new AyreianLunatone("Lunatone", Aspect.AYREIAN));
        pokemon.add(new AyreianRelicanth("Relicanth", Aspect.AYREIAN));
        pokemon.add(new AyreianLuvdisc("Luvdisc", Aspect.AYREIAN));

        //Phoenix Rising
        pokemon.add(new RelicRoselia("Roselia", Aspect.RELIC));
        pokemon.add(new RelicSpinda("Spinda", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianExploud("Exploud", Aspect.KASKADIAN));
        pokemon.add(new GutsyCastform("Castform", Aspect.GUTSY));
        pokemon.add(new WindyCastform("Castform", Aspect.WINDY));
        pokemon.add(new SmoggyCastform("Castform", Aspect.SMOGGY));
        pokemon.add(new DustyCastform("Castform", Aspect.DUSTY));
        pokemon.add(new SandyCastform("Castform", Aspect.SANDY));
        pokemon.add(new SwarmyCastform("Castform", Aspect.SWARMY));
        pokemon.add(new SpookyCastform("Castform", Aspect.SPOOKY));
        pokemon.add(new WhirlyCastform("Castform", Aspect.WHIRLY));
        pokemon.add(new AllergyCastform("Castform", Aspect.ALLERGY));
        pokemon.add(new ZappyCastform("Castform", Aspect.ZAPPY));
        pokemon.add(new ZennyCastform("Castform", Aspect.ZENNY));
        pokemon.add(new SorceryCastform("Castform", Aspect.SORCERY));
        pokemon.add(new ShadyCastform("Castform", Aspect.SHADY));
        pokemon.add(new LovelyCastform("Castform", Aspect.LOVELY));
        pokemon.add(new KaskadianTropius("Tropius", Aspect.KASKADIAN).setUsesBigModel());

        //Azure (Mystic)
        pokemon.add(new MysticTreecko("Treecko", Aspect.MYSTIC));
        pokemon.add(new MysticGrovyle("Grovyle", Aspect.MYSTIC));
        pokemon.add(new MysticSceptile("Sceptile", Aspect.MYSTIC));
        pokemon.add(new MysticTorchic("Torchic", Aspect.MYSTIC));
        pokemon.add(new MysticCombusken("Combusken", Aspect.MYSTIC));
        pokemon.add(new MysticBlaziken("Blaziken", Aspect.MYSTIC));
        pokemon.add(new MysticMudkip("Mudkip", Aspect.MYSTIC));
        pokemon.add(new MysticMarshtomp("Marshtomp", Aspect.MYSTIC));
        pokemon.add(new MysticSwampert("Swampert", Aspect.MYSTIC));
        pokemon.add(new MysticPoochyena("Poochyena", Aspect.MYSTIC));
        pokemon.add(new MysticMightyena("Mightyena", Aspect.MYSTIC));

        //Pokemon Opalo
        pokemon.add(new CefiranMakuhita("Makuhita", Aspect.CEFIRAN));
        pokemon.add(new CefiranHariyama("Hariyama", Aspect.CEFIRAN));
        pokemon.add(new CefiranSableye("Sableye", Aspect.CEFIRAN));
        pokemon.add(new CefiranNumel("Numel", Aspect.CEFIRAN));
        pokemon.add(new CefiranCamerupt("Camerupt", Aspect.CEFIRAN));
        pokemon.add(new CefiranVibrava("Vibrava", Aspect.CEFIRAN));
        pokemon.add(new CefiranFlygon("Flygon", Aspect.CEFIRAN));
        pokemon.add(new CefiranSnorunt("Snorunt", Aspect.CEFIRAN));
        pokemon.add(new CefiranGlalie("Glalie", Aspect.CEFIRAN));

    }

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochTreecko("", Aspect.EPOCH));
        pokemon.add(new EpochGrovyle("", Aspect.EPOCH));
        pokemon.add(new EpochSceptile("", Aspect.EPOCH));
        pokemon.add(new EpochMudkip("", Aspect.EPOCH));
        pokemon.add(new EpochMarshtomp("", Aspect.EPOCH));
        pokemon.add(new EpochSwampert("", Aspect.EPOCH));
        pokemon.add(new EpochMudkipOne("", Aspect.EPOCH));
        pokemon.add(new EpochMarshtompOne("", Aspect.EPOCH));
        pokemon.add(new EpochSwampertOne("", Aspect.EPOCH));

        pokemon.add(new EpochWailmer("", Aspect.EPOCH));
        pokemon.add(new EpochWailord("", Aspect.EPOCH));
        pokemon.add(new EpochNosepass("", Aspect.EPOCH));
        pokemon.add(new EpochGulpin("", Aspect.EPOCH));
        pokemon.add(new EpochSwalot("", Aspect.EPOCH));
        pokemon.add(new EpochBaltoy("", Aspect.EPOCH));
        pokemon.add(new EpochClaydol("", Aspect.EPOCH));
        pokemon.add(new EpochLunatone("", Aspect.EPOCH));
        pokemon.add(new EpochSolrock("", Aspect.EPOCH));
        pokemon.add(new EpochShroomish("", Aspect.EPOCH));
        pokemon.add(new EpochBreloom("", Aspect.EPOCH));
        pokemon.add(new EpochCarvanha("", Aspect.EPOCH));
        pokemon.add(new EpochSharpedo("", Aspect.EPOCH));
        pokemon.add(new EpochSnorunt("", Aspect.EPOCH));
        pokemon.add(new EpochGlalie("", Aspect.EPOCH));
        pokemon.add(new EpochSableye("", Aspect.EPOCH));
        pokemon.add(new EpochSwablu("", Aspect.EPOCH));
        pokemon.add(new EpochAltaria("", Aspect.EPOCH));
        pokemon.add(new EpochDuskull("", Aspect.EPOCH));
        pokemon.add(new EpochDusclops("", Aspect.EPOCH));
        pokemon.add(new EpochAron("", Aspect.EPOCH));
        pokemon.add(new EpochLairon("", Aspect.EPOCH));
        pokemon.add(new EpochAggron("", Aspect.EPOCH));
        pokemon.add(new EpochWurmple("", Aspect.EPOCH));
        pokemon.add(new EpochSilcoon("", Aspect.EPOCH));
        pokemon.add(new EpochBeautifly("", Aspect.EPOCH));
        pokemon.add(new EpochWurmpleOne("", Aspect.EPOCH));
        pokemon.add(new EpochCascoon("", Aspect.EPOCH));
        pokemon.add(new EpochDustox("", Aspect.EPOCH));
        pokemon.add(new EpochFeebas("", Aspect.EPOCH));
        pokemon.add(new EpochMilotic("", Aspect.EPOCH));
        pokemon.add(new EpochSeedot("", Aspect.EPOCH));
        pokemon.add(new EpochNuzleaf("", Aspect.EPOCH));
        pokemon.add(new EpochShiftry("", Aspect.EPOCH));
        pokemon.add(new EpochRalts("", Aspect.EPOCH));
        pokemon.add(new EpochKirlia("", Aspect.EPOCH));
        pokemon.add(new EpochGardevoir("", Aspect.EPOCH));
        pokemon.add(new EpochNumel("", Aspect.EPOCH));
        pokemon.add(new EpochCamerupt("", Aspect.EPOCH));
        pokemon.add(new EpochAzurill("", Aspect.EPOCH));
        pokemon.add(new EpochPoochyena("", Aspect.EPOCH));
        pokemon.add(new EpochMightyena("", Aspect.EPOCH));
        pokemon.add(new EpochAbsol("", Aspect.EPOCH));
        pokemon.add(new EpochBeldum("", Aspect.EPOCH));
        pokemon.add(new EpochMetang("", Aspect.EPOCH));
        pokemon.add(new EpochMetagross("", Aspect.EPOCH));
        pokemon.add(new EpochMeditite("", Aspect.EPOCH));
        pokemon.add(new EpochMedicham("", Aspect.EPOCH));
        pokemon.add(new EpochNincada("", Aspect.EPOCH));
        pokemon.add(new EpochNinjask("", Aspect.EPOCH));
        pokemon.add(new EpochShedinja("", Aspect.EPOCH));
        pokemon.add(new EpochLileep("", Aspect.EPOCH));
        pokemon.add(new EpochCradily("", Aspect.EPOCH));
        pokemon.add(new EpochCacnea("", Aspect.EPOCH));
        pokemon.add(new EpochCacturne("", Aspect.EPOCH));
        pokemon.add(new EpochTaillow("", Aspect.EPOCH));
        pokemon.add(new EpochSwellow("", Aspect.EPOCH));
        pokemon.add(new EpochSpheal("", Aspect.EPOCH));
        pokemon.add(new EpochSealeo("", Aspect.EPOCH));
        pokemon.add(new EpochWalrein("", Aspect.EPOCH));
        pokemon.add(new EpochSurskit("", Aspect.EPOCH));
        pokemon.add(new EpochMasquerain("", Aspect.EPOCH));
        pokemon.add(new EpochWingull("", Aspect.EPOCH));
        pokemon.add(new EpochPelipper("", Aspect.EPOCH));
        pokemon.add(new EpochElectrike("", Aspect.EPOCH));
        pokemon.add(new EpochManectric("", Aspect.EPOCH));
        pokemon.add(new EpochTorkoal("", Aspect.EPOCH));
        pokemon.add(new EpochRoselia("", Aspect.EPOCH));
        pokemon.add(new EpochAbsolOne("", Aspect.EPOCH));
        pokemon.add(new EpochSableyeOne("", Aspect.EPOCH));
        pokemon.add(new EpochSwabluOne("", Aspect.EPOCH));
        pokemon.add(new EpochAltariaOne("", Aspect.EPOCH));
        pokemon.add(new EpochSurskitOne("", Aspect.EPOCH));
        pokemon.add(new EpochMasquerainOne("", Aspect.EPOCH));
        pokemon.add(new EpochClamperl("", Aspect.EPOCH));
        pokemon.add(new EpochHuntail("", Aspect.EPOCH));
        pokemon.add(new EpochGorebyss("", Aspect.EPOCH));
        pokemon.add(new EpochSkittyOne("", Aspect.EPOCH));
        pokemon.add(new EpochDelcattyOne("", Aspect.EPOCH));
        pokemon.add(new EpochNumelOne("", Aspect.EPOCH));
        pokemon.add(new EpochCameruptOne("", Aspect.EPOCH));
        pokemon.add(new EpochZigzagoon("", Aspect.EPOCH));
        pokemon.add(new EpochLinoone("", Aspect.EPOCH));
        pokemon.add(new EpochTrapinch("", Aspect.EPOCH));
        pokemon.add(new EpochVibrava("", Aspect.EPOCH));
        pokemon.add(new EpochFlygon("", Aspect.EPOCH));
        pokemon.add(new EpochShuppet("", Aspect.EPOCH));
        pokemon.add(new EpochBanette("", Aspect.EPOCH));
        pokemon.add(new EpochWhismur("", Aspect.EPOCH));
        pokemon.add(new EpochLoudred("", Aspect.EPOCH));
        pokemon.add(new EpochExploud("", Aspect.EPOCH));
        pokemon.add(new EpochCorphish("", Aspect.EPOCH));
        pokemon.add(new EpochCrawdaunt("", Aspect.EPOCH));
        pokemon.add(new EpochAnorith("", Aspect.EPOCH));
        pokemon.add(new EpochArmaldo("", Aspect.EPOCH));
        pokemon.add(new EpochBagon("", Aspect.EPOCH));
        pokemon.add(new EpochShelgon("", Aspect.EPOCH));
        pokemon.add(new EpochSalamence("", Aspect.EPOCH));
        pokemon.add(new EpochNosepassOne("", Aspect.EPOCH));
        pokemon.add(new EpochSlakoth("", Aspect.EPOCH));
        pokemon.add(new EpochVigoroth("", Aspect.EPOCH));
        pokemon.add(new EpochSlaking("", Aspect.EPOCH));
        pokemon.add(new EpochChimecho("", Aspect.EPOCH));
        pokemon.add(new EpochRoseliaOne("", Aspect.EPOCH));
        pokemon.add(new EpochLotad("", Aspect.EPOCH));
        pokemon.add(new EpochLombre("", Aspect.EPOCH));
        pokemon.add(new EpochLudicolo("", Aspect.EPOCH));
        pokemon.add(new EpochFeebasOne("", Aspect.EPOCH));
        pokemon.add(new EpochMiloticOne("", Aspect.EPOCH));
        pokemon.add(new EpochSkitty("", Aspect.EPOCH));
        pokemon.add(new EpochDelcatty("", Aspect.EPOCH));

    }

    private void addEghoPokemon() {
        //Pokemon Infinity
        pokemon.add(new EghoLotad("Lotad", Aspect.EGHO));
        pokemon.add(new EghoLombre("Lombre", Aspect.EGHO));
        pokemon.add(new EghoLudicolo("Ludicolo", Aspect.EGHO));
        pokemon.add(new EghoAzurill("Azurill", Aspect.EGHO));
        pokemon.add(new EghoSwablu("Swablu", Aspect.EGHO));
        pokemon.add(new EghoAltaria("Altaria", Aspect.EGHO));
    }

    private void addDeltaPokemon() {
        //Pokemon Insurgance
        pokemon.add(new DeltaTreecko("Treecko", Aspect.DELTA));
        pokemon.add(new DeltaGrovyle("Grovyle", Aspect.DELTA));
        pokemon.add(new DeltaSceptile("Sceptile", Aspect.DELTA));
        pokemon.add(new DeltaTorchic("Torchic", Aspect.DELTA));
        pokemon.add(new DeltaCombusken("Combusken", Aspect.DELTA));
        pokemon.add(new DeltaBlaziken("Blaziken", Aspect.DELTA));
        pokemon.add(new DeltaLotad("Lotad", Aspect.DELTA));
        pokemon.add(new DeltaLombre("Lombre", Aspect.DELTA));
        pokemon.add(new DeltaLudicolo("Ludicolo", Aspect.DELTA));
        pokemon.add(new DeltaSeedot("Seedot", Aspect.DELTA));
        pokemon.add(new DeltaNuzleaf("Nuzleaf", Aspect.DELTA));
        pokemon.add(new DeltaShiftry("Shiftry", Aspect.DELTA));
        pokemon.add(new DeltaRalts("Ralts", Aspect.DELTA));
        pokemon.add(new DeltaKirlia("Kirlia", Aspect.DELTA));
        pokemon.add(new DeltaGardevoir("Gardevoir", Aspect.DELTA));
        pokemon.add(new DeltaSableye("Sableye", Aspect.DELTA));
        pokemon.add(new DeltaMawile("Mawile", Aspect.DELTA));
        pokemon.add(new DeltaAron("Aron", Aspect.DELTA));
        pokemon.add(new DeltaLairon("Lairon", Aspect.DELTA));
        pokemon.add(new DeltaAggron("Aggron", Aspect.DELTA));
        pokemon.add(new DeltaMeditite("Meditite", Aspect.DELTA));
        pokemon.add(new DeltaMedicham("Medicham", Aspect.DELTA));
        pokemon.add(new DeltaPlusle("Plusle", Aspect.DELTA));
        pokemon.add(new DeltaMinun("Minun", Aspect.DELTA));
        pokemon.add(new DeltaRoselia("Roselia", Aspect.DELTA));
        pokemon.add(new DeltaWailmer("Wailmer", Aspect.DELTA));
        pokemon.add(new DeltaWailord("Wailord", Aspect.DELTA));
        pokemon.add(new DeltaNumel("Numel", Aspect.DELTA));
        pokemon.add(new DeltaCamerupt("Camerupt", Aspect.DELTA));
        pokemon.add(new DeltaFeebas("Feebas", Aspect.DELTA));
        pokemon.add(new DeltaMilotic("Milotic", Aspect.DELTA));
        pokemon.add(new DeltaSnorunt("Snorunt", Aspect.DELTA));
        pokemon.add(new DeltaGlalie("Glalie", Aspect.DELTA));
        pokemon.add(new DeltaClamperl("Clamperl", Aspect.DELTA));
        pokemon.add(new DeltaHuntail("Huntail", Aspect.DELTA));
        pokemon.add(new DeltaGorebyss("Gorebyss", Aspect.DELTA));
        pokemon.add(new DeltaSpiderBeldum("Beldum", Aspect.DELTA_SPIDER));
        pokemon.add(new DeltaSpiderMetang("Metang", Aspect.DELTA_SPIDER));
        pokemon.add(new DeltaSpiderMetagross("Metagross", Aspect.DELTA_SPIDER));
        pokemon.add(new DeltaRuinBeldum("Beldum", Aspect.DELTA_RUIN));
        pokemon.add(new DeltaRuinMetang("Metang", Aspect.DELTA_RUIN));
        pokemon.add(new DeltaRuinMetagross("Metagross", Aspect.DELTA_RUIN));
        pokemon.add(new DeltaRegirock("Regirock", Aspect.DELTA));
        pokemon.add(new DeltaRegice("Regice", Aspect.DELTA));
        pokemon.add(new DeltaRegisteel("Registeel", Aspect.DELTA));
    }

    private void addXPokemon() {
        //X-Species (Xenoverse)
        pokemon.add(new RoseliaX("",Aspect.X));
        pokemon.add(new CarvanhaX("",Aspect.X));
        pokemon.add(new SharpedoX("",Aspect.X));
        pokemon.add(new CacneaX("",Aspect.X));
        pokemon.add(new CacturneX("",Aspect.X));
    }
}
