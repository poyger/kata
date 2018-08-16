package pattern.strategy;

import java.util.List;

public class ZipStrategy implements CompressStrategy {
    @Override
    public int compress(List<String> files) {
        System.out.println("Using " + this.getClass().getTypeName());
        return 0;
    }
}
