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
        super("Opal", "https://drive.google.com/drive/folders/1NbGZ32Izkj7WSBzkW72-1zCmO9bh7p-4");
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

        addNewPokemon(new CefiranDiglett("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranDugtrio("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranMeowthFire("Meowth", Aspect.CEFIRAN_FIRE).useDefaultCry());
        addNewPokemon(new CefiranPersianFire("Persian", Aspect.CEFIRAN_FIRE).useDefaultCry());
        addNewPokemon(new CefiranMeowthIce("Meowth", Aspect.CEFIRAN_ICE).useDefaultCry());
        addNewPokemon(new CefiranPersianIce("Persian", Aspect.CEFIRAN_ICE).useDefaultCry());
        addNewPokemon(new CefiranMeowthElectric("Meowth", Aspect.CEFIRAN_ELECTRIC).useDefaultCry());
        addNewPokemon(new CefiranPersianElectric("Persian", Aspect.CEFIRAN_ELECTRIC).useDefaultCry());
        addNewPokemon(new CefiranTeddiursa("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranUrsaring("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranSlugma("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranMagcargo("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranDelibird("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranSmeargle("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranCelebi("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranMakuhita("Makuhita", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranHariyama("Hariyama", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranSableye("Sableye", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranNumel("Numel", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranCamerupt("Camerupt", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranVibrava("Vibrava", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranFlygon("Flygon", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranSnorunt("Snorunt", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranGlalie("Glalie", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranSwablu("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranAltaria("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranBuneary("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranLopunny("", Aspect.CEFIRAN, new Stats(480, FAST_PHYSICAL_ATTACKER, List.of())).useDefaultCry());
        addNewPokemon(new CefiranSnover("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranAbomasnow("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranFroslass("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranPetilil("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranLilligant("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranGothitelle("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranGolett("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranGolurk("", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranKlefki("Klefki", Aspect.CEFIRAN).useDefaultCry());
        addNewPokemon(new CefiranFalinks("", Aspect.CEFIRAN, new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).useDefaultCry());

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
