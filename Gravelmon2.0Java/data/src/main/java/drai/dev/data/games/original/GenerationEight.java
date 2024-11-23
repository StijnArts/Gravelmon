package drai.dev.data.games.original;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.ferran.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.ivris.regional.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;

public class GenerationEight extends Game {
    public GenerationEight() {
        super("generation8");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new AromianStonjourner("", Aspect.AROMIAN).setUsesBigModel()); //TODO

        pokemon.add(new FabelianWyrdeer("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        pokemon.add(new FabelianHatenna("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianHattrem("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianApplin("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianFalinks("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSinistea("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianPolteageist("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianWooloo("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianDubwool("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMilcery("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianImpidimp("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMorgrem("", Aspect.FABELIAN).setUsesBigModel());

        pokemon.add(new MahalianSinistea("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        pokemon.add(new MahalianPolteageist("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new FerranianSinistea("", Aspect.FERRANIAN).setUsesBigModel()); //TODO
        pokemon.add(new FerranianApplin("", Aspect.FERRANIAN).setUsesBigModel());

        pokemon.add(new IvrisianSinistea("", Aspect.IVRISIAN).setUsesBigModel()); //TODO
        pokemon.add(new IvrisianPerrserker("", Aspect.IVRISIAN).setUsesBigModel());

//        pokemon.add(new MystisianImpidimp("", Aspect.MYSTISIAN)); TODO
//        pokemon.add(new MystisianMorgrem("", Aspect.MYSTISIAN));
//        pokemon.add(new MystisianGrimmsnarl("", Aspect.MYSTISIAN));

        registerSoulstonesVariants();

//        pokemon.add(new OttoranImpidimp("", Aspect.OTTORAN)); MEMBER OF LINE NOT FINISHED

        pokemon.add(new LagoonanHattena("", Aspect.LAGOONAN));
        pokemon.add(new LagoonanHattrem("", Aspect.LAGOONAN));
        pokemon.add(new LagoonanHatterene("", Aspect.LAGOONAN));

        addNewPokemon(new NovranWooloo("", Aspect.NOVRAN));
        addNewPokemon(new NovranDubwool("", Aspect.NOVRAN));
        addNewPokemon(new NovranClobbopus("", Aspect.NOVRAN).fishingSpawnFromExisting());
        addNewPokemon(new NovranGrapploct("", Aspect.NOVRAN));
        addNewPokemon(new NovranHatenna("", Aspect.NOVRAN));
        addNewPokemon(new NovranHattrem("", Aspect.NOVRAN));
        addNewPokemon(new NovranHatterene("", Aspect.NOVRAN));
        addNewPokemon(new NovranImpidimp("", Aspect.NOVRAN));
        addNewPokemon(new NovranMorgrem("", Aspect.NOVRAN));
        addNewPokemon(new NovranGrimmsnarl("", Aspect.NOVRAN));

        addNewPokemon(new NorheimanRookidee("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCorvisquire("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanFalinks("", Aspect.NORHEIMAN));

//        pokemon.add(new VaritasianHatenna(856)); Member of line Not Finished
//        pokemon.add(new VaritasianHattrem(857)); Missing Art
        addNewPokemon(new VaritasianImpidimp("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMorgrem("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMilcery("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianAlcremie("", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianDreepy(885)); Member of line Not Finished
//        pokemon.add(new VaritasianDrakloak(886)); Missing Art
//        pokemon.add(new VaritasianDragapult(887)); Missing Art

//        pokemon.add(new HavaiianBlipbug(824)); Member of line Not Finished
//        pokemon.add(new HavaiianDottler(825)); Missing Art
//        pokemon.add(new HavaiianOrbeetle(826)); Missing Art
//
        addNewPokemon(new HizianSilicobra("", Aspect.HIZIAN));
        addNewPokemon(new HizianSandaconda("", Aspect.HIZIAN));

          //Pokemon Blazing Emerald
        addNewPokemon(new HoennianDreepy("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDrakloak("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDragapult("", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianSizzlipede("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianCentiskorch("", Aspect.SEVIIAN));

        //Myth
        addNewPokemon(new MythianKleavor("", Aspect.MYTHIAN));

        //Vanguard
        addNewPokemon(new AyreianGrookey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianThwackey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRillaboom("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSizzlipede("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCentiskorch("", Aspect.AYREIAN));

        pokemon.add(new AyreianHatenna("", Aspect.AYREIAN));
        pokemon.add(new AyreianHattrem("", Aspect.AYREIAN));
        pokemon.add(new AyreianHatterene("", Aspect.AYREIAN));
        pokemon.add(new AyreianObstagoon("", Aspect.AYREIAN));

        //Kaskadian
        addNewPokemon(new KaskadianDubwool("", Aspect.KASKADIAN));

    }

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochSobble("", Aspect.EPOCH));
        pokemon.add(new EpochDrizzile("", Aspect.EPOCH));
        pokemon.add(new EpochInteleon("", Aspect.EPOCH));

        pokemon.add(new EpochRookidee("", Aspect.EPOCH));
        pokemon.add(new EpochCorvisquire("", Aspect.EPOCH));
        pokemon.add(new EpochCorviknight("", Aspect.EPOCH));
        pokemon.add(new EpochYamper("", Aspect.EPOCH));
        pokemon.add(new EpochBoltund("", Aspect.EPOCH));
        pokemon.add(new EpochImpidimp("", Aspect.EPOCH));
        pokemon.add(new EpochMorgrem("", Aspect.EPOCH));
        pokemon.add(new EpochGrimmsnarl("", Aspect.EPOCH));
        pokemon.add(new EpochImpidimpOne("", Aspect.EPOCH));
        pokemon.add(new EpochMorgremOne("", Aspect.EPOCH));
        pokemon.add(new EpochGrimmsnarlOne("", Aspect.EPOCH));
        pokemon.add(new EpochGossifleur("", Aspect.EPOCH));
        pokemon.add(new EpochEldegoss("", Aspect.EPOCH));
        pokemon.add(new EpochSilicobra("", Aspect.EPOCH));
        pokemon.add(new EpochSandaconda("", Aspect.EPOCH));
        pokemon.add(new EpochSinistea("", Aspect.EPOCH));
        pokemon.add(new EpochPolteageist("", Aspect.EPOCH));
        pokemon.add(new EpochSkwovet("", Aspect.EPOCH));
        pokemon.add(new EpochGreedent("", Aspect.EPOCH));
        pokemon.add(new EpochToxel("", Aspect.EPOCH));
        pokemon.add(new EpochToxtricity("", Aspect.EPOCH));
        pokemon.add(new EpochApplin("", Aspect.EPOCH));
        pokemon.add(new EpochFlapple("", Aspect.EPOCH));
        pokemon.add(new EpochAppletun("", Aspect.EPOCH));
        pokemon.add(new EpochWooloo("", Aspect.EPOCH));
        pokemon.add(new EpochDubwool("", Aspect.EPOCH));
        pokemon.add(new EpochWoolooOne("", Aspect.EPOCH));
        pokemon.add(new EpochDubwoolOne("", Aspect.EPOCH));
        pokemon.add(new EpochArrokuda("", Aspect.EPOCH));
        pokemon.add(new EpochBarraskewda("", Aspect.EPOCH));
        pokemon.add(new EpochFalinks("", Aspect.EPOCH));
        pokemon.add(new EpochIndeedee("", Aspect.EPOCH));
        pokemon.add(new EpochPincurchin("", Aspect.EPOCH));
        pokemon.add(new EpochRolycoly("", Aspect.EPOCH));
        pokemon.add(new EpochCarkol("", Aspect.EPOCH));
        pokemon.add(new EpochCoalossal("", Aspect.EPOCH));
        pokemon.add(new EpochDreepy("", Aspect.EPOCH));
        pokemon.add(new EpochDrakloak("", Aspect.EPOCH));
        pokemon.add(new EpochDragapult("", Aspect.EPOCH));
        pokemon.add(new EpochStonjourner("", Aspect.EPOCH));
        pokemon.add(new EpochSnom("", Aspect.EPOCH));
        pokemon.add(new EpochFrosmoth("", Aspect.EPOCH));
        pokemon.add(new EpochCramorant("", Aspect.EPOCH));
        pokemon.add(new EpochSizzlipede("", Aspect.EPOCH));
        pokemon.add(new EpochCentiskorch("", Aspect.EPOCH));
        pokemon.add(new EpochMilcery("", Aspect.EPOCH));
        pokemon.add(new EpochAlcremie("", Aspect.EPOCH));
        pokemon.add(new EpochClobbopus("", Aspect.EPOCH));
        pokemon.add(new EpochGrapploct("", Aspect.EPOCH));
        pokemon.add(new EpochCufant("", Aspect.EPOCH));
        pokemon.add(new EpochCopperajah("", Aspect.EPOCH));
        pokemon.add(new EpochHatenna("", Aspect.EPOCH));
        pokemon.add(new EpochHattrem("", Aspect.EPOCH));
        pokemon.add(new EpochHatterene("", Aspect.EPOCH));
        pokemon.add(new EpochEternatus("", Aspect.EPOCH));

        pokemon.add(new EpochMrrime("", Aspect.EPOCH));
        pokemon.add(new EpochCursola("", Aspect.EPOCH));
        pokemon.add(new EpochObstagoon("", Aspect.EPOCH));
        pokemon.add(new EpochUrsaluna("", Aspect.EPOCH));
        pokemon.add(new EpochWyrdeer("", Aspect.EPOCH));
        pokemon.add(new EpochWyrdeerOne("", Aspect.EPOCH));
        pokemon.add(new EpochSneasler("", Aspect.EPOCH));
        pokemon.add(new EpochBasculegion("", Aspect.EPOCH));
    }
}
