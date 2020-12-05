package io.vertx.blueprint.todolist.common;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;

/***
 *
 *
 * @author <a href="mailto:1934849492@qq.com">Darian</a> 
 * @date 2020/12/5  12:31
 */
public class ConfigReadUtils {

    public static String readConfig(String configName) {
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream(configName);
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(systemResourceAsStream, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String env_String = new BufferedReader(inputStreamReader)
                .lines()
                .collect(Collectors.joining(System.lineSeparator()));

        return env_String;
    }
}
