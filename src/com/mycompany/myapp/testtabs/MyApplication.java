package com.mycompany.myapp.testtabs;


import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.ui.Button;
import com.codename1.ui.CheckBox;
import com.codename1.ui.Container;
import com.codename1.ui.RadioButton;
import com.codename1.ui.Tabs;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import java.io.IOException;

public class MyApplication {

    private Form current;
    private Resources theme;

    public void init(Object context) {
        theme = UIManager.initFirstTheme("/theme");

        // Pro only feature, uncomment if you have a pro subscription
        // Log.bindCrashProtection(true);
    }
    
    public void start() {
        if(current != null){
            current.show();
            return;
        }
        Form hi = new Form("Hi World", new BorderLayout());
        Tabs t = new Tabs();
        hi.add(BorderLayout.CENTER, t);
        t.addTab("AAA", createContainer());
        t.addTab("BBB", createContainer());
        t.addTab("CCC", createContainer());
        t.addTab("DDD", createContainer());
        hi.show();
    }
    
    private Container createContainer() {
        return BoxLayout.encloseY(new RadioButton("RB 1"), new RadioButton("RB 2"), new CheckBox("CB 1"), new Button("Button 1"));
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }

}
