package io.vertx.blueprint.todolist.application;

import io.vertx.blueprint.todolist.common.ConfigReadUtils;
import io.vertx.blueprint.todolist.verticle.RxTodoVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

/***
 *
 *
 * @author <a href="mailto:1934849492@qq.com">Darian</a> 
 * @date 2020/12/5  15:31
 */
public abstract class AbstractVerticleApplication {

    protected static final void runApplication(String configPath) {
        DeploymentOptions deploymentOptions = new DeploymentOptions();
        String readConfig = ConfigReadUtils.readConfig("config_jdbc.json");
        JsonObject config = new JsonObject(readConfig);

        deploymentOptions.setConfig(config);
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new RxTodoVerticle(), deploymentOptions);
    }
}
