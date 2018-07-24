package com.ldtteam.animatrix.util;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Holder class for the Animatrix Logger.
 */
public class Log
{
    /**
     * Holds the logger.
     */
    private static Logger logger;

    /**
     * Returns the animatrix logger.
     * @return the animatrix Logger.
     */
    public static Logger getLogger()
    {
        return logger;
    }

    /**
     * Sets the animatrix logger.
     * Called by {@link Animatrix#preInit(FMLPreInitializationEvent)}
     *
     * @param logger The logger to set.
     */
    public static void setLogger(final Logger logger)
    {
        Log.logger = logger;
    }
}
