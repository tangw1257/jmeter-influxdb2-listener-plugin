package io.github.mderevyankoaqa.influxdb2.visualizer.config;

/**
 * Arguments validation.
 * @author Michael Derevyanko
 */
public final class ArgsValidator {

    /**
     * Private constructor to prevent instantiation of {@link ArgsValidator}.
     * <p>
     * This constructor is intentionally left empty as this class is designed to be a
     * utility class with only static methods and should not be instantiated.
     * </p>
     */
    private ArgsValidator() {
        // This constructor is intentionally left empty to prevent instantiation.
    }

    /**
     * Checks that http scheme is "http" or "https".
     * @param scheme represents the http scheme.
     * @return the validate scheme.
     * @throws IllegalArgumentException when the entered scheme is not equal "http" or "https".
     */
    public static String checkHTTPScheme(String scheme) throws IllegalArgumentException
    {
        String httpSchema= scheme.toLowerCase();

        if(httpSchema.equals("http") || httpSchema.equals("https"))
        {
            return httpSchema;
        }
        else {
            throw new IllegalArgumentException("Expecting a 'http' or 'https' as scheme, but you set " + scheme);
        }
    }
}
