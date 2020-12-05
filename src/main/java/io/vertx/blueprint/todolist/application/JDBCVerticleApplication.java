package io.vertx.blueprint.todolist.application;

/***
 *
 *
 * @author <a href="mailto:1934849492@qq.com">Darian</a> 
 * @date 2020/12/5  12:28
 */
public class JDBCVerticleApplication extends AbstractVerticleApplication {

    public static void main(String[] args) {
        runApplication("config_jdbc.json");
    }
}
