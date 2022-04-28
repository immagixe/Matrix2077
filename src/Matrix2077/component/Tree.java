package Matrix2077.component;

import Matrix2077.model.Element;

public class Tree extends Element {

    final char type = 'ᛉ';

    public Tree(final int x, final int y) {
        super(x, y);
        super.setType(type);
    }
}
