/*
 * Interpreter.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * 
 * Modelizes an interpreter of a programming language.
 * 
 */
public class Interpreter {
    private String sourceCodepath;
    private String outputFilePath;
    private Reader interpreter;
    private Writer output;
    private int[] vars = new int[100];

    public Interpreter(String sourceCodePath, String outputFilePath) {
        this.sourceCodepath = sourceCodePath;
        this.outputFilePath = outputFilePath;
        for (int i = 0; i < 100; i++) {
            vars[i] = 1;
        }
    }

    /**
     * Executa el programa.
     * 
     * @param outputFilePath El path del fitxer de sortida.
     */
    public void run() {
        interpreter = new Reader(sourceCodepath);
        output = new Writer(outputFilePath);
        String cl = interpreter.readLine();
        boolean end = false;
        while (cl != null && !end) {
            String instruccio = cl.split(" ")[1];
            if (instruccio.equals("stop")) {
                stop();
                end = true;
            } else if (instruccio.equals("endl")) {
                endl();
            } else if (instruccio.equals("prin")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                prin(i);
            } else if (instruccio.equals("stor")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                int v = Integer.parseInt(cl.split(" ")[3]);
                stor(i, v);
            } else if (instruccio.equals("copy")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                int j = Integer.parseInt(cl.split(" ")[3]);
                copy(i, j);
            } else if (instruccio.equals("acum")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                int j = Integer.parseInt(cl.split(" ")[3]);
                acum(i, j);
            } else if (instruccio.equals("subs")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                int j = Integer.parseInt(cl.split(" ")[3]);
                subs(i, j);
            } else if (instruccio.equals("prod")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                int j = Integer.parseInt(cl.split(" ")[3]);
                prod(i, j);
            } else if (instruccio.equals("goto")) {
                int l = Integer.parseInt(cl.split(" ")[2]);
                gototo(l);
            } else if (instruccio.equals("jzer")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                int l = Integer.parseInt(cl.split(" ")[3]);
                jzer(i, l);
            } else if (instruccio.equals("jneg")) {
                int i = Integer.parseInt(cl.split(" ")[2]);
                int l = Integer.parseInt(cl.split(" ")[3]);
                jneg(i, l);
            }
            cl = interpreter.readLine();
        }
        interpreter.close();
        output.close();
    }

    private void stop() {
    }

    private void endl() {
        output.println("");
    }

    private void prin(int i) {
        output.print(" " + vars[i]);
    }

    private void stor(int i, int v) {
        vars[i] = v;
    }

    private void copy(int i, int j) {
        vars[i] = vars[j];
    }

    private void acum(int i, int j) {
        vars[i] += vars[j];
    }

    private void subs(int i, int j) {
        vars[i] -= vars[j];
    }

    private void prod(int i, int j) {
        vars[i] *= vars[j];
    }

    private void gototo(int l) {
        interpreter.close();
        interpreter = new Reader(sourceCodepath);
        for (int i = 0; i <= l - 1; i++) {
            interpreter.readLine();
        }
    }

    private void jzer(int i, int l) {
        if (vars[i] == 0) {
            interpreter.close();
            interpreter = new Reader(sourceCodepath);
            for (int j = 0; j <= l - 1; j++) {
                interpreter.readLine();
            }
        }
    }

    private void jneg(int i, int l) {
        if (vars[i] < 0) {
            interpreter.close();
            interpreter = new Reader(sourceCodepath);
            for (int j = 0; j <= l - 1; j++) {
                interpreter.readLine();
            }
        }
    }
}
