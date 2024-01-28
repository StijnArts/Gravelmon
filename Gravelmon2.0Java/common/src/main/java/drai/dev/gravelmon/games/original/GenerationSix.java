package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.aristos.regional.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationSix extends Game {
    public GenerationSix() {
        super("generation6");
    }

    @Override
    public void registerPokemon() {

        pokemon.add(new VaritasianFlabebe(669));
        pokemon.add(new VaritasianFloette(670));
        pokemon.add(new VaritasianPhantump(708));
        pokemon.add(new VaritasianTrevenant(709));

        pokemon.add(new HizianLitleo(667));
        pokemon.add(new HizianPyroar(668));

//        pokemon.add(new AristosianLitleo(667)); NOT FINISHED


        //Pokemon Insurgance
        pokemon.add(new DeltaFroakie(656));
        pokemon.add(new DeltaFrogadier(657));
        pokemon.add(new DeltaGreninja(658));
        pokemon.add(new DeltaAmaura(698));
        pokemon.add(new DeltaAurorus(699));
        pokemon.add(new DeltaGoomy(704));
        pokemon.add(new DeltaSliggoo(705));
        pokemon.add(new DeltaGoodra(706));
        pokemon.add(new DeltaPhantump(708));
        pokemon.add(new DeltaTrevenant(709));
        pokemon.add(new DeltaBergmite(712));
        pokemon.add(new DeltaAvalugg(713));
        pokemon.add(new DeltaNoibat(714));
        pokemon.add(new DeltaNoivern(715));
        pokemon.add(new DeltaHoopa(720));
        pokemon.add(new DeltaHoopaUnleashed(720));

        //X-Species (Xenoverse)
        pokemon.add(new GreninjaX(658));
        pokemon.add(new AegislashX(681));
        pokemon.add(new SwirlixX(684));
        pokemon.add(new SlurpuffX(685));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianGoomy(704));

        //Radical Red
        pokemon.add(new SeviianClauncher(692));
        pokemon.add(new SeviianClawitzer(693));
        pokemon.add(new SeviianNoibat(714));
        pokemon.add(new SeviianNoivern(715));

        //Myth
        pokemon.add(new MythianNoivern(715));

        //Daybreak
        pokemon.add(new ArmiranFroakie(656));
        pokemon.add(new ArmiranFrogadier(657));
        pokemon.add(new ArmiranGreninja(658));

        //Vanguard
        pokemon.add(new AyreianFletchling(661));
        pokemon.add(new AyreianFletchinder(662));
        pokemon.add(new AyreianPancham(674));
        pokemon.add(new AyreianPangoro(675));
        pokemon.add(new AyreianCarbink(703));
        pokemon.add(new AyreianKlefki(707));
        pokemon.add(new AyreianPumpkaboo(710));
        pokemon.add(new AyreianGourgeist(711));
        pokemon.add(new AyreianNoibat(714));
        pokemon.add(new AyreianNoivern(715));

        //Phoenix Rising
        pokemon.add(new RelicSkiddo(672));
        pokemon.add(new RelicGogoat(673));

        //Kaskadian
        pokemon.add(new KaskadianBunnelby(659));
        pokemon.add(new KaskadianDiggersby(660));
        pokemon.add(new KaskadianPhantump(708));
        pokemon.add(new KaskadianTrevenant(709));
        pokemon.add(new KaskadianDiancie(719));

        //Pokemon Opalo
        pokemon.add(new CefiranKlefki(707));
    }
}
