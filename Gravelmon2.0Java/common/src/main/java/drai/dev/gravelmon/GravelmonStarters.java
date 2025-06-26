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
                createCategory("Form - Kanto",
                        List.of(
                                "Bulbasaur forman=true level=10",
                                "Charmander forman=true level=10",
                                "Squirtle forman=true level=10"
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
                createCategory("Form - Johto",
                        List.of(
                                "Chikorita forman=true level=10",
                                "Cyndaquil forman=true level=10",
                                "Totodile forman=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Johto",
                createCategory("Ionos - Johto",
                        List.of(
                                "Chikorita ionosian=true level=10",
                                "Cyndaquil ionosian=true level=10",
                                "Totodile ionosian=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Johto",
                createCategory("Epoch - Johto 1",
                        List.of(
                                "Chikorita epoch=true level=10",
                                "Cyndaquil epoch=true level=10",
                                "Totodile epoch=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Johto",
                createCategory("Epoch - Johto 2",
                        List.of(
                                "Chikorita epochtwo=true level=10",
                                "Cyndaquil epochtwo=true level=10",
                                "Totodile epochtwo=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Johto",
                createCategory("URC - Johto",
                        List.of(
                                "Chikotize level=10",
                                "Cyndaqize level=10",
                                "Totodize level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Hoenn",
                createCategory("Form - Hoenn",
                        List.of(
                                "Treecko forman=true level=10",
                                "Torchic forman=true level=10",
                                "Mudkip forman=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Hoenn",
                createCategory("Ayrei - Hoenn",
                        List.of(
                                "Treecko ayreian=true level=10",
                                "Torchic ayreian=true level=10",
                                "Mudkip ayreian=true level=10"
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
        GravelmonStarterManager.registerNewStarter("Hoenn",
                createCategory("Epoch - Hoenn",
                        List.of(
                                "Treecko epoch=true level=10",
                                "Torchic epoch=true level=10",
                                "Mudkip epoch=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Sinnoh",
                createCategory("Epoch - Sinnoh",
                        List.of(
                                "Turtwig epoch=true level=10",
                                "Chimchar epoch=true level=10",
                                "Piplup epoch=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Unova",
                createCategory("Epoch - Unova",
                        List.of(
                                "Snivy epoch=true level=10",
                                "Tepig epoch=true level=10",
                                "Oshawott epoch=true level=10"
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
        GravelmonStarterManager.registerNewStarter("Galar",
                createCategory("Epoch - Galar",
                        List.of(
                                "grookey epoch=true level=10",
                                "scorbunny epoch=true level=10",
                                "sobble epoch=true level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter("Paldea",
                createCategory("Epoch - Paldea",
                        List.of(
                                "sprigatito epoch=true level=10",
                                "fuecoco epoch=true level=10",
                                "quaxly epoch=true level=10"
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
                createCategory("Hiza",
                        List.of(
                                "Gnabling level=10",
                                "Kerodillo level=10",
                                "Bubbalo level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Junnin 1",
                        List.of(
                                "Eucuwala level=10",
                                "Kindlemur level=10",
                                "Liqueel level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Junnin 2",
                        List.of(
                                "Reptling level=10",
                                "Woolvry level=10",
                                "Dimetrus level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Junnin 3",
                        List.of(
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
                createCategory("Norheim 1",
                        List.of(
                                "Gnatle level=10",
                                "Bunbear level=10",
                                "Pouffy level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Norheim 2",
                        List.of(
                                "Lilyquack level=10",
                                "Ignewt level=10",
                                "Buppie level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Norheim 3",
                        List.of(
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
                createCategory("Atlas 1",
                        List.of(
                                "Fawnlora level=10",
                                "Scorchet level=10",
                                "Finjoy level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Atlas 2",
                        List.of(
                                "Baneep level=10",
                                "Vulkidna level=10",
                                "Pumpel level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Atlas 3",
                        List.of(
                                "Instick level=10",
                                "Ruflame level=10",
                                "Caimar level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Atlas 4",
                        List.of(
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
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Goetia 1",
                        List.of(
                                "Nymfaun level=10",
                                "Pinonkey level=10",
                                "Seamian level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Goetia 2",
                        List.of(
                                "Slowth level=10",
                                "Taratinder level=10",
                                "Cowet level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Ionos 1",
                        List.of(
                                "Shrubbie level=10",
                                "Radarent level=10",
                                "Chompper level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Ionos 2",
                        List.of(
                                "Faunler level=10",
                                "Kinbat level=10",
                                "Fillybrum level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Trizor 1",
                        List.of(
                                "Babear level=10",
                                "Gorire level=10",
                                "Spactrish level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Trizor 2",
                        List.of(
                                "Lizaflage level=10",
                                "Kapalze level=10",
                                "Dropico level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Palmia",
                        List.of(
                                "Wizlit level=10",
                                "Oryoze level=10",
                                "Squcale level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Norse 1",
                        List.of(
                                "Loctus level=10",
                                "Lavades level=10",
                                "Rayside level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Norse 2",
                        List.of(
                                "Lizanir level=10",
                                "Moroll level=10",
                                "Gloefa level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Norse 3",
                        List.of(
                                "Bearmal level=10",
                                "Draukid level=10",
                                "Roboi level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Norse 4",
                        List.of(
                                "Scalasaur level=10",
                                "Clawmander level=10",
                                "Flortle level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Raian 1",
                        List.of(
                                "Migraff level=10",
                                "Hymbr level=10",
                                "Aquama level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Raian 2",
                        List.of(
                                "Snaprick level=10",
                                "Sycrog level=10",
                                "Dagekko level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Raian 3",
                        List.of(
                                "Solice level=10",
                                "Watchost level=10",
                                "Clasoil level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Aldao",
                        List.of(
                                "Pupfleur level=10",
                                "Cubby level=10",
                                "Nymbble level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Ivris",
                        List.of(
                                "Hezard level=10",
                                "Calburn level=10",
                                "Amppo level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Ferran",
                        List.of(
                                "Chamaerol level=10",
                                "Hogoat level=10",
                                "Platyblub level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Mahal",
                        List.of(
                                "Honylin level=10",
                                "Saany level=10",
                                "Wavalo level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Aroma",
                        List.of(
                                "Spramarro level=10",
                                "Blaapra level=10",
                                "Blubbybara level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Borazul",
                        List.of(
                                "Drubat level=10",
                                "Coaliz level=10",
                                "Seaquin level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Kuulkid",
                        List.of(
                                "Shelliphant level=10",
                                "Peppercoon level=10",
                                "Anemini level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Mastenia",
                        List.of(
                                "Kididna level=10",
                                "Platykid level=10",
                                "Bwibble level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Bago",
                        List.of(
                                "Cattail level=10",
                                "Searther level=10",
                                "Marmink level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Mikitari",
                        List.of(
                                "Rhinplink level=10",
                                "Skindling level=10",
                                "Dampybara level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Mushi",
                        List.of(
                                "Bewilt level=10",
                                "Pyroki level=10",
                                "Micronaut level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Mongratis",
                        List.of(
                                "Timberry level=10",
                                "Saurky level=10",
                                "Bonfur level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Mystis",
                        List.of(
                                "Munchmite level=10",
                                "Lavat level=10",
                                "Crubble level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Nodorro",
                        List.of(
                                "Faunox level=10",
                                "Mouslit level=10",
                                "Feloam level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Olysos",
                        List.of(
                                "Cubtus level=10",
                                "Flambah level=10",
                                "Sharkin level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Olysos",
                        List.of(
                                "patouette level=10",
                                "capoubou level=10",
                                "bullaine level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Rikoto",
                        List.of(
                                "Herovor level=10",
                                "Purrlit level=10",
                                "Salatad level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Otopo",
                        List.of(
                                "Elefern level=10",
                                "Kinfowl level=10",
                                "Cubble level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Panjaea",
                        List.of(
                                "Owleaf level=10",
                                "Coalverine level=10",
                                "Raindolph level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Pastel Island",
                        List.of(
                                "Geckamp level=10",
                                "Avire level=10",
                                "Hissicle level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Ruskow",
                        List.of(
                                "Eleplant level=10",
                                "Bollokin level=10",
                                "Newtiny level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Sorin",
                        List.of(
                                "Grascal level=10",
                                "Ochrab level=10",
                                "Burrblu level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Theos",
                        List.of(
                                "Leazid level=10",
                                "Bullit level=10",
                                "Hippony level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Tochi",
                        List.of(
                                "Brambli level=10",
                                "Salamagma level=10",
                                "Octiny level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Tokas",
                        List.of(
                                "Frungus level=10",
                                "Oinklit level=10",
                                "Bufflow level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Ultra Space",
                        List.of(
                                "Amphibrain level=10",
                                "Jawminate level=10",
                                "Knuclaw level=10",
                                "Poipole level=10"
                        )
                ));
        GravelmonStarterManager.registerNewStarter(null,
                createCategory("Urzavos",
                        List.of(
                                "Spritten level=10",
                                "Ambystar level=10",
                                "Psyalii level=10"
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
