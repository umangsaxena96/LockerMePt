package services;

import entities.Directory;
import screens.FileOptionsScreen;
import screens.FileOptionsScreen;
import screens.Screen;
import screens.LockerMe;


public class ScreenService {

	public static LockerMe WelcomeScreen = new LockerMe();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
     public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
