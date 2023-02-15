package com.github.vovabezhenar.storybookexclude;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;
public class StorybookExcludeRegistration implements ApplicationComponent {

    @NotNull
    @Override
    public String getComponentName() {
        return "StorybookExcludePlugin";
    }

    @Override
    public void initComponent() {
        ActionManager actionManager = ActionManager.getInstance();
        ExcludeAction excludeAction = new ExcludeAction();

        actionManager.registerAction("StorybookExcludePluginExclude", excludeAction);
        DefaultActionGroup windowMenu = (DefaultActionGroup) actionManager.getAction("ToolsMenu");

        windowMenu.addSeparator();
        windowMenu.add(excludeAction);
    }

    @Override
    public void disposeComponent() {

    }

}
