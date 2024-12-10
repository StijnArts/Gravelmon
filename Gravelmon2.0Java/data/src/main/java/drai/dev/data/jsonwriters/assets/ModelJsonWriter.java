package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ModelJsonWriter {
    private static List<String> generatedModels = new ArrayList<>();
    public static void writeModel(AbstractPokemon abstractPokemon,int width, int height, String resourcesDir) {
        try {

            String dir = resourcesDir + "\\assets\\cobblemon\\bedrock\\pokemon\\models\\";
            var modelLocation = dir + abstractPokemon.getPlaceholderModelName() + ".geo.json";
            if(generatedModels.contains(modelLocation)) return;
            generatedModels.add(modelLocation);
            Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            Files.createDirectories(new File(dir).toPath());
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(modelLocation)));
            writer.write(gson.toJson(getModelJson(width, height)));
            writer.close();
            PoserJSONWriter.createPoserFile(abstractPokemon.getPosingFileData(), abstractPokemon.getPlaceholderModelName(), resourcesDir, gson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static JsonObject getModelJson(int width, int height) {
        float widthFactor = width / 128f;
        float heightFactor = height / 128f;
        JsonObject modelJson = new JsonObject();
        modelJson.addProperty("format_version", "1.12.0");
        var minecraftGeometry = new JsonArray();
        modelJson.add("minecraft:geometry", minecraftGeometry);
        var geometry = new JsonObject();
        minecraftGeometry.add(geometry);
        var description = new JsonObject();
        geometry.add("description", description);
        description.addProperty("identifier", "geometry.substitute");
        description.addProperty("texture_width", width);
        description.addProperty("texture_height", height);
        description.addProperty("visible_bounds_width", 12f*widthFactor);
        description.addProperty("visible_bounds_height", 13.75f*heightFactor);
        var boundsOffset = new JsonArray();
        boundsOffset.add(0);
        boundsOffset.add(2.125f*heightFactor);
        boundsOffset.add(0);
        description.add("visible_bounds_offset", boundsOffset);
        var bones = new JsonArray();
        geometry.add("bones", bones);
        var substituteBone = new JsonObject();
        var pivot = new JsonArray();
        pivot.add(0);
        pivot.add(0);
        pivot.add(0);
        substituteBone.addProperty("name", "substitute");
        substituteBone.add("pivot", pivot);
        var bodyBone = new JsonObject();
        bodyBone.addProperty("name", "body");
        bodyBone.addProperty("parent", "substitute");
        bodyBone.add("pivot", pivot);
        var cubes = new JsonArray();
        var cube = createCube(width, height);
        cubes.add(cube);
        cubes.add(cube);
        bodyBone.add("cubes", cubes);
        bones.add(substituteBone);
        bones.add(bodyBone);
        return modelJson;
    }

    private static JsonObject createCube(int width, int height) {
        var cube = new JsonObject();
        var origin = new JsonArray();
        origin.add(-width/2);
        origin.add(-1);
        origin.add(0);
        cube.add("origin", origin);
        var size = new JsonArray();
        size.add(width);
        size.add(height);
        size.add(0);
        cube.add("size", size);
        var uv = new JsonArray();
        uv.add(0);
        uv.add(0);
        cube.add("uv", uv);
        return cube;
    }
}
