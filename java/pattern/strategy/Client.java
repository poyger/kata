package pattern.strategy;

import java.util.Arrays;

/**
 * depending on runtime parameters we can changing behaviour of the task to be done.
 * for example depending on what device user use we can use different strategies
 */
public class Client {
    public static void main(String[] args) {
        final CompressContext context = new CompressContext();
        // Jar strategy can be configured in external resource
        context.setCompressStrategy(new JarStrategy());
        final int compress = context.compress(Arrays.asList("test.txt", "test1.txt"));
        System.out.println(compress);
    }
}
