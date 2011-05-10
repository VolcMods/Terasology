/*
 *  Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.github.begla.blockmania;

import java.util.HashMap;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.vector.Vector3f;

/**
 * Stores the settings of the game.
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public final class Configuration {

    // Engine settings
    /**
     * The title of the game.
     */
    public static final String GAME_TITLE = "Blockmania Alpha v0.02";
    /**
     * The viewing distance in chunks.
     *
     * 16x1x16 seems to be a good value. With a chunk size of 16x128x16 there are 8.388.608 blocks
     * present at the same time.
     */
    public static final Vector3f VIEWING_DISTANCE_IN_CHUNKS = new Vector3f(16.0f, 1.0f, 16.0f);
    /**
     * The dimensions of a chunk.
     */
    public static final Vector3f CHUNK_DIMENSIONS = new Vector3f(16, 128, 16);
    /**
     * The size of the sun.
     */
    public static final float SUN_SIZE = 64f;
    /**
     * The string used to generate the default world. If not set, a random seed
     * is used on init.
     */
    public static final String DEFAULT_SEED = "yMfLzKzZvHzQiWhA";
    /**
     * The pixel format used to init. the display.
     */
    public static final PixelFormat PIXEL_FORMAT = new PixelFormat().withDepthBits(24);
    /**
     * The height of the display area.
     */
    public static final int DISPLAY_HEIGHT = 720;
    /**
     * The width of the display area.
     */
    public static final int DISPLAY_WIDTH = 1280;
    /**
     * If set to true, the display is rendered as a
     * fullscreen application.
     */
    public static final boolean FULLSCREEN = false;
    /**
     * Maximum light value.
     */
    public static final byte MAX_LIGHT = 16;
    /**
     * Mimimum light value.
     */
    public static final byte MIN_LIGHT = 0;
    /**
     * Intensity of a occlusion.
     */
    public static final float OCCLUSION_INTENS = 0.0625f;
    /**
     * Intensity of which the sides of blocks should be dimmed.
     */
    public static final float BLOCK_SIDE_DIMMING = 0.05f;
    /**
     * The intensity at which light is absorbed within
     * translucent blocks.
     */
    public static final float LIGHT_ABSORPTION = 0.0625f;
    /**
     * The hash map storing numeric settings.
     */
    public static final HashMap<String, Float> _settingsNumeric = new HashMap<String, Float>();
    /**
     * The hash map storing boolean settings.
     */
    public static final HashMap<String, Boolean> _settingsBoolean = new HashMap<String, Boolean>();

    static {
        _settingsBoolean.put("SHOW_PLACING_BOX", true);
        _settingsBoolean.put("SHOW_CHUNK_OUTLINES", false);
        _settingsBoolean.put("SHOW_HUD", true);
        _settingsBoolean.put("ENABLE_BOBBING", true);
        _settingsBoolean.put("DEMO_FLIGHT", false);
        _settingsBoolean.put("GOD_MODE", false);
        _settingsNumeric.put("JUMP_INTENSITY", 10f);
        _settingsNumeric.put("MAX_GRAVITY", 64f);
        _settingsNumeric.put("WALKING_SPEED", 1.5f);
        _settingsNumeric.put("RUNNING_FACTOR", 2f);
        _settingsNumeric.put("PLAYER_HEIGHT", 1.0f);
        _settingsNumeric.put("G_FORCE", 0.05f);
        _settingsNumeric.put("SLOWDOWN_INTENS", 0.05f);
    }

    /**
     * Returns a numeric settings value for a given key.
     * 
     * @param key The key
     * @return The numeric value
     */
    public static Float getSettingNumeric(String key) {
        return _settingsNumeric.get(key);
    }

    /**
     * Returns the boolean value for a given key.
     * 
     * @param key The key
     * @return The boolean value
     */
    public static Boolean getSettingBoolean(String key) {
        return _settingsBoolean.get(key);
    }

    /**
     * Sets a boolean settings value for a given key.
     * 
     * @param key The key
     * @param value The boolean value
     */
    public static void setSetting(String key, Boolean value) {
        _settingsBoolean.put(key, value);
    }

     /**
     * Sets a numeric settings value for a given key.
     *
     * @param key The key
     * @param value The numeric value
     */
    public static void setSetting(String key, Float value) {
        _settingsNumeric.put(key, value);
    }
}