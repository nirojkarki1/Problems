package hotswap_plugins.reload;

import org.hotswap.agent.annotation.LoadEvent;
import org.hotswap.agent.annotation.OnClassLoadEvent;
import org.hotswap.agent.annotation.Plugin;
import org.hotswap.agent.util.PluginManagerInvoker;

import java.lang.reflect.InvocationTargetException;

@Plugin(name = "ClassReload", testedVersions = "1")
public class ClassReload {
    static final String init = PluginManagerInvoker.buildInitializePlugin(ClassReload.class);
    static boolean reloading = false;

    @OnClassLoadEvent(classNameRegexp = ".*", events = LoadEvent.REDEFINE )
    public static void onAnyReload(String className) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        if(!reloading){
            System.out.println("reloaded class " + className);
            var splitClassName = className.split("/");
            var classNameOnly = splitClassName[splitClassName.length - 1];
            var constructorForReloadedClass = Class.forName("genspark.assignments.section1.AddOne").getConstructor();
            var reloadedObject = constructorForReloadedClass.newInstance();
            reloadedObject.getClass().getMethod("test").invoke(reloadedObject);
        }
        //reloading = !reloading;
    }
}
