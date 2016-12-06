package rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class ApplicationConfig extends Application {
    private Set<Object> singletons;

    public ApplicationConfig(){
        singletons = new HashSet<Object>();
        singletons.add(new Shoutbox());
    }
    @Override
    public Set<Class<?>> getClasses(){
        return new HashSet<Class<?>>();
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}
