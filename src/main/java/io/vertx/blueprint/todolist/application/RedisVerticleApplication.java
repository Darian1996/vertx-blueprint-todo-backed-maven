package io.vertx.blueprint.todolist.application;

/***
 *
 *
 * @author <a href="mailto:1934849492@qq.com">Darian</a> 
 * @date 2020/12/5  15:31
 */
public class RedisVerticleApplication extends AbstractVerticleApplication {
    public static void main(String[] args) {
        runApplication("config_redis.json");
    }
}
