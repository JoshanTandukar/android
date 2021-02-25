package me.carda.awesome_notifications_example;

import io.flutter.plugin.common.PluginRegistry;

public final class FirebaseCloudMessagingPluginRegistrant{
    public static void registerWith(PluginRegistry registry)
    {
        if (alreadyRegisteredWith(registry))
        {
            return;
        }
        io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"));
    }

    private static boolean alreadyRegisteredWith(PluginRegistry registry)
    {
        final String key = FirebaseCloudMessagingPluginRegistrant.class.getCanonicalName();
        if (registry.hasPlugin(key))
        {
            return true;
        }
        registry.registrarFor(key);
        return false;
    }
}