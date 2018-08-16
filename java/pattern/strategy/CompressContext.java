package pattern.strategy;

import java.util.List;

public class CompressContext {

    private CompressStrategy compressStrategy;

    public void setCompressStrategy(CompressStrategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    public int compress(List<String> files) {
        return compressStrategy.compress(files);
    }
}
