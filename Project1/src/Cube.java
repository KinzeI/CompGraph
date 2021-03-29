import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;

public class Cube {
    protected static void setup( GL2 gl2, int width, int height ) {

        GLU glu = new GLU();
        if (height <= 0) {
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl2.glViewport(0, 0, width, height);
        gl2.glMatrixMode(GL2.GL_PROJECTION);
        gl2.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        glu.gluLookAt(0, 0, 3, 0, 0, 0, 0, 1, 0);
        gl2.glMatrixMode(GL2.GL_MODELVIEW);
        gl2.glLoadIdentity();
    }

    protected static void render( GL2 gl2, int width, int height ) {
        gl2.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl2.glEnable(GL.GL_DEPTH_TEST);



        gl2.glBegin( GL2.GL_POLYGON);
        //белая
        gl2.glColor3f(1.0f, 1.0f, 1.0f);    gl2.glVertex3f(0.5f, 0.5f, 0.5f);
        //фиолетовый
        gl2.glColor3f(1.0f, 0f, 1.0f);      gl2.glVertex3f(-0.5f, 0.5f, 0.5f);
        //синий
        gl2.glColor3f(0.0f, 0.0f, 1.0f);    gl2.glVertex3f(-0.5f, -0.5f, 0.5f);
        //голубой
        gl2.glColor3f(0.0f, 1.0f, 1.0f);    gl2.glVertex3f(0.5f, -0.5f, 0.5f);
        //зеленый
        gl2.glColor3f(0.0f, 1.0f, 0.0f);    gl2.glVertex3f(0.5f, -0.5f, -0.5f);
        //желтый
        gl2.glColor3f(1.0f, 1.0f, 0.0f);    gl2.glVertex3f(0.5f, 0.5f, -0.5f);
        //красный
        gl2.glColor3f(1.0f, 0.0f, 0.0f);    gl2.glVertex3f(-0.5f, 0.5f, -0.5f);
        //фиолетовый
        gl2.glColor3f(1.0f, 0f, 1.0f);      gl2.glVertex3f(-0.5f, 0.5f, 0.5f);

        gl2.glEnd();

        gl2.glBegin(GL2.GL_POLYGON);
        //черная
        gl2.glColor3f(0.0f, 0.0f, 0.0f);    gl2.glVertex3f(-0.5f, -0.5f, -0.5f);
        //зеленая
        gl2.glColor3f(0.0f, 1.0f, 0.0f);    gl2.glVertex3f(0.5f, -0.5f, -0.5f);
        //желтый
        gl2.glColor3f(1.0f, 1.0f, 0.0f);    gl2.glVertex3f(0.5f, 0.5f, -0.5f);
        //красный
        gl2.glColor3f(1.0f, 0.0f, 0.0f);    gl2.glVertex3f(-0.5f, 0.5f, -0.5f);
        //фиолетовый
        gl2.glColor3f(1.0f, 0f, 1.0f);      gl2.glVertex3f(-0.5f, 0.5f, 0.5f);
        //синий
        gl2.glColor3f(0.0f, 0.0f, 1.0f);    gl2.glVertex3f(-0.5f, -0.5f, 0.5f);
        //голубой
        gl2.glColor3f(0.0f, 1.0f, 1.0f);    gl2.glVertex3f(0.5f, -0.5f, 0.5f);
        //зеленая
        gl2.glColor3f(0.0f, 1.0f, 0.0f);    gl2.glVertex3f(0.5f, -0.5f, -0.5f);

        gl2.glEnd();

    }
}
