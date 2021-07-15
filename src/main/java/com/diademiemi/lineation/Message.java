package com.diademiemi.lineation;

import org.bukkit.ChatColor;

/**
 * Messages used within the plugin
 *
 * @author diademiemi
 */

public class Message {

    private static final Config messageConfig = Config.getMessageConfig();

    public static String PREFIX;
    public static String HELP_INDEX;
    public static String HELP_LINE;
    public static String ERROR_NO_PERMS;
    public static String ERROR_UNKNOWN_ARGS;
    public static String ERROR_MISSING_ARGS;
    public static String ERROR_UNKNOWN_LINE;
    public static String ERROR_NULL_BOUNDS;
    public static String ERROR_INVALID_NAME;
    public static String ERROR_LINE_EXISTS;
    public static String SUCCESS_RELOAD;
    public static String SUCCESS_LINE_STARTED;
    public static String SUCCESS_LINE_STOPPED;
    public static String SUCCESS_LINE_CREATED;
    public static String SUCCESS_SET_BOUNDS;
    public static String SUCCESS_LINE_REMOVED;
    public static String SUCCESS_LINE_SELECTED;
    public static String LINE_INFO;
    public static String LINE_LIST;

    /**
     * Load/reload messages from file
     */
    public static void reloadMessages() {
        PREFIX = format(messageConfig.getConfig().getString("PREFIX"));
        HELP_INDEX = format(messageConfig.getConfig().getString("HELP_INDEX"));
        HELP_LINE = format(messageConfig.getConfig().getString("HELP_LINE"));
        ERROR_NO_PERMS = PREFIX + format(messageConfig.getConfig().getString("ERROR_NO_PERMS"));
        ERROR_UNKNOWN_ARGS = PREFIX + format(messageConfig.getConfig().getString("ERROR_UNKNOWN_ARGS"));
        ERROR_MISSING_ARGS = PREFIX + format(messageConfig.getConfig().getString("ERROR_MISSING_ARGS"));
        ERROR_UNKNOWN_LINE = PREFIX + format(messageConfig.getConfig().getString("ERROR_UNKNOWN_LINE"));
        ERROR_NULL_BOUNDS = PREFIX + format(messageConfig.getConfig().getString("ERROR_NULL_BOUNDS"));
        ERROR_INVALID_NAME = PREFIX + format(messageConfig.getConfig().getString("ERROR_INVALID_NAME"));
        ERROR_LINE_EXISTS = PREFIX + format(messageConfig.getConfig().getString("ERROR_LINE_EXISTS"));
        SUCCESS_RELOAD = PREFIX + format(messageConfig.getConfig().getString("SUCCESS_RELOAD"));
        SUCCESS_LINE_STARTED = PREFIX + format(messageConfig.getConfig().getString("SUCCESS_LINE_STARTED"));
        SUCCESS_LINE_STOPPED = PREFIX + format(messageConfig.getConfig().getString("SUCCESS_LINE_STOPPED"));
        SUCCESS_LINE_CREATED = PREFIX + format(messageConfig.getConfig().getString("SUCCESS_LINE_CREATED"));
        SUCCESS_SET_BOUNDS = PREFIX + format(messageConfig.getConfig().getString("SUCCESS_SET_BOUNDS"));
        SUCCESS_LINE_REMOVED = PREFIX + format(messageConfig.getConfig().getString("SUCCESS_LINE_REMOVED"));
        SUCCESS_LINE_SELECTED = PREFIX + format(messageConfig.getConfig().getString("SUCCESS_LINE_SELECTED"));
        LINE_INFO = PREFIX + format(messageConfig.getConfig().getString("LINE_INFO"));
        LINE_LIST = PREFIX + format(messageConfig.getConfig().getString("LINE_LIST"));
    }

    /**
     * Apply colour codes and line breaks
     *
     * @param msg mesage to format
     * @return formatted message
     */
    public static String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}

