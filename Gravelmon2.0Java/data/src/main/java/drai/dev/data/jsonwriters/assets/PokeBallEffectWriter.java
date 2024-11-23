package drai.dev.data.jsonwriters.assets;

import drai.dev.gravelmon.registries.*;

import java.io.*;
import java.nio.file.*;
import java.util.function.*;

public class PokeBallEffectWriter {
    public static void writeEffects(String resourcesDir) {
        GravelmonItems.POKE_BALLS.stream().map(Supplier::get)
                .forEach(pokeBallItem -> {
                    var pokeBallName = pokeBallItem.getPokeBall().getName().getPath().replaceAll("_", "");
                    var dir = resourcesDir + "\\assets\\cobblemon\\bedrock\\particles\\balls\\" + pokeBallName + "\\";

                    var fileStart = " {\n" +
                            "                                            \t\"format_version\": \"1.10.0\",\n" +
                            "                                            \t\"particle_effect\": {\n" +
                            "                                            \t\t\"description\": {\n" +
                            "                                            \t\t\t\"identifier\": \"cobblemon:"+pokeBallName;
                    try {
                        Files.createDirectories(new File(dir).toPath());
                        writeBaseBallSparkleParticle(dir, fileStart);
                        writeBattleParticles(dir + "battle\\", fileStart);
                        writeCasualParticles(dir + "casual\\", fileStart);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    private static void writeCasualParticles(String dir, String fileStart) throws IOException {
        Files.createDirectories(new File(dir).toPath());
        writeCasualBallSendSparkle(dir, fileStart);
        writeCasualBallSparks(dir, fileStart);
        writeCasualBallSendFlash(dir, fileStart);
    }

    private static void writeBattleParticles(String dir, String fileStart) throws IOException {
        Files.createDirectories(new File(dir).toPath());
        writeBattleBallSendSparkle(dir, fileStart);
        writeBattleBallSparks(dir, fileStart);
        writeBattleBallSendFlash(dir, fileStart);
    }

    private static void writeBattleBallSendFlash(String dir, String fileStart) throws IOException {
        var contents = "/battle/sendflash\",\n" +
                "                \t\t\t\"basic_render_parameters\": {\n" +
                "                \t\t\t\t\"material\": \"particles_alpha\",\n" +
                "                \t\t\t\t\"texture\": \"textures/particles/balls/pokeball/battle/sendflash\"\n" +
                "                \t\t\t}\n" +
                "                \t\t},\n" +
                "                \t\t\"components\": {\n" +
                "                \t\t\t\"minecraft:emitter_rate_instant\": {\n" +
                "                \t\t\t\t\"num_particles\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_lifetime_looping\": {\n" +
                "                \t\t\t\t\"active_time\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_shape_point\": {\n" +
                "                \t\t\t\t\"offset\": [0, 0.5, 0]\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_lifetime_expression\": {\n" +
                "                \t\t\t\t\"max_lifetime\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_initial_speed\": 0,\n" +
                "                \t\t\t\"minecraft:particle_motion_dynamic\": {},\n" +
                "                \t\t\t\"minecraft:particle_appearance_billboard\": {\n" +
                "                \t\t\t\t\"size\": [2.25, 2.25],\n" +
                "                \t\t\t\t\"facing_camera_mode\": \"rotate_xyz\",\n" +
                "                \t\t\t\t\"uv\": {\n" +
                "                \t\t\t\t\t\"texture_width\": 1024,\n" +
                "                \t\t\t\t\t\"texture_height\": 64,\n" +
                "                \t\t\t\t\t\"flipbook\": {\n" +
                "                \t\t\t\t\t\t\"base_UV\": [0, 0],\n" +
                "                \t\t\t\t\t\t\"size_UV\": [64, 64],\n" +
                "                \t\t\t\t\t\t\"step_UV\": [64, 0],\n" +
                "                \t\t\t\t\t\t\"frames_per_second\": 24,\n" +
                "                \t\t\t\t\t\t\"max_frame\": 16\n" +
                "                \t\t\t\t\t}\n" +
                "                \t\t\t\t}\n" +
                "                \t\t\t}\n" +
                "                \t\t}\n" +
                "                \t}\n" +
                "                }";
        writePokeBallParticles(dir + "sendflash.particle.json", fileStart+contents);
    }

    private static void writeBattleBallSparks(String dir, String fileStart) throws IOException {
        var contents = "/battle/ballsparks\",\n\t\t\t\"basic_render_parameters\": {\n" +
                "                \t\t\t\t\"material\": \"particles_alpha\",\n" +
                "                \t\t\t\t\"texture\": \"textures/particles/balls/pokeball/ballsparks\"\n" +
                "                \t\t\t}\n" +
                "                \t\t},\n" +
                "                \t\t\"components\": {\n" +
                "                \t\t\t\"minecraft:emitter_rate_instant\": {\n" +
                "                \t\t\t\t\"num_particles\": 10\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_lifetime_once\": {\n" +
                "                \t\t\t\t\"active_time\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_shape_sphere\": {\n" +
                "                \t\t\t\t\"direction\": [\"math.random(-10,10)\", \"math.random(-0.1,4)*3+0.5\", \"math.random(-10,10)\"]\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_lifetime_expression\": {\n" +
                "                \t\t\t\t\"max_lifetime\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_initial_speed\": \"math.random(4,7)*3.5\",\n" +
                "                \t\t\t\"minecraft:particle_motion_dynamic\": {\n" +
                "                \t\t\t\t\"linear_drag_coefficient\": 4.5\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_appearance_billboard\": {\n" +
                "                \t\t\t\t\"size\": [0.15, 0.15],\n" +
                "                \t\t\t\t\"facing_camera_mode\": \"rotate_xyz\",\n" +
                "                \t\t\t\t\"uv\": {\n" +
                "                \t\t\t\t\t\"texture_width\": 80,\n" +
                "                \t\t\t\t\t\"texture_height\": 8,\n" +
                "                \t\t\t\t\t\"flipbook\": {\n" +
                "                \t\t\t\t\t\t\"base_UV\": [0, 0],\n" +
                "                \t\t\t\t\t\t\"size_UV\": [8, 8],\n" +
                "                \t\t\t\t\t\t\"step_UV\": [8, 0],\n" +
                "                \t\t\t\t\t\t\"frames_per_second\": 18,\n" +
                "                \t\t\t\t\t\t\"max_frame\": 10\n" +
                "                \t\t\t\t\t}\n" +
                "                \t\t\t\t}\n" +
                "                \t\t\t}\n" +
                "                \t\t}\n" +
                "                \t}\n" +
                "                }";
        writePokeBallParticles(dir + "ballsparks.particle.json", fileStart+contents);
    }

    private static void writeBattleBallSendSparkle(String dir, String fileStart) throws IOException {
        var contents = "/battle/ballsendsparkle\",\n" +
                "                \t\t\t\"basic_render_parameters\": {\n" +
                "                \t\t\t\t\"material\": \"particles_alpha\",\n" +
                "                \t\t\t\t\"texture\": \"textures/particles/balls/pokeball/ballsendsparkle\"\n" +
                "                \t\t\t}\n" +
                "                \t\t},\n" +
                "                \t\t\"components\": {\n" +
                "                \t\t\t\"minecraft:emitter_rate_instant\": {\n" +
                "                \t\t\t\t\"num_particles\": 8\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_lifetime_once\": {\n" +
                "                \t\t\t\t\"active_time\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_shape_sphere\": {\n" +
                "                \t\t\t\t\"direction\": [\"math.random(-10,10)\", \"math.random(-0.05,4)*4+0.5\", \"math.random(-10,10)\"]\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_lifetime_expression\": {\n" +
                "                \t\t\t\t\"max_lifetime\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_initial_speed\": \"math.random(4,7)*3\",\n" +
                "                \t\t\t\"minecraft:particle_motion_dynamic\": {\n" +
                "                \t\t\t\t\"linear_acceleration\": [0, -5, 0],\n" +
                "                \t\t\t\t\"linear_drag_coefficient\": 4\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_appearance_billboard\": {\n" +
                "                \t\t\t\t\"size\": [0.15, 0.15],\n" +
                "                \t\t\t\t\"facing_camera_mode\": \"rotate_xyz\",\n" +
                "                \t\t\t\t\"uv\": {\n" +
                "                \t\t\t\t\t\"texture_width\": 99,\n" +
                "                \t\t\t\t\t\"texture_height\": 9,\n" +
                "                \t\t\t\t\t\"flipbook\": {\n" +
                "                \t\t\t\t\t\t\"base_UV\": [0, 0],\n" +
                "                \t\t\t\t\t\t\"size_UV\": [9, 9],\n" +
                "                \t\t\t\t\t\t\"step_UV\": [9, 0],\n" +
                "                \t\t\t\t\t\t\"frames_per_second\": 18,\n" +
                "                \t\t\t\t\t\t\"max_frame\": 11\n" +
                "                \t\t\t\t\t}\n" +
                "                \t\t\t\t}\n" +
                "                \t\t\t}\n" +
                "                \t\t}\n" +
                "                \t}\n" +
                "                }\n" +
                "                ";
        writePokeBallParticles(dir + "ballsendsparkle.particle.json", fileStart+contents);
    }

    private static void writeCasualBallSendFlash(String dir, String fileStart) throws IOException {
        var contents = "/casual/sendflash\",\n" +
                "                \t\t\t\"basic_render_parameters\": {\n" +
                "                \t\t\t\t\"material\": \"particles_alpha\",\n" +
                "                \t\t\t\t\"texture\": \"textures/particles/balls/pokeball/casual/sendcasual\"\n" +
                "                \t\t\t}\n" +
                "                \t\t},\n" +
                "                \t\t\"components\": {\n" +
                "                \t\t\t\"minecraft:emitter_rate_instant\": {\n" +
                "                \t\t\t\t\"num_particles\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_lifetime_once\": {\n" +
                "                \t\t\t\t\"active_time\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_shape_point\": {\n" +
                "                \t\t\t\t\"offset\": [0, 0.5, 0]\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_lifetime_expression\": {\n" +
                "                \t\t\t\t\"max_lifetime\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_initial_speed\": 0,\n" +
                "                \t\t\t\"minecraft:particle_motion_dynamic\": {},\n" +
                "                \t\t\t\"minecraft:particle_appearance_billboard\": {\n" +
                "                \t\t\t\t\"size\": [1.25, 1.25],\n" +
                "                \t\t\t\t\"facing_camera_mode\": \"rotate_xyz\",\n" +
                "                \t\t\t\t\"uv\": {\n" +
                "                \t\t\t\t\t\"texture_width\": 384,\n" +
                "                \t\t\t\t\t\"texture_height\": 32,\n" +
                "                \t\t\t\t\t\"flipbook\": {\n" +
                "                \t\t\t\t\t\t\"base_UV\": [0, 0],\n" +
                "                \t\t\t\t\t\t\"size_UV\": [32, 32],\n" +
                "                \t\t\t\t\t\t\"step_UV\": [32, 0],\n" +
                "                \t\t\t\t\t\t\"frames_per_second\": 24,\n" +
                "                \t\t\t\t\t\t\"max_frame\": 12\n" +
                "                \t\t\t\t\t}\n" +
                "                \t\t\t\t}\n" +
                "                \t\t\t}\n" +
                "                \t\t}\n" +
                "                \t}\n" +
                "                }\n" +
                "                ";
        writePokeBallParticles(dir + "sendflash.particle.json", fileStart+contents);
    }

    private static void writeCasualBallSparks(String dir, String fileStart) throws IOException {
        var contents = "/casual/ballsparks\",\n" +
                "                \t\t\t\"basic_render_parameters\": {\n" +
                "                \t\t\t\t\"material\": \"particles_alpha\",\n" +
                "                \t\t\t\t\"texture\": \"textures/particles/balls/pokeball/ballsparks\"\n" +
                "                \t\t\t}\n" +
                "                \t\t},\n" +
                "                \t\t\"components\": {\n" +
                "                \t\t\t\"minecraft:emitter_rate_instant\": {\n" +
                "                \t\t\t\t\"num_particles\": 5\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_lifetime_once\": {\n" +
                "                \t\t\t\t\"active_time\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_shape_sphere\": {\n" +
                "                \t\t\t\t\"direction\": [\"math.random(-10,10)\", \"math.random(-0.1,4)*3+0.5\", \"math.random(-10,10)\"]\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_lifetime_expression\": {\n" +
                "                \t\t\t\t\"max_lifetime\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_initial_speed\": \"math.random(4,7)*2.1\",\n" +
                "                \t\t\t\"minecraft:particle_motion_dynamic\": {\n" +
                "                \t\t\t\t\"linear_drag_coefficient\": 3.5\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_appearance_billboard\": {\n" +
                "                \t\t\t\t\"size\": [0.1, 0.1],\n" +
                "                \t\t\t\t\"facing_camera_mode\": \"rotate_xyz\",\n" +
                "                \t\t\t\t\"uv\": {\n" +
                "                \t\t\t\t\t\"texture_width\": 80,\n" +
                "                \t\t\t\t\t\"texture_height\": 8,\n" +
                "                \t\t\t\t\t\"flipbook\": {\n" +
                "                \t\t\t\t\t\t\"base_UV\": [0, 0],\n" +
                "                \t\t\t\t\t\t\"size_UV\": [8, 8],\n" +
                "                \t\t\t\t\t\t\"step_UV\": [8, 0],\n" +
                "                \t\t\t\t\t\t\"frames_per_second\": 18,\n" +
                "                \t\t\t\t\t\t\"max_frame\": 10\n" +
                "                \t\t\t\t\t}\n" +
                "                \t\t\t\t}\n" +
                "                \t\t\t}\n" +
                "                \t\t}\n" +
                "                \t}\n" +
                "                }\n" +
                "                ";
        writePokeBallParticles(dir + "ballsparks.particle.json", fileStart+contents);
    }

    private static void writeCasualBallSendSparkle(String dir, String fileStart) throws IOException {
        var contents = "/casual/ballsendsparkle\",\n" +
                "                \t\t\t\"basic_render_parameters\": {\n" +
                "                \t\t\t\t\"material\": \"particles_alpha\",\n" +
                "                \t\t\t\t\"texture\": \"textures/particles/balls/pokeball/ballsendsparkle\"\n" +
                "                \t\t\t}\n" +
                "                \t\t},\n" +
                "                \t\t\"components\": {\n" +
                "                \t\t\t\"minecraft:emitter_rate_instant\": {\n" +
                "                \t\t\t\t\"num_particles\": 4\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_lifetime_once\": {\n" +
                "                \t\t\t\t\"active_time\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_shape_sphere\": {\n" +
                "                \t\t\t\t\"direction\": [\"math.random(-10,10)\", \"math.random(-0.05,4)*4+0.5\", \"math.random(-10,10)\"]\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_lifetime_expression\": {\n" +
                "                \t\t\t\t\"max_lifetime\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_initial_speed\": \"math.random(4,6)*2.5\",\n" +
                "                \t\t\t\"minecraft:particle_motion_dynamic\": {\n" +
                "                \t\t\t\t\"linear_acceleration\": [0, -6, 0],\n" +
                "                \t\t\t\t\"linear_drag_coefficient\": 4\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_appearance_billboard\": {\n" +
                "                \t\t\t\t\"size\": [0.15, 0.15],\n" +
                "                \t\t\t\t\"facing_camera_mode\": \"rotate_xyz\",\n" +
                "                \t\t\t\t\"uv\": {\n" +
                "                \t\t\t\t\t\"texture_width\": 99,\n" +
                "                \t\t\t\t\t\"texture_height\": 9,\n" +
                "                \t\t\t\t\t\"flipbook\": {\n" +
                "                \t\t\t\t\t\t\"base_UV\": [0, 0],\n" +
                "                \t\t\t\t\t\t\"size_UV\": [9, 9],\n" +
                "                \t\t\t\t\t\t\"step_UV\": [9, 0],\n" +
                "                \t\t\t\t\t\t\"frames_per_second\": 18,\n" +
                "                \t\t\t\t\t\t\"max_frame\": 11\n" +
                "                \t\t\t\t\t}\n" +
                "                \t\t\t\t}\n" +
                "                \t\t\t}\n" +
                "                \t\t}\n" +
                "                \t}\n" +
                "                }\n" +
                "                ";
        writePokeBallParticles(dir + "ballsendsparkle.particle.json", fileStart+contents);
    }
    
    private synchronized static void writeBaseBallSparkleParticle(String dir, String fileStart) throws IOException {
        var contents = "/ballsparkle\",\n" +
                "                \t\t\t\"basic_render_parameters\": {\n" +
                "                \t\t\t\t\"material\": \"particles_alpha\",\n" +
                "                \t\t\t\t\"texture\": \"textures/particles/balls/pokeball/ballsparkle\"\n" +
                "                \t\t\t}\n" +
                "                \t\t},\n" +
                "                \t\t\"components\": {\n" +
                "                \t\t\t\"minecraft:emitter_rate_steady\": {\n" +
                "                \t\t\t\t\"spawn_rate\": 16,\n" +
                "                \t\t\t\t\"max_particles\": 16\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_lifetime_once\": {\n" +
                "                \t\t\t\t\"active_time\": 0.5\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:emitter_shape_sphere\": {\n" +
                "                \t\t\t\t\"offset\": [0, 1.5, 0],\n" +
                "                \t\t\t\t\"radius\": \"math.random(0.5,1.5)*1.5\",\n" +
                "                \t\t\t\t\"surface_only\": true,\n" +
                "                \t\t\t\t\"direction\": [0, 1, 0]\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_lifetime_expression\": {\n" +
                "                \t\t\t\t\"max_lifetime\": 1\n" +
                "                \t\t\t},\n" +
                "                \t\t\t\"minecraft:particle_initial_speed\": 0.75,\n" +
                "                \t\t\t\"minecraft:particle_motion_dynamic\": {},\n" +
                "                \t\t\t\"minecraft:particle_appearance_billboard\": {\n" +
                "                \t\t\t\t\"size\": [0.2, 0.2],\n" +
                "                \t\t\t\t\"facing_camera_mode\": \"rotate_xyz\",\n" +
                "                \t\t\t\t\"uv\": {\n" +
                "                \t\t\t\t\t\"texture_width\": 36,\n" +
                "                \t\t\t\t\t\"texture_height\": 9,\n" +
                "                \t\t\t\t\t\"flipbook\": {\n" +
                "                \t\t\t\t\t\t\"base_UV\": [0, 0],\n" +
                "                \t\t\t\t\t\t\"size_UV\": [9, 9],\n" +
                "                \t\t\t\t\t\t\"step_UV\": [9, 0],\n" +
                "                \t\t\t\t\t\t\"frames_per_second\": 12,\n" +
                "                \t\t\t\t\t\t\"max_frame\": 4\n" +
                "                \t\t\t\t\t}\n" +
                "                \t\t\t\t}\n" +
                "                \t\t\t}\n" +
                "                \t\t}\n" +
                "                \t}\n" +
                "                }\n" +
                "                ";
        writePokeBallParticles(dir + "ballsparkle.particle.json", fileStart+contents);
    }

    private synchronized static void writePokeBallParticles(String dir, String contents) throws IOException {
        var file = new File(dir);
        if (!file.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(contents);
            writer.close();
        }
    }
}
