package drai.dev.gravelmon;

import com.llamalad7.mixinextras.utils.*;
import drai.dev.gravelsextendedbattles.starters.*;
import org.apache.commons.lang3.*;

import java.util.*;

public class GravelmonStarters {
    public static final Map<String, String> LANG_ENTRIES = new HashMap<>();

    public static void injectStarters() {
        GravelmonStarterManager.registerNewStarter("Kanto",
                createCategory("Egho - Kanto",
                        List.of(
                                "Bulbasaur egho=true level=10",
                                "Charmander egho=true level=10",
                                "Squirtle egho=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Kanto",
                createCategory("Ayrei - Kanto",
                        List.of(
                                "Bulbasaur ayreian=true level=10",
                                "Charmander ayreian=true level=10",
                                "Squirtle ayreian=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Kanto",
                createCategory("Torren",
                        List.of(
                                "Bulbasaur delta=true level=10",
                                "Charmander delta=true level=10",
                                "Squirtle delta=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Johto",
                createCategory("Ayrei - Johto",
                        List.of(
                                "Chikorita ayreian=true level=10",
                                "Cyndaquil ayreian=true level=10",
                                "Totodile ayreian=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Johto",
                createCategory("Egho - Johto",
                        List.of(
                                "Chikorita egho=true level=10",
                                "Cyndaquil egho=true level=10",
                                "Totodile egho=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Johto",
                createCategory("Epoch - Johto",
                        List.of(
                                "Chikorita epoch=true level=10",
                                "Cyndaquil epoch=true level=10",
                                "Totodile epoch=true level=10",
                                "Chikorita epochtwo=true level=10",
                                "Cyndaquil epochtwo=true level=10",
                                "Totodile epochtwo=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Hoenn",
                createCategory("Zakos",
                        List.of(
                                "Treecko mystic=true level=10",
                                "Torchic mystic=true level=10",
                                "Mudkip mystic=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Sinnoh",
                createCategory("Epoch - Sinnoh",
                        List.of(
                                "Treecko mystic=true level=10",
                                "Torchic mystic=true level=10",
                                "Mudkip mystic=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Kalos",
                createCategory("Vesitas",
                        List.of(
                                "Chespin vesitan=true level=10",
                                "Fennekin vesitan=true level=10",
                                "Froakie vesitan=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Kalos",
                createCategory("Epoch - Kalos",
                        List.of(
                                "Chespin epoch=true level=10",
                                "Fennekin epoch=true level=10",
                                "Froakie epoch=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Alola",
                createCategory("Epoch - Alola",
                        List.of(
                                "rowlet epoch=true level=10",
                                "litten epoch=true level=10",
                                "popplio epoch=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Urobos",
                        List.of(
                                "Foliat level=10",
                                "Kidling level=10",
                                "Aguade level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Esoteria",
                        List.of(
                                "Meadew level=10",
                                "Mousic level=10",
                                "Gulliby level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Rica",
                        List.of(
                                "Cotylit level=10",
                                "Bunfin level=10",
                                "Mirmoor level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Egho",
                        List.of(
                                "Kokiseed level=10",
                                "Chargo level=10",
                                "Darpole level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Dhiome",
                        List.of(
                                "spearex level=10",
                                "caflare level=10",
                                "bubblebon level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Lagoone",
                        List.of(
                                "Leafin level=10",
                                "Torshell level=10",
                                "Squigill level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Interregional",
                        List.of(
                                "Leafrog level=10",
                                "Giraze level=10",
                                "Damphant level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Cefiran",
                        List.of(
                                "Snampery level=10",
                                "Flasinge level=10",
                                "Swolphin level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Iberia",
                        List.of(
                                "Polekin level=10",
                                "Lugnis level=10",
                                "Quisquite level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Ferroa",
                        List.of(
                                "Crabble level=10",
                                "Burrliz level=10",
                                "Sharby level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Enriko",
                        List.of(
                                "Plantis level=10",
                                "Blastpole level=10",
                                "Aqualisk level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Eldiw",
                        List.of(
                                "Chiripe level=10",
                                "Croakling level=10",
                                "Inflant level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Xenoverse",
                        List.of(
                                "Shyleon level=10",
                                "Trishout level=10",
                                "Shulong level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Oceane",
                        List.of(
                                "Bublit level=10",
                                "Friney level=10",
                                "Nomstar level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Africanus",
                        List.of(
                                "Petiolis level=10",
                                "Harregg level=10",
                                "Hipporos level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Tandor",
                        List.of(
                                "Orchynx level=10",
                                "Raptorch level=10",
                                "Eletux level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Altera",
                        List.of(
                                "Mozz level=10",
                                "Chiklit level=10",
                                "Findolf level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Oceane",
                        List.of(
                                "Bublit level=10",
                                "Friney level=10",
                                "Nomstar level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Hiza",
                        List.of(
                                "Gnabling level=10",
                                "Kerodillo level=10",
                                "Bubbalo level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Junnin",
                        List.of(
                                "Eucuwala level=10",
                                "Kindlemur level=10",
                                "Liqueel level=10",
                                "Reptling level=10",
                                "Woolvry level=10",
                                "Dimetrus level=10",
                                "Yetini level=10",
                                "Batorch level=10",
                                "Lochsea level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Orohn-Havai",
                        List.of(
                                "Ekopi level=10",
                                "Flaero level=10",
                                "Kelpony level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("The Eternal Forest",
                        List.of(
                                "Smettle level=10",
                                "Pachyball level=10",
                                "Squini level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Norheim",
                        List.of(
                                "Gnatle level=10",
                                "Bunbear level=10",
                                "Pouffy level=10",
                                "Lilyquack level=10",
                                "Ignewt level=10",
                                "Buppie level=10",
                                "Minkit level=10",
                                "Calfyr level=10",
                                "Bayby level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Kaskade",
                        List.of(
                                "Llampas level=10",
                                "Therpal level=10",
                                "Burbwhirl level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Nosto",
                        List.of(
                                "Neschick level=10",
                                "Blashrew level=10",
                                "Drimp level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Vereshad",
                        List.of(
                                "Psypole level=10",
                                "Boxeroo level=10",
                                "Seijitsu level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Mythire",
                        List.of(
                                "Glimruff level=10",
                                "Noviss level=10",
                                "Mollup level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Fliga",
                        List.of(
                                "Aggronut level=10",
                                "Meltuff level=10",
                                "Nibblish level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Qamor",
                        List.of(
                                "Albat level=10",
                                "Kindlet level=10",
                                "Barbay level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Kuria",
                        List.of(
                                "Twigit level=10",
                                "Kuuby level=10",
                                "Kikro level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Isiah",
                        List.of(
                                "Inood level=10",
                                "Frilzard level=10",
                                "Finvore level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Midamis",
                        List.of(
                                "Florcoon level=10",
                                "Pyrall level=10",
                                "Aquaff level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Hoenn",
                createCategory("Post Catastrophe",
                        List.of(
                                "Nimbleaf level=10",
                                "Peyero level=10",
                                "Liquiput level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Signet",
                        List.of(
                                "Basille level=10",
                                "Patroleo level=10",
                                "Katuna level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Novrai",
                        List.of(
                                "Snipsnap level=10",
                                "Impyre level=10",
                                "Scuddle level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Atlas",
                        List.of(
                                "Fawnlora level=10",
                                "Scorchet level=10",
                                "Finjoy level=10",
                                "Baneep level=10",
                                "Vulkidna level=10",
                                "Pumpel level=10",
                                "Instick level=10",
                                "Ruflame level=10",
                                "Caimar level=10",
                                "Nawdile level=10",
                                "Barkindle level=10",
                                "Watuber level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Amavi",
                        List.of(
                                "Ankleaf level=10",
                                "Spawnkey level=10",
                                "Shellop level=10"
                        )
                ));
    }

    private static StarterCategoryDataHolder createCategory(String name, List<String> starters) {
        var lang = "cobblemon.starterselection.category." + GravelmonUtils.getCleanName(name.toLowerCase().replaceAll(" ", ""));
        LANG_ENTRIES.put(lang, name);
        return new StarterCategoryDataHolder(StringUtils.capitalize(name), lang ,
                starters);
    }
}
