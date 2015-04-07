package is.hello.shiba.graph;

import android.content.Context;
import android.support.annotation.NonNull;

import dagger.Module;
import dagger.Provides;
import is.hello.buruberi.bluetooth.BuruberiModule;
import is.hello.shiba.api.ApiModule;
import is.hello.shiba.ui.fragments.LandingFragment;
import is.hello.shiba.ui.fragments.ScanFragment;
import is.hello.shiba.ui.fragments.SenseFragment;
import is.hello.shiba.ui.fragments.SignInFragment;
import is.hello.shiba.ui.fragments.WiFiFragment;

@SuppressWarnings("UnusedDeclaration")
@Module(
        injects = {
                LandingFragment.class,
                ScanFragment.class,
                SignInFragment.class,
                SenseFragment.class,
                SensePresenter.class,
                WiFiFragment.class,
        },
        includes = {
                BuruberiModule.class, ApiModule.class
        }
)
public class AppModule {
    private final Context appContext;

    public AppModule(@NonNull Context appContext) {
        this.appContext = appContext;
    }

    @Provides Context providesAppContext() {
        return appContext;
    }
}
