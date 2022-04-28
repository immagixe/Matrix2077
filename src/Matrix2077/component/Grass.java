package Matrix2077.component;

import Matrix2077.model.Element;

public class Grass extends Element {

    final char type = '✶';

    public Grass(final int x, final int y) {
        super(x, y);
        super.setType(this.type);
    }
}
