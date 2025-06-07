package drai.dev.data.games.other;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.opalo.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatArchetype.FAST_PHYSICAL_ATTACKER;

public class Opal extends Game {
    public static final Game INSTANCE = new Opal();
    private Opal() {
        super("Opal");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new Snampery().addLabels(Label.STARTER));
        addNewPokemon(new Descargot().addLabels(Label.STARTER));
        addNewPokemon(new Gastesla().addLabels(Label.STARTER));
        addNewPokemon(new Flasinge().addLabels(Label.STARTER));
        addNewPokemon(new Shaboon().addLabels(Label.STARTER));
        addNewPokemon(new Lunaye().addLabels(Label.STARTER));
        addNewPokemon(new Swolphin().addLabels(Label.STARTER));
        addNewPokemon(new Norspear().addLabels(Label.STARTER));
        addNewPokemon(new Narvalor().addLabels(Label.STARTER));
        addNewPokemon(new Cefireon().addLabels(Label.STARTER));

        addNewPokemon(new CefiranDiglett("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranDugtrio("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranMeowthFire("Meowth", Aspect.CEFIRAN_FIRE));
        addNewPokemon(new CefiranPersianFire("Persian", Aspect.CEFIRAN_FIRE));
        addNewPokemon(new CefiranMeowthIce("Meowth", Aspect.CEFIRAN_ICE));
        addNewPokemon(new CefiranPersianIce("Persian", Aspect.CEFIRAN_ICE));
        addNewPokemon(new CefiranMeowthElectric("Meowth", Aspect.CEFIRAN_ELECTRIC));
        addNewPokemon(new CefiranPersianElectric("Persian", Aspect.CEFIRAN_ELECTRIC));
        addNewPokemon(new CefiranTeddiursa("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranUrsaring("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSlugma("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranMagcargo("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranDelibird("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSmeargle("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranCelebi("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranMakuhita("Makuhita", Aspect.CEFIRAN));
        addNewPokemon(new CefiranHariyama("Hariyama", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSableye("Sableye", Aspect.CEFIRAN));
        addNewPokemon(new CefiranNumel("Numel", Aspect.CEFIRAN));
        addNewPokemon(new CefiranCamerupt("Camerupt", Aspect.CEFIRAN));
        addNewPokemon(new CefiranVibrava("Vibrava", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFlygon("Flygon", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSnorunt("Snorunt", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGlalie("Glalie", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSwablu("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranAltaria("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranBuneary("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranLopunny("", Aspect.CEFIRAN, new Stats(480, FAST_PHYSICAL_ATTACKER, List.of())));
        addNewPokemon(new CefiranSnover("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranAbomasnow("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFroslass("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranPetilil("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranLilligant("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGothitelle("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGolett("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGolurk("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranKlefki("Klefki", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFalinks("", Aspect.CEFIRAN, new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));

        addNewPokemon(new Polekin().addLabels(Label.STARTER));
        addNewPokemon(new Fungorse().addLabels(Label.STARTER));
        addNewPokemon(new Cervantrier().addLabels(Label.STARTER));
        addNewPokemon(new Lugnis().addLabels(Label.STARTER));
        addNewPokemon(new Luravit().addLabels(Label.STARTER));
        addNewPokemon(new Luxpiravit().addLabels(Label.STARTER));
        addNewPokemon(new Quisquite().addLabels(Label.STARTER));
        addNewPokemon(new Gambarrel().addLabels(Label.STARTER));
        addNewPokemon(new Bogaleon().addLabels(Label.STARTER));
        addNewPokemon(new Astrem().addLabels(Label.LEGENDARY));
        addNewPokemon(new Unktena().addLabels(Label.LEGENDARY));
    }
}
