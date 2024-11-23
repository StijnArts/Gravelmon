package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.aristos.regional.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.avalos.regional.*;
import drai.dev.data.pokemon.avoris.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.elb.regional.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.ferran.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.form.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.ionos.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.mastenia.regional.*;
import drai.dev.data.pokemon.neonintendo.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import static drai.dev.data.attributes.StatArchetype.*;
import static drai.dev.data.attributes.StatType.*;

public class GenerationThree extends Game {
    public GenerationThree() {
        super("generation3");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new AromianChimecho("", Aspect.AROMIAN).setUsesBigModel()); //TODO

        addNewPokemon(new FabelianRalts("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        addNewPokemon(new FabelianKirlia("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianSableye("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianSwablu("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianSnorunt("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianBeldum("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianMetang("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianMetagross("", Aspect.FABELIAN).setUsesBigModel());

        addNewPokemon(new MahalianTorkoal("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        addNewPokemon(new MahalianPoochyena("", Aspect.MAHALIAN).setUsesBigModel());
        addNewPokemon(new MahalianMightyena("", Aspect.MAHALIAN).setUsesBigModel());

        addNewPokemon(new ElbianSlakoth("", Aspect.ELBIAN).setUsesBigModel()); //TODO
        addNewPokemon(new ElbianVigoroth("", Aspect.ELBIAN).setUsesBigModel());
        addNewPokemon(new ElbianGulpin("", Aspect.ELBIAN).setUsesBigModel());
        addNewPokemon(new ElbianSwalot("", Aspect.ELBIAN).setUsesBigModel());

        addNewPokemon(new FerranianBarboach("", Aspect.FERRANIAN).setUsesBigModel()); //TODO
        addNewPokemon(new FerranianWhiscash("", Aspect.FERRANIAN).setUsesBigModel());
        addNewPokemon(new FerranianSlakoth("", Aspect.FERRANIAN).setUsesBigModel());
        addNewPokemon(new FerranianVigoroth("", Aspect.FERRANIAN).setUsesBigModel());
        addNewPokemon(new FerranianWailord("", Aspect.FERRANIAN).setUsesBigModel());
        addNewPokemon(new FerranianBagon("", Aspect.FERRANIAN).setUsesBigModel());
        addNewPokemon(new FerranianShelgon("", Aspect.FERRANIAN).setUsesBigModel());
        addNewPokemon(new FerranianSalamence("", Aspect.FERRANIAN).setUsesBigModel());

        addNewPokemon(new RaianianWhismur("", Aspect.RAIANIAN).setUsesBigModel()); //TODO
        addNewPokemon(new RaianianLoudred("", Aspect.RAIANIAN).setUsesBigModel());
        addNewPokemon(new RaianianExploud("", Aspect.RAIANIAN, new Stats(490, PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        addNewPokemon(new RaianianAbsol("", Aspect.RAIANIAN, new Stats(465, PHYSICAL_ATTACKER, List.of(ATTACK, ATTACK, ATTACK))).setUsesBigModel());
        addNewPokemon(new RaianianSalamence("", Aspect.RAIANIAN, new Stats(600, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());

        //TODO
        addNewPokemon(new TrizoranAbsol("", Aspect.TRIZORAN, new Stats(465, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        //TODO
        addNewPokemon(new NorseAbsol("", Aspect.NORSE, new Stats(465, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        addNewPokemon(new FormanTreecko("", Aspect.FORMAN).setUsesBigModel());
        addNewPokemon(new FormanTorchic("", Aspect.FORMAN).setUsesBigModel());
        addNewPokemon(new FormanMudkip("", Aspect.FORMAN).setUsesBigModel());

//        addNewPokemon(new MystisianAbsol("", Aspect.MYSTISIAN)); TODO

//        addNewPokemon(new OlysosianMightyena("", Aspect.OLYSOSIAN)); TODO
//        addNewPokemon(new OlysosianPoochyena("", Aspect.OLYSOSIAN));

//        addNewPokemon(new NodorranTreecko("", Aspect.NODORRAN));  MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranGrovyle("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranSceptile("", Aspect.NODORRAN)); Missing art
//        addNewPokemon(new NodorranNosepass("", Aspect.NODORRAN)); TODO

//        addNewPokemon(new MastenianTreecko("", Aspect.MASTENIAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new MastenianGrovyle("", Aspect.MASTENIAN)); MISSING ART
//        addNewPokemon(new MastenianTorchic("", Aspect.MASTENIAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new MastenianCombusken("", Aspect.MASTENIAN)); MISSING ART
//        addNewPokemon(new MastenianMudkip("", Aspect.MASTENIAN)); MEMBER OF LINE NOT FINISHED
        addNewPokemon(new MastenianShroomish("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianBreloom("", Aspect.MASTENIAN, new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
//        addNewPokemon(new MastenianIllumise("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianVolbeat("", Aspect.MASTENIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));

        registerSoulstonesVariants();

        addNewPokemon(new IonosianTrapinch("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianVibrava("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianFlygon("", Aspect.IONOSIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));

        addNewPokemon(new AvalossianTreecko("Treecko", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGrovyle("Grovyle", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianSceptile("Sceptile", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianRalts("Ralts", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianKirlia("Kirlia", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGardevoir("Gardevoir", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianSlakoth("Slakoth", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianVigoroth("Vigoroth", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianNincada("Nincada", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianDuskull("Duskull", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianDusclops("Dusclops", Aspect.AVALOSSIAN));

        addNewPokemon(new EnjinnianElectrike("", Aspect.ENJINNIAN));
        addNewPokemon(new EnjinnianManectric("", Aspect.ENJINNIAN));

        addNewPokemon(new EnjinnianSableye("Sableye", Aspect.ENJINNIAN));

        addNewPokemon(new NeoCacnea("Cacnea", Aspect.NEO));

        addNewPokemon(new NovranHuntail("Huntail", Aspect.NOVRAN));
        addNewPokemon(new NovranGorebyss("Gorebyss", Aspect.NOVRAN));

        addNewPokemon(new QamoranSpoink("Spoink", Aspect.QAMORAN));
        addNewPokemon(new QamoranGrumpig("Grumpig", Aspect.QAMORAN));

        addNewPokemon(new NorheimanMasquerain("Masquerain", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new NorheimanWailmer("Wailmer", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanNumel("Numel", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCorphish("Corphish", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCrawdaunt("Crawdaunt", Aspect.NORHEIMAN, new Stats(468, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));


        addNewPokemon(new VaritasianSwablu("Swablu", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianAltaria("Altaria", Aspect.VARITASIAN));

        addNewPokemon(new AvorianRoselia("Roselia", Aspect.AVORIAN));

        addNewPokemon(new HizianNosepass("Nosepass", Aspect.HIZIAN));
        addNewPokemon(new HizianSkitty("Skitty", Aspect.HIZIAN));
        addNewPokemon(new HizianDelcatty("Delcatty", Aspect.HIZIAN));
        addNewPokemon(new HizianAron("Aron", Aspect.HIZIAN));
        addNewPokemon(new HizianLairon("Lairon", Aspect.HIZIAN));
        addNewPokemon(new HizianAggron("Aggron", Aspect.HIZIAN));
        addNewPokemon(new HizianLileep("Lileep", Aspect.HIZIAN));
        addNewPokemon(new HizianCradily("Cradily", Aspect.HIZIAN));
        addNewPokemon(new HizianAnorith("Anorith", Aspect.HIZIAN));
        addNewPokemon(new HizianArmaldo("Armaldo", Aspect.HIZIAN));
        addNewPokemon(new HizianTropius("Tropius", Aspect.HIZIAN));
        addNewPokemon(new HizianLuvdisc("Luvdisc", Aspect.HIZIAN));

//        addNewPokemon(new AristosianNumel(322)); Missing Art
//        addNewPokemon(new AristosianTaillow(276)); Member of line not finished
//        addNewPokemon(new AristosianNosepass(299)); Missing Art
        addNewPokemon(new AristosianTropius("Tropius", Aspect.ARISTOSIAN));

        addEghoPokemon();

        addDeltaPokemon();

        addXPokemon();

        //Radical Red
        addNewPokemon(new SeviianFeebas("Feebas", Aspect.SEVIIAN).fishingSpawnFromExisting());
        addNewPokemon(new SeviianMilotic("Milotic", Aspect.SEVIIAN));

        //Pokemon Flux
        addNewPokemon(new AlteranShroomish("Shroomish", Aspect.ALTERAN));
        addNewPokemon(new AlteranBreloom("Breloom", Aspect.ALTERAN));

        //Daybreak
        addNewPokemon(new ArmiranSceptile("Sceptile", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranSwellow("Swellow", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianTreecko("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGrovyle("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSceptile("", Aspect.AYREIAN));
        addNewPokemon(new AyreianZigzagoon("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLinoone("", Aspect.AYREIAN));
        addNewPokemon(new AyreianShroomish("", Aspect.AYREIAN));
        addNewPokemon(new AyreianBreloom("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRalts("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKirlia("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGardevoir("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTropius("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSnorunt("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGlalie("", Aspect.AYREIAN));

        addNewPokemon(new AyreianTorchic("Torchic", Aspect.AYREIAN));
        addNewPokemon(new AyreianCombusken("Combusken", Aspect.AYREIAN));
        addNewPokemon(new AyreianBlaziken("Blaziken", Aspect.AYREIAN));
        addNewPokemon(new AyreianNosepass("Nosepass", Aspect.AYREIAN));
        addNewPokemon(new AyreianAron("Aron", Aspect.AYREIAN));
        addNewPokemon(new AyreianLairon("Lairon", Aspect.AYREIAN));
        addNewPokemon(new AyreianAggron("Aggron", Aspect.AYREIAN));
        addNewPokemon(new AyreianRoselia("Roselia", Aspect.AYREIAN));
        addNewPokemon(new AyreianNumel("Numel", Aspect.AYREIAN));
        addNewPokemon(new AyreianCamerupt("Camerupt", Aspect.AYREIAN));
        addNewPokemon(new AyreianTrapinch("Trapinch", Aspect.AYREIAN));
        addNewPokemon(new AyreianVibrava("Vibrava", Aspect.AYREIAN));
        addNewPokemon(new AyreianFlygon("Flygon", Aspect.AYREIAN));
        addNewPokemon(new AyreianSwablu("Swablu", Aspect.AYREIAN));
        addNewPokemon(new AyreianAltaria("Altaria", Aspect.AYREIAN));
        addNewPokemon(new AyreianLunatone("Lunatone", Aspect.AYREIAN));
        addNewPokemon(new AyreianRelicanth("Relicanth", Aspect.AYREIAN));
        addNewPokemon(new AyreianLuvdisc("Luvdisc", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicRoselia("Roselia", Aspect.RELIC));
        addNewPokemon(new RelicSpinda("Spinda", Aspect.RELIC));

        //Kaskadian
        addNewPokemon(new KaskadianExploud("Exploud", Aspect.KASKADIAN));
        addNewPokemon(new GutsyCastform("Castform", Aspect.GUTSY));
        addNewPokemon(new WindyCastform("Castform", Aspect.WINDY));
        addNewPokemon(new SmoggyCastform("Castform", Aspect.SMOGGY));
        addNewPokemon(new DustyCastform("Castform", Aspect.DUSTY));
        addNewPokemon(new SandyCastform("Castform", Aspect.SANDY));
        addNewPokemon(new SwarmyCastform("Castform", Aspect.SWARMY));
        addNewPokemon(new SpookyCastform("Castform", Aspect.SPOOKY));
        addNewPokemon(new WhirlyCastform("Castform", Aspect.WHIRLY));
        addNewPokemon(new AllergyCastform("Castform", Aspect.ALLERGY));
        addNewPokemon(new ZappyCastform("Castform", Aspect.ZAPPY));
        addNewPokemon(new ZennyCastform("Castform", Aspect.ZENNY));
        addNewPokemon(new SorceryCastform("Castform", Aspect.SORCERY));
        addNewPokemon(new ShadyCastform("Castform", Aspect.SHADY));
        addNewPokemon(new LovelyCastform("Castform", Aspect.LOVELY));
        addNewPokemon(new KaskadianTropius("Tropius", Aspect.KASKADIAN).setUsesBigModel());

        //Azure (Mystic)
        addNewPokemon(new MysticTreecko("Treecko", Aspect.MYSTIC));
        addNewPokemon(new MysticGrovyle("Grovyle", Aspect.MYSTIC));
        addNewPokemon(new MysticSceptile("Sceptile", Aspect.MYSTIC));
        addNewPokemon(new MysticTorchic("Torchic", Aspect.MYSTIC));
        addNewPokemon(new MysticCombusken("Combusken", Aspect.MYSTIC));
        addNewPokemon(new MysticBlaziken("Blaziken", Aspect.MYSTIC));
        addNewPokemon(new MysticMudkip("Mudkip", Aspect.MYSTIC));
        addNewPokemon(new MysticMarshtomp("Marshtomp", Aspect.MYSTIC));
        addNewPokemon(new MysticSwampert("Swampert", Aspect.MYSTIC));
        addNewPokemon(new MysticPoochyena("Poochyena", Aspect.MYSTIC));
        addNewPokemon(new MysticMightyena("Mightyena", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranMakuhita("Makuhita", Aspect.CEFIRAN));
        addNewPokemon(new CefiranHariyama("Hariyama", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSableye("Sableye", Aspect.CEFIRAN));
        addNewPokemon(new CefiranNumel("Numel", Aspect.CEFIRAN));
        addNewPokemon(new CefiranCamerupt("Camerupt", Aspect.CEFIRAN));
        addNewPokemon(new CefiranVibrava("Vibrava", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFlygon("Flygon", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSnorunt("Snorunt", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGlalie("Glalie", Aspect.CEFIRAN));

    }

    private void registerSoulstonesVariants() {
        addNewPokemon(new EpochTreecko("", Aspect.EPOCH));
        addNewPokemon(new EpochGrovyle("", Aspect.EPOCH));
        addNewPokemon(new EpochSceptile("", Aspect.EPOCH));
        addNewPokemon(new EpochMudkip("", Aspect.EPOCH));
        addNewPokemon(new EpochMarshtomp("", Aspect.EPOCH));
        addNewPokemon(new EpochSwampert("", Aspect.EPOCH));
        addNewPokemon(new EpochMudkipOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMarshtompOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSwampertOne("", Aspect.EPOCH));

        addNewPokemon(new EpochWailmer("", Aspect.EPOCH));
        addNewPokemon(new EpochWailord("", Aspect.EPOCH));
        addNewPokemon(new EpochNosepass("", Aspect.EPOCH));
        addNewPokemon(new EpochGulpin("", Aspect.EPOCH));
        addNewPokemon(new EpochSwalot("", Aspect.EPOCH));
        addNewPokemon(new EpochBaltoy("", Aspect.EPOCH));
        addNewPokemon(new EpochClaydol("", Aspect.EPOCH));
        addNewPokemon(new EpochLunatone("", Aspect.EPOCH));
        addNewPokemon(new EpochSolrock("", Aspect.EPOCH));
        addNewPokemon(new EpochShroomish("", Aspect.EPOCH));
        addNewPokemon(new EpochBreloom("", Aspect.EPOCH));
        addNewPokemon(new EpochCarvanha("", Aspect.EPOCH));
        addNewPokemon(new EpochSharpedo("", Aspect.EPOCH));
        addNewPokemon(new EpochSnorunt("", Aspect.EPOCH));
        addNewPokemon(new EpochGlalie("", Aspect.EPOCH));
        addNewPokemon(new EpochSableye("", Aspect.EPOCH));
        addNewPokemon(new EpochSwablu("", Aspect.EPOCH));
        addNewPokemon(new EpochAltaria("", Aspect.EPOCH));
        addNewPokemon(new EpochDuskull("", Aspect.EPOCH));
        addNewPokemon(new EpochDusclops("", Aspect.EPOCH));
        addNewPokemon(new EpochAron("", Aspect.EPOCH));
        addNewPokemon(new EpochLairon("", Aspect.EPOCH));
        addNewPokemon(new EpochAggron("", Aspect.EPOCH));
        addNewPokemon(new EpochWurmple("", Aspect.EPOCH));
        addNewPokemon(new EpochSilcoon("", Aspect.EPOCH));
        addNewPokemon(new EpochBeautifly("", Aspect.EPOCH));
        addNewPokemon(new EpochWurmpleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCascoon("", Aspect.EPOCH));
        addNewPokemon(new EpochDustox("", Aspect.EPOCH));
        addNewPokemon(new EpochFeebas("", Aspect.EPOCH));
        addNewPokemon(new EpochMilotic("", Aspect.EPOCH));
        addNewPokemon(new EpochSeedot("", Aspect.EPOCH));
        addNewPokemon(new EpochNuzleaf("", Aspect.EPOCH));
        addNewPokemon(new EpochShiftry("", Aspect.EPOCH));
        addNewPokemon(new EpochRalts("", Aspect.EPOCH));
        addNewPokemon(new EpochKirlia("", Aspect.EPOCH));
        addNewPokemon(new EpochGardevoir("", Aspect.EPOCH));
        addNewPokemon(new EpochNumel("", Aspect.EPOCH));
        addNewPokemon(new EpochCamerupt("", Aspect.EPOCH));
        addNewPokemon(new EpochAzurill("", Aspect.EPOCH));
        addNewPokemon(new EpochPoochyena("", Aspect.EPOCH));
        addNewPokemon(new EpochMightyena("", Aspect.EPOCH));
        addNewPokemon(new EpochAbsol("", Aspect.EPOCH));
        addNewPokemon(new EpochBeldum("", Aspect.EPOCH));
        addNewPokemon(new EpochMetang("", Aspect.EPOCH));
        addNewPokemon(new EpochMetagross("", Aspect.EPOCH));
        addNewPokemon(new EpochMeditite("", Aspect.EPOCH));
        addNewPokemon(new EpochMedicham("", Aspect.EPOCH));
        addNewPokemon(new EpochNincada("", Aspect.EPOCH));
        addNewPokemon(new EpochNinjask("", Aspect.EPOCH));
        addNewPokemon(new EpochShedinja("", Aspect.EPOCH));
        addNewPokemon(new EpochLileep("", Aspect.EPOCH));
        addNewPokemon(new EpochCradily("", Aspect.EPOCH));
        addNewPokemon(new EpochCacnea("", Aspect.EPOCH));
        addNewPokemon(new EpochCacturne("", Aspect.EPOCH));
        addNewPokemon(new EpochTaillow("", Aspect.EPOCH));
        addNewPokemon(new EpochSwellow("", Aspect.EPOCH));
        addNewPokemon(new EpochSpheal("", Aspect.EPOCH));
        addNewPokemon(new EpochSealeo("", Aspect.EPOCH));
        addNewPokemon(new EpochWalrein("", Aspect.EPOCH));
        addNewPokemon(new EpochSurskit("", Aspect.EPOCH));
        addNewPokemon(new EpochMasquerain("", Aspect.EPOCH));
        addNewPokemon(new EpochWingull("", Aspect.EPOCH));
        addNewPokemon(new EpochPelipper("", Aspect.EPOCH));
        addNewPokemon(new EpochElectrike("", Aspect.EPOCH));
        addNewPokemon(new EpochManectric("", Aspect.EPOCH));
        addNewPokemon(new EpochTorkoal("", Aspect.EPOCH));
        addNewPokemon(new EpochRoselia("", Aspect.EPOCH));
        addNewPokemon(new EpochAbsolOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSableyeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSwabluOne("", Aspect.EPOCH));
        addNewPokemon(new EpochAltariaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSurskitOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMasquerainOne("", Aspect.EPOCH));
        addNewPokemon(new EpochClamperl("", Aspect.EPOCH));
        addNewPokemon(new EpochHuntail("", Aspect.EPOCH));
        addNewPokemon(new EpochGorebyss("", Aspect.EPOCH));
        addNewPokemon(new EpochSkittyOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDelcattyOne("", Aspect.EPOCH));
        addNewPokemon(new EpochNumelOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCameruptOne("", Aspect.EPOCH));
        addNewPokemon(new EpochZigzagoon("", Aspect.EPOCH));
        addNewPokemon(new EpochLinoone("", Aspect.EPOCH));
        addNewPokemon(new EpochTrapinch("", Aspect.EPOCH));
        addNewPokemon(new EpochVibrava("", Aspect.EPOCH));
        addNewPokemon(new EpochFlygon("", Aspect.EPOCH));
        addNewPokemon(new EpochShuppet("", Aspect.EPOCH));
        addNewPokemon(new EpochBanette("", Aspect.EPOCH));
        addNewPokemon(new EpochWhismur("", Aspect.EPOCH));
        addNewPokemon(new EpochLoudred("", Aspect.EPOCH));
        addNewPokemon(new EpochExploud("", Aspect.EPOCH));
        addNewPokemon(new EpochCorphish("", Aspect.EPOCH));
        addNewPokemon(new EpochCrawdaunt("", Aspect.EPOCH));
        addNewPokemon(new EpochAnorith("", Aspect.EPOCH));
        addNewPokemon(new EpochArmaldo("", Aspect.EPOCH));
        addNewPokemon(new EpochBagon("", Aspect.EPOCH));
        addNewPokemon(new EpochShelgon("", Aspect.EPOCH));
        addNewPokemon(new EpochSalamence("", Aspect.EPOCH));
        addNewPokemon(new EpochNosepassOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSlakoth("", Aspect.EPOCH));
        addNewPokemon(new EpochVigoroth("", Aspect.EPOCH));
        addNewPokemon(new EpochSlaking("", Aspect.EPOCH));
        addNewPokemon(new EpochChimecho("", Aspect.EPOCH));
        addNewPokemon(new EpochRoseliaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochLotad("", Aspect.EPOCH));
        addNewPokemon(new EpochLombre("", Aspect.EPOCH));
        addNewPokemon(new EpochLudicolo("", Aspect.EPOCH));
        addNewPokemon(new EpochFeebasOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMiloticOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSkitty("", Aspect.EPOCH));
        addNewPokemon(new EpochDelcatty("", Aspect.EPOCH));

    }

    private void addEghoPokemon() {
        //Pokemon Infinity
        addNewPokemon(new EghoLotad("Lotad", Aspect.EGHO));
        addNewPokemon(new EghoLombre("Lombre", Aspect.EGHO));
        addNewPokemon(new EghoLudicolo("Ludicolo", Aspect.EGHO));
        addNewPokemon(new EghoAzurill("Azurill", Aspect.EGHO));
        addNewPokemon(new EghoSwablu("Swablu", Aspect.EGHO));
        addNewPokemon(new EghoAltaria("Altaria", Aspect.EGHO));
    }

    private void addDeltaPokemon() {
        //Pokemon Insurgance
        addNewPokemon(new DeltaTreecko("Treecko", Aspect.DELTA));
        addNewPokemon(new DeltaGrovyle("Grovyle", Aspect.DELTA));
        addNewPokemon(new DeltaSceptile("Sceptile", Aspect.DELTA));
        addNewPokemon(new DeltaTorchic("Torchic", Aspect.DELTA));
        addNewPokemon(new DeltaCombusken("Combusken", Aspect.DELTA));
        addNewPokemon(new DeltaBlaziken("Blaziken", Aspect.DELTA));
        addNewPokemon(new DeltaLotad("Lotad", Aspect.DELTA));
        addNewPokemon(new DeltaLombre("Lombre", Aspect.DELTA));
        addNewPokemon(new DeltaLudicolo("Ludicolo", Aspect.DELTA));
        addNewPokemon(new DeltaSeedot("Seedot", Aspect.DELTA));
        addNewPokemon(new DeltaNuzleaf("Nuzleaf", Aspect.DELTA));
        addNewPokemon(new DeltaShiftry("Shiftry", Aspect.DELTA));
        addNewPokemon(new DeltaRalts("Ralts", Aspect.DELTA));
        addNewPokemon(new DeltaKirlia("Kirlia", Aspect.DELTA));
        addNewPokemon(new DeltaGardevoir("Gardevoir", Aspect.DELTA));
        addNewPokemon(new DeltaSableye("Sableye", Aspect.DELTA));
        addNewPokemon(new DeltaMawile("Mawile", Aspect.DELTA));
        addNewPokemon(new DeltaAron("Aron", Aspect.DELTA));
        addNewPokemon(new DeltaLairon("Lairon", Aspect.DELTA));
        addNewPokemon(new DeltaAggron("Aggron", Aspect.DELTA));
        addNewPokemon(new DeltaMeditite("Meditite", Aspect.DELTA));
        addNewPokemon(new DeltaMedicham("Medicham", Aspect.DELTA));
        addNewPokemon(new DeltaPlusle("Plusle", Aspect.DELTA));
        addNewPokemon(new DeltaMinun("Minun", Aspect.DELTA));
        addNewPokemon(new DeltaRoselia("Roselia", Aspect.DELTA));
        addNewPokemon(new DeltaWailmer("Wailmer", Aspect.DELTA));
        addNewPokemon(new DeltaWailord("Wailord", Aspect.DELTA));
        addNewPokemon(new DeltaNumel("Numel", Aspect.DELTA));
        addNewPokemon(new DeltaCamerupt("Camerupt", Aspect.DELTA));
        addNewPokemon(new DeltaFeebas("Feebas", Aspect.DELTA));
        addNewPokemon(new DeltaMilotic("Milotic", Aspect.DELTA));
        addNewPokemon(new DeltaSnorunt("Snorunt", Aspect.DELTA));
        addNewPokemon(new DeltaGlalie("Glalie", Aspect.DELTA));
        addNewPokemon(new DeltaClamperl("Clamperl", Aspect.DELTA));
        addNewPokemon(new DeltaHuntail("Huntail", Aspect.DELTA));
        addNewPokemon(new DeltaGorebyss("Gorebyss", Aspect.DELTA));
        addNewPokemon(new DeltaSpiderBeldum("Beldum", Aspect.DELTA_SPIDER));
        addNewPokemon(new DeltaSpiderMetang("Metang", Aspect.DELTA_SPIDER));
        addNewPokemon(new DeltaSpiderMetagross("Metagross", Aspect.DELTA_SPIDER));
        addNewPokemon(new DeltaRuinBeldum("Beldum", Aspect.DELTA_RUIN));
        addNewPokemon(new DeltaRuinMetang("Metang", Aspect.DELTA_RUIN));
        addNewPokemon(new DeltaRuinMetagross("Metagross", Aspect.DELTA_RUIN));
        addNewPokemon(new DeltaRegirock("Regirock", Aspect.DELTA));
        addNewPokemon(new DeltaRegice("Regice", Aspect.DELTA));
        addNewPokemon(new DeltaRegisteel("Registeel", Aspect.DELTA));
    }

    private void addXPokemon() {
        //X-Species (Xenoverse)
        addNewPokemon(new RoseliaX("",Aspect.X));
        addNewPokemon(new CarvanhaX("",Aspect.X));
        addNewPokemon(new SharpedoX("",Aspect.X));
        addNewPokemon(new CacneaX("",Aspect.X));
        addNewPokemon(new CacturneX("",Aspect.X));
    }
}
