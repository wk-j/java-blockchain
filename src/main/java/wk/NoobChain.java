package wk;

import java.util.ArrayList;

public class NoobChain {
    ArrayList<Block> b = new ArrayList<>();

    public NoobChain() {
        b.add(new Block("1", "0"));
        b.add(new Block("2", b.get(b.size() - 1).hash));
        b.add(new Block("3", b.get(b.size() - 1).hash));
    }

    public boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;

        for (int i = 1; i < b.size(); i++) {
            currentBlock = b.get(i);
            previousBlock = b.get(i - 1);

            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashs not equal");
                return false;
            }

            if (!previousBlock.hash.equals(currentBlock.previousHash)) {
                System.out.println("Previous Hashs not equal");
                return false;
            }
        }
        return true;
    }
}