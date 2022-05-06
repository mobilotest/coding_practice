package javaTraining.JavaStuff;

import com.sun.javafx.text.ScriptMapper;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptRun {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        String script = "var name = 'Malchik Spalchik';name;";
        try {
            Object result = engine.eval(script);
            System.out.println(result);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}
