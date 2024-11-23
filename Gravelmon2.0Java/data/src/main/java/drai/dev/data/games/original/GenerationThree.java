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
        pokemon.add(new AromianChimecho("", Aspect.AROMIAN).setUsesBigModel()); //TODO

        pokemon.add(new FabelianRalts("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        pokemon.add(new FabelianKirlia("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSableye("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSwablu("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSnorunt("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianBeldum("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMetang("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMetagross("", Aspect.FABELIAN).setUsesBigModel());

        pokemon.add(new MahalianTorkoal("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        pokemon.add(new MahalianPoochyena("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianMightyena("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new ElbianSlakoth("", Aspect.ELBIAN).setUsesBigModel()); //TODO
        pokemon.add(new ElbianVigoroth("", Aspect.ELBIAN).setUsesBigModel());
        pokemon.add(new ElbianGulpin("", Aspect.ELBIAN).setUsesBigModel());
        pokemon.add(new ElbianSwalot("", Aspect.ELBIAN).setUsesBigModel());

        pokemon.add(new FerranianBarboach("", Aspect.FERRANIAN).setUsesBigModel()); //TODO
        pokemon.add(new FerranianWhiscash("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianSlakoth("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianVigoroth("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianWailord("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianBagon("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianShelgon("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianSalamence("", Aspect.FERRANIAN).setUsesBigModel());

        pokemon.add(new RaianianWhismur("", Aspect.RAIANIAN).setUsesBigModel()); //TODO
        pokemon.add(new RaianianLoudred("", Aspect.RAIANIAN).setUsesBigModel());
        pokemon.add(new RaianianExploud("", Aspect.RAIANIAN, new Stats(490, PHYSICAL_ATTACKER, List.of(HP))).setUsesBigModel());
        pokemon.add(new RaianianAbsol("", Aspect.RAIANIAN, new Stats(465, PHYSICAL_ATTACKER, List.of(ATTACK, ATTACK, ATTACK))).setUsesBigModel());
        pokemon.add(new RaianianSalamence("", Aspect.RAIANIAN, new Stats(600, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());

        //TODO
        pokemon.add(new TrizoranAbsol("", Aspect.TRIZORAN, new Stats(465, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        //TODO
        pokemon.add(new NorseAbsol("", Aspect.NORSE, new Stats(465, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        pokemon.add(new FormanTreecko("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanTorchic("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMudkip("", Aspect.FORMAN).setUsesBigModel());

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
        pokemon.add(new MastenianShroomish("", Aspect.MASTENIAN));
        pokemon.add(new MastenianBreloom("", Aspect.MASTENIAN, new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));
//        pokemon.add(new MastenianIllumise("", Aspect.MASTENIAN));
        pokemon.add(new MastenianVolbeat("", Aspect.MASTENIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));

        registerSoulstonesVariants();

        pokemon.add(new IonosianTrapinch("", Aspect.IONOSIAN));
        pokemon.add(new IonosianVibrava("", Aspect.IONOSIAN));
        pokemon.add(new IonosianFlygon("", Aspect.IONOSIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));

        pokemon.add(new AvalossianTreecko("Treecko", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianGrovyle("Grovyle", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianSceptile("Sceptile", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianRalts("Ralts", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianKirlia("Kirlia", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianGardevoir("Gardevoir", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianSlakoth("Slakoth", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianVigoroth("Vigoroth", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianNincada("Nincada", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianDuskull("Duskull", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianDusclops("Dusclops", Aspect.AVALOSSIAN));

        pokemon.add(new EnjinnianElectrike("", Aspect.ENJINNIAN));
        pokemon.add(new EnjinnianManectric("", Aspect.ENJINNIAN));

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

//        pokemon.add(new AristosianNumel(322)); Missing Art
//        pokemon.add(new AristosianTaillow(276)); Member of line not finished
//        pokemon.add(new AristosianNosepass(299)); Missing Art
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
        addNewPokemon(new RelicRoselia("Roselia", Aspect.RELIC));
        addNewPokemon(new RelicSpinda("Spinda", Aspect.RELIC));

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
