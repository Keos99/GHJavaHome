package Chapter4;

class Block {
    int a;
    int b;
    int c;
    int volume;

    Block(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    boolean sameBlock (Block block) {
        if ((block.a == a) & (block.b == b) & (block.c == c)){
            return true;
        } else {
            return false;
        }
    }

    boolean sameVolume (Block block){
        if (block.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}

public class PassOb {
    public static void main(String[] args) {
        Block block1 = new Block(10, 2, 5);
        Block block2 = new Block(10, 2, 5);
        Block block3 = new Block(4, 5, 5);

        System.out.println(block1.a + " " + block1.b + " " + block1.c);
        System.out.println(block2.a + " " + block2.b + " " + block2.c);
        System.out.println(block3.a + " " + block3.b + " " + block3.c);

        System.out.println("block1 имеет те же размеры, что и block2: " + block1.sameBlock(block2));
        System.out.println("block1 имеет те же размеры, что и block3: " + block1.sameBlock(block3));
        System.out.println("block1 имеет тот же объем, что и block3: " + block1.sameVolume(block3));
    }
}
