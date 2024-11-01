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
        pokemon.add(new AromianSpritzee("", Aspect.AROMIAN).setUsesBigModel()); //TODO
        pokemon.add(new AromianAromatisse("", Aspect.AROMIAN).setUsesBigModel());

        pokemon.add(new MahalianBunnelby("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        pokemon.add(new MahalianDiggersby("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new IvrisianSpritzee("", Aspect.IVRISIAN).setUsesBigModel()); //TODO
        pokemon.add(new IvrisianClauncher("", Aspect.IVRISIAN).setUsesBigModel());

//        pokemon.add(new PastelianFlabebe("", Aspect.PASTELIAN)); TODO
//        pokemon.add(new PastelianFloette("", Aspect.PASTELIAN));

//        pokemon.add(new TheossianFlabebe("", Aspect.THEOSSIAN)); TODO
//        pokemon.add(new TheossianFloette("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianFlorges("", Aspect.THEOSSIAN));

        registerSoulstonesVariants();

        pokemon.add(new AfricanusanHonedge("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanDoublade("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanAegislash("", Aspect.AFRICANUSAN));

//       pokemon.add(new OttoranHonedge("", Aspect.OTTORAN)); TODO
//       pokemon.add(new OttoranDoublade("", Aspect.OTTORAN));

        pokemon.add(new LagoonanBinacle("", Aspect.LAGOONAN));
        pokemon.add(new LagoonanBarbaracle("", Aspect.LAGOONAN));

//        pokemon.add(new IonosianInkay("", Aspect.IONOSIAN));   Missing Art

        pokemon.add(new VesitanChespin("", Aspect.VESITAN));
        pokemon.add(new VesitanQuilladin("", Aspect.VESITAN));
        pokemon.add(new VesitanChesnaught("", Aspect.VESITAN));
        pokemon.add(new VesitanFennekin("", Aspect.VESITAN));
        pokemon.add(new VesitanBraixen("", Aspect.VESITAN));
        pokemon.add(new VesitanDelphox("", Aspect.VESITAN));
        pokemon.add(new VesitanFroakie("", Aspect.VESITAN));
        pokemon.add(new VesitanFrogadier("", Aspect.VESITAN));
        pokemon.add(new VesitanGreninja("", Aspect.VESITAN));
        pokemon.add(new VesitanScatterbug("", Aspect.VESITAN));
        pokemon.add(new VesitanSpewpa("", Aspect.VESITAN));
        pokemon.add(new VesitanVivillon("", Aspect.VESITAN));
        pokemon.add(new VesitanFlabebe("", Aspect.VESITAN));
        pokemon.add(new VesitanFloette("", Aspect.VESITAN));
        pokemon.add(new VesitanFlorges("", Aspect.VESITAN));
        pokemon.add(new VesitanSkiddo("", Aspect.VESITAN));
        pokemon.add(new VesitanGogoat("", Aspect.VESITAN));
        pokemon.add(new VesitanSpritzee("", Aspect.VESITAN));
        pokemon.add(new VesitanAromatisse("", Aspect.VESITAN));
        pokemon.add(new VesitanSwirlix("", Aspect.VESITAN));
        pokemon.add(new VesitanSlurpuff("", Aspect.VESITAN));
        pokemon.add(new VesitanInkay("", Aspect.VESITAN));
        pokemon.add(new VesitanMalamar("", Aspect.VESITAN));
        pokemon.add(new VesitanBinacle("", Aspect.VESITAN));
        pokemon.add(new VesitanBarbaracle("", Aspect.VESITAN));
        pokemon.add(new VesitanSkrelp("", Aspect.VESITAN));
        pokemon.add(new VesitanDragalge("", Aspect.VESITAN));
        pokemon.add(new VesitanClauncher("", Aspect.VESITAN));
        pokemon.add(new VesitanClawitzer("", Aspect.VESITAN));
        pokemon.add(new VesitanHelioptile("", Aspect.VESITAN));
        pokemon.add(new VesitanHeliolisk("", Aspect.VESITAN));
        pokemon.add(new VesitanHawlucha("", Aspect.VESITAN));
        pokemon.add(new VesitanDedenne("", Aspect.VESITAN));
        pokemon.add(new VesitanGoomy("", Aspect.VESITAN));
        pokemon.add(new VesitanSliggoo("", Aspect.VESITAN));
        pokemon.add(new VesitanGoodra("", Aspect.VESITAN));
        pokemon.add(new VesitanBergmite("", Aspect.VESITAN));
        pokemon.add(new VesitanAvalugg("", Aspect.VESITAN));
        pokemon.add(new VesitanNoibat("", Aspect.VESITAN));
        pokemon.add(new VesitanNoivern("", Aspect.VESITAN));
//        pokemon.add(new VesitanXerneas("", Aspect.VESITAN));
//        pokemon.add(new VesitanYveltal("", Aspect.VESITAN));

        pokemon.add(new NovranSkrelp("Skrelp", Aspect.NOVRAN));
        pokemon.add(new NovranDragalge("Dragalge", Aspect.NOVRAN));

        pokemon.add(new VaritasianFlabebe("Flabebe", Aspect.VARITASIAN));
        pokemon.add(new VaritasianFloette("Floette", Aspect.VARITASIAN));
        pokemon.add(new VaritasianPhantump("Phantump", Aspect.VARITASIAN));
        pokemon.add(new VaritasianTrevenant("Trevenant", Aspect.VARITASIAN));

        pokemon.add(new HizianLitleo("Litleo", Aspect.HIZIAN));
        pokemon.add(new HizianPyroar("Pyroar", Aspect.HIZIAN));

//        pokemon.add(new AristosianLitleo(667)); Missing Art


        //Pokemon Insurgance
        pokemon.add(new DeltaFroakie("Froakie", Aspect.DELTA));
        pokemon.add(new DeltaFrogadier("Frogadier", Aspect.DELTA));
        pokemon.add(new DeltaGreninja("Greninja", Aspect.DELTA));
        pokemon.add(new DeltaAmaura("Amaura", Aspect.DELTA));
        pokemon.add(new DeltaAurorus("Aurorus", Aspect.DELTA));
        pokemon.add(new DeltaGoomy("Goomy", Aspect.DELTA));
        pokemon.add(new DeltaSliggoo("Sliggoo", Aspect.DELTA));
        pokemon.add(new DeltaGoodra("Goodra", Aspect.DELTA));
        pokemon.add(new DeltaPhantump("Phantump", Aspect.DELTA));
        pokemon.add(new DeltaTrevenant("Trevenant", Aspect.DELTA));
        pokemon.add(new DeltaBergmite("Bergmite", Aspect.DELTA));
        pokemon.add(new DeltaAvalugg("Avalugg", Aspect.DELTA));
        pokemon.add(new DeltaNoibat("Noibat", Aspect.DELTA));
        pokemon.add(new DeltaNoivern("Noivern", Aspect.DELTA));
        pokemon.add(new DeltaHoopa("Hoopa", Aspect.DELTA));
        pokemon.add(new DeltaHoopaUnleashed("Hoopa", Aspect.DELTA_UNLEASHED));

        //X-Species (Xenoverse)
        pokemon.add(new GreninjaX("Greninja", Aspect.X));
        pokemon.add(new AegislashX("Aegislash", Aspect.X));
        pokemon.add(new SwirlixX("Swirlix", Aspect.X));
        pokemon.add(new SlurpuffX("Slurpuff", Aspect.X));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianGoomy("Goomy", Aspect.HOENNIAN));

        //Radical Red
        pokemon.add(new SeviianClauncher("Clauncher", Aspect.SEVIIAN));
        pokemon.add(new SeviianClawitzer("Clawitzer", Aspect.SEVIIAN));
        pokemon.add(new SeviianNoibat("Noibat", Aspect.SEVIIAN));
        pokemon.add(new SeviianNoivern("Noivern", Aspect.SEVIIAN));

        //Myth
        pokemon.add(new MythianNoivern("Noivern", Aspect.MYTHIAN));

        //Daybreak
        pokemon.add(new ArmiranFroakie("Froakie", Aspect.ARMIRAN));
        pokemon.add(new ArmiranFrogadier("Frogadier", Aspect.ARMIRAN));
        pokemon.add(new ArmiranGreninja("Greninja", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianSkiddo("", Aspect.AYREIAN));
        pokemon.add(new AyreianGogoat("", Aspect.AYREIAN));
        pokemon.add(new AyreianPhantump("", Aspect.AYREIAN));
        pokemon.add(new AyreianTrevenant("", Aspect.AYREIAN));

        pokemon.add(new AyreianFletchling("Fletchling", Aspect.AYREIAN));
        pokemon.add(new AyreianFletchinder("Fletchinder", Aspect.AYREIAN));
        pokemon.add(new AyreianPancham("Pancham", Aspect.AYREIAN));
        pokemon.add(new AyreianPangoro("Pangoro", Aspect.AYREIAN));
        pokemon.add(new AyreianCarbink("Carbink", Aspect.AYREIAN));
        pokemon.add(new AyreianKlefki("Klefki", Aspect.AYREIAN));
        pokemon.add(new AyreianPumpkaboo("Pumpkaboo", Aspect.AYREIAN));
        pokemon.add(new AyreianGourgeist("Gourgeist", Aspect.AYREIAN));
        pokemon.add(new AyreianNoibat("Noibat", Aspect.AYREIAN));
        pokemon.add(new AyreianNoivern("Noivern", Aspect.AYREIAN));

        //Phoenix Rising
        pokemon.add(new RelicSkiddo("Skiddo", Aspect.RELIC));
        pokemon.add(new RelicGogoat("Gogoat", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianBunnelby("Bunnelby", Aspect.KASKADIAN));
        pokemon.add(new KaskadianDiggersby("Diggersby", Aspect.KASKADIAN));
        pokemon.add(new KaskadianPhantump("Phantump", Aspect.KASKADIAN));
        pokemon.add(new KaskadianTrevenant("Trevenant", Aspect.KASKADIAN));
        pokemon.add(new KaskadianDiancie("Diancie", Aspect.KASKADIAN));

        //Pokemon Opalo
        pokemon.add(new CefiranKlefki("Klefki", Aspect.CEFIRAN));
    }

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochFennekin("", Aspect.EPOCH));
        pokemon.add(new EpochBraixen("", Aspect.EPOCH));
        pokemon.add(new EpochDelphox("", Aspect.EPOCH));
        pokemon.add(new EpochChespin("", Aspect.EPOCH));
        pokemon.add(new EpochQuilladin("", Aspect.EPOCH));
        pokemon.add(new EpochChesnaught("", Aspect.EPOCH));
        pokemon.add(new EpochFroakie("", Aspect.EPOCH));
        pokemon.add(new EpochFrogadier("", Aspect.EPOCH));
        pokemon.add(new EpochGreninja("", Aspect.EPOCH));

        pokemon.add(new EpochFletchling("", Aspect.EPOCH));
        pokemon.add(new EpochFletchinder("", Aspect.EPOCH));
        pokemon.add(new EpochTalonflame("", Aspect.EPOCH));
        pokemon.add(new EpochBergmite("", Aspect.EPOCH));
        pokemon.add(new EpochAvalugg("", Aspect.EPOCH));
        pokemon.add(new EpochAmaura("", Aspect.EPOCH));
        pokemon.add(new EpochAurorus("", Aspect.EPOCH));
        pokemon.add(new EpochSkrelp("", Aspect.EPOCH));
        pokemon.add(new EpochDragalge("", Aspect.EPOCH));
        pokemon.add(new EpochLitleo("", Aspect.EPOCH));
        pokemon.add(new EpochPyroar("", Aspect.EPOCH));
        pokemon.add(new EpochSkiddo("", Aspect.EPOCH));
        pokemon.add(new EpochGogoat("", Aspect.EPOCH));
        pokemon.add(new EpochSwirlix("", Aspect.EPOCH));
        pokemon.add(new EpochSlurpuff("", Aspect.EPOCH));
        pokemon.add(new EpochSylveon("", Aspect.EPOCH));
        pokemon.add(new EpochNoibat("", Aspect.EPOCH));
        pokemon.add(new EpochNoivern("", Aspect.EPOCH));
        pokemon.add(new EpochSpritzee("", Aspect.EPOCH));
        pokemon.add(new EpochAromatisse("", Aspect.EPOCH));
        pokemon.add(new EpochFurfrou("", Aspect.EPOCH));
        pokemon.add(new EpochHonedge("", Aspect.EPOCH));
        pokemon.add(new EpochHonedgeOne("", Aspect.EPOCH));
        pokemon.add(new EpochHonedgeTwo("", Aspect.EPOCH));
        pokemon.add(new EpochHonedgeThree("", Aspect.EPOCH));
        pokemon.add(new EpochDoublade("", Aspect.EPOCH));
        pokemon.add(new EpochDoubladeOne("", Aspect.EPOCH));
        pokemon.add(new EpochDoubladeTwo("", Aspect.EPOCH));
        pokemon.add(new EpochDoubladeThree("", Aspect.EPOCH));
        pokemon.add(new EpochAegislash("", Aspect.EPOCH));
        pokemon.add(new EpochAegislashOne("", Aspect.EPOCH));
        pokemon.add(new EpochAegislashTwo("", Aspect.EPOCH));
        pokemon.add(new EpochAegislashThree("", Aspect.EPOCH));
        pokemon.add(new EpochEspurr("", Aspect.EPOCH));
        pokemon.add(new EpochMeowstic("", Aspect.EPOCH));
        pokemon.add(new EpochKlefki("", Aspect.EPOCH));
        pokemon.add(new EpochTyrunt("", Aspect.EPOCH));
        pokemon.add(new EpochTyrantrum("", Aspect.EPOCH));
        pokemon.add(new EpochSpritzeeOne("", Aspect.EPOCH));
        pokemon.add(new EpochAromatisseOne("", Aspect.EPOCH));
        pokemon.add(new EpochCarbink("", Aspect.EPOCH));
        pokemon.add(new EpochGoomy("", Aspect.EPOCH));
        pokemon.add(new EpochSliggoo("", Aspect.EPOCH));
        pokemon.add(new EpochGoodra("", Aspect.EPOCH));
        pokemon.add(new EpochBinacle("", Aspect.EPOCH));
        pokemon.add(new EpochBarbaracle("", Aspect.EPOCH));
        pokemon.add(new EpochPhantump("", Aspect.EPOCH));
        pokemon.add(new EpochTrevenant("", Aspect.EPOCH));
        pokemon.add(new EpochHelioptile("", Aspect.EPOCH));
        pokemon.add(new EpochHeliolisk("", Aspect.EPOCH));
        pokemon.add(new EpochDedenne("", Aspect.EPOCH));
        pokemon.add(new EpochFlabebe("", Aspect.EPOCH));
        pokemon.add(new EpochFloette("", Aspect.EPOCH));
        pokemon.add(new EpochFlorges("", Aspect.EPOCH));
        pokemon.add(new EpochHoopa("", Aspect.EPOCH));

    }
}
