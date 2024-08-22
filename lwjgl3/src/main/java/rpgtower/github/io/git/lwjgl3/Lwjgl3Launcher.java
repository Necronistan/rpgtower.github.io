package rpgtower.github.io.git.lwjgl3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import rpgtower.github.io.git.Drop;

public class Lwjgl3Launcher {
    public static void main (String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Drop");
        config.setWindowedMode(640, 320);
        config.setMaximized(true);
        config.useVsync(true);
        config.setForegroundFPS(60);
        new Lwjgl3Application(new Drop(), config);
    }
}
