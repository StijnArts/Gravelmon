package drai.dev.data.games.original;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.chaosinvestia.*;
import drai.dev.data.pokemon.chaosinvestia.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.ivris.*;
import drai.dev.data.pokemon.ivris.regional.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class GenerationSix extends Game {
    public GenerationSix() {
        super("generation6");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new AromianSpritzee("", Aspect.AROMIAN).setUsesBigModel()); //TODO
        addNewPokemon(new AromianAromatisse("", Aspect.AROMIAN).setUsesBigModel());

        addNewPokemon(new MahalianBunnelby("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        addNewPokemon(new MahalianDiggersby("", Aspect.MAHALIAN).setUsesBigModel());

        addNewPokemon(new IvrisianSpritzee("", Aspect.IVRISIAN).setUsesBigModel()); //TODO
        addNewPokemon(new IvrisianClauncher("", Aspect.IVRISIAN).setUsesBigModel());

//        addNewPokemon(new PastelianFlabebe("", Aspect.PASTELIAN)); TODO
//        addNewPokemon(new PastelianFloette("", Aspect.PASTELIAN));

//        addNewPokemon(new TheossianFlabebe("", Aspect.THEOSSIAN)); TODO
//        addNewPokemon(new TheossianFloette("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianFlorges("", Aspect.THEOSSIAN));

        registerSoulstonesVariants();

        addNewPokemon(new AfricanusanHonedge("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanDoublade("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanAegislash("", Aspect.AFRICANUSAN));

//       addNewPokemon(new OttoranHonedge("", Aspect.OTTORAN)); TODO
//       addNewPokemon(new OttoranDoublade("", Aspect.OTTORAN));

        addNewPokemon(new LagoonanBinacle("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanBarbaracle("", Aspect.LAGOONAN));

//        addNewPokemon(new IonosianInkay("", Aspect.IONOSIAN));   Missing Art

        addNewPokemon(new VesitanChespin("", Aspect.VESITAN));
        addNewPokemon(new VesitanQuilladin("", Aspect.VESITAN));
        addNewPokemon(new VesitanChesnaught("", Aspect.VESITAN));
        addNewPokemon(new VesitanFennekin("", Aspect.VESITAN));
        addNewPokemon(new VesitanBraixen("", Aspect.VESITAN));
        addNewPokemon(new VesitanDelphox("", Aspect.VESITAN));
        addNewPokemon(new VesitanFroakie("", Aspect.VESITAN));
        addNewPokemon(new VesitanFrogadier("", Aspect.VESITAN));
        addNewPokemon(new VesitanGreninja("", Aspect.VESITAN));
        addNewPokemon(new VesitanScatterbug("", Aspect.VESITAN));
        addNewPokemon(new VesitanSpewpa("", Aspect.VESITAN));
        addNewPokemon(new VesitanVivillon("", Aspect.VESITAN));
        addNewPokemon(new VesitanFlabebe("", Aspect.VESITAN));
        addNewPokemon(new VesitanFloette("", Aspect.VESITAN));
        addNewPokemon(new VesitanFlorges("", Aspect.VESITAN));
        addNewPokemon(new VesitanSkiddo("", Aspect.VESITAN));
        addNewPokemon(new VesitanGogoat("", Aspect.VESITAN));
        addNewPokemon(new VesitanSpritzee("", Aspect.VESITAN));
        addNewPokemon(new VesitanAromatisse("", Aspect.VESITAN));
        addNewPokemon(new VesitanSwirlix("", Aspect.VESITAN));
        addNewPokemon(new VesitanSlurpuff("", Aspect.VESITAN));
        addNewPokemon(new VesitanInkay("", Aspect.VESITAN));
        addNewPokemon(new VesitanMalamar("", Aspect.VESITAN));
        addNewPokemon(new VesitanBinacle("", Aspect.VESITAN));
        addNewPokemon(new VesitanBarbaracle("", Aspect.VESITAN));
        addNewPokemon(new VesitanSkrelp("", Aspect.VESITAN));
        addNewPokemon(new VesitanDragalge("", Aspect.VESITAN));
        addNewPokemon(new VesitanClauncher("", Aspect.VESITAN));
        addNewPokemon(new VesitanClawitzer("", Aspect.VESITAN));
        addNewPokemon(new VesitanHelioptile("", Aspect.VESITAN));
        addNewPokemon(new VesitanHeliolisk("", Aspect.VESITAN));
        addNewPokemon(new VesitanHawlucha("", Aspect.VESITAN));
        addNewPokemon(new VesitanDedenne("", Aspect.VESITAN));
        addNewPokemon(new VesitanGoomy("", Aspect.VESITAN));
        addNewPokemon(new VesitanSliggoo("", Aspect.VESITAN));
        addNewPokemon(new VesitanGoodra("", Aspect.VESITAN));
        addNewPokemon(new VesitanBergmite("", Aspect.VESITAN));
        addNewPokemon(new VesitanAvalugg("", Aspect.VESITAN));
        addNewPokemon(new VesitanNoibat("", Aspect.VESITAN));
        addNewPokemon(new VesitanNoivern("", Aspect.VESITAN));
//        addNewPokemon(new VesitanXerneas("", Aspect.VESITAN));
//        addNewPokemon(new VesitanYveltal("", Aspect.VESITAN));

        addNewPokemon(new NovranSkrelp("Skrelp", Aspect.NOVRAN));
        addNewPokemon(new NovranDragalge("Dragalge", Aspect.NOVRAN));

        addNewPokemon(new VaritasianFlabebe("Flabebe", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianFloette("Floette", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianPhantump("Phantump", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTrevenant("Trevenant", Aspect.VARITASIAN));

        addNewPokemon(new HizianLitleo("Litleo", Aspect.HIZIAN));
        addNewPokemon(new HizianPyroar("Pyroar", Aspect.HIZIAN));

//        addNewPokemon(new AristosianLitleo(667)); Missing Art


        //Pokemon Insurgance
        addNewPokemon(new DeltaFroakie("Froakie", Aspect.DELTA));
        addNewPokemon(new DeltaFrogadier("Frogadier", Aspect.DELTA));
        addNewPokemon(new DeltaGreninja("Greninja", Aspect.DELTA));
        addNewPokemon(new DeltaAmaura("Amaura", Aspect.DELTA));
        addNewPokemon(new DeltaAurorus("Aurorus", Aspect.DELTA));
        addNewPokemon(new DeltaGoomy("Goomy", Aspect.DELTA));
        addNewPokemon(new DeltaSliggoo("Sliggoo", Aspect.DELTA));
        addNewPokemon(new DeltaGoodra("Goodra", Aspect.DELTA));
        addNewPokemon(new DeltaPhantump("Phantump", Aspect.DELTA));
        addNewPokemon(new DeltaTrevenant("Trevenant", Aspect.DELTA));
        addNewPokemon(new DeltaBergmite("Bergmite", Aspect.DELTA));
        addNewPokemon(new DeltaAvalugg("Avalugg", Aspect.DELTA));
        addNewPokemon(new DeltaNoibat("Noibat", Aspect.DELTA));
        addNewPokemon(new DeltaNoivern("Noivern", Aspect.DELTA));
        addNewPokemon(new DeltaHoopa("Hoopa", Aspect.DELTA));
        addNewPokemon(new DeltaHoopaUnleashed("Hoopa", Aspect.DELTA_UNLEASHED));

        //X-Species (Xenoverse)
        addNewPokemon(new GreninjaX("Greninja", Aspect.X));
        addNewPokemon(new AegislashX("Aegislash", Aspect.X));
        addNewPokemon(new SwirlixX("Swirlix", Aspect.X));
        addNewPokemon(new SlurpuffX("Slurpuff", Aspect.X));

        //Pokemon Blazing Emerald
        addNewPokemon(new HoennianGoomy("Goomy", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianClauncher("Clauncher", Aspect.SEVIIAN));
        addNewPokemon(new SeviianClawitzer("Clawitzer", Aspect.SEVIIAN));
        addNewPokemon(new SeviianNoibat("Noibat", Aspect.SEVIIAN));
        addNewPokemon(new SeviianNoivern("Noivern", Aspect.SEVIIAN));

        //Myth
        addNewPokemon(new MythianNoivern("Noivern", Aspect.MYTHIAN));

        //Daybreak
        addNewPokemon(new ArmiranFroakie("Froakie", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranFrogadier("Frogadier", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranGreninja("Greninja", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianSkiddo("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGogoat("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPhantump("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTrevenant("", Aspect.AYREIAN));

        addNewPokemon(new AyreianFletchling("Fletchling", Aspect.AYREIAN));
        addNewPokemon(new AyreianFletchinder("Fletchinder", Aspect.AYREIAN));
        addNewPokemon(new AyreianPancham("Pancham", Aspect.AYREIAN));
        addNewPokemon(new AyreianPangoro("Pangoro", Aspect.AYREIAN));
        addNewPokemon(new AyreianCarbink("Carbink", Aspect.AYREIAN));
        addNewPokemon(new AyreianKlefki("Klefki", Aspect.AYREIAN));
        addNewPokemon(new AyreianPumpkaboo("Pumpkaboo", Aspect.AYREIAN));
        addNewPokemon(new AyreianGourgeist("Gourgeist", Aspect.AYREIAN));
        addNewPokemon(new AyreianNoibat("Noibat", Aspect.AYREIAN));
        addNewPokemon(new AyreianNoivern("Noivern", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicSkiddo("Skiddo", Aspect.RELIC));
        addNewPokemon(new RelicGogoat("Gogoat", Aspect.RELIC));

        //Kaskadian
        addNewPokemon(new KaskadianBunnelby("Bunnelby", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianDiggersby("Diggersby", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianPhantump("Phantump", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianTrevenant("Trevenant", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianDiancie("Diancie", Aspect.KASKADIAN));

        //Pokemon Opalo
        addNewPokemon(new CefiranKlefki("Klefki", Aspect.CEFIRAN));
    }

    private void registerSoulstonesVariants() {
        addNewPokemon(new EpochFennekin("", Aspect.EPOCH));
        addNewPokemon(new EpochBraixen("", Aspect.EPOCH));
        addNewPokemon(new EpochDelphox("", Aspect.EPOCH));
        addNewPokemon(new EpochChespin("", Aspect.EPOCH));
        addNewPokemon(new EpochQuilladin("", Aspect.EPOCH));
        addNewPokemon(new EpochChesnaught("", Aspect.EPOCH));
        addNewPokemon(new EpochFroakie("", Aspect.EPOCH));
        addNewPokemon(new EpochFrogadier("", Aspect.EPOCH));
        addNewPokemon(new EpochGreninja("", Aspect.EPOCH));

        addNewPokemon(new EpochFletchling("", Aspect.EPOCH));
        addNewPokemon(new EpochFletchinder("", Aspect.EPOCH));
        addNewPokemon(new EpochTalonflame("", Aspect.EPOCH));
        addNewPokemon(new EpochBergmite("", Aspect.EPOCH));
        addNewPokemon(new EpochAvalugg("", Aspect.EPOCH));
        addNewPokemon(new EpochAmaura("", Aspect.EPOCH));
        addNewPokemon(new EpochAurorus("", Aspect.EPOCH));
        addNewPokemon(new EpochSkrelp("", Aspect.EPOCH));
        addNewPokemon(new EpochDragalge("", Aspect.EPOCH));
        addNewPokemon(new EpochLitleo("", Aspect.EPOCH));
        addNewPokemon(new EpochPyroar("", Aspect.EPOCH));
        addNewPokemon(new EpochSkiddo("", Aspect.EPOCH));
        addNewPokemon(new EpochGogoat("", Aspect.EPOCH));
        addNewPokemon(new EpochSwirlix("", Aspect.EPOCH));
        addNewPokemon(new EpochSlurpuff("", Aspect.EPOCH));
        addNewPokemon(new EpochSylveon("", Aspect.EPOCH));
        addNewPokemon(new EpochNoibat("", Aspect.EPOCH));
        addNewPokemon(new EpochNoivern("", Aspect.EPOCH));
        addNewPokemon(new EpochSpritzee("", Aspect.EPOCH));
        addNewPokemon(new EpochAromatisse("", Aspect.EPOCH));
        addNewPokemon(new EpochFurfrou("", Aspect.EPOCH));
        addNewPokemon(new EpochHonedge("", Aspect.EPOCH));
        addNewPokemon(new EpochHonedgeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochHonedgeTwo("", Aspect.EPOCH));
        addNewPokemon(new EpochHonedgeThree("", Aspect.EPOCH));
        addNewPokemon(new EpochDoublade("", Aspect.EPOCH));
        addNewPokemon(new EpochDoubladeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDoubladeTwo("", Aspect.EPOCH));
        addNewPokemon(new EpochDoubladeThree("", Aspect.EPOCH));
        addNewPokemon(new EpochAegislash("", Aspect.EPOCH));
        addNewPokemon(new EpochAegislashOne("", Aspect.EPOCH));
        addNewPokemon(new EpochAegislashTwo("", Aspect.EPOCH));
        addNewPokemon(new EpochAegislashThree("", Aspect.EPOCH));
        addNewPokemon(new EpochEspurr("", Aspect.EPOCH));
        addNewPokemon(new EpochMeowstic("", Aspect.EPOCH));
        addNewPokemon(new EpochKlefki("", Aspect.EPOCH));
        addNewPokemon(new EpochTyrunt("", Aspect.EPOCH));
        addNewPokemon(new EpochTyrantrum("", Aspect.EPOCH));
        addNewPokemon(new EpochSpritzeeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochAromatisseOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCarbink("", Aspect.EPOCH));
        addNewPokemon(new EpochGoomy("", Aspect.EPOCH));
        addNewPokemon(new EpochSliggoo("", Aspect.EPOCH));
        addNewPokemon(new EpochGoodra("", Aspect.EPOCH));
        addNewPokemon(new EpochBinacle("", Aspect.EPOCH));
        addNewPokemon(new EpochBarbaracle("", Aspect.EPOCH));
        addNewPokemon(new EpochPhantump("", Aspect.EPOCH));
        addNewPokemon(new EpochTrevenant("", Aspect.EPOCH));
        addNewPokemon(new EpochHelioptile("", Aspect.EPOCH));
        addNewPokemon(new EpochHeliolisk("", Aspect.EPOCH));
        addNewPokemon(new EpochDedenne("", Aspect.EPOCH));
        addNewPokemon(new EpochFlabebe("", Aspect.EPOCH));
        addNewPokemon(new EpochFloette("", Aspect.EPOCH));
        addNewPokemon(new EpochFlorges("", Aspect.EPOCH));
        addNewPokemon(new EpochHoopa("", Aspect.EPOCH));

    }
}
