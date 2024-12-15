package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
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
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class GenerationEight extends Game {
    public GenerationEight() {
        super("generation8");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new AromianStonjourner("", Aspect.AROMIAN)); //TODO

        addNewPokemon(new FabelianWyrdeer("", Aspect.FABELIAN)); //TODO
        addNewPokemon(new FabelianHatenna("", Aspect.FABELIAN));
        addNewPokemon(new FabelianHattrem("", Aspect.FABELIAN));
        addNewPokemon(new FabelianApplin("", Aspect.FABELIAN));
        addNewPokemon(new FabelianFalinks("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSinistea("", Aspect.FABELIAN));
        addNewPokemon(new FabelianPolteageist("", Aspect.FABELIAN));
        addNewPokemon(new FabelianWooloo("", Aspect.FABELIAN));
        addNewPokemon(new FabelianDubwool("", Aspect.FABELIAN));
        addNewPokemon(new FabelianMilcery("", Aspect.FABELIAN));
        addNewPokemon(new FabelianImpidimp("", Aspect.FABELIAN));
        addNewPokemon(new FabelianMorgrem("", Aspect.FABELIAN));

        addNewPokemon(new MahalianSinistea("", Aspect.MAHALIAN)); //TODO
        addNewPokemon(new MahalianPolteageist("", Aspect.MAHALIAN));

        addNewPokemon(new FerranianSinistea("", Aspect.FERRANIAN)); //TODO
        addNewPokemon(new FerranianApplin("", Aspect.FERRANIAN));

        addNewPokemon(new IvrisianSinistea("", Aspect.IVRISIAN)); //TODO
        addNewPokemon(new IvrisianPerrserker("", Aspect.IVRISIAN));

//        addNewPokemon(new MystisianImpidimp("", Aspect.MYSTISIAN)); TODO
//        addNewPokemon(new MystisianMorgrem("", Aspect.MYSTISIAN));
//        addNewPokemon(new MystisianGrimmsnarl("", Aspect.MYSTISIAN));

        registerSoulstonesVariants();

//        addNewPokemon(new OttoranImpidimp("", Aspect.OTTORAN)); MEMBER OF LINE NOT FINISHED

        addNewPokemon(new LagoonanHattena("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanHattrem("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanHatterene("", Aspect.LAGOONAN));

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

//        addNewPokemon(new VaritasianHatenna(856)); Member of line Not Finished
//        addNewPokemon(new VaritasianHattrem(857)); Missing Art
        addNewPokemon(new VaritasianImpidimp("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMorgrem("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMilcery("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianAlcremie("", Aspect.VARITASIAN));
//        addNewPokemon(new VaritasianDreepy(885)); Member of line Not Finished
//        addNewPokemon(new VaritasianDrakloak(886)); Missing Art
//        addNewPokemon(new VaritasianDragapult(887)); Missing Art

//        addNewPokemon(new HavaiianBlipbug(824)); Member of line Not Finished
//        addNewPokemon(new HavaiianDottler(825)); Missing Art
//        addNewPokemon(new HavaiianOrbeetle(826)); Missing Art
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

        //Opalo
        addNewPokemon(new CefiranFalinks("", Aspect.CEFIRAN, new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));

        //Vanguard
        addNewPokemon(new AyreianGrookey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianThwackey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRillaboom("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSizzlipede("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCentiskorch("", Aspect.AYREIAN));

        addNewPokemon(new AyreianHatenna("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHattrem("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHatterene("", Aspect.AYREIAN));
        addNewPokemon(new AyreianObstagoon("", Aspect.AYREIAN));

        //Kaskadian
        addNewPokemon(new KaskadianDubwool("", Aspect.KASKADIAN));

    }

    private void registerSoulstonesVariants() {
        addNewPokemon(new EpochSobble("", Aspect.EPOCH));
        addNewPokemon(new EpochDrizzile("", Aspect.EPOCH));
        addNewPokemon(new EpochInteleon("", Aspect.EPOCH));

        addNewPokemon(new EpochRookidee("", Aspect.EPOCH));
        addNewPokemon(new EpochCorvisquire("", Aspect.EPOCH));
        addNewPokemon(new EpochCorviknight("", Aspect.EPOCH));
        addNewPokemon(new EpochYamper("", Aspect.EPOCH));
        addNewPokemon(new EpochBoltund("", Aspect.EPOCH));
        addNewPokemon(new EpochImpidimp("", Aspect.EPOCH));
        addNewPokemon(new EpochMorgrem("", Aspect.EPOCH));
        addNewPokemon(new EpochGrimmsnarl("", Aspect.EPOCH));
        addNewPokemon(new EpochImpidimpOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMorgremOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGrimmsnarlOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGossifleur("", Aspect.EPOCH));
        addNewPokemon(new EpochEldegoss("", Aspect.EPOCH));
        addNewPokemon(new EpochSilicobra("", Aspect.EPOCH));
        addNewPokemon(new EpochSandaconda("", Aspect.EPOCH));
        addNewPokemon(new EpochSinistea("", Aspect.EPOCH));
        addNewPokemon(new EpochPolteageist("", Aspect.EPOCH));
        addNewPokemon(new EpochSkwovet("", Aspect.EPOCH));
        addNewPokemon(new EpochGreedent("", Aspect.EPOCH));
        addNewPokemon(new EpochToxel("", Aspect.EPOCH));
        addNewPokemon(new EpochToxtricity("", Aspect.EPOCH));
        addNewPokemon(new EpochApplin("", Aspect.EPOCH));
        addNewPokemon(new EpochFlapple("", Aspect.EPOCH));
        addNewPokemon(new EpochAppletun("", Aspect.EPOCH));
        addNewPokemon(new EpochWooloo("", Aspect.EPOCH));
        addNewPokemon(new EpochDubwool("", Aspect.EPOCH));
        addNewPokemon(new EpochWoolooOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDubwoolOne("", Aspect.EPOCH));
        addNewPokemon(new EpochArrokuda("", Aspect.EPOCH));
        addNewPokemon(new EpochBarraskewda("", Aspect.EPOCH));
        addNewPokemon(new EpochFalinks("", Aspect.EPOCH));
        addNewPokemon(new EpochIndeedee("", Aspect.EPOCH));
        addNewPokemon(new EpochPincurchin("", Aspect.EPOCH));
        addNewPokemon(new EpochRolycoly("", Aspect.EPOCH));
        addNewPokemon(new EpochCarkol("", Aspect.EPOCH));
        addNewPokemon(new EpochCoalossal("", Aspect.EPOCH));
        addNewPokemon(new EpochDreepy("", Aspect.EPOCH));
        addNewPokemon(new EpochDrakloak("", Aspect.EPOCH));
        addNewPokemon(new EpochDragapult("", Aspect.EPOCH));
        addNewPokemon(new EpochStonjourner("", Aspect.EPOCH));
        addNewPokemon(new EpochSnom("", Aspect.EPOCH));
        addNewPokemon(new EpochFrosmoth("", Aspect.EPOCH));
        addNewPokemon(new EpochCramorant("", Aspect.EPOCH));
        addNewPokemon(new EpochSizzlipede("", Aspect.EPOCH));
        addNewPokemon(new EpochCentiskorch("", Aspect.EPOCH));
        addNewPokemon(new EpochMilcery("", Aspect.EPOCH));
        addNewPokemon(new EpochAlcremie("", Aspect.EPOCH));
        addNewPokemon(new EpochClobbopus("", Aspect.EPOCH));
        addNewPokemon(new EpochGrapploct("", Aspect.EPOCH));
        addNewPokemon(new EpochCufant("", Aspect.EPOCH));
        addNewPokemon(new EpochCopperajah("", Aspect.EPOCH));
        addNewPokemon(new EpochHatenna("", Aspect.EPOCH));
        addNewPokemon(new EpochHattrem("", Aspect.EPOCH));
        addNewPokemon(new EpochHatterene("", Aspect.EPOCH));
        addNewPokemon(new EpochEternatus("", Aspect.EPOCH));

        addNewPokemon(new EpochMrrime("", Aspect.EPOCH));
        addNewPokemon(new EpochCursola("", Aspect.EPOCH));
        addNewPokemon(new EpochObstagoon("", Aspect.EPOCH));
        addNewPokemon(new EpochUrsaluna("", Aspect.EPOCH));
        addNewPokemon(new EpochWyrdeer("", Aspect.EPOCH));
        addNewPokemon(new EpochWyrdeerOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSneasler("", Aspect.EPOCH));
        addNewPokemon(new EpochBasculegion("", Aspect.EPOCH));
    }
}
