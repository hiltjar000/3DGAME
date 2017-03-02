/**
 * Created by hiltjar000 on 3/2/2017.
 */
import static org.lwjgl.glfw.GLFW.*;
public class Main {
    public static void main(String[] args){
        if (!glfwInit()){
            throw new IllegalStateException("Failed to initialize GLFW.");
        }

        long window = glfwCreateWindow(640, 480, "MY LWJGL Program", 0 ,0);
    }
}
