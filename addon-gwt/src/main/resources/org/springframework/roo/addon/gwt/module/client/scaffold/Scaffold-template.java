package __TOP_LEVEL_PACKAGE__.__SEGMENT_PACKAGE__;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import __TOP_LEVEL_PACKAGE__.client.scaffold.ioc.ScaffoldInjector;

/**
 * Application for browsing entities.
 */
public class Scaffold implements EntryPoint {
    final private ScaffoldInjector injector = GWT.create(ScaffoldInjector.class);

    public void onModuleLoad() {
        /* Get and run platform specific app */

        injector.getScaffoldApp().run();
    }
}